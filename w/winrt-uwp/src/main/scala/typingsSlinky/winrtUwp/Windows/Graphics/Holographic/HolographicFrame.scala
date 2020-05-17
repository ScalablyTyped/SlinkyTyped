package typingsSlinky.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolographicFrame extends js.Object {
  var addedCameras: js.Any = js.native
   /* unmapped type */ var currentPrediction: js.Any = js.native
   /* unmapped type */ var duration: js.Any = js.native
   /* unmapped type */ var getRenderingParameters: js.Any = js.native
   /* unmapped type */ var presentUsingCurrentPrediction: js.Any = js.native
   /* unmapped type */ var removedCameras: js.Any = js.native
   /* unmapped type */ var updateCurrentPrediction: js.Any = js.native
   /* unmapped type */ var waitForFrameToFinish: js.Any = js.native
}

object HolographicFrame {
  @scala.inline
  def apply(
    addedCameras: js.Any,
    currentPrediction: js.Any,
    duration: js.Any,
    getRenderingParameters: js.Any,
    presentUsingCurrentPrediction: js.Any,
    removedCameras: js.Any,
    updateCurrentPrediction: js.Any,
    waitForFrameToFinish: js.Any
  ): HolographicFrame = {
    val __obj = js.Dynamic.literal(addedCameras = addedCameras.asInstanceOf[js.Any], currentPrediction = currentPrediction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], getRenderingParameters = getRenderingParameters.asInstanceOf[js.Any], presentUsingCurrentPrediction = presentUsingCurrentPrediction.asInstanceOf[js.Any], removedCameras = removedCameras.asInstanceOf[js.Any], updateCurrentPrediction = updateCurrentPrediction.asInstanceOf[js.Any], waitForFrameToFinish = waitForFrameToFinish.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicFrame]
  }
  @scala.inline
  implicit class HolographicFrameOps[Self <: HolographicFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedCameras(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedCameras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPrediction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPrediction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRenderingParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderingParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresentUsingCurrentPrediction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentUsingCurrentPrediction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedCameras(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedCameras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateCurrentPrediction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCurrentPrediction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForFrameToFinish(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForFrameToFinish")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

