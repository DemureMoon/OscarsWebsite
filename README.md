Here is the basic overview of the files used for the API. It was created using **Springboot** and **Maven** and it displays to **localhost:8080**. The main classes where code has been added and edited are **WebController**, **SampleResponse** and **SimpleRestApiVersion2Application**. The dataset where all the oscar movies and actrs are stored is in the resources file.

![Project Folder](https://user-images.githubusercontent.com/31836580/118216392-4688e400-b428-11eb-9215-e47c2f832647.png)

Below this is the beginning of the **WebController** class. The mapping is set to */Oscars* so whenever the user types */Oscars?* in the URL, the program will then get the search value that is entered afterwards.The request parameter is set to *“search”* so when the user types this in the url it will take their input and then look through the json file for the matching string.
![WebController class start](https://user-images.githubusercontent.com/31836580/118216722-e5154500-b428-11eb-99a5-c415e7d31348.png)
