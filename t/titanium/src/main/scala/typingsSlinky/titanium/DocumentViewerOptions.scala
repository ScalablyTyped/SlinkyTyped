package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object for specifying options when showing or dismissing a <Titanium.UI.iOS.DocumentViewer>.
  */
@js.native
trait DocumentViewerOptions extends js.Object {
  /**
  	 * Indicates whether to animate the transition.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Anchors the options menu to the specified view.
  	 */
  var view: js.UndefOr[View] = js.native
}

object DocumentViewerOptions {
  @scala.inline
  def apply(): DocumentViewerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewerOptions]
  }
  @scala.inline
  implicit class DocumentViewerOptionsOps[Self <: DocumentViewerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

