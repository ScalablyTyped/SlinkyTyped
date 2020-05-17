package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialInteractionManager extends js.Object {
   /* unmapped type */ var addEventListener: js.Any = js.native
   /* unmapped type */ var getDetectedSourcesAtTimestamp: js.Any = js.native
   /* unmapped type */ var oninteractiondetected: js.Any = js.native
   /* unmapped type */ var onsourcedetected: js.Any = js.native
   /* unmapped type */ var onsourcelost: js.Any = js.native
   /* unmapped type */ var onsourcepressed: js.Any = js.native
   /* unmapped type */ var onsourcereleased: js.Any = js.native
   /* unmapped type */ var onsourceupdated: js.Any = js.native
   /* unmapped type */ var removeEventListener: js.Any = js.native
}

object SpatialInteractionManager {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    getDetectedSourcesAtTimestamp: js.Any,
    oninteractiondetected: js.Any,
    onsourcedetected: js.Any,
    onsourcelost: js.Any,
    onsourcepressed: js.Any,
    onsourcereleased: js.Any,
    onsourceupdated: js.Any,
    removeEventListener: js.Any
  ): SpatialInteractionManager = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], getDetectedSourcesAtTimestamp = getDetectedSourcesAtTimestamp.asInstanceOf[js.Any], oninteractiondetected = oninteractiondetected.asInstanceOf[js.Any], onsourcedetected = onsourcedetected.asInstanceOf[js.Any], onsourcelost = onsourcelost.asInstanceOf[js.Any], onsourcepressed = onsourcepressed.asInstanceOf[js.Any], onsourcereleased = onsourcereleased.asInstanceOf[js.Any], onsourceupdated = onsourceupdated.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionManager]
  }
  @scala.inline
  implicit class SpatialInteractionManagerOps[Self <: SpatialInteractionManager] (val x: Self) extends AnyVal {
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
    def withGetDetectedSourcesAtTimestamp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDetectedSourcesAtTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOninteractiondetected(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninteractiondetected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsourcedetected(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsourcedetected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsourcelost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsourcelost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsourcepressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsourcepressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsourcereleased(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsourcereleased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsourceupdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsourceupdated")(value.asInstanceOf[js.Any])
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

