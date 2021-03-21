
Feature: Login

   @Login
   Scenario Outline: Logout User
      Given User log in portal with <username> and <password>
      When User log out portal
      Then Portal is loaded without user
      Examples:
         |username|password  |
         |andres  |andres   |

