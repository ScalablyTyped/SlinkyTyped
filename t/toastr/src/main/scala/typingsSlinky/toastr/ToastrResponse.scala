package typingsSlinky.toastr

import typingsSlinky.toastr.toastrStrings.hidden
import typingsSlinky.toastr.toastrStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastrResponse extends js.Object {
  /**
    * The datetime the toast was closed, if the state is hidden.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  /**
    * The event's toast details.
    */
  var map: ToastMap
  /**
    * The toastr options.
    */
  var options: ToastrOptions
  /**
    * The datetime the toast was opened.
    */
  var startTime: js.Date
  /**
    * The current state of the toast.
    */
  var state: visible | hidden
  /**
    * The internal toast id.
    */
  var toastId: Double
}

object ToastrResponse {
  @scala.inline
  def apply(
    map: ToastMap,
    options: ToastrOptions,
    startTime: js.Date,
    state: visible | hidden,
    toastId: Double,
    endTime: js.Date = null
  ): ToastrResponse = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrResponse]
  }
}

