#include<stdio.h>
#include<conio.h>
void main()
{
int c=-1,a[1000],n=0;
clrscr();
while(c!=5)
{
printf("*menu**1.add\n2.remove\n3.modify\n4.print\n5.exit\n enter the number");
scanf("%d",&c);
switch(c){
case 1:
if(n<100){
printf("enter the value to be added");
scanf("%d",&a[n]);
n++;


}
else{
printf("array is full !\n");

}
break;
case2 :
if(n>0){
printf("element has to be remover d");
scanf("%d",&q);
q--;
if(q<0|| q>n-1)
{
printf("invalid input\n");
}
else{
for(i =q;i<n-1;i++){
a[i]=a[i+1];
}
n--;
printf("element has removed\n");
}
}else{


printf("array is empty!\n");
}
break;
case 3:
printf(" ente the modifly numbrr");

case 4:
for (i=0;i<n;i++){
printf("%d:%d\t",i,a[i]);
 }
 printf("\n");
 break;
 case 5 :

printf("good BYe!");

getch();
}
