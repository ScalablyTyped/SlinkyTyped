package typingsSlinky.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialLocatorAttachedFrameOfReference extends js.Object {
  var adjustHeading: js.Any = js.native
   /* unmapped type */ var getStationaryCoordinateSystemAtTimestamp: js.Any = js.native
   /* unmapped type */ var relativeOrientation: js.Any = js.native
   /* unmapped type */ var relativePosition: js.Any = js.native
   /* unmapped type */ var tryGetRelativeHeadingAtTimestamp: js.Any = js.native
}

object SpatialLocatorAttachedFrameOfReference {
  @scala.inline
  def apply(
    adjustHeading: js.Any,
    getStationaryCoordinateSystemAtTimestamp: js.Any,
    relativeOrientation: js.Any,
    relativePosition: js.Any,
    tryGetRelativeHeadingAtTimestamp: js.Any
  ): SpatialLocatorAttachedFrameOfReference = {
    val __obj = js.Dynamic.literal(adjustHeading = adjustHeading.asInstanceOf[js.Any], getStationaryCoordinateSystemAtTimestamp = getStationaryCoordinateSystemAtTimestamp.asInstanceOf[js.Any], relativeOrientation = relativeOrientation.asInstanceOf[js.Any], relativePosition = relativePosition.asInstanceOf[js.Any], tryGetRelativeHeadingAtTimestamp = tryGetRelativeHeadingAtTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocatorAttachedFrameOfReference]
  }
  @scala.inline
  implicit class SpatialLocatorAttachedFrameOfReferenceOps[Self <: SpatialLocatorAttachedFrameOfReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustHeading(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStationaryCoordinateSystemAtTimestamp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStationaryCoordinateSystemAtTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeOrientation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativePosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetRelativeHeadingAtTimestamp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetRelativeHeadingAtTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

