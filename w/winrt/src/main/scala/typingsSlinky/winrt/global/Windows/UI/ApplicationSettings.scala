package typingsSlinky.winrt.global.Windows.UI

import typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation
import typingsSlinky.winrt.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.ApplicationSettings")
@js.native
object ApplicationSettings extends js.Object {
  
  @js.native
  class SettingsCommand protected ()
    extends typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsCommand {
    def this(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler) = this()
  }
  
  @js.native
  object SettingsEdgeLocation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation with Double
      ] = js.native
    
    /* 1 */ val left: typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.left with Double = js.native
    
    /* 0 */ val right: typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.right with Double = js.native
  }
  
  @js.native
  class SettingsPane ()
    extends typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsPane
  /* static members */
  @js.native
  object SettingsPane extends js.Object {
    
    var edge: SettingsEdgeLocation = js.native
    
    def getForCurrentView(): typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsPane = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  class SettingsPaneCommandsRequest ()
    extends typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest
  
  @js.native
  class SettingsPaneCommandsRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs
}
