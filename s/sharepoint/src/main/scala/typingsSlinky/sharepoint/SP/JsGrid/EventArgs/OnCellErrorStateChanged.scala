package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCellErrorStateChanged extends IEventArgs {
  var bAddingError: Boolean = js.native
  var bCellCurrentlyHasError: Boolean = js.native
  var bCellHadError: Boolean = js.native
  var errorId: Double = js.native
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

object OnCellErrorStateChanged {
  @scala.inline
  def apply(
    bAddingError: Boolean,
    bCellCurrentlyHasError: Boolean,
    bCellHadError: Boolean,
    errorId: Double,
    fieldKey: String,
    recordKey: Double
  ): OnCellErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAddingError = bAddingError.asInstanceOf[js.Any], bCellCurrentlyHasError = bCellCurrentlyHasError.asInstanceOf[js.Any], bCellHadError = bCellHadError.asInstanceOf[js.Any], errorId = errorId.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCellErrorStateChanged]
  }
  @scala.inline
  implicit class OnCellErrorStateChangedOps[Self <: OnCellErrorStateChanged] (val x: Self) extends AnyVal {
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
    def withBCellCurrentlyHasError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bCellCurrentlyHasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBCellHadError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bCellHadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKey")(value.asInstanceOf[js.Any])
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

