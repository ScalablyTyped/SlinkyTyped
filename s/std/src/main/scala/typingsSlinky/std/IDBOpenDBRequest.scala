package typingsSlinky.std

import typingsSlinky.std.stdStrings.blocked
import typingsSlinky.std.stdStrings.upgradeneeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Also inherits methods from its parents IDBRequest and EventTarget. */
@js.native
trait IDBOpenDBRequest
  extends IDBRequest[org.scalajs.dom.raw.IDBDatabase] {
  
  @JSName("addEventListener")
  def addEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
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
  
  var onblocked: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  var onupgradeneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.IDBVersionChangeEvent, _]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
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
