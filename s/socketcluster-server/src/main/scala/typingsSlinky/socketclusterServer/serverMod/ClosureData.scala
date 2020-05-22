package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.CloseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosureData extends CloseData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^
}

object ClosureData {
  @scala.inline
  def apply(code: Double, reason: String, socket: typingsSlinky.socketclusterServer.serversocketMod.^): ClosureData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosureData]
  }
}

