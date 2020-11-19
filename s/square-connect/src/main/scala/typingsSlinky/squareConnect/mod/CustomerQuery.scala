package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomerQuery")
@js.native
class CustomerQuery () extends js.Object {
  
  /**
    * A list of filter criteria.
    */
  var filter: js.UndefOr[CustomerFilter] = js.native
  
  /**
    * Sort criteria for query results. The default sort behavior is to order customers alphabetically by `given_name`
    * and `last_name`.
    */
  var sort: js.UndefOr[CustomerSort] = js.native
}
