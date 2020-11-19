package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeJsonrpc.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "createProtocolConnection")
@js.native
object createProtocolConnection extends js.Object {
  
  def apply(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger
  ): ProtocolConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): ProtocolConnection = js.native
}
