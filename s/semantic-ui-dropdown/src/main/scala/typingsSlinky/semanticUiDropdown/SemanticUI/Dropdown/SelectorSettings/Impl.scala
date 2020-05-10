package typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default '.addition'
    */
  var addition: String = js.native
  /**
    * @default '.ui.dropdown'
    */
  var dropdown: String = js.native
  /**
    * @default '> .dropdown.icon'
    */
  var icon: String = js.native
  /**
    * @default '> input[type="hidden"], > select'
    */
  var input: String = js.native
  /**
    * @default '.item'
    */
  var item: String = js.native
  /**
    * @default '> .label'
    */
  var label: String = js.native
  /**
    * @default '.menu'
    */
  var menu: String = js.native
  /**
    * @default '.dropdown.icon'
    */
  var menuIcon: String = js.native
  /**
    * @default '.message'
    */
  var message: String = js.native
  /**
    * @default '> .label > .delete.icon'
    */
  var remove: String = js.native
  /**
    * @default 'input.search, .menu > .search > input'
    */
  var search: String = js.native
  /**
    * @default '.label'
    */
  var siblingLabel: String = js.native
  /**
    * @default '> .text:not(.icon)'
    */
  var text: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    addition: String,
    dropdown: String,
    icon: String,
    input: String,
    item: String,
    label: String,
    menu: String,
    menuIcon: String,
    message: String,
    remove: String,
    search: String,
    siblingLabel: String,
    text: String
  ): Impl = {
    val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuIcon = menuIcon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], siblingLabel = siblingLabel.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiblingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

