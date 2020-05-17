package typingsSlinky.std

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.std.stdStrings.addsourcebuffer
import typingsSlinky.std.stdStrings.removesourcebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A simple container list for multiple SourceBuffer objects. */
@js.native
trait SourceBufferList
  extends EventTarget
     with /* index */ NumberDictionary[SourceBuffer] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SourceBuffer]] = js.native
  val length: Double = js.native
  var onaddsourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onremovesourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
}

