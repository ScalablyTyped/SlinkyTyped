package typingsSlinky.vscodeLanguageserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ClientFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.RemoteClient, P]
  
  type ConsoleFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.RemoteConsole, P]
  
  @scala.inline
  def EOL: js.Array[java.lang.String] = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[java.lang.String]]
  
  type Feature[B, P] = js.Function1[
    /* Base */ org.scalablytyped.runtime.Instantiable0[B], 
    org.scalablytyped.runtime.Instantiable0[B with P]
  ]
  
  type IConnection = typingsSlinky.vscodeLanguageserver.mod.Connection[
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore
  ]
  
  type Languages = typingsSlinky.vscodeLanguageserver.mod._Languages
  
  type LanguagesFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.Languages, P]
  
  type RemoteWindow = typingsSlinky.vscodeLanguageserver.mod._RemoteWindow with typingsSlinky.vscodeLanguageserver.progressMod.WindowProgress
  
  type RemoteWorkspace = typingsSlinky.vscodeLanguageserver.mod._RemoteWorkspace with typingsSlinky.vscodeLanguageserver.configurationMod.Configuration with typingsSlinky.vscodeLanguageserver.workspaceFoldersMod.WorkspaceFolders
  
  type ServerRequestHandler[P, R, PR, E] = js.Function4[
    /* params */ P, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    /* workDoneProgress */ typingsSlinky.vscodeLanguageserver.progressMod.WorkDoneProgress, 
    /* resultProgress */ js.UndefOr[typingsSlinky.vscodeLanguageserver.progressMod.ResultProgress[PR]], 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type TelemetryFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.Telemetry, P]
  
  type TracerFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.Tracer, P]
  
  type WindowFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.RemoteWindow, P]
  
  type WorkspaceFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.RemoteWorkspace, P]
  
  @scala.inline
  def combineClientFeatures[O, T](
    one: typingsSlinky.vscodeLanguageserver.mod.ClientFeature[O],
    two: typingsSlinky.vscodeLanguageserver.mod.ClientFeature[T]
  ): typingsSlinky.vscodeLanguageserver.mod.ClientFeature[O with T] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineClientFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.ClientFeature[O with T]]
  
  @scala.inline
  def combineConsoleFeatures[O, T](
    one: typingsSlinky.vscodeLanguageserver.mod.ConsoleFeature[O],
    two: typingsSlinky.vscodeLanguageserver.mod.ConsoleFeature[T]
  ): typingsSlinky.vscodeLanguageserver.mod.ConsoleFeature[O with T] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineConsoleFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.ConsoleFeature[O with T]]
  
  @scala.inline
  def combineFeatures[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace](
    one: typingsSlinky.vscodeLanguageserver.mod.Features[
      OConsole, 
      OTracer, 
      OTelemetry, 
      OClient, 
      OWindow, 
      OWorkspace, 
      typingsSlinky.vscodeLanguageserver.mod._underscore
    ],
    two: typingsSlinky.vscodeLanguageserver.mod.Features[
      TConsole, 
      TTracer, 
      TTelemetry, 
      TClient, 
      TWindow, 
      TWorkspace, 
      typingsSlinky.vscodeLanguageserver.mod._underscore
    ]
  ): typingsSlinky.vscodeLanguageserver.mod.Features[
    OConsole with TConsole, 
    OTracer with TTracer, 
    OTelemetry with TTelemetry, 
    OClient with TClient, 
    OWindow with TWindow, 
    OWorkspace with TWorkspace, 
    typingsSlinky.vscodeLanguageserver.mod._underscore
  ] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.Features[
    OConsole with TConsole, 
    OTracer with TTracer, 
    OTelemetry with TTelemetry, 
    OClient with TClient, 
    OWindow with TWindow, 
    OWorkspace with TWorkspace, 
    typingsSlinky.vscodeLanguageserver.mod._underscore
  ]]
  
  @scala.inline
  def combineLanguagesFeatures[O, T](
    one: typingsSlinky.vscodeLanguageserver.mod.LanguagesFeature[O],
    two: typingsSlinky.vscodeLanguageserver.mod.LanguagesFeature[T]
  ): typingsSlinky.vscodeLanguageserver.mod.LanguagesFeature[O with T] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineLanguagesFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.LanguagesFeature[O with T]]
  
  @scala.inline
  def combineTelemetryFeatures[O, T](
    one: typingsSlinky.vscodeLanguageserver.mod.TelemetryFeature[O],
    two: typingsSlinky.vscodeLanguageserver.mod.TelemetryFeature[T]
  ): typingsSlinky.vscodeLanguageserver.mod.TelemetryFeature[O with T] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineTelemetryFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.TelemetryFeature[O with T]]
  
  @scala.inline
  def combineTracerFeatures[O, T](
    one: typingsSlinky.vscodeLanguageserver.mod.TracerFeature[O],
    two: typingsSlinky.vscodeLanguageserver.mod.TracerFeature[T]
  ): typingsSlinky.vscodeLanguageserver.mod.TracerFeature[O with T] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineTracerFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.TracerFeature[O with T]]
  
  @scala.inline
  def combineWindowFeatures[O, T](
    one: typingsSlinky.vscodeLanguageserver.mod.WindowFeature[O],
    two: typingsSlinky.vscodeLanguageserver.mod.WindowFeature[T]
  ): typingsSlinky.vscodeLanguageserver.mod.WindowFeature[O with T] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineWindowFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.WindowFeature[O with T]]
  
  @scala.inline
  def combineWorkspaceFeatures[O, T](
    one: typingsSlinky.vscodeLanguageserver.mod.WorkspaceFeature[O],
    two: typingsSlinky.vscodeLanguageserver.mod.WorkspaceFeature[T]
  ): typingsSlinky.vscodeLanguageserver.mod.WorkspaceFeature[O with T] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineWorkspaceFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.WorkspaceFeature[O with T]]
  
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String): js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport] = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String, encoding: typingsSlinky.node.BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  
  @scala.inline
  def createClientSocketTransport(port: scala.Double): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  @scala.inline
  def createClientSocketTransport(port: scala.Double, encoding: typingsSlinky.node.BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  
  @scala.inline
  def createConnection(): typingsSlinky.vscodeLanguageserver.mod.IConnection = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")().asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.IConnection]
  @scala.inline
  def createConnection(
    inputStream: typingsSlinky.node.NodeJS.ReadableStream,
    outputStream: typingsSlinky.node.NodeJS.WritableStream
  ): typingsSlinky.vscodeLanguageserver.mod.IConnection = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.IConnection]
  @scala.inline
  def createConnection(
    inputStream: typingsSlinky.node.NodeJS.ReadableStream,
    outputStream: typingsSlinky.node.NodeJS.WritableStream,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeLanguageserver.mod.IConnection = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.IConnection]
  @scala.inline
  def createConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): typingsSlinky.vscodeLanguageserver.mod.IConnection = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.IConnection]
  @scala.inline
  def createConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeLanguageserver.mod.IConnection = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.IConnection]
  @scala.inline
  def createConnection(strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy): typingsSlinky.vscodeLanguageserver.mod.IConnection = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(strategy.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.IConnection]
  @scala.inline
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: typingsSlinky.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]
  ): typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
  @scala.inline
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: typingsSlinky.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    inputStream: typingsSlinky.node.NodeJS.ReadableStream,
    outputStream: typingsSlinky.node.NodeJS.WritableStream
  ): typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
  @scala.inline
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: typingsSlinky.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    inputStream: typingsSlinky.node.NodeJS.ReadableStream,
    outputStream: typingsSlinky.node.NodeJS.WritableStream,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
  @scala.inline
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: typingsSlinky.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
  @scala.inline
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: typingsSlinky.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
  @scala.inline
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: typingsSlinky.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
  
  @scala.inline
  def createProtocolConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger
  ): typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  @scala.inline
  def createProtocolConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String, encoding: typingsSlinky.node.BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerSocketTransport(port: scala.Double, encoding: typingsSlinky.node.BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def generateRandomPipeName(): java.lang.String = typingsSlinky.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[java.lang.String]
}
