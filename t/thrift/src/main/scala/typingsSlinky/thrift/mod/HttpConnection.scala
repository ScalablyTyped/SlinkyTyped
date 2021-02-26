package typingsSlinky.thrift.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "HttpConnection")
@js.native
class HttpConnection protected () extends EventEmitter {
  def this(host: String, port: Double) = this()
  def this(host: String, port: Double, options: ConnectOptions) = this()
  
  var host: String = js.native
  
  var https: Boolean = js.native
  
  var options: ConnectOptions = js.native
  
  var port: Double = js.native
  
  var protocol: TProtocol = js.native
  
  def responseCallback(response: IncomingMessage): Unit = js.native
  
  var transport: TTransport = js.native
  
  def write(data: Buffer): Unit = js.native
}
