package typingsSlinky.semanticUiReact.selectSelectMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typingsSlinky.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectComponent extends FunctionComponent[SelectProps] {
  
  var Divider: ReactComponentClass[DropdownDividerProps] = js.native
  
  var Header: ReactComponentClass[DropdownHeaderProps] = js.native
  
  var Item: ReactComponentClass[DropdownItemProps] = js.native
  
  var Menu: ReactComponentClass[DropdownMenuProps] = js.native
}
