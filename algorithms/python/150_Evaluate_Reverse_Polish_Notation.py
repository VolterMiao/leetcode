class Solution:
    # @param tokens, a list of string
    # @return an integer
    def evalRPN(self, tokens):
        l = []
        oper = ['+','-','*','/']
        for t in tokens:
            if t not in oper:
                l.append(int(t))
            else:
                if t == '+':
                    l[-2] = l[-2]+l[-1]
                    del l[-1]
                if t == '-':
                    l[-2] = l[-2]-l[-1]
                    del l[-1]
                if t == '*':
                    l[-2] = l[-2]*l[-1]
                    del l[-1]
                if t == '/':
                    l[-2] = int(float(l[-2])/float(l[-1]))
                    del l[-1]
        return l[0]
