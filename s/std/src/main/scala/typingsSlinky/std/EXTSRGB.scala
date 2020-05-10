package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EXTSRGB extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum = js.native
  val SRGB8_ALPHA8_EXT: GLenum = js.native
  val SRGB_ALPHA_EXT: GLenum = js.native
  val SRGB_EXT: GLenum = js.native
}

object EXTSRGB {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum,
    SRGB8_ALPHA8_EXT: GLenum,
    SRGB_ALPHA_EXT: GLenum,
    SRGB_EXT: GLenum
  ): EXTSRGB = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT.asInstanceOf[js.Any], SRGB8_ALPHA8_EXT = SRGB8_ALPHA8_EXT.asInstanceOf[js.Any], SRGB_ALPHA_EXT = SRGB_ALPHA_EXT.asInstanceOf[js.Any], SRGB_EXT = SRGB_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTSRGB]
  }
  @scala.inline
  implicit class EXTSRGBOps[Self <: EXTSRGB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSRGB8_ALPHA8_EXT(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SRGB8_ALPHA8_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSRGB_ALPHA_EXT(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SRGB_ALPHA_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSRGB_EXT(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SRGB_EXT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

