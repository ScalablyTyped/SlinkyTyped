package typingsSlinky.semanticUiReact.dropdownDropdownMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typingsSlinky.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import typingsSlinky.semanticUiReact.dropdownSearchInputMod.DropdownSearchInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownComponent
  extends ComponentClass[DropdownProps, js.Object] {
  
  var Divider: ReactComponentClass[DropdownDividerProps] = js.native
  
  var Header: ReactComponentClass[DropdownHeaderProps] = js.native
  
  var Item: ReactComponentClass[DropdownItemProps] = js.native
  
  var Menu: ReactComponentClass[DropdownMenuProps] = js.native
  
  var SearchInput: ReactComponentClass[DropdownSearchInputProps] = js.native
}
