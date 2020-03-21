package typingsSlinky.storybookUi

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    var decorators: js.Array[js.Function1[/* storyFn */ _, ReactElement]] = js.native
    var title: String = js.native
    def component(hasNameIsComponentIsLeafIsExpandedIsSelectedProps: js.Any): ReactElement = js.native
  }
  
  @js.native
  object longName extends js.Object {
    var story: AnonName = js.native
    def apply(): ReactElement = js.native
  }
  
}

