package typingsSlinky.winrtDashUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Panel extends js.Object

/** Indicates the location of a panel on a computer. This enumeration is used for indicating the physical location of a device. */
@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends js.Object {
  /** The back panel of the computer. */
  @js.native
  sealed trait back extends Panel
  
  /** The bottom panel of the computer. */
  @js.native
  sealed trait bottom extends Panel
  
  /** The front panel of the computer. */
  @js.native
  sealed trait front extends Panel
  
  /** The left panel of the computer. */
  @js.native
  sealed trait left extends Panel
  
  /** The right panel of the computer. */
  @js.native
  sealed trait right extends Panel
  
  /** The top panel of the computer. */
  @js.native
  sealed trait top extends Panel
  
  /** The location of the panel is unknown. */
  @js.native
  sealed trait unknown extends Panel
  
  /* 2 */ val back: typingsSlinky.winrtDashUwp.Windows.Devices.Enumeration.Panel.back with Double = js.native
  /* 4 */ val bottom: typingsSlinky.winrtDashUwp.Windows.Devices.Enumeration.Panel.bottom with Double = js.native
  /* 1 */ val front: typingsSlinky.winrtDashUwp.Windows.Devices.Enumeration.Panel.front with Double = js.native
  /* 5 */ val left: typingsSlinky.winrtDashUwp.Windows.Devices.Enumeration.Panel.left with Double = js.native
  /* 6 */ val right: typingsSlinky.winrtDashUwp.Windows.Devices.Enumeration.Panel.right with Double = js.native
  /* 3 */ val top: typingsSlinky.winrtDashUwp.Windows.Devices.Enumeration.Panel.top with Double = js.native
  /* 0 */ val unknown: typingsSlinky.winrtDashUwp.Windows.Devices.Enumeration.Panel.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Panel with Double] = js.native
}

