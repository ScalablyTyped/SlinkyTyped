package typingsSlinky.winrtDashUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AllJoynSessionLostReason extends js.Object

/** Defines values used by AllJoynSessionLostEventArgs to indicate the reason for a lost session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostReason")
@js.native
object AllJoynSessionLostReason extends js.Object {
  /** The connection supporting the session timed out. */
  @js.native
  sealed trait linkTimeout extends AllJoynSessionLostReason
  
  /** No reason indicated. */
  @js.native
  sealed trait none extends AllJoynSessionLostReason
  
  /** The session was lost due to any other reason. */
  @js.native
  sealed trait other extends AllJoynSessionLostReason
  
  /** The Producer closed the session unexpectedly. */
  @js.native
  sealed trait producerClosedAbruptly extends AllJoynSessionLostReason
  
  /** The Producer left the session. */
  @js.native
  sealed trait producerLeftSession extends AllJoynSessionLostReason
  
  /** The Consumer was removed from the session by the Producer. */
  @js.native
  sealed trait removedByProducer extends AllJoynSessionLostReason
  
  /* 4 */ val linkTimeout: typingsSlinky.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.linkTimeout with Double = js.native
  /* 0 */ val none: typingsSlinky.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.none with Double = js.native
  /* 5 */ val other: typingsSlinky.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.other with Double = js.native
  /* 2 */ val producerClosedAbruptly: typingsSlinky.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.producerClosedAbruptly with Double = js.native
  /* 1 */ val producerLeftSession: typingsSlinky.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.producerLeftSession with Double = js.native
  /* 3 */ val removedByProducer: typingsSlinky.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.removedByProducer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AllJoynSessionLostReason with Double] = js.native
}

