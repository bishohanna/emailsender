# emailsender

* Reads users data from the included userdata.csv file, then emails active users
* For the sake of performance, the mailing process will be done asynchronously with the sake of an executor service, also more than one user can be emailed in parallel as the mailing process is independent between users.


* To start the application, simply go to the Application class and run the included main method.
