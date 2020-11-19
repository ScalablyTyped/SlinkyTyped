package typingsSlinky.vscodeJsonrpc.pipeSupportMod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader
import typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/pipeSupport", "createServerPipeTransport")
@js.native
object createServerPipeTransport extends js.Object {
  
  def apply(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def apply(pipeName: String, encoding: BufferEncoding): js.Tuple2[MessageReader, MessageWriter] = js.native
}
