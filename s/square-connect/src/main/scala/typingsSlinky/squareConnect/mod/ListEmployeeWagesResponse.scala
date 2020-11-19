package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListEmployeeWagesResponse")
@js.native
class ListEmployeeWagesResponse () extends js.Object {
  
  /**
    * Value supplied in the subsequent request to fetch the next next page of Employee Wage results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * A page of Employee Wage results.
    */
  var employee_wages: js.UndefOr[js.Array[EmployeeWage]] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
