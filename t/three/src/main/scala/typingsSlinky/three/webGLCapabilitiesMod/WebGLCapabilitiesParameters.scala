package typingsSlinky.three.webGLCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLCapabilitiesParameters extends js.Object {
  var logarithmicDepthBuffer: js.UndefOr[js.Any] = js.native
  var precision: js.UndefOr[js.Any] = js.native
}

object WebGLCapabilitiesParameters {
  @scala.inline
  def apply(): WebGLCapabilitiesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLCapabilitiesParameters]
  }
  @scala.inline
  implicit class WebGLCapabilitiesParametersOps[Self <: WebGLCapabilitiesParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogarithmicDepthBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmicDepthBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogarithmicDepthBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmicDepthBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
  }
  
}

