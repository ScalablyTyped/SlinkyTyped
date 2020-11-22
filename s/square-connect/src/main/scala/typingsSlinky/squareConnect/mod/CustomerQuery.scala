package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomerQuery")
@js.native
class CustomerQuery () extends js.Object {
  
  /**
    * A list of filtering criteria.
    */
  var filter: js.UndefOr[CustomerFilter] = js.native
  
  /**
    * Sorting criteria for query results. The default behavior is to sort  customers alphabetically by `given_name` and `family_name`.
    */
  var sort: js.UndefOr[CustomerSort] = js.native
}
