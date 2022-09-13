1. Add Dependencies
2. Create a folder *processes* inside `src/main/resources/`
   - Because we are using H2 driver, an in-memory database was automatically created and passed to Flowable’s process engine configuration
   - A Flowable ProcessEngine, CmmnEngine, DmnEngine, FormEngine, ContentEngine and IdmEngine beans have been created and exposed
   - All of Flowable services are exposed as Spring beans
   The Spring Job Executor is created

