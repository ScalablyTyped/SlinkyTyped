package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video that is associated with a product listing in the Windows Store. */
@js.native
trait StoreVideo extends js.Object {
  /** Gets the caption for the video. */
  var caption: String = js.native
  /** Gets the height of the video, in pixels. */
  var height: Double = js.native
  /** Gets the preview image that is displayed for the video. */
  var previewImage: StoreImage = js.native
  /** Gets the URI of the video. */
  var uri: Uri = js.native
  /** Gets the tag for the video. */
  var videoPurposeTag: String = js.native
  /** Gets the width of the video, in pixels. */
  var width: Double = js.native
}

object StoreVideo {
  @scala.inline
  def apply(
    caption: String,
    height: Double,
    previewImage: StoreImage,
    uri: Uri,
    videoPurposeTag: String,
    width: Double
  ): StoreVideo = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], previewImage = previewImage.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], videoPurposeTag = videoPurposeTag.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreVideo]
  }
  @scala.inline
  implicit class StoreVideoOps[Self <: StoreVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewImage(value: StoreImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoPurposeTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoPurposeTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

