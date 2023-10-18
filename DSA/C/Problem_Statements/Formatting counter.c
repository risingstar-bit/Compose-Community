#include <stdio.h>

int main() {
    int blanks = 0; 
	int tabs = 0; 
	int newlines = 0;
    int c = 0;

    printf("Press Spacebar, Tab and Enter key to count (press n then enter key to end):\n");

    while ((c = getchar()) !='n') {
        if (c == ' ') {
            blanks++;
        } else if (c == '\t') {
            tabs++;
        } else if (c == '\n') {
            newlines++;
        }
    }

    printf("\n");
    printf("Blanks: %d\n", blanks);
    printf("Tabs: %d\n", tabs);
    printf("Enters: %d\n", newlines);

    return 0;
}