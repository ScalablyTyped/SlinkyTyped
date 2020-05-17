package typingsSlinky.winrtUwp.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies options for user interface elements such as the application picker that can be invoked by this API. */
@js.native
trait LauncherUIOptions extends js.Object {
  /** Gets or sets the point on the screen where the user opened a file or URI. */
  var invocationPoint: Point = js.native
  /** Gets or sets the preferred placement of the Open With and Warning dialog boxes when starting a default app. */
  var preferredPlacement: Placement = js.native
  /** Gets or sets the selection rectangle on the screen where the user opened a file or URI. */
  var selectionRect: Rect = js.native
}

object LauncherUIOptions {
  @scala.inline
  def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): LauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[LauncherUIOptions]
  }
  @scala.inline
  implicit class LauncherUIOptionsOps[Self <: LauncherUIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvocationPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

