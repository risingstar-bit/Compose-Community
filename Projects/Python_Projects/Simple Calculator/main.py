import tkinter as tk

DISPLAY_BG = "#DEDEE8"
DIGITS_BG = "#FFFFFF"
OPERATORS_BG = "#F8FAFF"
EQUALS_BG = "#B7B7DA"

LABEL_COLOR = "#190033"
TOTAL_EXP_FONT_STYLE=("Arial",20)
CURRENT_EXP_FONT_STYLE=("Arial", 45, "bold")
DIGITS_FONT_STYLE=("Arial", 24, "bold")
DEFAULT_FONT_STYLE=("Arial",16)


class Calculator:
    def __init__(self):
        self.window = tk.Tk()
        self.window.geometry("399x667")
        self.window.resizable(0,0)
        self.window.title("Calculator")

        self.total_exp = ""
        self.current_exp = ""
        self.display_frame = self.create_display_frame()

        self.total_label, self.label = self.create_display_labels()

        self.digits = {
            7:(1,1), 8:(1,2), 9:(1,3),
            4:(2,1), 5:(2,2), 6:(2,3),
            1:(3,1), 2:(3,2), 3:(3,3),
            0:(4,2), '.':(4,1)
        }

        self.operations= {"/": "\u00F7", "*": "\u00D7", "-": "-", "+": "+"}
        self.buttons_frame = self.create_button_frame()

        self.buttons_frame.rowconfigure(0, weight = 1)

        for x in range(1,5):
            self.buttons_frame.rowconfigure(x, weight = 1)
            self.buttons_frame.columnconfigure(x, weight = 1)
        self.create_digit_buttons()
        self.create_operator_buttons()
        self.create_special_buttons()
        self.bind_keys()

    def bind_keys(self):
        self.window.bind("<Return>", lambda event : self.evaluate())
        for key in self.digits:
            self.window.bind(str(key), lambda event, digit=key : self.add_to_exp(digit))

        for key in self.operations:
            self.window.bind(key, lambda event, operator=key: self.append_operator(operator))
    
    def create_special_buttons(self):
        self.create_clear_button()
        self.create_equals_button()
        self.create_sqrt_button()
        self.create_square_button()

    def create_display_labels(self):
        total_label = tk.Label(self.display_frame, text=self.total_exp, anchor=tk.E, bg=DISPLAY_BG, fg=LABEL_COLOR,padx=24, font=TOTAL_EXP_FONT_STYLE)
        total_label.pack(expand = True, fill = "both")
        
        label = tk.Label(self.display_frame, text=self.current_exp, anchor=tk.E, bg=DISPLAY_BG, fg=LABEL_COLOR,padx=24 ,font=CURRENT_EXP_FONT_STYLE)
        label.pack(expand = True, fill = "both")

        return total_label, label

    def create_display_frame(self):
        frame = tk.Frame(self.window, height = 221, bg = DISPLAY_BG)
        frame.pack(expand = True, fill  = "both")
        return frame

    def add_to_exp(self,value):
        self.current_exp += str(value)
        self.update_label()

    def create_digit_buttons(self):
        for digit, grid_value in self.digits.items():
            button = tk.Button(self.buttons_frame, text = str(digit), bg = DIGITS_BG, fg = LABEL_COLOR, font = DIGITS_FONT_STYLE, borderwidth = 0, command = lambda x =digit :self.add_to_exp(x))
            button.grid(row = grid_value[0], column = grid_value[1], sticky=tk.NSEW)

    def append_operator(self,operator):
        self.current_exp += operator
        self.total_exp += self.current_exp
        self.current_exp = ""
        self.update_total_label()
        self.update_label()

    def create_operator_buttons(self):
        i = 0
        for operator, symbol in self.operations.items():
            button = tk.Button(self.buttons_frame, text = symbol, bg = OPERATORS_BG, fg = LABEL_COLOR, font = DEFAULT_FONT_STYLE, borderwidth = 0, command = lambda x=operator: self.append_operator(x))
            button.grid(row = i, column = 4, sticky = tk.NSEW)
            i += 1

    def clear(self):
        self.current_exp = ""
        self.total_exp = ""
        self.update_label()
        self.update_total_label()

    def create_clear_button(self):
        button = tk.Button(self.buttons_frame, text = "C", bg = OPERATORS_BG, fg = LABEL_COLOR, font = DEFAULT_FONT_STYLE, borderwidth = 0, command=self.clear)
        button.grid(row = 0, column = 1, sticky = tk.NSEW)
    
    def square(self):
        self.current_exp = str(eval(f"{self.current_exp}**2"))
        self.update_label()

    def create_square_button(self):
        button = tk.Button(self.buttons_frame, text = "x\u00b2", bg = OPERATORS_BG, fg = LABEL_COLOR, font = DEFAULT_FONT_STYLE, borderwidth = 0, command=self.square)
        button.grid(row=0, column = 2, sticky = tk.NSEW)

    def sqrt(self):
        self.current_exp = str(eval(f"{self.current_exp}**0.5"))
        self.update_label()

    def create_sqrt_button(self):
        button = tk.Button(self.buttons_frame, text ="\u221ax", bg = OPERATORS_BG, fg = LABEL_COLOR, font = DEFAULT_FONT_STYLE, borderwidth = 0, command = self.sqrt)
        button.grid(row = 0, column = 3, sticky=tk.NSEW)


    def evaluate(self):
        self.total_exp += self.current_exp
        self.update_total_label()
        try:
            self.current_exp = str(eval(self.total_exp))
            self.total_exp = ""
        except Exception as e:
            self.current_exp = "Error"
        finally:
            self.update_label()   

        self.update_label()

    def create_equals_button(self):
        button = tk.Button(self.buttons_frame, text = "=", bg = EQUALS_BG, fg = LABEL_COLOR, font = DEFAULT_FONT_STYLE, borderwidth = 0, command = self.evaluate)
        button.grid(row = 4, column = 3, columnspan = 2, sticky = tk.NSEW)

    def create_button_frame(self):
        frame = tk.Frame(self.window)
        frame.pack(expand = True, fill = "both")
        return frame

    def update_total_label(self):
        exp = self.total_exp
        for operator, symbol in self.operations.items():
            exp = exp.replace(operator, f' {symbol} ' )
        self.total_label.config(text = exp)
    
    def update_label(self):
        self.label.config(text = self.current_exp[:11])

    def run(self):
        self.window.mainloop()

if __name__=="__main__":
    calc = Calculator()
    calc.run()
