package typingsSlinky.vscodeLanguageclient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def EOL: js.Array[java.lang.String] = typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[java.lang.String]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vscodeLanguageclient.mod.Executable
    - typingsSlinky.vscodeLanguageclient.anon.Debug
    - typingsSlinky.vscodeLanguageclient.anon.Run
    - typingsSlinky.vscodeLanguageclient.mod.NodeModule
    - js.Function0[
  js.Promise[
    typingsSlinky.node.childProcessMod.ChildProcess | typingsSlinky.vscodeLanguageclient.mod.StreamInfo | typingsSlinky.vscodeLanguageclient.clientMod.MessageTransports | typingsSlinky.vscodeLanguageclient.mod.ChildProcessInfo
  ]]
  */
  type ServerOptions = typingsSlinky.vscodeLanguageclient.mod._ServerOptions | (js.Function0[
    js.Promise[
      typingsSlinky.node.childProcessMod.ChildProcess | typingsSlinky.vscodeLanguageclient.mod.StreamInfo | typingsSlinky.vscodeLanguageclient.clientMod.MessageTransports | typingsSlinky.vscodeLanguageclient.mod.ChildProcessInfo
    ]
  ])
  
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String): js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport] = typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String, encoding: typingsSlinky.node.BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport] = (typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  
  @scala.inline
  def createClientSocketTransport(port: scala.Double): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  @scala.inline
  def createClientSocketTransport(port: scala.Double, encoding: typingsSlinky.node.BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = (typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  
  @scala.inline
  def createProtocolConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger
  ): typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  @scala.inline
  def createProtocolConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String, encoding: typingsSlinky.node.BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerSocketTransport(port: scala.Double, encoding: typingsSlinky.node.BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def generateRandomPipeName(): java.lang.String = typingsSlinky.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[java.lang.String]
}
