package typingsSlinky.uiSelect.mod.ui.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectConfig extends js.Object {
  var appendToBody: Boolean = js.native
  var backspaceReset: Boolean = js.native
  var closeOnSelect: Boolean = js.native
  var dropdownPosition: String = js.native
  var paste: js.UndefOr[IPasteFn] = js.native
  var placeholder: String = js.native
  var refreshDelay: Double = js.native
  var removeSelected: Boolean = js.native
  var resetSearchInput: Boolean = js.native
  var searchEnabled: Boolean = js.native
  var skipFocusser: Boolean = js.native
  var sortable: Boolean = js.native
  var spinnerClass: String = js.native
  var spinnerEnabled: Boolean = js.native
  var theme: String = js.native
  def generateId(): Double = js.native
}

object ISelectConfig {
  @scala.inline
  def apply(
    appendToBody: Boolean,
    backspaceReset: Boolean,
    closeOnSelect: Boolean,
    dropdownPosition: String,
    generateId: () => Double,
    placeholder: String,
    refreshDelay: Double,
    removeSelected: Boolean,
    resetSearchInput: Boolean,
    searchEnabled: Boolean,
    skipFocusser: Boolean,
    sortable: Boolean,
    spinnerClass: String,
    spinnerEnabled: Boolean,
    theme: String
  ): ISelectConfig = {
    val __obj = js.Dynamic.literal(appendToBody = appendToBody.asInstanceOf[js.Any], backspaceReset = backspaceReset.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], dropdownPosition = dropdownPosition.asInstanceOf[js.Any], generateId = js.Any.fromFunction0(generateId), placeholder = placeholder.asInstanceOf[js.Any], refreshDelay = refreshDelay.asInstanceOf[js.Any], removeSelected = removeSelected.asInstanceOf[js.Any], resetSearchInput = resetSearchInput.asInstanceOf[js.Any], searchEnabled = searchEnabled.asInstanceOf[js.Any], skipFocusser = skipFocusser.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], spinnerClass = spinnerClass.asInstanceOf[js.Any], spinnerEnabled = spinnerEnabled.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectConfig]
  }
  @scala.inline
  implicit class ISelectConfigOps[Self <: ISelectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendToBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackspaceReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspaceReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetSearchInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSearchInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipFocusser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFocusser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinnerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinnerEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaste(value: /* data */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
  }
  
}

