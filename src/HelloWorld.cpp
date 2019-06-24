#include <iostream>
#include <string>

using namespace std;

int main()
{
    string str;
    getline(cin, str);
    cout << "Hello World!\n";
    cout << "The given parameter was " << str;

    return 0;
}