package typingsSlinky.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialSurfaceObserver extends js.Object {
   /* unmapped type */ var addEventListener: js.Any = js.native
   /* unmapped type */ var getObservedSurfaces: js.Any = js.native
   /* unmapped type */ var onobservedsurfaceschanged: js.Any = js.native
   /* unmapped type */ var removeEventListener: js.Any = js.native
   /* unmapped type */ var setBoundingVolume: js.Any = js.native
   /* unmapped type */ var setBoundingVolumes: js.Any = js.native
}

object SpatialSurfaceObserver {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    getObservedSurfaces: js.Any,
    onobservedsurfaceschanged: js.Any,
    removeEventListener: js.Any,
    setBoundingVolume: js.Any,
    setBoundingVolumes: js.Any
  ): SpatialSurfaceObserver = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], getObservedSurfaces = getObservedSurfaces.asInstanceOf[js.Any], onobservedsurfaceschanged = onobservedsurfaceschanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], setBoundingVolume = setBoundingVolume.asInstanceOf[js.Any], setBoundingVolumes = setBoundingVolumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceObserver]
  }
  @scala.inline
  implicit class SpatialSurfaceObserverOps[Self <: SpatialSurfaceObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetObservedSurfaces(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObservedSurfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnobservedsurfaceschanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onobservedsurfaceschanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBoundingVolume(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBoundingVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBoundingVolumes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBoundingVolumes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

