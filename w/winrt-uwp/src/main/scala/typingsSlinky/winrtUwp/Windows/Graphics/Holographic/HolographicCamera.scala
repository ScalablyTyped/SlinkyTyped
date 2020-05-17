package typingsSlinky.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolographicCamera extends js.Object {
  var id: js.Any = js.native
   /* unmapped type */ var isStereo: js.Any = js.native
   /* unmapped type */ var renderTargetSize: js.Any = js.native
   /* unmapped type */ var setFarPlaneDistance: js.Any = js.native
   /* unmapped type */ var setNearPlaneDistance: js.Any = js.native
   /* unmapped type */ var viewportScaleFactor: js.Any = js.native
}

object HolographicCamera {
  @scala.inline
  def apply(
    id: js.Any,
    isStereo: js.Any,
    renderTargetSize: js.Any,
    setFarPlaneDistance: js.Any,
    setNearPlaneDistance: js.Any,
    viewportScaleFactor: js.Any
  ): HolographicCamera = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isStereo = isStereo.asInstanceOf[js.Any], renderTargetSize = renderTargetSize.asInstanceOf[js.Any], setFarPlaneDistance = setFarPlaneDistance.asInstanceOf[js.Any], setNearPlaneDistance = setNearPlaneDistance.asInstanceOf[js.Any], viewportScaleFactor = viewportScaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicCamera]
  }
  @scala.inline
  implicit class HolographicCameraOps[Self <: HolographicCamera] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStereo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStereo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTargetSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTargetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFarPlaneDistance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFarPlaneDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetNearPlaneDistance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNearPlaneDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportScaleFactor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

