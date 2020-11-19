package typingsSlinky.squareConnect.mod

import typingsSlinky.squareConnect.squareConnectStrings.CLOSED
import typingsSlinky.squareConnect.squareConnectStrings.OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ShiftFilter")
@js.native
class ShiftFilter () extends js.Object {
  
  /**
    * Fetch shifts for the specified employee.
    */
  var employee_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Fetch the `Shift`s that end in the time range - Inclusive.
    */
  var end: js.UndefOr[TimeRange] = js.native
  
  /**
    * Fetch shifts for the specified location.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Fetch `Shift`s that start in the time range - Inclusive.
    */
  var start: js.UndefOr[TimeRange] = js.native
  
  /**
    * Fetch a `Shift` instance by `Shift.status`. See [ShiftFilterStatus](#type-shiftfilterstatus) for possible values.
    */
  var status: js.UndefOr[OPEN | CLOSED] = js.native
  
  /**
    * Fetch the `Shift`s based on workday date range.
    */
  var workday: js.UndefOr[ShiftWorkday] = js.native
}
