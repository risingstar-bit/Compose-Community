# Formatting Counter

Formatting Counter is a command-line interface (CLI) software written in the C programming language. It counts the number of times the keys spacebar, tab, and enter are pressed. The counting process starts when the user presses the spacebar, tab, or enter keys and ends when the user presses the 'n' key followed by the enter key. This tool helps users keep track of formatting-related keystrokes while typing.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [How It Works](#how-it-works)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Installation

To use Formatting Counter, you need to have a C compiler installed on your system. If you haven't already, you can install a C compiler such as GCC using the package manager for your operating system.

Clone the repository to your local machine:

```bash
git clone https://github.com/Aniket1234-cool/live_fomat_counter.git
```

Compile the C source code:

```bash
cd live_fomat_counter
gcc Formatting counter.c -o formatting counter
```

## Usage

Run the compiled executable:

```bash
./Formatting counter
```

Follow the on-screen instructions to start and stop counting formatting keystrokes.

## How It Works

Formatting Counter monitors the keyboard input and counts the occurrences of the spacebar, tab, and enter keys. When the user presses one of these keys, the counter is incremented. The counting process starts when one of these keys is pressed and ends when the user presses the 'n' key followed by the enter key.

## Example

```
Press space, tab, or enter to start counting. Press 'n' and enter to stop.

Blanks: 1
Tabs: 2
Enters: 3
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
