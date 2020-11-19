package typingsSlinky.std

import typingsSlinky.std.stdStrings.tonechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtmfSender extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val canInsertDTMF: scala.Boolean = js.native
  
  val duration: Double = js.native
  
  def insertDTMF(tones: java.lang.String): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: js.UndefOr[scala.Nothing], interToneGap: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double, interToneGap: Double): Unit = js.native
  
  val interToneGap: Double = js.native
  
  var ontonechange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  
  val sender: RTCRtpSender = js.native
  
  val toneBuffer: java.lang.String = js.native
}
