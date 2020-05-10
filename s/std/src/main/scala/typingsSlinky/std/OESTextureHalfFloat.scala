package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OES_texture_half_float extension is part of the WebGL API and adds texture formats with 16- (aka half float) and 32-bit floating-point components. */
@js.native
trait OESTextureHalfFloat extends js.Object {
  val HALF_FLOAT_OES: GLenum = js.native
}

object OESTextureHalfFloat {
  @scala.inline
  def apply(HALF_FLOAT_OES: GLenum): OESTextureHalfFloat = {
    val __obj = js.Dynamic.literal(HALF_FLOAT_OES = HALF_FLOAT_OES.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESTextureHalfFloat]
  }
  @scala.inline
  implicit class OESTextureHalfFloatOps[Self <: OESTextureHalfFloat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHALF_FLOAT_OES(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HALF_FLOAT_OES")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

