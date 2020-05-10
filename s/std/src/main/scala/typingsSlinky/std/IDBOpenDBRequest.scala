package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.stdStrings.blocked
import typingsSlinky.std.stdStrings.upgradeneeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Also inherits methods from its parents IDBRequest and EventTarget. */
@js.native
trait IDBOpenDBRequest
  extends IDBRequest[org.scalajs.dom.raw.IDBDatabase] {
  var onblocked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onupgradeneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.IDBVersionChangeEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_blocked(`type`: blocked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.IDBVersionChangeEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.IDBVersionChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.IDBVersionChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blocked(`type`: blocked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.IDBVersionChangeEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.IDBVersionChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.IDBVersionChangeEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("IDBOpenDBRequest")
@js.native
object IDBOpenDBRequest
  extends Instantiable0[org.scalajs.dom.raw.IDBOpenDBRequest]

