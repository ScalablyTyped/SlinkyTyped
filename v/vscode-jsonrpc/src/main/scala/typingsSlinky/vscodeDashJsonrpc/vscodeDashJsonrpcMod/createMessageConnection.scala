package typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "createMessageConnection")
@js.native
object createMessageConnection extends js.Object {
  def apply(inputStream: ReadableStream, outputStream: WritableStream): MessageConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream, logger: Logger): MessageConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ): MessageConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    logger: Logger
  ): MessageConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
}

