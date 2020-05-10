package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the data that describes a document page. */
@js.native
trait PrintPageDescription extends js.Object {
  /** The resolution in dots per inch (DPI) for the X dimension of the page. */
  var dpiX: Double = js.native
  /** The resolution in dots per inch (DPI) for the Y dimension of the page. */
  var dpiY: Double = js.native
  /** The Rect within the page size on which content may actually be printed. Content outside of the ImageableRect, whether less or greater than the page size, will be cropped by the print target. The ImageableRect is specified in device independent pixels (DIPs). */
  var imageableRect: Rect = js.native
  /** The page size in device independent pixels (DIPs). */
  var pageSize: Size = js.native
}

object PrintPageDescription {
  @scala.inline
  def apply(dpiX: Double, dpiY: Double, imageableRect: Rect, pageSize: Size): PrintPageDescription = {
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], imageableRect = imageableRect.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintPageDescription]
  }
  @scala.inline
  implicit class PrintPageDescriptionOps[Self <: PrintPageDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDpiX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpiX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDpiY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpiY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageableRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageableRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

