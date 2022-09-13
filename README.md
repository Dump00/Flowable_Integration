1. Add Dependencies
2. Create a folder *processes* inside `src/main/resources/`
   - Because we are using H2 driver, an in-memory database was automatically created and passed to Flowable’s process engine configuration
   - A Flowable ProcessEngine, CmmnEngine, DmnEngine, FormEngine, ContentEngine and IdmEngine beans have been created and exposed
   - All of Flowable services are exposed as Spring beans
   The Spring Job Executor is created
3. Add code lines **CommandLineRunner** which is a  special kind of Spring bean that is executed when the application boots
   - output
    ```
   Number of process definitions : 1
    Number of tasks : 0
    Number of tasks after process start : 1
   ```
4. Add REST support by adding dependency *flowable-spring-boot-starter-rest*
   - It is very common to use a REST API on top of the embedded Flowable engine, because it allows your application to interact with other micro services.
5. Create two custom end-points
   - One for starting process instances of our previously created BPMN 2.0 process definition
   - one for getting the active user tasks.
6. Create REST end-point
   - Both the @Service and the @RestController will be found by the automatic component scan for a Spring Boot application. Run the application class again. We can now interact with the REST API, for example, by using cURL or Postman.
   - 
