package typingsSlinky.uws.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.std.Error
import typingsSlinky.uws.Anon0
import typingsSlinky.uws.AnonBinary
import typingsSlinky.uws.AnonBinaryBoolean
import typingsSlinky.uws.AnonCode
import typingsSlinky.uws.AnonData
import typingsSlinky.uws.AnonReason
import typingsSlinky.uws.AnonTarget
import typingsSlinky.uws.AnonType
import typingsSlinky.uws.uwsStrings.close
import typingsSlinky.uws.uwsStrings.error
import typingsSlinky.uws.uwsStrings.message
import typingsSlinky.uws.uwsStrings.open
import typingsSlinky.uws.uwsStrings.ping
import typingsSlinky.uws.uwsStrings.pong
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocket extends EventEmitter {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
  var bytesReceived: Double = js.native
  var protocol: String = js.native
  var protocolVersion: String = js.native
  var readyState: Double = js.native
  var supports: js.Any = js.native
  var upgradeReq: IncomingMessage = js.native
  var url: String = js.native
  def addEventListener(method: String): Unit = js.native
  def addEventListener(method: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: close): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: close, cb: js.Function1[/* event */ AnonReason, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  // HTML5 WebSocket events
  @JSName("addEventListener")
  def addEventListener_message(method: message): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(method: message, cb: js.Function1[/* event */ AnonType, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: open): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: open, cb: js.Function1[/* event */ Anon0, Unit]): Unit = js.native
  @JSName("addListener")
  def addListener_close(event: close, cb: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, cb: js.Function2[/* data */ js.Any, /* flags */ AnonBinaryBoolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_open(event: open, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ping(event: ping, cb: js.Function2[/* data */ js.Any, /* flags */ AnonBinaryBoolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pong(event: pong, cb: js.Function2[/* data */ js.Any, /* flags */ AnonBinaryBoolean, Unit]): this.type = js.native
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, data: js.Any): Unit = js.native
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(
    event: close,
    cb: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* message */ String, Unit]
  ): this.type = js.native
  // Events
  @JSName("on")
  def on_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    cb: js.ThisFunction2[/* this */ this.type, /* data */ js.Any, /* flags */ AnonBinaryBoolean, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_open(event: open, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_ping(
    event: ping,
    cb: js.ThisFunction2[/* this */ this.type, /* data */ js.Any, /* flags */ AnonBinaryBoolean, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pong(
    event: pong,
    cb: js.ThisFunction2[/* this */ this.type, /* data */ js.Any, /* flags */ AnonBinaryBoolean, Unit]
  ): this.type = js.native
  def onclose(event: AnonCode): Unit = js.native
  def onerror(err: js.Error): Unit = js.native
  def onmessage(event: AnonData): Unit = js.native
  def onopen(event: AnonTarget): Unit = js.native
  def pause(): Unit = js.native
  def ping(): Unit = js.native
  def ping(data: js.Any): Unit = js.native
  def ping(data: js.Any, options: AnonBinary): Unit = js.native
  def ping(data: js.Any, options: AnonBinary, dontFail: Boolean): Unit = js.native
  def pong(): Unit = js.native
  def pong(data: js.Any): Unit = js.native
  def pong(data: js.Any, options: AnonBinary): Unit = js.native
  def pong(data: js.Any, options: AnonBinary, dontFail: Boolean): Unit = js.native
  def resume(): Unit = js.native
  def send(data: js.Any): Unit = js.native
  def send(data: js.Any, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def send(data: js.Any, options: AnonBinary): Unit = js.native
  def send(data: js.Any, options: AnonBinary, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stream(): Unit = js.native
  def stream(cb: js.Function2[/* err */ Error, /* final */ Boolean, Unit]): Unit = js.native
  def stream(options: AnonBinary): Unit = js.native
  def stream(options: AnonBinary, cb: js.Function2[/* err */ js.Error, /* final */ Boolean, Unit]): Unit = js.native
  def terminate(): Unit = js.native
}

