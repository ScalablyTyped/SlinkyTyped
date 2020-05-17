package typingsSlinky.std

import typingsSlinky.std.stdStrings.controllerchange
import typingsSlinky.std.stdStrings.message
import typingsSlinky.std.stdStrings.messageerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ServiceWorkerContainer interface of the ServiceWorker API provides an object representing the service worker as an overall unit in the network ecosystem, including facilities to register, unregister and update service workers, and access the state of service workers and their registrations. */
@js.native
trait ServiceWorkerContainer extends EventTarget {
  val controller: org.scalajs.dom.experimental.serviceworkers.ServiceWorker | Null = js.native
  var oncontrollerchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]) | Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]) | Null = js.native
  val ready: js.Promise[org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration] = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def getRegistration(): js.Promise[
    js.UndefOr[org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration]
  ] = js.native
  def getRegistration(clientURL: java.lang.String): js.Promise[
    js.UndefOr[org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration]
  ] = js.native
  def getRegistrations(): js.Promise[js.Array[org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration]] = js.native
  def register(scriptURL: java.lang.String): js.Promise[org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration] = js.native
  def register(scriptURL: java.lang.String, options: RegistrationOptions): js.Promise[org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration] = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  def startMessages(): Unit = js.native
}

