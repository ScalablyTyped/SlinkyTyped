package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.stdStrings.click
import typingsSlinky.std.stdStrings.error
import typingsSlinky.std.stdStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Notifications API interface is used to configure and display desktop notifications to the user. */
@js.native
trait Notification extends EventTarget {
  val actions: js.Array[NotificationAction] = js.native
  val badge: java.lang.String = js.native
  val body: java.lang.String = js.native
  val data: js.Any = js.native
  val dir: NotificationDirection = js.native
  val icon: java.lang.String = js.native
  val image: java.lang.String = js.native
  val lang: java.lang.String = js.native
  var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onshow: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  val renotify: scala.Boolean = js.native
  val requireInteraction: scala.Boolean = js.native
  val silent: scala.Boolean = js.native
  val tag: java.lang.String = js.native
  val timestamp: Double = js.native
  val title: java.lang.String = js.native
  val vibrate: js.Array[Double] = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: typingsSlinky.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: typingsSlinky.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: typingsSlinky.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_show(`type`: show, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_show(
    `type`: show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_show(
    `type`: show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def close(): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: typingsSlinky.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: typingsSlinky.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: typingsSlinky.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_show(`type`: show, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_show(
    `type`: show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_show(
    `type`: show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("Notification")
@js.native
object Notification
  extends Instantiable1[/* title */ java.lang.String, org.scalajs.dom.experimental.Notification]
     with Instantiable2[
      /* title */ java.lang.String, 
      /* options */ org.scalajs.dom.experimental.NotificationOptions, 
      org.scalajs.dom.experimental.Notification
    ] {
  val maxActions: Double = js.native
  val permission: NotificationPermission = js.native
  def requestPermission(): js.Promise[NotificationPermission] = js.native
  def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
}

