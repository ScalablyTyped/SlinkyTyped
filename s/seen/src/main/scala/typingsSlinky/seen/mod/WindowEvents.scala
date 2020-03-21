package typingsSlinky.seen.mod

import typingsSlinky.seen.mod.Events.Dispatcher
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "WindowEvents")
@js.native
object WindowEvents extends js.Object {
  def on(`type`: String, listener: EventListener): Dispatcher = js.native
}

