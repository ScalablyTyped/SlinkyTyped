package typingsSlinky.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialSurfaceInfo extends js.Object {
  var id: js.Any = js.native
   /* unmapped type */ var tryComputeLatestMeshAsync: js.Any = js.native
   /* unmapped type */ var tryGetBounds: js.Any = js.native
   /* unmapped type */ var updateTime: js.Any = js.native
}

object SpatialSurfaceInfo {
  @scala.inline
  def apply(id: js.Any, tryComputeLatestMeshAsync: js.Any, tryGetBounds: js.Any, updateTime: js.Any): SpatialSurfaceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tryComputeLatestMeshAsync = tryComputeLatestMeshAsync.asInstanceOf[js.Any], tryGetBounds = tryGetBounds.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceInfo]
  }
  @scala.inline
  implicit class SpatialSurfaceInfoOps[Self <: SpatialSurfaceInfo] (val x: Self) extends AnyVal {
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
    def withTryComputeLatestMeshAsync(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryComputeLatestMeshAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetBounds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

