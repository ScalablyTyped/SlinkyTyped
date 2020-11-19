package typingsSlinky.sharepoint.global.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.Page")
@js.native
object Page extends js.Object {
  
  @js.native
  class CommandDispatcher ()
    extends typingsSlinky.sharepoint.CUI.Page.CommandDispatcher
  
  @js.native
  class FocusManager ()
    extends typingsSlinky.sharepoint.CUI.Page.FocusManager
  
  @js.native
  class PageComponent ()
    extends typingsSlinky.sharepoint.CUI.Page.PageComponent
  
  @js.native
  class PageManager ()
    extends typingsSlinky.sharepoint.CUI.Page.PageManager
  /* static members */
  @js.native
  object PageManager extends js.Object {
    
    def createPageManager(): typingsSlinky.sharepoint.CUI.Page.PageManager = js.native
    
    def get_instance(): typingsSlinky.sharepoint.CUI.Page.PageManager = js.native
    
    def initialize(): scala.Unit = js.native
  }
  
  @js.native
  class UndoManager ()
    extends typingsSlinky.sharepoint.CUI.Page.UndoManager
}
