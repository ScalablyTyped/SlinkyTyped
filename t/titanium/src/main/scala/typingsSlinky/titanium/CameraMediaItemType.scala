package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Blob
import typingsSlinky.titanium.Titanium.UI.iOS.LivePhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A media object from the camera or photo gallery.
  */
@js.native
trait CameraMediaItemType extends SuccessResponse {
  /**
  	 * Simple object defining the user's selected crop rectangle, or `null` if the user has not edited the photo. `width`/`height` values are assumed to be in pixels.
  	 */
  var cropRect: js.UndefOr[Dimension] = js.native
  /**
  	 * The live photo object, as a <Titanium.UI.iOS.LivePhoto> and
  	 * `undefined` if no live photo is selected.
  	 */
  var livePhoto: js.UndefOr[LivePhoto] = js.native
  /**
  	 * The media object, as a [Blob](Titanium.Blob).
  	 */
  var media: js.UndefOr[Blob] = js.native
  /**
  	 * The type of media, either `MEDIA_TYPE_PHOTO`, `MEDIA_TYPE_LIVEPHOTO` or `MEDIA_TYPE_VIDEO` defined in <Titanium.Media>.
  	 */
  var mediaType: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Simple object defining the preview image size. This will be undefined when custom camera overlay is not used. Values are assumed to be in pixels.
  	 */
  var previewRect: js.UndefOr[Size] = js.native
}

object CameraMediaItemType {
  @scala.inline
  def apply(): CameraMediaItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraMediaItemType]
  }
  @scala.inline
  implicit class CameraMediaItemTypeOps[Self <: CameraMediaItemType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropRect(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropRect")(js.undefined)
        ret
    }
    @scala.inline
    def withLivePhoto(value: LivePhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livePhoto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLivePhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livePhoto")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewRect(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewRect")(js.undefined)
        ret
    }
  }
  
}

