package typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Logger
import typingsSlinky.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.ProtocolConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createProtocolConnection")
@js.native
object createProtocolConnection extends js.Object {
  def apply(
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    logger: Logger
  ): ProtocolConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    logger: Logger,
    strategy: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): ProtocolConnection = js.native
}

