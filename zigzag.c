#include<stdio.h>
#include<stdlib.h>
struct Stack
{
		int top;
		int capacity;
		int *arr;
};

struct Stack * createStack(int capacity)
{
		struct Stack *S=malloc(sizeof(struct Stack));
		S->capacity=capacity;
		S->top=-1;
		S->arr=malloc(sizeof(int)*capacity);
		return S;
}

int isFull(struct Stack *S)
{
	if(S->top==(S->capacity-1))
		return 1;
	else
		return 0;
}

int isEmpty(struct Stack *S)
{
	if(S->top==-1)
		return -1;
	else
		return 0;
}

void push(struct Stack *S,struct BinaryTree *data)
{
	if(isFull(S))
	{
		printf("Stack is overflow\n");
		return ;
	}
	S->arr[++S->top]=data;
}

struct Stack * pop(struct Stack *S)
{
	if(isEmpty(S))
	{
		printf("Stack is underflow\n");
	}
	return S->arr[S->top--];
}

struct BinaryTree
{
	int data;
	struct BinaryTree *left;
	struct BinaryTree *right;
};

struct BinaryTree * createNewNode(int data)
{
	struct BinaryTree *node=malloc(sizeof(struct BinaryTree));
	node->data=data;
	node->left=node->right=NULL;
	return node;
}

void zigZag(struct BinaryTree *root)
{
	struct BinaryTree *temp;
	int left=1;
	if(root!=NULL) return;
	struct Stack *S=createStack(10), *M=createStack(10);
	push(S,root);
	while(isEmpty(S))
	{
		temp=pop(S);
		if(temp!=NULL)
		{
			printf("%d",temp->data);
			if(left)
			{
				if(temp->left) push(M,temp->left);
				if(temp->right) push(M,temp->right);
			}
			else
			{
				if(temp->right) push(M,temp->right);
				if(temp->left) push(M,temp->left);
			}
		}
		if(isEmpty(S))
		{
			left=left-1;
			swap(S,M);
		}
	}
}

int main()
{
	struct BinaryTree *root=createNewNode('A');
	root->left=createNewNode('B');
	root->right=createNewNode('C');
	root->left->left=createNewNode('D');
	root->left->right=createNewNode('E');
	root->right->left=createNewNode('F');
	root->right->right=createNewNode('G');
	zigZag(root);
}