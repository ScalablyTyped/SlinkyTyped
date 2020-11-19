package typingsSlinky.vscodeJsonrpc.mod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "createMessageConnection")
@js.native
object createMessageConnection extends js.Object {
  
  def apply(inputStream: ReadableStream, outputStream: WritableStream): MessageConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    logger: js.UndefOr[scala.Nothing],
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream, logger: Logger): MessageConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): MessageConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: js.UndefOr[scala.Nothing],
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger
  ): MessageConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
}
