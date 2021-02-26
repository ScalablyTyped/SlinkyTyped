package typingsSlinky.thrift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HttpHeaders = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double | java.lang.String | js.Array[java.lang.String]]]
  
  type SeqId2Service = org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  
  type ServiceMap[TProcessor, THandler] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.thrift.mod.ServerOptions[TProcessor, THandler]]
  
  type TTransportCallback = js.Function2[
    /* msg */ js.UndefOr[typingsSlinky.node.Buffer], 
    /* seqid */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  @scala.inline
  def createClient[TClient](
    client: typingsSlinky.thrift.mod.TClientConstructor[TClient],
    connection: typingsSlinky.thrift.mod.Connection
  ): TClient = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]
  
  @scala.inline
  def createConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): typingsSlinky.thrift.mod.Connection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.Connection]
  @scala.inline
  def createConnection(
    host: js.UndefOr[scala.Nothing],
    port: scala.Double,
    options: typingsSlinky.thrift.mod.ConnectOptions
  ): typingsSlinky.thrift.mod.Connection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.Connection]
  @scala.inline
  def createConnection(host: java.lang.String, port: scala.Double): typingsSlinky.thrift.mod.Connection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.Connection]
  @scala.inline
  def createConnection(host: java.lang.String, port: scala.Double, options: typingsSlinky.thrift.mod.ConnectOptions): typingsSlinky.thrift.mod.Connection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.Connection]
  
  @scala.inline
  def createHttpClient[TClient](
    client: typingsSlinky.thrift.mod.TClientConstructor[TClient],
    connection: typingsSlinky.thrift.mod.HttpConnection
  ): TClient = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]
  
  @scala.inline
  def createHttpConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): typingsSlinky.thrift.mod.HttpConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.HttpConnection]
  @scala.inline
  def createHttpConnection(
    host: js.UndefOr[scala.Nothing],
    port: scala.Double,
    options: typingsSlinky.thrift.mod.ConnectOptions
  ): typingsSlinky.thrift.mod.HttpConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.HttpConnection]
  @scala.inline
  def createHttpConnection(host: java.lang.String, port: scala.Double): typingsSlinky.thrift.mod.HttpConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.HttpConnection]
  @scala.inline
  def createHttpConnection(host: java.lang.String, port: scala.Double, options: typingsSlinky.thrift.mod.ConnectOptions): typingsSlinky.thrift.mod.HttpConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.HttpConnection]
  
  @scala.inline
  def createSSLConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): typingsSlinky.thrift.mod.Connection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.Connection]
  @scala.inline
  def createSSLConnection(
    host: js.UndefOr[scala.Nothing],
    port: scala.Double,
    options: typingsSlinky.thrift.mod.ConnectOptions
  ): typingsSlinky.thrift.mod.Connection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.Connection]
  @scala.inline
  def createSSLConnection(host: java.lang.String, port: scala.Double): typingsSlinky.thrift.mod.Connection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.Connection]
  @scala.inline
  def createSSLConnection(host: java.lang.String, port: scala.Double, options: typingsSlinky.thrift.mod.ConnectOptions): typingsSlinky.thrift.mod.Connection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.Connection]
  
  @scala.inline
  def createServer[TProcessor, THandler](processor: typingsSlinky.thrift.mod.TProcessorConstructor[TProcessor, THandler], handler: THandler): typingsSlinky.node.httpMod.Server | typingsSlinky.node.tlsMod.Server = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(processor.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.httpMod.Server | typingsSlinky.node.tlsMod.Server]
  @scala.inline
  def createServer[TProcessor, THandler](
    processor: typingsSlinky.thrift.mod.TProcessorConstructor[TProcessor, THandler],
    handler: THandler,
    options: typingsSlinky.thrift.mod.ServerOptions[TProcessor, THandler]
  ): typingsSlinky.node.httpMod.Server | typingsSlinky.node.tlsMod.Server = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(processor.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.httpMod.Server | typingsSlinky.node.tlsMod.Server]
  
  @scala.inline
  def createStdIOClient[TClient](
    client: typingsSlinky.thrift.mod.TClientConstructor[TClient],
    connection: typingsSlinky.thrift.mod.Connection
  ): TClient = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStdIOClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]
  
  @scala.inline
  def createWSClient[TClient](
    client: typingsSlinky.thrift.mod.TClientConstructor[TClient],
    connection: typingsSlinky.thrift.mod.WSConnection
  ): TClient = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]
  
  @scala.inline
  def createWSConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): typingsSlinky.thrift.mod.WSConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.WSConnection]
  @scala.inline
  def createWSConnection(
    host: js.UndefOr[scala.Nothing],
    port: scala.Double,
    options: typingsSlinky.thrift.mod.WSConnectOptions
  ): typingsSlinky.thrift.mod.WSConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.WSConnection]
  @scala.inline
  def createWSConnection(host: java.lang.String, port: scala.Double): typingsSlinky.thrift.mod.WSConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.WSConnection]
  @scala.inline
  def createWSConnection(host: java.lang.String, port: scala.Double, options: typingsSlinky.thrift.mod.WSConnectOptions): typingsSlinky.thrift.mod.WSConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.WSConnection]
  
  @scala.inline
  def createWebServer[TProcessor, THandler](options: typingsSlinky.thrift.mod.WebServerOptions[TProcessor, THandler]): typingsSlinky.node.httpMod.Server | typingsSlinky.node.tlsMod.Server = typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWebServer")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.httpMod.Server | typingsSlinky.node.tlsMod.Server]
  
  @scala.inline
  def createXHRClient[TClient](
    client: typingsSlinky.thrift.mod.TClientConstructor[TClient],
    connection: typingsSlinky.thrift.mod.XHRConnection
  ): TClient = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]
  
  @scala.inline
  def createXHRConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): typingsSlinky.thrift.mod.XHRConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.XHRConnection]
  @scala.inline
  def createXHRConnection(
    host: js.UndefOr[scala.Nothing],
    port: scala.Double,
    options: typingsSlinky.thrift.mod.ConnectOptions
  ): typingsSlinky.thrift.mod.XHRConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.XHRConnection]
  @scala.inline
  def createXHRConnection(host: java.lang.String, port: scala.Double): typingsSlinky.thrift.mod.XHRConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.XHRConnection]
  @scala.inline
  def createXHRConnection(host: java.lang.String, port: scala.Double, options: typingsSlinky.thrift.mod.ConnectOptions): typingsSlinky.thrift.mod.XHRConnection = (typingsSlinky.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.thrift.mod.XHRConnection]
}
