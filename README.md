<h2>Project Files</h2>

Here is the basic overview of the files used for the API. It was created using **Springboot** and **Maven** and it displays to **localhost:8080**. The main classes where code has been added and edited are **WebController**, **SampleResponse** and **SimpleRestApiVersion2Application**. The JSON dataset file where all the oscar movies and actrs are stored is in the **resources** folder.
>![Project Folder](https://user-images.githubusercontent.com/31836580/118218908-3e7f7300-b42d-11eb-8306-5a76488ce1b9.png)

<h2>WebController class</h2>

Below this is the beginning of the **WebController** class. The mapping is set to */Oscars* so whenever the user types */Oscars?* in the URL, the program will then get the search value that is entered afterwards.The request parameter is set to *“search”* so when the user types this in the url it will take their input and then look through the json file for the matching string.
>![WebController class start](https://user-images.githubusercontent.com/31836580/118219031-81414b00-b42d-11eb-81d2-1e8b8299bbc8.png)

In the same class **WebController** and the same method, this next part is where the program searches for the requested movie or actor based on the string provided by the user. The for loop looks through all elements in the dataset and if the string *search* equals the entity, year, winner or category fields then it will return the information at that index. At this point, the program can only return one movie so if a specific name is searched, only the first result under the searched year will be returned.
>![WebController class end](https://user-images.githubusercontent.com/31836580/118217316-0cb8dd00-b42a-11eb-8539-c5cfbdee80c3.png)

However if no search parameter is specified, the program will pick and return a **random** movie or actor from the dataset.
>![random](https://user-images.githubusercontent.com/31836580/118219078-9e761980-b42d-11eb-818e-e4c087b7011f.png)

<h2>SampleResponse class</h2>

This part of the program is in the **SampleResponse** class and it sets up the fields that are going to be searched for and provided. For each field, there is a *get* and *set* method that will set the field to a specified value in the dataset and return it when called from the **WebController** class.
>![SampleResponse class](https://user-images.githubusercontent.com/31836580/118219188-d4b39900-b42d-11eb-91c6-51561822a58f.png)
