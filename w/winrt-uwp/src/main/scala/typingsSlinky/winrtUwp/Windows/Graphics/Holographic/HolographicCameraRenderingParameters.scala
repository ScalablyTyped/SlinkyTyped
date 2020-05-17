package typingsSlinky.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolographicCameraRenderingParameters extends js.Object {
  var direct3D11BackBuffer: js.Any = js.native
   /* unmapped type */ var direct3D11Device: js.Any = js.native
   /* unmapped type */ var setFocusPoint: js.Any = js.native
}

object HolographicCameraRenderingParameters {
  @scala.inline
  def apply(direct3D11BackBuffer: js.Any, direct3D11Device: js.Any, setFocusPoint: js.Any): HolographicCameraRenderingParameters = {
    val __obj = js.Dynamic.literal(direct3D11BackBuffer = direct3D11BackBuffer.asInstanceOf[js.Any], direct3D11Device = direct3D11Device.asInstanceOf[js.Any], setFocusPoint = setFocusPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicCameraRenderingParameters]
  }
  @scala.inline
  implicit class HolographicCameraRenderingParametersOps[Self <: HolographicCameraRenderingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirect3D11BackBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct3D11BackBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirect3D11Device(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct3D11Device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFocusPoint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocusPoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

