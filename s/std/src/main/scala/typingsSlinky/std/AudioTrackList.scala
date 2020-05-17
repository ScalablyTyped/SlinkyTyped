package typingsSlinky.std

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.std.stdStrings.addtrack
import typingsSlinky.std.stdStrings.change
import typingsSlinky.std.stdStrings.removetrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to represent a list of the audio tracks contained within a given HTML media element, with each track represented by a separate AudioTrack object in the list. */
@js.native
trait AudioTrackList
  extends EventTarget
     with /* index */ NumberDictionary[org.scalajs.dom.raw.AudioTrack] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.AudioTrack]] = js.native
  val length: Double = js.native
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _]) | Null = js.native
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def getTrackById(id: java.lang.String): org.scalajs.dom.raw.AudioTrack | Null = js.native
  def item(index: Double): org.scalajs.dom.raw.AudioTrack = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
}

