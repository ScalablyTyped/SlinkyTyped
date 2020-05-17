package typingsSlinky.webgme.global

import typingsSlinky.webgme.Gme.Client
import typingsSlinky.webgme.GmePanel.Options
import typingsSlinky.webgme.GmePanel.OptionsWithHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel")
@js.native
object GmePanel extends js.Object {
  @js.native
  class IActivePanel ()
    extends typingsSlinky.webgme.GmePanel.IActivePanel
  
  @js.native
  class Layout ()
    extends typingsSlinky.webgme.GmePanel.Layout
  
  @js.native
  class LayoutManager ()
    extends typingsSlinky.webgme.GmePanel.LayoutManager
  
  @js.native
  class Logger ()
    extends typingsSlinky.webgme.GmePanel.Logger
  
  @js.native
  class PanelBase protected ()
    extends typingsSlinky.webgme.GmePanel.PanelBase {
    def this(options: Options) = this()
  }
  
  @js.native
  class PanelBaseWithHeader protected ()
    extends typingsSlinky.webgme.GmePanel.PanelBaseWithHeader {
    def this(options: OptionsWithHeader, layoutManger: typingsSlinky.webgme.GmePanel.LayoutManager) = this()
  }
  
  @js.native
  class PanelManager protected ()
    extends typingsSlinky.webgme.GmePanel.PanelManager {
    def this(client: Client) = this()
  }
  
}

