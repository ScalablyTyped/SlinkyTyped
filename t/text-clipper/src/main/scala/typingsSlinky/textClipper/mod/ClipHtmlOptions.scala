package typingsSlinky.textClipper.mod

import typingsSlinky.textClipper.textClipperBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipHtmlOptions extends CommonClipOptions {
  /**
    * Set to true if the string is HTML-encoded. If so, this method will take extra care to make
    * sure the HTML-encoding is correctly maintained.
    */
  var html: `true` = js.native
  /**
    * The amount of characters to assume for images. This is used whenever an image is encountered,
    * but also for SVG and MathML content. Default: 2.
    */
  var imageWeight: js.UndefOr[Double] = js.native
}

object ClipHtmlOptions {
  @scala.inline
  def apply(html: `true`): ClipHtmlOptions = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipHtmlOptions]
  }
  @scala.inline
  implicit class ClipHtmlOptionsOps[Self <: ClipHtmlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWeight")(js.undefined)
        ret
    }
  }
  
}

