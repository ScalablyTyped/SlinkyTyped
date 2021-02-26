package typingsSlinky.std

import typingsSlinky.std.stdStrings.updatefound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This ServiceWorker API interface represents the service worker registration. You register a service worker to control one or more pages that share the same origin. */
@js.native
trait ServiceWorkerRegistration extends EventTarget {
  
  val active: org.scalajs.dom.experimental.serviceworkers.ServiceWorker | Null = js.native
  
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def getNotifications(): js.Promise[js.Array[org.scalajs.dom.experimental.Notification]] = js.native
  def getNotifications(filter: org.scalajs.dom.experimental.serviceworkers.GetNotificationOptions): js.Promise[js.Array[org.scalajs.dom.experimental.Notification]] = js.native
  
  val installing: org.scalajs.dom.experimental.serviceworkers.ServiceWorker | Null = js.native
  
  val navigationPreload: NavigationPreloadManager = js.native
  
  var onupdatefound: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  val pushManager: org.scalajs.dom.experimental.push.PushManager = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  
  val scope: java.lang.String = js.native
  
  def showNotification(title: java.lang.String): js.Promise[Unit] = js.native
  def showNotification(title: java.lang.String, options: org.scalajs.dom.experimental.NotificationOptions): js.Promise[Unit] = js.native
  
  val sync: SyncManager = js.native
  
  def unregister(): js.Promise[scala.Boolean] = js.native
  
  def update(): js.Promise[Unit] = js.native
  
  val updateViaCache: ServiceWorkerUpdateViaCache = js.native
  
  val waiting: org.scalajs.dom.experimental.serviceworkers.ServiceWorker | Null = js.native
}
