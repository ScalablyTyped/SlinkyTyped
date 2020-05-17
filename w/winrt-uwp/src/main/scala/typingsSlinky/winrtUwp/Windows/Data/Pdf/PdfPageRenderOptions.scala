package typingsSlinky.winrtUwp.Windows.Data.Pdf

import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
@js.native
trait PdfPageRenderOptions extends js.Object {
  /** Gets or sets the Portable Document Format (PDF) page's background color. */
  var backgroundColor: Color = js.native
  /** Gets or sets the Portable Document Format (PDF) page's encoding type to be used while the page is being converted to a bitmap. */
  var bitmapEncoderId: String = js.native
  /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
  var destinationHeight: Double = js.native
  /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
  var destinationWidth: Double = js.native
  /** Gets or sets whether the Portable Document Format (PDF) page uses the system's high contrast display setting. */
  var isIgnoringHighContrast: Boolean = js.native
  /** Gets or sets a portion of the Portable Document Format (PDF) page to be displayed. */
  var sourceRect: Rect = js.native
}

object PdfPageRenderOptions {
  @scala.inline
  def apply(
    backgroundColor: Color,
    bitmapEncoderId: String,
    destinationHeight: Double,
    destinationWidth: Double,
    isIgnoringHighContrast: Boolean,
    sourceRect: Rect
  ): PdfPageRenderOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bitmapEncoderId = bitmapEncoderId.asInstanceOf[js.Any], destinationHeight = destinationHeight.asInstanceOf[js.Any], destinationWidth = destinationWidth.asInstanceOf[js.Any], isIgnoringHighContrast = isIgnoringHighContrast.asInstanceOf[js.Any], sourceRect = sourceRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfPageRenderOptions]
  }
  @scala.inline
  implicit class PdfPageRenderOptionsOps[Self <: PdfPageRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitmapEncoderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmapEncoderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIgnoringHighContrast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIgnoringHighContrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

