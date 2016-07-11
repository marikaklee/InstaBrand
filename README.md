<h1>InstaBrand</h1>

<h2>Scenario of when to use InstaBrand:</h2>

You cruise through your favorite celebrity’s IG and you see a dress that she’s wearing that you really want to find and buy.

How do you do that?
Click on the add on button you can install for it to appear on IG pics.

Now let’s dive into the details…

So what do we need for our Brand Affiliate product…InstaBrand?

1. Alchemy API
2. Instagram API

<h2>How to use InstaBrand</h2>
(add on button you can install for it to appear on IG pics)

1. TRAIN many GAP pictures so that you can visually recognize that it is a GAP product (the more trained, the better it will visiaully recognize the product as GAP).

2. SEND all these pics to Alchemy API 

3. PROCESS into a particular class (like GAP high-rise jeans). 

4. TAG the IG pic with the class that we trained.

5. LINK the IG pic to the product URL and keep track if the product was bought or not.

6. Once purchase done... SHARE a certain % of profit to picture uploader and the company (in this case Gap)! 

<h2>Using Alchemy API:</h2>

We need to figure out what is contained in many images of the IG pics, but we don’t have the man-power to manually go one-by-one... So Alchemy API does the following for us:

1. Organize image libraries into categories
2. Segment user interests from social media pictures
3. Find great images with specific content faster
4. Recognize custom content from images


Input: 
JPEG images,
PNG images,
Image or website URLs,
Custom: Classifier name, JPEG images (positive examples for each class, and negative examples),
Service output

Output (as JSON file):
Class description,
Class taxonomy,
Face detection (Gender, age range, celebrity).
Text recognition (Beta)

<h2>Example of using Alchemy's Visual Recognition API</h2> (recognizing celebrity's t-shirt as the brand Gap):

Via HTTP call: ["https://watson-api-explorer.mybluemix.net/visual-recognition/api/v3/recognize_text?url=https%3A%2F%2Fwww.instagram.com%2Fp%2F-0WracAArW%2F%3Ftagged%3Dgaplogo%26hl%3Den&version=2016-05-19"]("https://watson-api-explorer.mybluemix.net/visual-recognition/api/v3/recognize_text?url=https%3A%2F%2Fwww.instagram.com%2Fp%2F-0WracAArW%2F%3Ftagged%3Dgaplogo%26hl%3Den&version=2016-05-19")

Via Command Line: [curl -X GET --header 'Accept: application/json' --header 'Accept-Language: en' 'https://watson-api-explorer.mybluemix.net/visual-recognition/api/v3/classify?url=http%3A%2F%2Fwww.gosugamers.net%2Ffiles%2Fimages%2Ffeatures%2F2016%2Fjune%2FDebutants%2520EU.jpg&version=2016-05-19'](curl -X GET --header 'Accept: application/json' --header 'Accept-Language: en' 'https://watson-api-explorer.mybluemix.net/visual-recognition/api/v3/classify?url=http%3A%2F%2Fwww.gosugamers.net%2Ffiles%2Fimages%2Ffeatures%2F2016%2Fjune%2FDebutants%2520EU.jpg&version=2016-05-19')

