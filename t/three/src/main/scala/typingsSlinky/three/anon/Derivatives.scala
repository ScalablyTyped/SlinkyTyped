package typingsSlinky.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Derivatives extends js.Object {
  var derivatives: js.UndefOr[Boolean] = js.native
  var drawBuffers: js.UndefOr[Boolean] = js.native
  var fragDepth: js.UndefOr[Boolean] = js.native
  var shaderTextureLOD: js.UndefOr[Boolean] = js.native
}

object Derivatives {
  @scala.inline
  def apply(): Derivatives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Derivatives]
  }
  @scala.inline
  implicit class DerivativesOps[Self <: Derivatives] (val x: Self) extends AnyVal {
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
    def withoutDerivatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivatives")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawBuffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBuffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBuffers")(js.undefined)
        ret
    }
    @scala.inline
    def withFragDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withShaderTextureLOD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaderTextureLOD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShaderTextureLOD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaderTextureLOD")(js.undefined)
        ret
    }
  }
  
}

