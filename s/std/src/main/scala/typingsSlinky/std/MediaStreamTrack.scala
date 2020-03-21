package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.stdStrings.ended
import typingsSlinky.std.stdStrings.isolationchange
import typingsSlinky.std.stdStrings.mute
import typingsSlinky.std.stdStrings.unmute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single media track within a stream; typically, these are audio or video tracks, but other track types may exist as well. */
@js.native
trait MediaStreamTrack extends EventTarget {
  var enabled: scala.Boolean = js.native
  val id: java.lang.String = js.native
  val isolated: scala.Boolean = js.native
  val kind: java.lang.String = js.native
  val label: java.lang.String = js.native
  val muted: scala.Boolean = js.native
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onisolationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmute: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onunmute: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  val readyState: org.scalajs.dom.experimental.mediastream.MediaStreamTrackState = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolationchange(`type`: isolationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolationchange(
    `type`: isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolationchange(
    `type`: isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(`type`: mute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(`type`: unmute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def applyConstraints(): js.Promise[Unit] = js.native
  def applyConstraints(constraints: org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): js.Promise[Unit] = js.native
  def getCapabilities(): MediaTrackCapabilities = js.native
  def getConstraints(): org.scalajs.dom.experimental.mediastream.MediaTrackConstraints = js.native
  def getSettings(): org.scalajs.dom.experimental.mediastream.MediaTrackSettings = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_isolationchange(`type`: isolationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_isolationchange(
    `type`: isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_isolationchange(
    `type`: isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(`type`: mute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(`type`: unmute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  def stop(): Unit = js.native
}

@JSGlobal("MediaStreamTrack")
@js.native
object MediaStreamTrack extends Instantiable0[MediaStreamTrack]

