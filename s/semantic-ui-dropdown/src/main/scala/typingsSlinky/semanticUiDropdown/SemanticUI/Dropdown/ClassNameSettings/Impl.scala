package typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String = js.native
  /**
    * @default 'addition'
    */
  var addition: String = js.native
  /**
    * @default 'animating'
    */
  var animating: String = js.native
  /**
    * @default 'disabled'
    */
  var disabled: String = js.native
  /**
    * @default 'ui dropdown'
    */
  var dropdown: String = js.native
  /**
    * @default 'filtered'
    */
  var filtered: String = js.native
  /**
    * @default 'hidden transition'
    */
  var hidden: String = js.native
  /**
    * @default 'item'
    */
  var item: String = js.native
  /**
    * @default 'ui label'
    */
  var label: String = js.native
  /**
    * @default 'loading'
    */
  var loading: String = js.native
  /**
    * @default 'menu'
    */
  var menu: String = js.native
  /**
    * @default 'message'
    */
  var message: String = js.native
  /**
    * @default 'multiple'
    */
  var multiple: String = js.native
  /**
    * @default 'default'
    */
  var placeholder: String = js.native
  /**
    * @default 'search'
    */
  var search: String = js.native
  /**
    * @default 'selected'
    */
  var selected: String = js.native
  /**
    * @default 'selection'
    */
  var selection: String = js.native
  /**
    * @default 'upward'
    */
  var upward: String = js.native
  /**
    * @default 'visible'
    */
  var visible: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    active: String,
    addition: String,
    animating: String,
    disabled: String,
    dropdown: String,
    filtered: String,
    hidden: String,
    item: String,
    label: String,
    loading: String,
    menu: String,
    message: String,
    multiple: String,
    placeholder: String,
    search: String,
    selected: String,
    selection: String,
    upward: String,
    visible: String
  ): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addition = addition.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], upward = upward.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiltered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
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
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

