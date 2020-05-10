package typingsSlinky.winrt.Windows.UI.ViewManagement

import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputPaneVisibilityEventArgs extends js.Object {
  var ensuredFocusedElementInView: Boolean = js.native
  var occludedRect: Rect = js.native
}

object IInputPaneVisibilityEventArgs {
  @scala.inline
  def apply(ensuredFocusedElementInView: Boolean, occludedRect: Rect): IInputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView.asInstanceOf[js.Any], occludedRect = occludedRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputPaneVisibilityEventArgs]
  }
  @scala.inline
  implicit class IInputPaneVisibilityEventArgsOps[Self <: IInputPaneVisibilityEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnsuredFocusedElementInView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensuredFocusedElementInView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccludedRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occludedRect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

