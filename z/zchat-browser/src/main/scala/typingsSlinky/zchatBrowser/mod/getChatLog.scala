package typingsSlinky.zchatBrowser.mod

import typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getChatLog")
@js.native
object getChatLog extends js.Object {
  def apply(): js.Array[ChatEventData] = js.native
}

