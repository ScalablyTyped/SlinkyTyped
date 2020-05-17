package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnRowErrorStateChanged extends IEventArgs {
  var bAddingError: Boolean = js.native
  var bErrorCurrentlyInRow: Boolean = js.native
  var bRowHadError: Boolean = js.native
  var errorId: Double = js.native
  var message: String = js.native
  var recordKey: Double = js.native
}

object OnRowErrorStateChanged {
  @scala.inline
  def apply(
    bAddingError: Boolean,
    bErrorCurrentlyInRow: Boolean,
    bRowHadError: Boolean,
    errorId: Double,
    message: String,
    recordKey: Double
  ): OnRowErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAddingError = bAddingError.asInstanceOf[js.Any], bErrorCurrentlyInRow = bErrorCurrentlyInRow.asInstanceOf[js.Any], bRowHadError = bRowHadError.asInstanceOf[js.Any], errorId = errorId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowErrorStateChanged]
  }
  @scala.inline
  implicit class OnRowErrorStateChangedOps[Self <: OnRowErrorStateChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBAddingError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bAddingError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBErrorCurrentlyInRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bErrorCurrentlyInRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRowHadError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bRowHadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

