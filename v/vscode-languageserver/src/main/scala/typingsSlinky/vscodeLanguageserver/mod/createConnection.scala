package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(): IConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream): IConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): IConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): IConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): IConnection = js.native
  def apply(strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy): IConnection = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    inputStream: ReadableStream,
    outputStream: WritableStream
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
}
