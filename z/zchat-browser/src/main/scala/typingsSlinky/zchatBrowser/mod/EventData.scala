package typingsSlinky.zchatBrowser.mod

import typingsSlinky.zchatBrowser.anon.Nick
import typingsSlinky.zchatBrowser.anon.Timestamp
import typingsSlinky.zchatBrowser.anon.Typing
import typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData
  - typingsSlinky.zchatBrowser.anon.Nick
  - typingsSlinky.zchatBrowser.anon.Typing
  - typingsSlinky.zchatBrowser.anon.Timestamp
  - typingsSlinky.zchatBrowser.zchatBrowserStrings.online
  - typingsSlinky.zchatBrowser.zchatBrowserStrings.away
  - typingsSlinky.zchatBrowser.zchatBrowserStrings.offline
  - typingsSlinky.zchatBrowser.zchatBrowserStrings.connecting
  - typingsSlinky.zchatBrowser.zchatBrowserStrings.connected
  - typingsSlinky.zchatBrowser.zchatBrowserStrings.closed
*/
trait EventData extends js.Object

object EventData {
  @scala.inline
  def online: typingsSlinky.zchatBrowser.zchatBrowserStrings.online = "online".asInstanceOf[typingsSlinky.zchatBrowser.zchatBrowserStrings.online]
  @scala.inline
  def away: typingsSlinky.zchatBrowser.zchatBrowserStrings.away = "away".asInstanceOf[typingsSlinky.zchatBrowser.zchatBrowserStrings.away]
  @scala.inline
  def offline: typingsSlinky.zchatBrowser.zchatBrowserStrings.offline = "offline".asInstanceOf[typingsSlinky.zchatBrowser.zchatBrowserStrings.offline]
  @scala.inline
  def connecting: typingsSlinky.zchatBrowser.zchatBrowserStrings.connecting = "connecting".asInstanceOf[typingsSlinky.zchatBrowser.zchatBrowserStrings.connecting]
  @scala.inline
  def connected: typingsSlinky.zchatBrowser.zchatBrowserStrings.connected = "connected".asInstanceOf[typingsSlinky.zchatBrowser.zchatBrowserStrings.connected]
  @scala.inline
  def closed: typingsSlinky.zchatBrowser.zchatBrowserStrings.closed = "closed".asInstanceOf[typingsSlinky.zchatBrowser.zchatBrowserStrings.closed]
  @scala.inline
  implicit def apply(value: ChatEventData): EventData = value.asInstanceOf[EventData]
  @scala.inline
  implicit def apply(value: Nick): EventData = value.asInstanceOf[EventData]
  @scala.inline
  implicit def apply(value: Timestamp): EventData = value.asInstanceOf[EventData]
  @scala.inline
  implicit def apply(value: Typing): EventData = value.asInstanceOf[EventData]
}

