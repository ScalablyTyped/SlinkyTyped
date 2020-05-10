package typingsSlinky.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebGL 1 Extensions
@js.native
trait EXTColorBufferHalfFloat extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double = js.native
  val RGB16F_EXT: Double = js.native
  val RGBA16F_EXT: Double = js.native
  val UNSIGNED_NORMALIZED_EXT: Double = js.native
}

object EXTColorBufferHalfFloat {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double,
    RGB16F_EXT: Double,
    RGBA16F_EXT: Double,
    UNSIGNED_NORMALIZED_EXT: Double
  ): EXTColorBufferHalfFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT.asInstanceOf[js.Any], RGB16F_EXT = RGB16F_EXT.asInstanceOf[js.Any], RGBA16F_EXT = RGBA16F_EXT.asInstanceOf[js.Any], UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTColorBufferHalfFloat]
  }
  @scala.inline
  implicit class EXTColorBufferHalfFloatOps[Self <: EXTColorBufferHalfFloat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRGB16F_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RGB16F_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRGBA16F_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RGBA16F_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNSIGNED_NORMALIZED_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSIGNED_NORMALIZED_EXT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

