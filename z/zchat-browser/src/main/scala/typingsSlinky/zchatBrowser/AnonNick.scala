package typingsSlinky.zchatBrowser

import typingsSlinky.zchatBrowser.mod.EventData
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotqueue_position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNick extends EventData {
  var nick: String
  var queue_position: Double
  var `type`: chatDotqueue_position
}

object AnonNick {
  @scala.inline
  def apply(nick: String, queue_position: Double, `type`: chatDotqueue_position): AnonNick = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], queue_position = queue_position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNick]
  }
}

