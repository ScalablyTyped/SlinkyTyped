package typingsSlinky.std

import typingsSlinky.std.stdStrings.cancel
import typingsSlinky.std.stdStrings.finish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def cancel(): Unit = js.native
  
  var currentTime: Double | Null = js.native
  
  var effect: AnimationEffect | Null = js.native
  
  def finish(): Unit = js.native
  
  val finished: js.Promise[Animation] = js.native
  
  var id: java.lang.String = js.native
  
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]) | Null = js.native
  
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]) | Null = js.native
  
  def pause(): Unit = js.native
  
  val pending: scala.Boolean = js.native
  
  def play(): Unit = js.native
  
  val playState: AnimationPlayState = js.native
  
  var playbackRate: Double = js.native
  
  val ready: js.Promise[Animation] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  
  def reverse(): Unit = js.native
  
  var startTime: Double | Null = js.native
  
  var timeline: AnimationTimeline | Null = js.native
  
  def updatePlaybackRate(playbackRate: Double): Unit = js.native
}
