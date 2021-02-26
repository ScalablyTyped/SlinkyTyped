package typingsSlinky.sharepoint.global.SP.UI

import typingsSlinky.sharepoint.SP.UI.Controls.INavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  @JSGlobal("SP.UI.Controls.ControlManager")
  @js.native
  class ControlManager ()
    extends typingsSlinky.sharepoint.SP.UI.Controls.ControlManager
  object ControlManager {
    
    /* static member */
    @JSGlobal("SP.UI.Controls.ControlManager.getControl")
    @js.native
    def getControl(placeHolderId: String): js.Any = js.native
  }
  
  @JSGlobal("SP.UI.Controls.Navigation")
  @js.native
  class Navigation protected ()
    extends typingsSlinky.sharepoint.SP.UI.Controls.Navigation {
    def this(placeholderDOMElementId: String, options: INavigationOptions) = this()
  }
  object Navigation {
    
    /* static member */
    @JSGlobal("SP.UI.Controls.Navigation.getVersionedLayoutsUrl")
    @js.native
    def getVersionedLayoutsUrl(pageName: String): String = js.native
  }
  
  @JSGlobal("SP.UI.Controls.NavigationOptions")
  @js.native
  class NavigationOptions () extends INavigationOptions
  
  @JSGlobal("SP.UI.Controls.SettingsLink")
  @js.native
  class SettingsLink ()
    extends typingsSlinky.sharepoint.SP.UI.Controls.SettingsLink
}
