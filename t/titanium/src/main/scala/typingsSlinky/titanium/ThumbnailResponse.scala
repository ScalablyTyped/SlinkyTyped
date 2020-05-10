package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the thumbnail callback in response to the
  * [requestThumbnailImagesAtTimes](Titanium.Media.VideoPlayer.requestThumbnailImagesAtTimes)
  * method.
  */
@js.native
trait ThumbnailResponse extends ErrorResponse {
  /**
  	 * Thumbnail image, as a `Blob`.
  	 */
  var image: js.UndefOr[Blob] = js.native
  /**
  	 * Time offset for the thumbnail, in seconds.
  	 */
  var time: js.UndefOr[Double] = js.native
}

object ThumbnailResponse {
  @scala.inline
  def apply(): ThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailResponse]
  }
  @scala.inline
  implicit class ThumbnailResponseOps[Self <: ThumbnailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

