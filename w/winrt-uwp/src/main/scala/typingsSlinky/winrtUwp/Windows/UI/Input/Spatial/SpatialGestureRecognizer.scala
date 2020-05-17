package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialGestureRecognizer extends js.Object {
  var addEventListener: js.Any = js.native
   /* unmapped type */ var cancelPendingGestures: js.Any = js.native
   /* unmapped type */ var captureInteraction: js.Any = js.native
   /* unmapped type */ var gestureSettings: js.Any = js.native
   /* unmapped type */ var onholdcanceled: js.Any = js.native
   /* unmapped type */ var onholdcompleted: js.Any = js.native
   /* unmapped type */ var onholdstarted: js.Any = js.native
   /* unmapped type */ var onmanipulationcanceled: js.Any = js.native
   /* unmapped type */ var onmanipulationcompleted: js.Any = js.native
   /* unmapped type */ var onmanipulationstarted: js.Any = js.native
   /* unmapped type */ var onmanipulationupdated: js.Any = js.native
   /* unmapped type */ var onnavigationcanceled: js.Any = js.native
   /* unmapped type */ var onnavigationcompleted: js.Any = js.native
   /* unmapped type */ var onnavigationstarted: js.Any = js.native
   /* unmapped type */ var onnavigationupdated: js.Any = js.native
   /* unmapped type */ var onrecognitionended: js.Any = js.native
   /* unmapped type */ var onrecognitionstarted: js.Any = js.native
   /* unmapped type */ var ontapped: js.Any = js.native
   /* unmapped type */ var removeEventListener: js.Any = js.native
   /* unmapped type */ var trySetGestureSettings: js.Any = js.native
}

object SpatialGestureRecognizer {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    cancelPendingGestures: js.Any,
    captureInteraction: js.Any,
    gestureSettings: js.Any,
    onholdcanceled: js.Any,
    onholdcompleted: js.Any,
    onholdstarted: js.Any,
    onmanipulationcanceled: js.Any,
    onmanipulationcompleted: js.Any,
    onmanipulationstarted: js.Any,
    onmanipulationupdated: js.Any,
    onnavigationcanceled: js.Any,
    onnavigationcompleted: js.Any,
    onnavigationstarted: js.Any,
    onnavigationupdated: js.Any,
    onrecognitionended: js.Any,
    onrecognitionstarted: js.Any,
    ontapped: js.Any,
    removeEventListener: js.Any,
    trySetGestureSettings: js.Any
  ): SpatialGestureRecognizer = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], cancelPendingGestures = cancelPendingGestures.asInstanceOf[js.Any], captureInteraction = captureInteraction.asInstanceOf[js.Any], gestureSettings = gestureSettings.asInstanceOf[js.Any], onholdcanceled = onholdcanceled.asInstanceOf[js.Any], onholdcompleted = onholdcompleted.asInstanceOf[js.Any], onholdstarted = onholdstarted.asInstanceOf[js.Any], onmanipulationcanceled = onmanipulationcanceled.asInstanceOf[js.Any], onmanipulationcompleted = onmanipulationcompleted.asInstanceOf[js.Any], onmanipulationstarted = onmanipulationstarted.asInstanceOf[js.Any], onmanipulationupdated = onmanipulationupdated.asInstanceOf[js.Any], onnavigationcanceled = onnavigationcanceled.asInstanceOf[js.Any], onnavigationcompleted = onnavigationcompleted.asInstanceOf[js.Any], onnavigationstarted = onnavigationstarted.asInstanceOf[js.Any], onnavigationupdated = onnavigationupdated.asInstanceOf[js.Any], onrecognitionended = onrecognitionended.asInstanceOf[js.Any], onrecognitionstarted = onrecognitionstarted.asInstanceOf[js.Any], ontapped = ontapped.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], trySetGestureSettings = trySetGestureSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialGestureRecognizer]
  }
  @scala.inline
  implicit class SpatialGestureRecognizerOps[Self <: SpatialGestureRecognizer] (val x: Self) extends AnyVal {
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
    def withCancelPendingGestures(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelPendingGestures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptureInteraction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGestureSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnholdcanceled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onholdcanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnholdcompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onholdcompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnholdstarted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onholdstarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmanipulationcanceled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmanipulationcanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmanipulationcompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmanipulationcompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmanipulationstarted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmanipulationstarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmanipulationupdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmanipulationupdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnnavigationcanceled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onnavigationcanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnnavigationcompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onnavigationcompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnnavigationstarted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onnavigationstarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnnavigationupdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onnavigationupdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnrecognitionended(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrecognitionended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnrecognitionstarted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrecognitionstarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOntapped(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrySetGestureSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySetGestureSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

