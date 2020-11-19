package typingsSlinky.workboxWindow.workboxMod

import org.scalajs.dom.experimental.serviceworkers.ServiceWorker
import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import typingsSlinky.std.RegistrationOptions
import typingsSlinky.workboxWindow.eventTargetShimMod.EventTargetShim
import typingsSlinky.workboxWindow.workboxEventMapMod.WorkboxExtendableEvent
import typingsSlinky.workboxWindow.workboxEventMapMod.WorkboxMessageEvent
import typingsSlinky.workboxWindow.workboxEventMapMod.WorkboxUpdatableEvent
import typingsSlinky.workboxWindow.workboxEventMapMod.WorkboxWaitingEvent
import typingsSlinky.workboxWindow.workboxEventMod.WorkboxEvent
import typingsSlinky.workboxWindow.workboxMod.Workbox.RegisterOptions
import typingsSlinky.workboxWindow.workboxWindowStrings.activated
import typingsSlinky.workboxWindow.workboxWindowStrings.externalactivated
import typingsSlinky.workboxWindow.workboxWindowStrings.externalinstalled
import typingsSlinky.workboxWindow.workboxWindowStrings.externalwaiting
import typingsSlinky.workboxWindow.workboxWindowStrings.installed
import typingsSlinky.workboxWindow.workboxWindowStrings.message
import typingsSlinky.workboxWindow.workboxWindowStrings.redundant
import typingsSlinky.workboxWindow.workboxWindowStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-window/Workbox", "Workbox")
@js.native
class Workbox_ protected () extends EventTargetShim {
  def this(scriptURL: String) = this()
  def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  
  val active: js.Promise[ServiceWorker] = js.native
  
  @JSName("addEventListener")
  def addEventListener_activated(
    `type`: activated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controlling(
    `type`: typingsSlinky.workboxWindow.workboxWindowStrings.controlling,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalactivated(
    `type`: externalactivated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalinstalled(
    `type`: externalinstalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalwaiting(
    `type`: externalwaiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_installed(
    `type`: installed,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxMessageEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redundant(`type`: redundant, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxWaitingEvent, Unit]
  ): Unit = js.native
  
  val controlling: js.Promise[ServiceWorker] = js.native
  
  def getSW(): js.Promise[ServiceWorker] = js.native
  
  def messageSW(data: js.Any): js.Promise[_] = js.native
  
  def register(): js.Promise[ServiceWorkerRegistration] = js.native
  def register(options: RegisterOptions): js.Promise[ServiceWorkerRegistration] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_activated(
    `type`: activated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controlling(
    `type`: typingsSlinky.workboxWindow.workboxWindowStrings.controlling,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalactivated(
    `type`: externalactivated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalinstalled(
    `type`: externalinstalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalwaiting(
    `type`: externalwaiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_installed(
    `type`: installed,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxMessageEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redundant(`type`: redundant, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxWaitingEvent, Unit]
  ): Unit = js.native
}
