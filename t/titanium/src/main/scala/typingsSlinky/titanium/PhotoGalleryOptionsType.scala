package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to
  * [openPhotoGallery](Titanium.Media.openPhotoGallery).
  */
@js.native
trait PhotoGalleryOptionsType extends js.Object {
  /**
  	 * Specifies if the media should be editable after capture/selection.
  	 */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if the user should be able to select multiple photos.
  	 */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if the video should be transcoded (using highest quality preset) . If set to false no video transcoding will be performed.
  	 */
  var allowTranscoding: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if the dialog should be animated upon showing and hiding.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls the type of arrow and position of the popover.
  	 */
  var arrowDirection: js.UndefOr[Double] = js.native
  /**
  	 * Specifies if the photo gallery should be hidden automatically after the media
  	 * selection is completed.
  	 */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
  	 * Function to call if the user presses the cancel button.
  	 */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
  	 * Function to call upon receiving an error.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
  	 * Array of media type constants to allow.
  	 * Live photos is only supported on the iOS platform, starting with iOS 9.1. If you want
  	 * to allow live photos with <Titanium.Media.MEDIA_TYPE_LIVEPHOTO>, you also need to specify
  	 * at least <Titanium.Media.MEDIA_TYPE_PHOTO> as a fallback. If you do not allow live
  	 * photos, they still can be selected, but will be represented as a normal static photo.
  	 */
  var mediaTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
  	 * View to position the photo gallery popover on top of.
  	 */
  var popoverView: js.UndefOr[View] = js.native
  /**
  	 * Function to call when the photo gallery is closed after a successful selection.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ CameraMediaItemType, Unit]] = js.native
}

object PhotoGalleryOptionsType {
  @scala.inline
  def apply(): PhotoGalleryOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoGalleryOptionsType]
  }
  @scala.inline
  implicit class PhotoGalleryOptionsTypeOps[Self <: PhotoGalleryOptionsType] (val x: Self) extends AnyVal {
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
    def withAllowMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTranscoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTranscoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTranscoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTranscoding")(js.undefined)
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
  }
  
}

