
def collinear(x1, y1, x2, y2, x3, y3):


    a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)

    if (a == 0):
        print("Yes")
    else:
        print("No")

x1, x2, x3, y1, y2, y3 = 1, 1, 1, 1, 4, 5
collinear(x1, y1, x2, y2, x3, y3)

