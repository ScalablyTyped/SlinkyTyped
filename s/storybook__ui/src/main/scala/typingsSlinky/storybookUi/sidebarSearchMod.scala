package typingsSlinky.storybookUi

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.storybookUi.anon.Focussed
import typingsSlinky.storybookUi.anon.OnChange
import typingsSlinky.storybookUi.storybookUiStrings.button
import typingsSlinky.storybookUi.storybookUiStrings.form
import typingsSlinky.storybookUi.storybookUiStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/SidebarSearch", JSImport.Namespace)
@js.native
object sidebarSearchMod extends js.Object {
  
  def PureSidebarSearch(hasClassNameOnChangeProps: PureSidebarSearchProps): ReactElement = js.native
  
  def default(hasClassNameOnChangeProps: PureSidebarSearchProps): ReactElement = js.native
  
  type CancelButtonProps = ComponentProps[button]
  
  type FilterFieldProps = ComponentProps[input]
  
  type FilterFormProps = ComponentProps[form] with Focussed
  
  type PureSidebarSearchProps = FilterFieldProps with OnChange
}
