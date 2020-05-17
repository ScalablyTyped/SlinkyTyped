package typingsSlinky.xstate.patternsMod

import typingsSlinky.std.Record
import typingsSlinky.xstate.anon.TypeTEventType
import typingsSlinky.xstate.typesMod.AtomicStateNodeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/patterns", "toggle")
@js.native
object toggle extends js.Object {
  def apply[TEventType /* <: String */](onState: String, offState: String, eventType: TEventType): Record[String, AtomicStateNodeConfig[_, TypeTEventType[TEventType]]] = js.native
}

