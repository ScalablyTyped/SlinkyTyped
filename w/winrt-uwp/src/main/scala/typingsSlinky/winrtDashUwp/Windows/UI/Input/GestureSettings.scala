package typingsSlinky.winrtDashUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GestureSettings extends js.Object

/** Specifies the interactions that are supported by an application. */
@JSGlobal("Windows.UI.Input.GestureSettings")
@js.native
object GestureSettings extends js.Object {
  /** Enable support for the CrossSliding interaction when using the slide or swipe gesture through a single touch contact. */
  @js.native
  sealed trait crossSlide extends GestureSettings
  
  /** Enable support for the double-tap gesture. */
  @js.native
  sealed trait doubleTap extends GestureSettings
  
  /** Enable support for the slide or swipe gesture with a mouse or pen/stylus (single contact). The Dragging event is raised when either gesture is detected. */
  @js.native
  sealed trait drag extends GestureSettings
  
  /** Enable support for the press and hold gesture (from a single touch or pen/stylus contact). The Holding event is raised if a time threshold is crossed before the contact is lifted, an additional contact is detected, or a gesture is started. */
  @js.native
  sealed trait hold extends GestureSettings
  
  /** Enable support for the press and hold gesture through the left button on a mouse. The Holding event is raised if a time threshold is crossed before the left button is released or a gesture is started. */
  @js.native
  sealed trait holdWithMouse extends GestureSettings
  
  /** Enable panning and disable zoom when two or more touch contacts are detected. */
  @js.native
  sealed trait manipulationMultipleFingerPanning extends GestureSettings
  
  /** Enable support for the rotation gesture through pointer input. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationRotate extends GestureSettings
  
  /** Enable support for rotation inertia after the rotate gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationRotateInertia extends GestureSettings
  
  /** Enable support for the pinch or stretch gesture through pointer input. */
  @js.native
  sealed trait manipulationScale extends GestureSettings
  
  /** Enable support for scaling inertia after the pinch or stretch gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationScaleInertia extends GestureSettings
  
  /** Enable support for translation inertia after the slide gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationTranslateInertia extends GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the horizontal axis using rails (guides). The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateRailsX extends GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the vertical axis using rails (guides). The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateRailsY extends GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the horizontal axis. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateX extends GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the vertical axis. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateY extends GestureSettings
  
  /** Disable support for gestures and manipulations. */
  @js.native
  sealed trait none extends GestureSettings
  
  /** Enable support for a right-tap interaction. The RightTapped event is raised when the contact is lifted or the mouse button released. */
  @js.native
  sealed trait rightTap extends GestureSettings
  
  /** Enable support for the tap gesture. */
  @js.native
  sealed trait tap extends GestureSettings
  
  /* 16 */ val crossSlide: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.crossSlide with Double = js.native
  /* 2 */ val doubleTap: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.doubleTap with Double = js.native
  /* 6 */ val drag: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.drag with Double = js.native
  /* 3 */ val hold: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.hold with Double = js.native
  /* 4 */ val holdWithMouse: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.holdWithMouse with Double = js.native
  /* 17 */ val manipulationMultipleFingerPanning: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationMultipleFingerPanning with Double = js.native
  /* 11 */ val manipulationRotate: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationRotate with Double = js.native
  /* 14 */ val manipulationRotateInertia: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationRotateInertia with Double = js.native
  /* 12 */ val manipulationScale: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationScale with Double = js.native
  /* 15 */ val manipulationScaleInertia: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationScaleInertia with Double = js.native
  /* 13 */ val manipulationTranslateInertia: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationTranslateInertia with Double = js.native
  /* 9 */ val manipulationTranslateRailsX: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationTranslateRailsX with Double = js.native
  /* 10 */ val manipulationTranslateRailsY: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationTranslateRailsY with Double = js.native
  /* 7 */ val manipulationTranslateX: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationTranslateX with Double = js.native
  /* 8 */ val manipulationTranslateY: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.manipulationTranslateY with Double = js.native
  /* 0 */ val none: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.none with Double = js.native
  /* 5 */ val rightTap: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.rightTap with Double = js.native
  /* 1 */ val tap: typingsSlinky.winrtDashUwp.Windows.UI.Input.GestureSettings.tap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GestureSettings with Double] = js.native
}

