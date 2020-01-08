package typingsSlinky.atStorybookUi

import typingsSlinky.atStorybookUi.atStorybookUiStrings.button
import typingsSlinky.atStorybookUi.atStorybookUiStrings.form
import typingsSlinky.atStorybookUi.atStorybookUiStrings.input
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarSearch", JSImport.Namespace)
@js.native
object distComponentsSidebarSidebarSearchMod extends js.Object {
  def PureSidebarSearch(hasClassNameOnChangeProps: PureSidebarSearchProps): Element = js.native
  def default(hasClassNameOnChangeProps: PureSidebarSearchProps): Element = js.native
  type CancelButtonProps = ComponentProps[button]
  type FilterFieldProps = ComponentProps[input]
  type FilterFormProps = ComponentProps[form] with Anon_Focussed
  type PureSidebarSearchProps = FilterFieldProps with Anon_Arg
}

