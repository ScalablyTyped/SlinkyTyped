package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to <Titanium.Media.previewImage>.
  */
@js.native
trait PreviewImageOptions extends js.Object {
  /**
  	 * Function called back if the preview fails. Check the `message` property of passed back parameter.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ PreviewImageError, Unit]] = js.native
  /**
  	 * The image to preview. Must be a blob based on a file, such as from <Titanium.Filesystem.File.read>.
  	 */
  var image: js.UndefOr[Blob] = js.native
  /**
  	 * Function to be called back if the preview succeeds. No info is passed.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ SuccessResponse, Unit]] = js.native
}

object PreviewImageOptions {
  @scala.inline
  def apply(): PreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewImageOptions]
  }
  @scala.inline
  implicit class PreviewImageOptionsOps[Self <: PreviewImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: /* param0 */ PreviewImageError => Unit): Self = {
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
    def withImage(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* param0 */ SuccessResponse => Unit): Self = {
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

