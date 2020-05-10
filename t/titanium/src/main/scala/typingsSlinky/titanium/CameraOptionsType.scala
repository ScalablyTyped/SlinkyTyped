package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.Matrix2D
import typingsSlinky.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to [showCamera](Titanium.Media.showCamera).
  */
@js.native
trait CameraOptionsType extends js.Object {
  /**
  	 * Specifies if the media should be editable after capture/selection.
  	 */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if the dialog should be animated upon showing and hiding.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls the type of arrow and position of the popover.
  	 */
  var arrowDirection: js.UndefOr[Double] = js.native
  /**
  	 * Specifies if the camera should be hidden automatically after the media capture is completed.
  	 */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
  	 * Determines if the camera preview should rotate or not.
  	 */
  var autorotate: js.UndefOr[Boolean] = js.native
  /**
  	 * Function to call if the user presses the cancel button.
  	 */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
  	 * Function to call upon receiving an error.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
  	 * Show the camera in a popover.
  	 */
  var inPopOver: js.UndefOr[Boolean] = js.native
  /**
  	 * Array of media type constants to allow. Note: If you want to select live photos, iOS only  allows
  	 * you to select existing live photos from the gallery, capturing new live photos is not supported by
  	 * iOS public API, yet.
  	 */
  var mediaTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
  	 * View to added as an overlay to the camera UI (on top).
  	 */
  var overlay: js.UndefOr[View] = js.native
  /**
  	 * View to position the camera or photo gallery popover on top of.
  	 */
  var popoverView: js.UndefOr[View] = js.native
  /**
  	 * Specifies if the media should be saved to the photo gallery upon successful capture.
  	 */
  var saveToPhotoGallery: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates if the built-in camera controls should be displayed.
  	 */
  var showControls: js.UndefOr[Boolean] = js.native
  /**
  	 * Function to call when the camera is closed after a successful capture/selection.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ CameraMediaItemType, Unit]] = js.native
  /**
  	 * Transformation matrix to apply to the camera or photogallery view.
  	 */
  var transform: js.UndefOr[Matrix2D] = js.native
  /**
  	 * Maximum duration (in milliseconds) to allow video capture before completing.
  	 */
  var videoMaximumDuration: js.UndefOr[Double] = js.native
  /**
  	 * Constant to indicate the video quality during capture.
  	 */
  var videoQuality: js.UndefOr[Double] = js.native
  /**
  	 * Opens the camera with the specified camera direction.
  	 */
  var whichCamera: js.UndefOr[Double] = js.native
}

object CameraOptionsType {
  @scala.inline
  def apply(): CameraOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptionsType]
  }
  @scala.inline
  implicit class CameraOptionsTypeOps[Self <: CameraOptionsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(js.undefined)
        ret
    }
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
    def withArrowDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withAutohide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutohide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(js.undefined)
        ret
    }
    @scala.inline
    def withAutorotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutorotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorotate")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* param0 */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* param0 */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withInPopOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPopOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInPopOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPopOver")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaTypes(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverView")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveToPhotoGallery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveToPhotoGallery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveToPhotoGallery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveToPhotoGallery")(js.undefined)
        ret
    }
    @scala.inline
    def withShowControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showControls")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* param0 */ CameraMediaItemType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: Matrix2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoMaximumDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMaximumDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoMaximumDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMaximumDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withWhichCamera(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whichCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhichCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whichCamera")(js.undefined)
        ret
    }
  }
  
}

