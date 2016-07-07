InstaBrand

Scenario:

You cruise through your favorite celebrity’s IG and you see a dress that she’s wearing that you really want to find and buy.

How do you do that?
Click on the add on button you can install for it to appear on IG pics.

Now let’s dive into the details…

So what do we need for our Brand Affiliate product…InstaBrand?

1. Alchemy API
2. Instagram API

How to use InstaBrand (add on button you can install for it to appear on IG pics)

1. TRAIN tons of Nike pictures so that you can visually recognize that it is a Nike product.

2. SEND all these pics to Alchemy API 

3. PROCESS into a particular class (like Nike shoes). 

4. TAG the IG pic with the class that we trained.

5. LINK the IG pic to the product URL and keep track if the product was bought or not.

6. Once purchase done... 
SHARE a certain % of profit to picture uploader and us! 



Example of using Alchemy's Visual Recognition API (recognizing celebrity's t-shirt as the brand Gap):

Via HTTP call: "https://watson-api-explorer.mybluemix.net/visual-recognition/api/v3/recognize_text?url=https%3A%2F%2Fwww.instagram.com%2Fp%2F-0WracAArW%2F%3Ftagged%3Dgaplogo%26hl%3Den&version=2016-05-19"

Via Command Line: curl -X GET --header 'Accept: application/json' --header 'Accept-Language: en' 'https://watson-api-explorer.mybluemix.net/visual-recognition/api/v3/classify?url=http%3A%2F%2Fwww.gosugamers.net%2Ffiles%2Fimages%2Ffeatures%2F2016%2Fjune%2FDebutants%2520EU.jpg&version=2016-05-19'

