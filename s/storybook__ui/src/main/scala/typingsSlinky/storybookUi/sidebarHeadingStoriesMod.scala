package typingsSlinky.storybookUi

import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.anon.Id
import typingsSlinky.storybookUi.sidebarHeadingMod.SidebarHeadingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/SidebarHeading.stories", JSImport.Namespace)
@js.native
object sidebarHeadingStoriesMod extends js.Object {
  
  def customBrandImage(): ReactElement = js.native
  
  def linkAndText(): ReactElement = js.native
  
  def longText(): ReactElement = js.native
  
  def menuHighlighted(): ReactElement = js.native
  
  def onlyText(): ReactElement = js.native
  
  def standard(): ReactElement = js.native
  
  def standardNoLink(): ReactElement = js.native
  
  @js.native
  object default extends js.Object {
    
    def component(hasMenuHighlightedMenuProps: SidebarHeadingProps): ReactElement = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, ReactElement]] = js.native
    
    var excludeStories: js.RegExp = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object standardData extends js.Object {
    
    var menu: js.Array[Id] = js.native
  }
}
