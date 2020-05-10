package typingsSlinky.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenshotOptions extends js.Object {
  /** returns the page screenshot at the Document Complete point (i.e.: when window.onload was fired) */
  var documentComplete: js.UndefOr[Boolean] = js.native
  /** returns the full resolution screenshot in PNG format if available */
  var fullResolution: js.UndefOr[Boolean] = js.native
  /** returns the page screenshot at the Start Render point (i.e.: when something was first displayed on screen) */
  var startRender: js.UndefOr[Boolean] = js.native
}

object ScreenshotOptions {
  @scala.inline
  def apply(): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotOptions]
  }
  @scala.inline
  implicit class ScreenshotOptionsOps[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withFullResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRender")(js.undefined)
        ret
    }
  }
  
}

