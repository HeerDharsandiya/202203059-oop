//Q-1) Write a program to implement linked list in C language (Using pointers).

#include <stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node *addFirst(struct node *head, int n){
    struct node *p=malloc(sizeof(struct node));
    p->data=n;
    p->next=head;
    
    head=p;
    return head;
}

struct node *deleteFirst(struct node *head){
    
    if(head==NULL) {
        printf("Linked list is empty\n");
        return head;
    }

    head=head->next;
    return head;
}

void addLast(struct node *head, int n){
    if(head==NULL) {
        printf("Linked list is empty\n");
        return;
    }

    struct node *p,*q;
    p=head;
    q=malloc(sizeof(struct node));
    q->data=n;
    q->next=NULL;
    
    while(p->next != NULL){
        p=p->next;
    }
    p->next=q;
}

void deleteLast(struct node *head){
    if(head==NULL) {
        printf("Linked list is empty\n");
        return;
    }
    if(head->next==NULL) head=NULL;
    struct node *p=head;
    struct node *q=head->next;
    while(q->next != NULL){
        p=p->next;
        q=q->next;
    }
    p->next=NULL;
}

struct node *addMiddle(struct node *head,int d,int n)
{
    if(n==1) addFirst(head,d);
    struct node *p=head;
    struct node *q=malloc(sizeof(struct node));
    q->data=d;
    int i=1;
    while(i<n-1){
        p=p->next;
        i++;
    }
    q->next=p->next;
    p->next=q;
    return head;
}

struct node *deleteMiddle(struct node *head,int n){
    
    struct node *p=head;
    struct node *q=head->next;
    int i=1;
    while(i<n-1){
        p=p->next;
        q=q->next;
        i++;
    }
    p->next=q->next;
    return head;
}

void Print(struct node *head){
    struct node *p=head;
    if(head==NULL) {
        printf("Linked list is empty\n");
        return;
    }
    while(p != NULL){
        printf("%d -> ",p->data);
        p=p->next;
    }
    printf("NULL");
}

int main()
{
    struct node *head =(struct node *)malloc(sizeof(struct node));
    head->data=13;
    head->next=NULL;
    
    struct node *curr=malloc(sizeof(struct node));
    curr->data=14;
    curr->next=NULL;
    head->next=curr;
    
    curr=malloc(sizeof(struct node));
    curr->data=15;
    curr->next=NULL;
    head->next->next=curr;
    
    curr=malloc(sizeof(struct node));
    curr->data=16;
    curr->next=NULL;
    head->next->next->next=curr;
    
    printf("The linked list is:\n");
    Print(head);
    
    head=addFirst(head,12);
    printf("\nElement added in the beginning: ");
    Print(head);
    
    head=deleteFirst(head);
    printf("\nElement deleted from the beginning: ");
    Print(head);
    
    addLast(head,17);
    printf("\nElement added at the end: ");
    Print(head);
    
    deleteLast(head);
    printf("\nElement deleted from the end: ");
    Print(head);
    
    head=addFirst(head,12);
    addLast(head,17);
    printf("\nThe linked list is: ");
    Print(head);
    
    head=addMiddle(head,35,3);
    printf("\nElement inserted in between: ");
    Print(head);
    
    head=deleteMiddle(head,3);
    printf("\nElement inserted in between: ");
    Print(head);
    
    return 0;
}

