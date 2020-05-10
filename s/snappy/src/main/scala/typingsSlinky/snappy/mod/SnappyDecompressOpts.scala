package typingsSlinky.snappy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnappyDecompressOpts extends js.Object {
  var asBuffer: Boolean = js.native
}

object SnappyDecompressOpts {
  @scala.inline
  def apply(asBuffer: Boolean): SnappyDecompressOpts = {
    val __obj = js.Dynamic.literal(asBuffer = asBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnappyDecompressOpts]
  }
  @scala.inline
  implicit class SnappyDecompressOptsOps[Self <: SnappyDecompressOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBuffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

