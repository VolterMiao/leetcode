#include <stdio.h>
#include <stdlib.h>

struct ListNode
{
  int val;
  struct ListNode *next;
};

void deleteNode(struct ListNode* node)
{
  if(NULL == node) return;
  
  while(node->next->next != NULL)
  {
    node->val = node->next->val;
    node = node->next;
  }

  node->val = node->next->val;
  node->next = NULL;
}

int main()
{
  struct ListNode* head = (struct ListNode*) malloc(sizeof(struct ListNode));
  head->val = 1;
  head->next = NULL;
  struct ListNode* p = head;
  int i;
  for(i=2; i<=7; i++)
    {
      p->next = (struct ListNode*) malloc(sizeof(struct ListNode));
      p->next->val = i;
      p->next->next = NULL;
      p = p->next;
    }

  struct ListNode* t = head;
  while(t->val != 3) t = t->next;

  deleteNode(t);

  struct ListNode* pp = head;
  while(pp != NULL){
    printf("%d->", pp->val);
    pp = pp->next;
  }
  
  return 0;
}
