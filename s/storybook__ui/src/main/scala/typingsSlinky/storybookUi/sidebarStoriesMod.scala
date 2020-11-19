package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.anon.Id
import typingsSlinky.storybookUi.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", JSImport.Namespace)
@js.native
object sidebarStoriesMod extends js.Object {
  
  def loading(): ReactElement = js.native
  
  def simple(): ReactElement = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: ReactComponentClass[SidebarProps] = js.native
    
    var excludeStories: js.RegExp = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object loadingData extends js.Object {
    
    var menu: js.Array[Id] = js.native
  }
  
  @js.native
  object simpleData extends js.Object {
    
    var menu: js.Array[Id] = js.native
    
    var stories: js.Any = js.native
    
    var storyId: String = js.native
  }
}
