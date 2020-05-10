package typingsSlinky.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDrawBuffers extends js.Object {
  var derivatives: Boolean = js.native
  var drawBuffers: Boolean = js.native
  var fragDepth: Boolean = js.native
  var shaderTextureLOD: Boolean = js.native
}

object AnonDrawBuffers {
  @scala.inline
  def apply(derivatives: Boolean, drawBuffers: Boolean, fragDepth: Boolean, shaderTextureLOD: Boolean): AnonDrawBuffers = {
    val __obj = js.Dynamic.literal(derivatives = derivatives.asInstanceOf[js.Any], drawBuffers = drawBuffers.asInstanceOf[js.Any], fragDepth = fragDepth.asInstanceOf[js.Any], shaderTextureLOD = shaderTextureLOD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDrawBuffers]
  }
  @scala.inline
  implicit class AnonDrawBuffersOps[Self <: AnonDrawBuffers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDerivatives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawBuffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShaderTextureLOD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaderTextureLOD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

