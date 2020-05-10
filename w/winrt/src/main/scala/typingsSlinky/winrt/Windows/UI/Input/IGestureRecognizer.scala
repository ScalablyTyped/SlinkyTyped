package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGestureRecognizer extends js.Object {
  var autoProcessInertia: Boolean = js.native
  var crossSlideExact: Boolean = js.native
  var crossSlideHorizontally: Boolean = js.native
  var crossSlideThresholds: CrossSlideThresholds = js.native
  var gestureSettings: GestureSettings = js.native
  var inertiaExpansion: Double = js.native
  var inertiaExpansionDeceleration: Double = js.native
  var inertiaRotationAngle: Double = js.native
  var inertiaRotationDeceleration: Double = js.native
  var inertiaTranslationDeceleration: Double = js.native
  var inertiaTranslationDisplacement: Double = js.native
  var isActive: Boolean = js.native
  var isInertial: Boolean = js.native
  var manipulationExact: Boolean = js.native
  var mouseWheelParameters: MouseWheelParameters = js.native
  var oncrosssliding: js.Any = js.native
  var ondragging: js.Any = js.native
  var onholding: js.Any = js.native
  var onmanipulationcompleted: js.Any = js.native
  var onmanipulationinertiastarting: js.Any = js.native
  var onmanipulationstarted: js.Any = js.native
  var onmanipulationupdated: js.Any = js.native
  var onrighttapped: js.Any = js.native
  var ontapped: js.Any = js.native
  var pivotCenter: Point = js.native
  var pivotRadius: Double = js.native
  var showGestureFeedback: Boolean = js.native
  def canBeDoubleTap(value: PointerPoint): Boolean = js.native
  def completeGesture(): Unit = js.native
  def processDownEvent(value: PointerPoint): Unit = js.native
  def processInertia(): Unit = js.native
  def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: Boolean, isControlKeyDown: Boolean): Unit = js.native
  def processMoveEvents(value: IVector[PointerPoint]): Unit = js.native
  def processUpEvent(value: PointerPoint): Unit = js.native
}

object IGestureRecognizer {
  @scala.inline
  def apply(
    autoProcessInertia: Boolean,
    canBeDoubleTap: PointerPoint => Boolean,
    completeGesture: () => Unit,
    crossSlideExact: Boolean,
    crossSlideHorizontally: Boolean,
    crossSlideThresholds: CrossSlideThresholds,
    gestureSettings: GestureSettings,
    inertiaExpansion: Double,
    inertiaExpansionDeceleration: Double,
    inertiaRotationAngle: Double,
    inertiaRotationDeceleration: Double,
    inertiaTranslationDeceleration: Double,
    inertiaTranslationDisplacement: Double,
    isActive: Boolean,
    isInertial: Boolean,
    manipulationExact: Boolean,
    mouseWheelParameters: MouseWheelParameters,
    oncrosssliding: js.Any,
    ondragging: js.Any,
    onholding: js.Any,
    onmanipulationcompleted: js.Any,
    onmanipulationinertiastarting: js.Any,
    onmanipulationstarted: js.Any,
    onmanipulationupdated: js.Any,
    onrighttapped: js.Any,
    ontapped: js.Any,
    pivotCenter: Point,
    pivotRadius: Double,
    processDownEvent: PointerPoint => Unit,
    processInertia: () => Unit,
    processMouseWheelEvent: (PointerPoint, Boolean, Boolean) => Unit,
    processMoveEvents: IVector[PointerPoint] => Unit,
    processUpEvent: PointerPoint => Unit,
    showGestureFeedback: Boolean
  ): IGestureRecognizer = {
    val __obj = js.Dynamic.literal(autoProcessInertia = autoProcessInertia.asInstanceOf[js.Any], canBeDoubleTap = js.Any.fromFunction1(canBeDoubleTap), completeGesture = js.Any.fromFunction0(completeGesture), crossSlideExact = crossSlideExact.asInstanceOf[js.Any], crossSlideHorizontally = crossSlideHorizontally.asInstanceOf[js.Any], crossSlideThresholds = crossSlideThresholds.asInstanceOf[js.Any], gestureSettings = gestureSettings.asInstanceOf[js.Any], inertiaExpansion = inertiaExpansion.asInstanceOf[js.Any], inertiaExpansionDeceleration = inertiaExpansionDeceleration.asInstanceOf[js.Any], inertiaRotationAngle = inertiaRotationAngle.asInstanceOf[js.Any], inertiaRotationDeceleration = inertiaRotationDeceleration.asInstanceOf[js.Any], inertiaTranslationDeceleration = inertiaTranslationDeceleration.asInstanceOf[js.Any], inertiaTranslationDisplacement = inertiaTranslationDisplacement.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isInertial = isInertial.asInstanceOf[js.Any], manipulationExact = manipulationExact.asInstanceOf[js.Any], mouseWheelParameters = mouseWheelParameters.asInstanceOf[js.Any], oncrosssliding = oncrosssliding.asInstanceOf[js.Any], ondragging = ondragging.asInstanceOf[js.Any], onholding = onholding.asInstanceOf[js.Any], onmanipulationcompleted = onmanipulationcompleted.asInstanceOf[js.Any], onmanipulationinertiastarting = onmanipulationinertiastarting.asInstanceOf[js.Any], onmanipulationstarted = onmanipulationstarted.asInstanceOf[js.Any], onmanipulationupdated = onmanipulationupdated.asInstanceOf[js.Any], onrighttapped = onrighttapped.asInstanceOf[js.Any], ontapped = ontapped.asInstanceOf[js.Any], pivotCenter = pivotCenter.asInstanceOf[js.Any], pivotRadius = pivotRadius.asInstanceOf[js.Any], processDownEvent = js.Any.fromFunction1(processDownEvent), processInertia = js.Any.fromFunction0(processInertia), processMouseWheelEvent = js.Any.fromFunction3(processMouseWheelEvent), processMoveEvents = js.Any.fromFunction1(processMoveEvents), processUpEvent = js.Any.fromFunction1(processUpEvent), showGestureFeedback = showGestureFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGestureRecognizer]
  }
  @scala.inline
  implicit class IGestureRecognizerOps[Self <: IGestureRecognizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoProcessInertia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoProcessInertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeDoubleTap(value: PointerPoint => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canBeDoubleTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompleteGesture(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeGesture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCrossSlideExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossSlideExact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossSlideHorizontally(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossSlideHorizontally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossSlideThresholds(value: CrossSlideThresholds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossSlideThresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGestureSettings(value: GestureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInertiaExpansion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInertiaExpansionDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaExpansionDeceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInertiaRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaRotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInertiaRotationDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaRotationDeceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInertiaTranslationDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaTranslationDeceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInertiaTranslationDisplacement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaTranslationDisplacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInertial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInertial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManipulationExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manipulationExact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseWheelParameters(value: MouseWheelParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncrosssliding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncrosssliding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndragging(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnholding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onholding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmanipulationcompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmanipulationcompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmanipulationinertiastarting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmanipulationinertiastarting")(value.asInstanceOf[js.Any])
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
    def withOnrighttapped(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrighttapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOntapped(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivotCenter(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivotRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessDownEvent(value: PointerPoint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDownEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcessInertia(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processInertia")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProcessMouseWheelEvent(value: (PointerPoint, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processMouseWheelEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withProcessMoveEvents(value: IVector[PointerPoint] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processMoveEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcessUpEvent(value: PointerPoint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processUpEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowGestureFeedback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGestureFeedback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

