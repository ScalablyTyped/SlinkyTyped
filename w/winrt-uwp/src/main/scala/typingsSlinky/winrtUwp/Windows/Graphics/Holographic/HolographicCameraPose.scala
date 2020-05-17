package typingsSlinky.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolographicCameraPose extends js.Object {
  var farPlaneDistance: js.Any = js.native
   /* unmapped type */ var holographicCamera: js.Any = js.native
   /* unmapped type */ var nearPlaneDistance: js.Any = js.native
   /* unmapped type */ var projectionTransform: js.Any = js.native
   /* unmapped type */ var tryGetCullingFrustum: js.Any = js.native
   /* unmapped type */ var tryGetViewTransform: js.Any = js.native
   /* unmapped type */ var tryGetVisibleFrustum: js.Any = js.native
   /* unmapped type */ var viewport: js.Any = js.native
}

object HolographicCameraPose {
  @scala.inline
  def apply(
    farPlaneDistance: js.Any,
    holographicCamera: js.Any,
    nearPlaneDistance: js.Any,
    projectionTransform: js.Any,
    tryGetCullingFrustum: js.Any,
    tryGetViewTransform: js.Any,
    tryGetVisibleFrustum: js.Any,
    viewport: js.Any
  ): HolographicCameraPose = {
    val __obj = js.Dynamic.literal(farPlaneDistance = farPlaneDistance.asInstanceOf[js.Any], holographicCamera = holographicCamera.asInstanceOf[js.Any], nearPlaneDistance = nearPlaneDistance.asInstanceOf[js.Any], projectionTransform = projectionTransform.asInstanceOf[js.Any], tryGetCullingFrustum = tryGetCullingFrustum.asInstanceOf[js.Any], tryGetViewTransform = tryGetViewTransform.asInstanceOf[js.Any], tryGetVisibleFrustum = tryGetVisibleFrustum.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicCameraPose]
  }
  @scala.inline
  implicit class HolographicCameraPoseOps[Self <: HolographicCameraPose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFarPlaneDistance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farPlaneDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHolographicCamera(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holographicCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNearPlaneDistance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearPlaneDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectionTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetCullingFrustum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetCullingFrustum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetViewTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetViewTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetVisibleFrustum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetVisibleFrustum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

