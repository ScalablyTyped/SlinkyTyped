package typingsSlinky.webvrApi

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRDisplayEvent extends Event_ {
  val display: VRDisplay = js.native
  val reason: VRDisplayEventReasonDtAlias | Null = js.native
}

@JSGlobal("VRDisplayEvent")
@js.native
object VRDisplayEvent extends Instantiable2[/* type */ String, /* eventInitDict */ VRDisplayEventInit, VRDisplayEvent]

