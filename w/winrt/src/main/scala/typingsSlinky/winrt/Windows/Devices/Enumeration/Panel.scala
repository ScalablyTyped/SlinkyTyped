package typingsSlinky.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Panel extends js.Object

@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends js.Object {
  @js.native
  sealed trait back extends Panel
  
  @js.native
  sealed trait bottom extends Panel
  
  @js.native
  sealed trait front extends Panel
  
  @js.native
  sealed trait left extends Panel
  
  @js.native
  sealed trait right extends Panel
  
  @js.native
  sealed trait top extends Panel
  
  @js.native
  sealed trait unknown extends Panel
  
  /* 2 */ val back: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.back with Double = js.native
  /* 4 */ val bottom: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.bottom with Double = js.native
  /* 1 */ val front: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.front with Double = js.native
  /* 5 */ val left: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.left with Double = js.native
  /* 6 */ val right: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.right with Double = js.native
  /* 3 */ val top: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.top with Double = js.native
  /* 0 */ val unknown: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Panel with Double] = js.native
}

