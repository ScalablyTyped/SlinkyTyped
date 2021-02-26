package typingsSlinky.std

import typingsSlinky.std.stdStrings.keystatuseschange
import typingsSlinky.std.stdStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This EncryptedMediaExtensions API interface represents a context for message exchange with a content decryption module (CDM). */
@js.native
trait MediaKeySession extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  val closed: js.Promise[Unit] = js.native
  
  val expiration: Double = js.native
  
  def generateRequest(initDataType: java.lang.String, initData: BufferSource): js.Promise[Unit] = js.native
  
  val keyStatuses: MediaKeyStatusMap = js.native
  
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  var onkeystatuseschange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _]) | Null = js.native
  
  def remove(): js.Promise[Unit] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  
  val sessionId: java.lang.String = js.native
  
  def update(response: BufferSource): js.Promise[Unit] = js.native
}
