package typingsSlinky.winrtUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the scan resolution. */
@js.native
trait ImageScannerResolution extends js.Object {
  /** The horizontal size. */
  var dpiX: Double = js.native
  /** The vertical size. */
  var dpiY: Double = js.native
}

object ImageScannerResolution {
  @scala.inline
  def apply(dpiX: Double, dpiY: Double): ImageScannerResolution = {
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerResolution]
  }
  @scala.inline
  implicit class ImageScannerResolutionOps[Self <: ImageScannerResolution] (val x: Self) extends AnyVal {
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
  }
  
}

