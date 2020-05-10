package typingsSlinky.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertStrings extends js.Object {
  /**
    * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
    */
  var confirmButtonLabel: js.UndefOr[String] = js.native
  /**
    *  The message to be displyed in the alert dialog.
    */
  var text: String = js.native
  /**
    * (Optional) String. The title of the alert dialog.
    */
  var title: js.UndefOr[String] = js.native
}

object AlertStrings {
  @scala.inline
  def apply(text: String): AlertStrings = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertStrings]
  }
  @scala.inline
  implicit class AlertStringsOps[Self <: AlertStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

