package typingsSlinky.webgme.global

import typingsSlinky.webgme.Gme.Client
import typingsSlinky.webgme.GmePanel.Options
import typingsSlinky.webgme.GmePanel.OptionsWithHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmePanel {
  
  @JSGlobal("GmePanel.IActivePanel")
  @js.native
  class IActivePanel ()
    extends typingsSlinky.webgme.GmePanel.IActivePanel
  
  @JSGlobal("GmePanel.Layout")
  @js.native
  class Layout ()
    extends typingsSlinky.webgme.GmePanel.Layout
  
  @JSGlobal("GmePanel.LayoutManager")
  @js.native
  class LayoutManager ()
    extends typingsSlinky.webgme.GmePanel.LayoutManager
  
  @JSGlobal("GmePanel.Logger")
  @js.native
  class Logger ()
    extends typingsSlinky.webgme.GmePanel.Logger
  
  @JSGlobal("GmePanel.PanelBase")
  @js.native
  class PanelBase protected ()
    extends typingsSlinky.webgme.GmePanel.PanelBase {
    def this(options: Options) = this()
  }
  
  @JSGlobal("GmePanel.PanelBaseWithHeader")
  @js.native
  class PanelBaseWithHeader protected ()
    extends typingsSlinky.webgme.GmePanel.PanelBaseWithHeader {
    def this(options: OptionsWithHeader, layoutManger: typingsSlinky.webgme.GmePanel.LayoutManager) = this()
  }
  
  @JSGlobal("GmePanel.PanelManager")
  @js.native
  class PanelManager protected ()
    extends typingsSlinky.webgme.GmePanel.PanelManager {
    def this(client: Client) = this()
  }
}
