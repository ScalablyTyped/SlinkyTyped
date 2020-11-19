package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "createServerPipeTransport")
@js.native
object createServerPipeTransport extends js.Object {
  
  def apply(pipeName: String): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = js.native
  def apply(pipeName: String, encoding: BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = js.native
}
