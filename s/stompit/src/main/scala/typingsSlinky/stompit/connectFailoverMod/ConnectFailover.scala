package typingsSlinky.stompit.connectFailoverMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.stompit.anon.Abort
import typingsSlinky.stompit.connectMod.ConnectOptions
import typingsSlinky.stompit.stompitStrings.connect
import typingsSlinky.stompit.stompitStrings.connecting
import typingsSlinky.stompit.stompitStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectFailover extends EventEmitter {
  
  def addServer(config: String): Unit = js.native
  def addServer(config: ConnectOptions): Unit = js.native
  
  def connect(
    callback: js.Function4[
      /* error */ js.Error | Null, 
      /* client */ typingsSlinky.stompit.clientMod.^, 
      /* reconnect */ js.Function0[Unit], 
      /* server */ Server, 
      Unit
    ]
  ): Abort = js.native
  
  def getReconnectDelay(reconnects: Double): Double = js.native
  
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* server */ ConnectState, Unit]): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function1[/* server */ ConnectState, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ ConnectError, /* server */ ConnectState, Unit]): this.type = js.native
}
