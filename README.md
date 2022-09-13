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

