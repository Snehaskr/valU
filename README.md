According to Forbes.com, GenZ defined by their ability to rewrite "rules that favor liberal viewpoints on things like race, gender, identity, and sexuality." Values are an increasingly important aspect of new job seekers' efforts to join the work-force, and many companies consequently emphasize corporate culture and core values while marketing available roles. 

ValU provides a curated resource for individuals to learn about companies that may align with their top ranked values and priorities with regards to corporate culture. Our website provides visual displays of information scraped from Indeed and other data sets regarding corporate diversity, so that user's may hear directly from others like them in a visual, clear, and easily discernible manner. 

Our project is broken down into several parts: data scraping, followed by sentiment and syntax analysis, data organization, data visualization, and front-end development. 

We scraped the data from Indeed using R and reconciled the companies in the database with the scraped data. We created tables with 1000 reviews for each of the companies we were analyzing. After scraping the review data, we passed it to our teammates to perform syntax analysis.

Using data-sets saved in the form of JSON files, we performed syntactical and sentiment analysis using Google Natural Language Processing API. Syntactical analysis provided a breakdown of the various attributes of a company's reviews,including parts-of-speech, gender, and person. Our java program parsed the JSON files to develop a count of all the adjectives mentioned in the Indeed reviews. Sentiment analysis provided a score for each company, ranging from -1 to 1, which was most positive. Google NLP also provides a magnitude to rate the intensity of sentiment within a section of text. We use averages of this data representing each company for our visuals.

This information was all consequently passed along in csv format and was used to create a SQLite database.

Top Sources:
  1. https://cloud.google.com/natural-language/docs/analyzing-sentiment
  2. Google Cloud Shell
  3. https://cloud.google.com/sdk/gcloud/reference/alpha/cloud-shell/scp
  4. https://webkul.com/blog/iterate-through-jsonobject-in-java-android/
  5. https://cloud.google.com/shell/docs/
  6. https://cloud.google.com/natural-language/docs/analyzing-syntax

