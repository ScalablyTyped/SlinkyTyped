package typingsSlinky.simpleDashWebsocket.simpleDashWebsocketMod

import typingsSlinky.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends Duplex {
  def destroy(err: js.Error): Unit = js.native
  /** Send text/binary data to the WebSocket server */
  def send(chunk: js.Any): Unit = js.native
}

