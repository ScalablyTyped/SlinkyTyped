package typingsSlinky.winrtDashUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PerceptionFrameSourcePropertyChangeStatus extends js.Object

/** Indicates the status of a property change that an app requested of a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus")
@js.native
object PerceptionFrameSourcePropertyChangeStatus extends js.Object {
  /** The requested property change was accepted by the frame source. */
  @js.native
  sealed trait accepted extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The frame source property could not be changed because the app lost controller mode before the request was processed. */
  @js.native
  sealed trait lostControl extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property is not supported by the frame source. */
  @js.native
  sealed trait propertyNotSupported extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the property is read-only. */
  @js.native
  sealed trait propertyReadOnly extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The status change is unknown. */
  @js.native
  sealed trait unknown extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the value is not in a valid range. */
  @js.native
  sealed trait valueOutOfRange extends PerceptionFrameSourcePropertyChangeStatus
  
  /* 1 */ val accepted: typingsSlinky.winrtDashUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.accepted with Double = js.native
  /* 2 */ val lostControl: typingsSlinky.winrtDashUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.lostControl with Double = js.native
  /* 3 */ val propertyNotSupported: typingsSlinky.winrtDashUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.propertyNotSupported with Double = js.native
  /* 4 */ val propertyReadOnly: typingsSlinky.winrtDashUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.propertyReadOnly with Double = js.native
  /* 0 */ val unknown: typingsSlinky.winrtDashUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.unknown with Double = js.native
  /* 5 */ val valueOutOfRange: typingsSlinky.winrtDashUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.valueOutOfRange with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PerceptionFrameSourcePropertyChangeStatus with Double] = js.native
}

