package typingsSlinky.toastr

import typingsSlinky.toastr.toastrStrings.hidden
import typingsSlinky.toastr.toastrStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrResponse extends js.Object {
  /**
  	 * The datetime the toast was closed, if the state is hidden.
  	 */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
  	 * The event's toast details.
  	 */
  var map: ToastMap = js.native
  /**
  	 * The toastr options.
  	 */
  var options: ToastrOptions = js.native
  /**
  	 * The datetime the toast was opened.
  	 */
  var startTime: js.Date = js.native
  /**
  	 * The current state of the toast.
  	 */
  var state: visible | hidden = js.native
  /**
  	 * The internal toast id.
  	 */
  var toastId: Double = js.native
}

object ToastrResponse {
  @scala.inline
  def apply(
    map: ToastMap,
    options: ToastrOptions,
    startTime: js.Date,
    state: visible | hidden,
    toastId: Double
  ): ToastrResponse = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrResponse]
  }
  @scala.inline
  implicit class ToastrResponseOps[Self <: ToastrResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMap(value: ToastMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ToastrOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: visible | hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToastId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
  }
  
}

