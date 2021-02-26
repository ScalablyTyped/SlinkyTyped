package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListEmployeesResponse")
@js.native
class ListEmployeesResponse () extends StObject {
  
  /**
    * The token to be used to retrieve the next page of results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * List of employees returned from the request.
    */
  var employees: js.UndefOr[js.Array[Employee]] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
