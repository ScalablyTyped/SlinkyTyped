package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "createServerPipeTransport")
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
