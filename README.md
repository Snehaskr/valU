According to Forbes.com, GenZ defined by their ability to rewrite "rules that favor liberal viewpoints on things like race, gender, identity, and sexuality." Values are an increasingly important aspect of new job seekers' efforts to join the work-force, and many companies consequently emphasize corporate culture and core values while marketing available roles. 

ValU provides a curated resource for individuals to learn about companies that may align with their top ranked values and priorities with regards to corporate culture. Our website provides visual displays of information scraped from Indeed and other data sets regarding corporate diversity, so that user's may hear directly from others like them in a visual, clear, and easily discernible manner. 

Our project is broken down into several parts: data scraping, followed by sentiment and syntax analysis, data organization, data visualization, and front-end development. 

Backend development:
We started off by finding data sources from a diversity database and Indeed.com. We scraped the data from Indeed and reconciled the companies in the database with the scraped data. We created tables with 1000 reviews for each of the companies we were analyzing. After scraping the review data, we passed it to our teammates to perform syntax analysis.
Our teammates passed back CSV files and other data containing syntactical analysis of the reviews we had given. This data determined how the reviewers on Indeed had felt about working at these companies, as well as keywords associated with each company. We cleaned the data and created a SQLite database of this information.

