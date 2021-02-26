package typingsSlinky.vscodeJsonrpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GenericNotificationHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type GenericRequestHandler[R, E] = js.Function1[/* repeated */ js.Any, typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]]
  
  type HandlerResult[R, E] = R | typingsSlinky.vscodeJsonrpc.messagesMod.ResponseError[E] | (typingsSlinky.vscodeJsonrpc.Thenable[R | typingsSlinky.vscodeJsonrpc.messagesMod.ResponseError[E]])
  
  type MessageQueue = typingsSlinky.vscodeJsonrpc.linkedMapMod.LinkedMap[java.lang.String, typingsSlinky.vscodeJsonrpc.messagesMod.Message]
  
  type NotificationHandler[P] = js.Function1[/* params */ P, scala.Unit]
  
  type NotificationHandler0 = js.Function0[scala.Unit]
  
  type NotificationHandler1[P1] = js.Function1[/* p1 */ P1, scala.Unit]
  
  type NotificationHandler2[P1, P2] = js.Function2[/* p1 */ P1, /* p2 */ P2, scala.Unit]
  
  type NotificationHandler3[P1, P2, P3] = js.Function3[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, scala.Unit]
  
  type NotificationHandler4[P1, P2, P3, P4] = js.Function4[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, scala.Unit]
  
  type NotificationHandler5[P1, P2, P3, P4, P5] = js.Function5[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, /* p5 */ P5, scala.Unit]
  
  type NotificationHandler6[P1, P2, P3, P4, P5, P6] = js.Function6[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, /* p5 */ P5, /* p6 */ P6, scala.Unit]
  
  type NotificationHandler7[P1, P2, P3, P4, P5, P6, P7] = js.Function7[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    scala.Unit
  ]
  
  type NotificationHandler8[P1, P2, P3, P4, P5, P6, P7, P8] = js.Function8[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* p8 */ P8, 
    scala.Unit
  ]
  
  type NotificationHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9] = js.Function9[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* p8 */ P8, 
    /* p9 */ P9, 
    scala.Unit
  ]
  
  @scala.inline
  def NullLogger: typingsSlinky.vscodeJsonrpc.mod.Logger = typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NullLogger").asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.Logger]
  
  type ProgressToken = scala.Double | java.lang.String
  
  type RequestHandler[P, R, E] = js.Function2[
    /* params */ P, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler0[R, E] = js.Function1[
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler1[P1, R, E] = js.Function2[
    /* p1 */ P1, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler2[P1, P2, R, E] = js.Function3[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler3[P1, P2, P3, R, E] = js.Function4[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler4[P1, P2, P3, P4, R, E] = js.Function5[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler5[P1, P2, P3, P4, P5, R, E] = js.Function6[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler6[P1, P2, P3, P4, P5, P6, R, E] = js.Function7[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler7[P1, P2, P3, P4, P5, P6, P7, R, E] = js.Function8[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler8[P1, P2, P3, P4, P5, P6, P7, P8, R, E] = js.Function9[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* p8 */ P8, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type RequestHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E] = js.Function10[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* p8 */ P8, 
    /* p9 */ P9, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  
  type StarNotificationHandler = js.Function2[/* method */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  
  type StarRequestHandler = js.Function2[
    /* method */ java.lang.String, 
    /* repeated */ js.Any, 
    typingsSlinky.vscodeJsonrpc.mod.HandlerResult[js.Any, js.Any]
  ]
  
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String): js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport] = typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String, encoding: typingsSlinky.node.BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport] = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  
  @scala.inline
  def createClientSocketTransport(port: scala.Double): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  @scala.inline
  def createClientSocketTransport(port: scala.Double, encoding: typingsSlinky.node.BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  
  @scala.inline
  def createMessageConnection(
    inputStream: typingsSlinky.node.NodeJS.ReadableStream,
    outputStream: typingsSlinky.node.NodeJS.WritableStream
  ): typingsSlinky.vscodeJsonrpc.mod.MessageConnection = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.MessageConnection]
  @scala.inline
  def createMessageConnection(
    inputStream: typingsSlinky.node.NodeJS.ReadableStream,
    outputStream: typingsSlinky.node.NodeJS.WritableStream,
    logger: js.UndefOr[scala.Nothing],
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeJsonrpc.mod.MessageConnection = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.MessageConnection]
  @scala.inline
  def createMessageConnection(
    inputStream: typingsSlinky.node.NodeJS.ReadableStream,
    outputStream: typingsSlinky.node.NodeJS.WritableStream,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger
  ): typingsSlinky.vscodeJsonrpc.mod.MessageConnection = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.MessageConnection]
  @scala.inline
  def createMessageConnection(
    inputStream: typingsSlinky.node.NodeJS.ReadableStream,
    outputStream: typingsSlinky.node.NodeJS.WritableStream,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeJsonrpc.mod.MessageConnection = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.MessageConnection]
  @scala.inline
  def createMessageConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): typingsSlinky.vscodeJsonrpc.mod.MessageConnection = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.MessageConnection]
  @scala.inline
  def createMessageConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: js.UndefOr[scala.Nothing],
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeJsonrpc.mod.MessageConnection = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.MessageConnection]
  @scala.inline
  def createMessageConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger
  ): typingsSlinky.vscodeJsonrpc.mod.MessageConnection = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.MessageConnection]
  @scala.inline
  def createMessageConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeJsonrpc.mod.MessageConnection = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeJsonrpc.mod.MessageConnection]
  
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String, encoding: typingsSlinky.node.BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerSocketTransport(port: scala.Double, encoding: typingsSlinky.node.BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def generateRandomPipeName(): java.lang.String = typingsSlinky.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[java.lang.String]
}
