package typingsSlinky.semanticUiReact.selectSelectMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps
  extends StrictSelectProps
     with /* key */ StringDictionary[js.Any]

object SelectProps {
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): SelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

