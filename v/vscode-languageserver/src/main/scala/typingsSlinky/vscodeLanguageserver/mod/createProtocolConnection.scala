package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeJsonrpc.mod.Logger
import typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "createProtocolConnection")
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
