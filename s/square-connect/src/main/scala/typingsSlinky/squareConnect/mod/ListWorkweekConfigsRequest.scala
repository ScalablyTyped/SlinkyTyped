package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListWorkweekConfigsRequest")
@js.native
class ListWorkweekConfigsRequest () extends js.Object {
  
  /**
    * Pointer to the next page of Workweek Config results to fetch.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of Workweek Configs to return per page.
    */
  var limit: js.UndefOr[Double] = js.native
}
