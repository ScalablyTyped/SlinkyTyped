package typingsSlinky.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a visibilitychanged event that is associated with a searchPane object. */
@js.native
trait SearchPaneVisibilityChangedEventArgs extends js.Object {
  /** Indicates whether the search pane is open. */
  var visible: Boolean = js.native
}

object SearchPaneVisibilityChangedEventArgs {
  @scala.inline
  def apply(visible: Boolean): SearchPaneVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneVisibilityChangedEventArgs]
  }
  @scala.inline
  implicit class SearchPaneVisibilityChangedEventArgsOps[Self <: SearchPaneVisibilityChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

