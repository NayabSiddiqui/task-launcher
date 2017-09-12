# Tolls Spring Cloud Task Launcher

Spring boot based app to act as a Spring Cloud Task launcher. This listens to HTTP
request and then drops a message on the RabbitMQ for the 
[Event-Sink](https://github.com/NayabSiddiqui/tolls-event-sink) to listen on to.

### How to set up Dev Environment

#### Prerequisites:
- Assuming that you already have the [Event-Sink](https://github.com/NayabSiddiqui/tolls-event-sink)
up and running.
- Gradle

#### Get Started:
- Run the application:

    Run the application by issuing following command on command line:

    ```
    gradle bootRun
    ```

---
    
### Using the application:

Send a `POST` request to the application at `localhost:8082/tasks` with the 
following body

```
station42,MK22 DI 8934,2017-10-12T07:44:22
```

The body is a comma separated arguments to be used the by the [Tolls Task](https://github.com/NayabSiddiqui/tolls-task).
This should trigger the task and and the results should be visible in the MySql
database created during the setup of [Tolls Task](https://github.com/NayabSiddiqui/tolls-task),
refer steps at this [doc](https://github.com/NayabSiddiqui/tolls-task/blob/master/README.md#get-started)