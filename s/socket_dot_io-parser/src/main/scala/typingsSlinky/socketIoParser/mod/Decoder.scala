package typingsSlinky.socketIoParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socket.io-parser", "Decoder")
@js.native
class Decoder () extends js.Object {
  
  def add(encodedPacket: EncodedPacket): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def on(event: String, callback: js.Function1[/* decodedPacket */ Packet, Unit]): Unit = js.native
}
