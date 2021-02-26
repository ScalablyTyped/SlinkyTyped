package typingsSlinky.thrift.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "Connection")
@js.native
class Connection protected () extends EventEmitter {
  def this(stream: Socket) = this()
  def this(stream: Socket, options: ConnectOptions) = this()
  
  var connected: Boolean = js.native
  
  var connection: Socket = js.native
  
  def connection_gone(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def end(): Unit = js.native
  
  def initialize_retry_vars(): Unit = js.native
  
  var offline_queue: js.Array[Buffer] = js.native
  
  var options: ConnectOptions = js.native
  
  var protocol: TProtocol = js.native
  
  var seqId2Service: SeqId2Service = js.native
  
  var ssl: Boolean = js.native
  
  var transport: TTransport = js.native
  
  def write(data: Buffer): Unit = js.native
}
