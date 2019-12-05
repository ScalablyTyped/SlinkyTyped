package typingsSlinky.vscodeDashJsonrpc.libPipeSupportMod

import typingsSlinky.vscodeDashJsonrpc.Thenable
import typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeTransport extends js.Object {
  def onConnected(): Thenable[js.Tuple2[MessageReader, MessageWriter]]
}

object PipeTransport {
  @scala.inline
  def apply(onConnected: () => Thenable[js.Tuple2[MessageReader, MessageWriter]]): PipeTransport = {
    val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
  
    __obj.asInstanceOf[PipeTransport]
  }
}

