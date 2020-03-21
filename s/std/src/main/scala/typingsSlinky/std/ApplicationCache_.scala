package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.stdStrings.cached
import typingsSlinky.std.stdStrings.checking
import typingsSlinky.std.stdStrings.downloading
import typingsSlinky.std.stdStrings.error
import typingsSlinky.std.stdStrings.noupdate
import typingsSlinky.std.stdStrings.obsolete
import typingsSlinky.std.stdStrings.progress
import typingsSlinky.std.stdStrings.updateready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCache_ extends EventTarget {
  val CHECKING: Double = js.native
  val DOWNLOADING: Double = js.native
  val IDLE: Double = js.native
  val OBSOLETE: Double = js.native
  val UNCACHED: Double = js.native
  val UPDATEREADY: Double = js.native
  /** @deprecated */
  var oncached: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /** @deprecated */
  var onchecking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /** @deprecated */
  var ondownloading: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /** @deprecated */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /** @deprecated */
  var onnoupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /** @deprecated */
  var onobsolete: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /** @deprecated */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]) | Null = js.native
  /** @deprecated */
  var onupdateready: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /** @deprecated */
  val status: Double = js.native
  /** @deprecated */
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(`type`: cached, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(`type`: checking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(`type`: downloading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(
    `type`: downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(
    `type`: downloading,
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
  def addEventListener_noupdate(`type`: noupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(`type`: obsolete, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(`type`: updateready, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cached(`type`: cached, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(`type`: checking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(`type`: downloading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(
    `type`: downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(
    `type`: downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
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
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(`type`: noupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(`type`: obsolete, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(`type`: updateready, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  /** @deprecated */
  def swapCache(): Unit = js.native
  /** @deprecated */
  def update(): Unit = js.native
}

@JSGlobal("ApplicationCache")
@js.native
object ApplicationCache_ extends Instantiable0[ApplicationCache_] {
  val CHECKING: Double = js.native
  val DOWNLOADING: Double = js.native
  val IDLE: Double = js.native
  val OBSOLETE: Double = js.native
  val UNCACHED: Double = js.native
  val UPDATEREADY: Double = js.native
}

