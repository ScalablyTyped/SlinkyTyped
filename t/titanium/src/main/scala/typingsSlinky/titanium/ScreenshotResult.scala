package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter passed to the <Titanium.Media.takeScreenshot> callback.
  */
@js.native
trait ScreenshotResult extends js.Object {
  /**
  	 * The screenshot image.
  	 */
  var media: js.UndefOr[Blob] = js.native
}

object ScreenshotResult {
  @scala.inline
  def apply(): ScreenshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotResult]
  }
  @scala.inline
  implicit class ScreenshotResultOps[Self <: ScreenshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

