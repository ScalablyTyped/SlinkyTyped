package typingsSlinky.tabris

import typingsSlinky.tabris.tabrisStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePort extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  def onmessage(ev: MessageEvent): js.Any = js.native
  def postMessage(): Unit = js.native
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[_]): Unit = js.native
  def start(): Unit = js.native
}

