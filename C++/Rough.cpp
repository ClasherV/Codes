#include <iostream>
using namespace std;
int main()
{
    int money=0;
    int task=24;
    int reward=41;
    int no_days=0;
    while(true)
    {
        if(reward==0)
        {
            break;
        }
        for(int i=1;i<=5;i++)
        {
            no_days+=1;
            if(i==5)
            {
                reward-=1;
            }
            else if(i==4)
            {
                continue;
            }
            else
            {
                money+=task*reward;
            }
        }
    }
    cout<<"Total Money: "<<money<<endl;
    cout<<"Number of Days: "<<no_days;
    return 0;
}