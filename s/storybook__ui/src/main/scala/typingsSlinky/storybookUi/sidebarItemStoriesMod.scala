package typingsSlinky.storybookUi

import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/SidebarItem.stories", JSImport.Namespace)
@js.native
object sidebarItemStoriesMod extends js.Object {
  
  def component(): ReactElement = js.native
  
  def componentExpanded(): ReactElement = js.native
  
  def group(): ReactElement = js.native
  
  def loading(): ReactElement = js.native
  
  def nestedDepths(): ReactElement = js.native
  
  def story(): ReactElement = js.native
  
  def storySelected(): ReactElement = js.native
  
  @js.native
  object default extends js.Object {
    
    def component(hasNameIsComponentIsLeafIsExpandedIsSelectedProps: js.Any): ReactElement = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, ReactElement]] = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object longName extends js.Object {
    
    def apply(): ReactElement = js.native
    
    var story: Name = js.native
  }
}
