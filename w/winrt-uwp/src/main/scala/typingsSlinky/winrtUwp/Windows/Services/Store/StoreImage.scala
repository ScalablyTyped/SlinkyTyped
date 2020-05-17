package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an image that is associated with a product listing in the Windows Store. */
@js.native
trait StoreImage extends js.Object {
  /** Gets the caption for the image. */
  var caption: String = js.native
  /** Gets the height of the image, in pixels. */
  var height: Double = js.native
  /** Gets the tag for the image. */
  var imagePurposeTag: String = js.native
  /** Gets the URI of the image. */
  var uri: Uri = js.native
  /** Gets the width of the image, in pixels. */
  var width: Double = js.native
}

object StoreImage {
  @scala.inline
  def apply(caption: String, height: Double, imagePurposeTag: String, uri: Uri, width: Double): StoreImage = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imagePurposeTag = imagePurposeTag.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreImage]
  }
  @scala.inline
  implicit class StoreImageOps[Self <: StoreImage] (val x: Self) extends AnyVal {
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
    def withImagePurposeTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePurposeTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
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

