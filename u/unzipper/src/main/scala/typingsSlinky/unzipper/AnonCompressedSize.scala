package typingsSlinky.unzipper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompressedSize extends js.Object {
  var compressedSize: Double = js.native
  var compressionMethod: Double = js.native
  var crc32: Double = js.native
  var extraFieldLength: Double = js.native
  var fileNameLength: Double = js.native
  var flags: Double = js.native
  var lastModifiedTime: Double = js.native
  var signature: js.UndefOr[Double] = js.native
  var versionsNeededToExtract: Double = js.native
}

object AnonCompressedSize {
  @scala.inline
  def apply(
    compressedSize: Double,
    compressionMethod: Double,
    crc32: Double,
    extraFieldLength: Double,
    fileNameLength: Double,
    flags: Double,
    lastModifiedTime: Double,
    versionsNeededToExtract: Double
  ): AnonCompressedSize = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], compressionMethod = compressionMethod.asInstanceOf[js.Any], crc32 = crc32.asInstanceOf[js.Any], extraFieldLength = extraFieldLength.asInstanceOf[js.Any], fileNameLength = fileNameLength.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], versionsNeededToExtract = versionsNeededToExtract.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompressedSize]
  }
  @scala.inline
  implicit class AnonCompressedSizeOps[Self <: AnonCompressedSize] (val x: Self) extends AnyVal {
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
    def withCompressionMethod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrc32(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crc32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraFieldLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraFieldLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileNameLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNameLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionsNeededToExtract(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionsNeededToExtract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}

