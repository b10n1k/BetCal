BetCal
======
by b10n1k - jbonatakis at gmail dot com
gpg fingerprint: B380 AD6B B1AF CB3D 77CD  20EC A990 A950 C569 E2D4

The Idea
--------
There is a way to earn every time from the betting. To do that you need only a bagdet and a little bit of luck. First let s say that you want to earn 50 euros. You choose two games to play. Assume that the odds for game1 is 1.8 and for game2 is 2.1. Using the function(see below) we found that to earn 50 euros with the current odds we must bet 17.985611511. In particular 18 euros is ok. In the case of winning we are ok. In the other case we must find out two others game and estimate again including the lost amount. For our example the 18 euros. Assume now odds for game1 = 1.9 && game2 = 2.2. Using again the function we get that we ll bet 21 euros. The profit of this includes 50+18 euros. The bugdet was 30 euros. If we are unlucky we must play again the same system. The possibilities is very good to ensure the win. 

Function
--------
We use the function
---------------------------
| S = (R + L)/((o1*o2)-1) |
---------------------------
| S = bet                 |
| R = profit              |
| L = current lost amount |
| o1,o2 = bet odds        |
---------------------------

Development
-----------
Framework: JDK 1.7
Java Version: java EE 6 web
JSF 2.1
Server : Apache Tomcat 7.0.27.0 
       
Github: 
https://github.com/j0ny/BetCal
