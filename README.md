# MVVM Study Project with Retrofit

This is a study project that implements the MVVM (Model-View-ViewModel) architecture using Retrofit for network requests. The project also uses ViewModel and LiveData to manage and observe data.

## Features

- Fetch data from an API using Retrofit.
- MVVM architecture to separate responsibilities and facilitate maintenance.
- Use of ViewModel to manage UI-related data.
- Use of LiveData to observe data changes and update the UI automatically.

## Project Structure

The project is organized into the following main packages:

- `view`: Contains the activities and fragments that make up the user interface.
- `viewmodel`: Contains the ViewModel classes that manage UI-related data.
- `model`: Contains the data model classes and the Retrofit service.

## Dependencies

This project uses the following libraries:

- [Retrofit](https://square.github.io/retrofit/): For making HTTP requests.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel): For efficiently managing UI-related data.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata): For observing data changes.

## How to Run

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/mvvm-retrofit-project.git
    ```
2. Open the project in Android Studio.
3. Sync the Gradle dependencies.
4. Run the application on an emulator or a physical device.
