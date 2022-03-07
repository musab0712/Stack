#include"MyStack.c"

int isOperand(char x)
{
		/*if(x>='0'&&x<='9')
			return 1;
		else
			return 0;*/
		return x>='0'&&x<='9';
}


int main( )
{
		char postfix[20];
		int operand1,operand2;
		scanf("%s",postfix);
		struct Stack *S=createStack(10);
		int i;
		for(i=0;postfix[i];i++)
		{
				if(isOperand(postfix[i]))
					push(S,postfix[i]);

				else			//operator
				{
						operand2=pop(S)-48;
						operand1=pop(S)-48;
						switch(postfix[i])
						{
								case '+': push(S,operand1+operand2 + 48);
												break;
								case '-':   push(S,operand1-operand2 + 48);
												break;
								case '*':  push(S, operand1*operand2 + 48);
												break;
								case '/':  push(S, operand1/operand2 + 48);
												break;
						}
				}
		}

		printf("Answer is : %d",pop(S)-48);
}