package typingsSlinky.storybookUi

import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.sidebarSearchMod.PureSidebarSearchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarSearch.stories", JSImport.Namespace)
@js.native
object sidebarSearchStoriesMod extends js.Object {
  def filledIn(): ReactElement = js.native
  def focussed(): ReactElement = js.native
  def simple(): ReactElement = js.native
  @js.native
  object default extends js.Object {
    var decorators: js.Array[js.Function1[/* storyFn */ _, ReactElement]] = js.native
    var title: String = js.native
    def component(hasClassNameOnChangeProps: PureSidebarSearchProps): ReactElement = js.native
  }
  
}

