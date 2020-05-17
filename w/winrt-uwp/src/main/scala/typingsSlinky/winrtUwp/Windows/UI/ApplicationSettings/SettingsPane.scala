package typingsSlinky.winrtUwp.Windows.UI.ApplicationSettings

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.commandsrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class that enables the app to control the Settings Charm pane. The app can add or remove commands, receive a notification when the user opens the pane, or open the pane programmatically. */
@js.native
trait SettingsPane extends js.Object {
  /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
  @JSName("oncommandsrequested")
  var oncommandsrequested_Original: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_commandsrequested(
    `type`: commandsrequested,
    listener: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
  /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
  def oncommandsrequested(ev: SettingsPaneCommandsRequestedEventArgs with WinRTEvent[SettingsPane]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_commandsrequested(
    `type`: commandsrequested,
    listener: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
}

