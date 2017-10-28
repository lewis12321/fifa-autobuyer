# fifa-player-prices

*REQUIRES
- GOOGLE CHROME
- SOME KNOWLEDGE ON EDITTING .JAVA FILES

This repositiory gets the lowest minimum-buy-now price of the a player you want specifed by a URL that you put into a `.txt` file. This will then go to that website and open up a browser and locate the player and get the price.
It prints out infomation such as maximum bid price and tells you infomation about that player saved as a `.csv` that can be opened with `Excel` or similar.

You need to edit the urls of the "urls.txt" to whichever players you want to get prices on / you need to change the location of the `URLService` Class to "urls.txt" on file system.

You will also need to change the location of the `BrowserDriver` Class to where it is located on your file system - the chromedriver should be part of this repository.

I'm open for suggestions and anyone who wants to improve it.
