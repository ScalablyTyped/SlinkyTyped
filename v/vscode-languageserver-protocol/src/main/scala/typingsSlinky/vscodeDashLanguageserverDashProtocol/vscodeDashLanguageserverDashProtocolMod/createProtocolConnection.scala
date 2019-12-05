package typingsSlinky.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "createProtocolConnection")
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

