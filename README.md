# CSE389WebDemo

Website to allow users to find books in our specified catalog for their particular courses (pdfs are for courses ranging from Computer Engineering to Mechanical Engineering to Computer Science and so on).

Created login.jsp and registration.jsp to allow users gain access into the website.

Created RegistrationServlet.java used to handle requests and responses sent between registration.jsp and the web server

Created LoginServlet.java used to handle requests and response sent between login.jsp and the web server (Also plan to use this to be able to communicate and confirm whether entered responses align with the info in the database specified to that user)

Created LoginError.jsp to display when the user enters invalid input

Created RegistrationError.jsp to display if user tries to create an account with an existing account's email address

Created a database to keep all the pdf files that make up our specified catalog

Created a database to keep all user registration/login details

Had an existing web.xml file to handle mappings between URL paths and the servlets that handle requests with those paths  (in this case, between Registration.jsp and RegistrationServlet.java, and Login.jsp and LoginServlet.java).


First, the user encounters the Registration page (this is usually the case, seeing as the user is coming across the page for the first time. But, if anything, they would just choose the option to login with their existing credentials). The user is then prompted to creare an account with their desired credentials, and then their details are saved in a particular database. The user is then redirected to the homepage where they are exposed to a plethora of pdfs in our catalog. The user would also notice a few features of the page such as the profile page and the about page. On clicking the profile page, the user is exposed to their profile information: where their login details and other information such as Date Of Birth and Full Name are saved. On clicking the About Us Page, the user is exposed to more information about the content creator; a link where the content creator can be contacted is displayed below (via email).

The main core of this project is the database: Since we implemented a login and registration system, the database would be able to keep track of the information of each user login. It would also allow us to keep the pdfs/books we have in our catalog for easy access. 
