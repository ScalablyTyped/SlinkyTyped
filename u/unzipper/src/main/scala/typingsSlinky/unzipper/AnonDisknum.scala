package typingsSlinky.unzipper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisknum extends js.Object {
  var compressedSize: Double = js.native
  var disknum: Double = js.native
  var offset: Double = js.native
  var partsize: Double = js.native
  var signature: Double = js.native
  var uncompressedSize: Double = js.native
}

object AnonDisknum {
  @scala.inline
  def apply(
    compressedSize: Double,
    disknum: Double,
    offset: Double,
    partsize: Double,
    signature: Double,
    uncompressedSize: Double
  ): AnonDisknum = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], disknum = disknum.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partsize = partsize.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisknum]
  }
  @scala.inline
  implicit class AnonDisknumOps[Self <: AnonDisknum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompressedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisknum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disknum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncompressedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncompressedSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

