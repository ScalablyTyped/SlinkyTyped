package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the options for displaying the full contact card. */
@js.native
trait FullContactCardOptions extends js.Object {
  /** Gets or sets a value that describes the desired view size for the full contact card. */
  var desiredRemainingView: ViewSizePreference = js.native
}

object FullContactCardOptions {
  @scala.inline
  def apply(desiredRemainingView: ViewSizePreference): FullContactCardOptions = {
    val __obj = js.Dynamic.literal(desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullContactCardOptions]
  }
  @scala.inline
  implicit class FullContactCardOptionsOps[Self <: FullContactCardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredRemainingView(value: ViewSizePreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredRemainingView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

