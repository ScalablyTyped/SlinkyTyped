package typingsSlinky.std

import typingsSlinky.std.stdStrings.error
import typingsSlinky.std.stdStrings.localcandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceGatherer extends RTCStatsProvider {
  
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val component: RTCIceComponent = js.native
  
  def createAssociatedGatherer(): RTCIceGatherer = js.native
  
  def getLocalCandidates(): js.Array[RTCIceCandidateDictionary] = js.native
  
  def getLocalParameters(): RTCIceParameters = js.native
  
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  var onlocalcandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}
