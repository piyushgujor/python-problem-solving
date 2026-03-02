#include <iostream>
#include <vector>
using namespace std;

class BannerApp {
public:

    // Static helper for O
    static vector<string> getO() {
        return {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static helper for P
    static vector<string> getP() {
        return {
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

    // Static helper for S
    static vector<string> getS() {
        return {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }
};

int main() {

    // Get character patterns using static methods
    vector<string> O = BannerApp::getO();
    vector<string> P = BannerApp::getP();
    vector<string> S = BannerApp::getS();

    // Loop-based rendering
    for (int i = 0; i < O.size(); i++) {
        cout << O[i] << "   "
             << P[i] << "   "
             << S[i] << endl;
    }

    return 0;
}