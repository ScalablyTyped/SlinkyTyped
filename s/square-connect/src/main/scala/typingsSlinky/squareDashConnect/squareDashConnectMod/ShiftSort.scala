package typingsSlinky.squareDashConnect.squareDashConnectMod

import typingsSlinky.squareDashConnect.squareDashConnectStrings.CREATED_AT
import typingsSlinky.squareDashConnect.squareDashConnectStrings.END_AT
import typingsSlinky.squareDashConnect.squareDashConnectStrings.START_AT
import typingsSlinky.squareDashConnect.squareDashConnectStrings.UPDATED_AT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftSort")
@js.native
class ShiftSort () extends js.Object {
  /**
    * The field to sort on. See [ShiftSortField](#type-shiftsortfield) for possible values.
    */
  var field: js.UndefOr[START_AT | END_AT | CREATED_AT | UPDATED_AT] = js.native
  /**
    * The order in which results are returned. Defaults to DESC. See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[SortOrderType] = js.native
}

