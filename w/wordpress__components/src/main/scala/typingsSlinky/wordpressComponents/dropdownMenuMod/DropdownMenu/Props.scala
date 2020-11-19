package typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.dropdownMod.Dropdown.RenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren
  - typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls
*/
trait Props extends js.Object
object Props {
  
  @scala.inline
  def PropsWithChildren(children: RenderProps => ReactElement, label: String): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  def PropsWithControls(controls: js.Array[Control], label: String): Props = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}
