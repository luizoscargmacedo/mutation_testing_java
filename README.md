# Mutation Testing 
# Java - Maven - Pitest - JUnit

Version: 1.0
Created: 2020-09-05

It's fast, scalable, and integrates with modern tests and build tooling.
Faults (or mutations) are automatically seeded into your code, then your tests are run. If your tests fail then the mutation is killed, if your tests pass then the mutation lived.

The quality of your tests can be gauged from the percentage of mutations killed.

To put it another way - PIT runs your unit tests against automatically modified versions of your application code. When the application code changes, it should produce different results and cause the unit tests to fail. If a unit test does not fail in this situation, it may indicate an issue with the test suite.

You can use a mutant to help with ensuring the test coverage!

It is a good practice to validate your Unit Testing with a mutant before CI/CD, or we can make it part of the CI process (be careful, each team needs to do a time impact analysis about mutation testing in your project).

Video: https://www.linkedin.com/feed/update/urn%3Ali%3Aactivity%3A6727605047363964928/

Additional Information: https://pitest.org/

### Environment Configuration ###
### Installation ###
IntelliJ IDEA
url: https://www.jetbrains.com/idea/ 

PIT Mutation Testing
url: https://pitest.org/


### Execution Project ###
  - Maven and/or JUnit
  
E-mail: luiz.gmacedo@gmail.com
