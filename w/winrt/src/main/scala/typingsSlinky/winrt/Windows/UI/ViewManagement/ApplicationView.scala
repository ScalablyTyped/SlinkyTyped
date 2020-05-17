package typingsSlinky.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationView extends js.Object {
  /**
  			 * Gets whether the current window (app view) is adjacent to the left edge of the screen.
  			**/
  var adjacentToLeftDisplayEdge: Double = js.native
  /**
  			 * Gets whether the current window (app view) is adjacent to the right edge of the screen.
  			**/
  var adjacentToRightDisplayEdge: Boolean = js.native
  /**
  			 * Gets the current ID of the window (app view) .
  			**/
  var id: Double = js.native
  /**
  			 * Gets whether the window(app view) is full screen or not.
  			**/
  var isFullScreen: Boolean = js.native
  /**
  			 * Gets whether the window (app view) is on the Windows lock screen.
  			**/
  var isOnLockScreen: Boolean = js.native
  /**
  			 * Gets or sets whether screen capture is enabled for the window (app view).
  			**/
  var isScreenCaptureEnabled: Boolean = js.native
  /**
  			 * Gets the current orientation of the window (app view) with respect to the display.
  			**/
  var orientation: ApplicationViewOrientation = js.native
  /**
  			 * Gets or sets the displayed title of the window.
  			**/
  var title: String = js.native
  /**
  			 * Gets the title bar of the app.
  			**/
  var titleBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationViewTitleBar */ js.Any = js.native
}

object ApplicationView {
  @scala.inline
  def apply(
    adjacentToLeftDisplayEdge: Double,
    adjacentToRightDisplayEdge: Boolean,
    id: Double,
    isFullScreen: Boolean,
    isOnLockScreen: Boolean,
    isScreenCaptureEnabled: Boolean,
    orientation: ApplicationViewOrientation,
    title: String,
    titleBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationViewTitleBar */ js.Any
  ): ApplicationView = {
    val __obj = js.Dynamic.literal(adjacentToLeftDisplayEdge = adjacentToLeftDisplayEdge.asInstanceOf[js.Any], adjacentToRightDisplayEdge = adjacentToRightDisplayEdge.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFullScreen = isFullScreen.asInstanceOf[js.Any], isOnLockScreen = isOnLockScreen.asInstanceOf[js.Any], isScreenCaptureEnabled = isScreenCaptureEnabled.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleBar = titleBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationView]
  }
  @scala.inline
  implicit class ApplicationViewOps[Self <: ApplicationView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjacentToLeftDisplayEdge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacentToLeftDisplayEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdjacentToRightDisplayEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacentToRightDisplayEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOnLockScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnLockScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScreenCaptureEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScreenCaptureEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: ApplicationViewOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationViewTitleBar */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

