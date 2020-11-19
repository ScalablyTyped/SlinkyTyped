package typingsSlinky.ws.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.ws.anon.Binary
import typingsSlinky.ws.anon.Code
import typingsSlinky.ws.anon.Error
import typingsSlinky.ws.anon.Target
import typingsSlinky.ws.wsStrings.`unexpected-response`
import typingsSlinky.ws.wsStrings.close
import typingsSlinky.ws.wsStrings.error
import typingsSlinky.ws.wsStrings.message
import typingsSlinky.ws.wsStrings.open
import typingsSlinky.ws.wsStrings.ping
import typingsSlinky.ws.wsStrings.pong
import typingsSlinky.ws.wsStrings.upgrade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// WebSocket socket.
@js.native
trait WebSocket extends EventEmitter {
  
  var CLOSED: Double = js.native
  
  var CLOSING: Double = js.native
  
  var CONNECTING: Double = js.native
  
  var OPEN: Double = js.native
  
  def addEventListener(method: String): Unit = js.native
  def addEventListener(method: String, listener: js.Function0[Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: close): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: close, cb: js.Function1[/* event */ Code, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error, cb: js.Function1[/* event */ Error, Unit]): Unit = js.native
  // HTML5 WebSocket events
  @JSName("addEventListener")
  def addEventListener_message(method: message): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(method: message, cb: js.Function1[/* event */ typingsSlinky.ws.anon.Data, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: open): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: open, cb: js.Function1[/* event */ Target, Unit]): Unit = js.native
  
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ping(event: ping, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pong(event: pong, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.Function2[/* request */ ClientRequest, /* response */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_upgrade(event: upgrade, listener: js.Function1[/* request */ IncomingMessage, Unit]): this.type = js.native
  
  var binaryType: String = js.native
  
  var bufferedAmount: Double = js.native
  
  def close(): Unit = js.native
  def close(code: js.UndefOr[scala.Nothing], data: String): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, data: String): Unit = js.native
  
  var extensions: String = js.native
  
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_close(
    event: close,
    listener: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* reason */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.ThisFunction1[/* this */ this.type, /* data */ Data, Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_ping(event: ping, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_pong(event: pong, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.ThisFunction2[
      /* this */ this.type, 
      /* request */ ClientRequest, 
      /* response */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_upgrade(
    event: upgrade,
    listener: js.ThisFunction1[/* this */ this.type, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  
  def onclose(event: CloseEvent): Unit = js.native
  
  def onerror(event: ErrorEvent): Unit = js.native
  
  def onmessage(event: MessageEvent): Unit = js.native
  
  def onopen(event: OpenEvent): Unit = js.native
  
  def ping(): Unit = js.native
  def ping(
    data: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
  def ping(data: js.UndefOr[scala.Nothing], mask: Boolean): Unit = js.native
  def ping(data: js.UndefOr[scala.Nothing], mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ping(data: js.Any): Unit = js.native
  def ping(data: js.Any, mask: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ping(data: js.Any, mask: Boolean): Unit = js.native
  def ping(data: js.Any, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def pong(): Unit = js.native
  def pong(
    data: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
  def pong(data: js.UndefOr[scala.Nothing], mask: Boolean): Unit = js.native
  def pong(data: js.UndefOr[scala.Nothing], mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def pong(data: js.Any): Unit = js.native
  def pong(data: js.Any, mask: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def pong(data: js.Any, mask: Boolean): Unit = js.native
  def pong(data: js.Any, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  var protocol: String = js.native
  
  var readyState: Double = js.native
  
  def removeEventListener(method: String): Unit = js.native
  def removeEventListener(method: String, listener: js.Function0[Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(method: close): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(method: close, cb: js.Function1[/* event */ Code, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(method: error): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(method: error, cb: js.Function1[/* event */ Error, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(method: message): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(method: message, cb: js.Function1[/* event */ typingsSlinky.ws.anon.Data, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(method: open): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(method: open, cb: js.Function1[/* event */ Target, Unit]): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_ping(event: ping, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pong(event: pong, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.Function2[/* request */ ClientRequest, /* response */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_upgrade(event: upgrade, listener: js.Function1[/* request */ IncomingMessage, Unit]): this.type = js.native
  
  def send(data: js.Any): Unit = js.native
  def send(data: js.Any, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def send(data: js.Any, options: Binary): Unit = js.native
  def send(data: js.Any, options: Binary, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  def terminate(): Unit = js.native
  
  var url: String = js.native
}
