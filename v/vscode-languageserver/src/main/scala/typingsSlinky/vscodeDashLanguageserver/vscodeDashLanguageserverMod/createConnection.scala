package typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(): IConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream): IConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): IConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ): IConnection = js.native
  def apply(
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    strategy: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): IConnection = js.native
  def apply(strategy: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy): IConnection = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: ReadableStream,
    outputStream: WritableStream
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    strategy: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    strategy: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
}

