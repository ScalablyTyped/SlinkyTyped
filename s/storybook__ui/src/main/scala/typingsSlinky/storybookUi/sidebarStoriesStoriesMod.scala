package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.sidebarSidebarStoriesMod.StoriesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/SidebarStories.stories", JSImport.Namespace)
@js.native
object sidebarStoriesStoriesMod extends js.Object {
  
  def empty(): ReactElement = js.native
  
  def loading(): ReactElement = js.native
  
  def noRoot(): ReactElement = js.native
  
  def withRoot(): ReactElement = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: ReactComponentClass[StoriesProps] = js.native
    
    var decorators: js.Array[js.Function1[/* s */ _, ReactElement]] = js.native
    
    var excludeStories: js.RegExp = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object noRootData extends js.Object {
    
    var stories: js.Any = js.native
    
    var storyId: String = js.native
  }
  
  @js.native
  object withRootData extends js.Object {
    
    var stories: js.Any = js.native
    
    var storyId: String = js.native
  }
}
