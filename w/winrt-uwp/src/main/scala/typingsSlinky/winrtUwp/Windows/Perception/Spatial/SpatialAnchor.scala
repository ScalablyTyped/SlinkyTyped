package typingsSlinky.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialAnchor extends js.Object {
   /* unmapped type */ var addEventListener: js.Any = js.native
   /* unmapped type */ var coordinateSystem: js.Any = js.native
   /* unmapped type */ var onrawcoordinatesystemadjusted: js.Any = js.native
   /* unmapped type */ var rawCoordinateSystem: js.Any = js.native
   /* unmapped type */ var removeEventListener: js.Any = js.native
}

object SpatialAnchor {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    coordinateSystem: js.Any,
    onrawcoordinatesystemadjusted: js.Any,
    rawCoordinateSystem: js.Any,
    removeEventListener: js.Any
  ): SpatialAnchor = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], onrawcoordinatesystemadjusted = onrawcoordinatesystemadjusted.asInstanceOf[js.Any], rawCoordinateSystem = rawCoordinateSystem.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchor]
  }
  @scala.inline
  implicit class SpatialAnchorOps[Self <: SpatialAnchor] (val x: Self) extends AnyVal {
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
    def withCoordinateSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnrawcoordinatesystemadjusted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrawcoordinatesystemadjusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawCoordinateSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawCoordinateSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

