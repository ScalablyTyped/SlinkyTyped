package typingsSlinky.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueSelectProps extends js.Object {
  var autocomplete: String = js.native
  var clearSearchOnSelect: Boolean = js.native
  var clearable: Boolean = js.native
  var closeOnSelect: Boolean = js.native
  var dir: String = js.native
  var disabled: Boolean = js.native
  var filterable: Boolean = js.native
  var index: String | Null = js.native
  var inputId: String | Null = js.native
  var label: String = js.native
  var maxHeight: String = js.native
  var multiple: Boolean = js.native
  var noDrop: Boolean = js.native
  var options: js.Array[_] = js.native
  var placeholder: String = js.native
  var pushTags: Boolean = js.native
  var resetOnOptionsChange: Boolean = js.native
  var searchable: Boolean = js.native
  var selectOnTab: Boolean = js.native
  var tabindex: Double | Null = js.native
  var taggable: Boolean = js.native
  var transition: String = js.native
  var value: js.Any = js.native
  def createOption(option: js.Any): js.Any = js.native
  def filter(options: js.Array[_], search: String): Boolean = js.native
  def filterBy(option: js.Any, label: String, search: String): Boolean = js.native
  def getOptionLabel(option: js.Any): String = js.native
  def onChange(`val`: js.Any): Unit = js.native
  def onInput(`val`: js.Any): Unit = js.native
  def onTab(): Unit = js.native
}

object VueSelectProps {
  @scala.inline
  def apply(
    autocomplete: String,
    clearSearchOnSelect: Boolean,
    clearable: Boolean,
    closeOnSelect: Boolean,
    createOption: js.Any => js.Any,
    dir: String,
    disabled: Boolean,
    filter: (js.Array[_], String) => Boolean,
    filterBy: (js.Any, String, String) => Boolean,
    filterable: Boolean,
    getOptionLabel: js.Any => String,
    label: String,
    maxHeight: String,
    multiple: Boolean,
    noDrop: Boolean,
    onChange: js.Any => Unit,
    onInput: js.Any => Unit,
    onTab: () => Unit,
    options: js.Array[_],
    placeholder: String,
    pushTags: Boolean,
    resetOnOptionsChange: Boolean,
    searchable: Boolean,
    selectOnTab: Boolean,
    taggable: Boolean,
    transition: String,
    value: js.Any
  ): VueSelectProps = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], clearSearchOnSelect = clearSearchOnSelect.asInstanceOf[js.Any], clearable = clearable.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], createOption = js.Any.fromFunction1(createOption), dir = dir.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], filter = js.Any.fromFunction2(filter), filterBy = js.Any.fromFunction3(filterBy), filterable = filterable.asInstanceOf[js.Any], getOptionLabel = js.Any.fromFunction1(getOptionLabel), label = label.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], noDrop = noDrop.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onInput = js.Any.fromFunction1(onInput), onTab = js.Any.fromFunction0(onTab), options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pushTags = pushTags.asInstanceOf[js.Any], resetOnOptionsChange = resetOnOptionsChange.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], selectOnTab = selectOnTab.asInstanceOf[js.Any], taggable = taggable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueSelectProps]
  }
  @scala.inline
  implicit class VueSelectPropsOps[Self <: VueSelectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocomplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearSearchOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSearchOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateOption(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: (js.Array[_], String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilterBy(value: (js.Any, String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOptionLabel(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnInput(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTab(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetOnOptionsChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnOptionsChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectOnTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(null)
        ret
    }
    @scala.inline
    def withInputId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(null)
        ret
    }
    @scala.inline
    def withTabindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabindexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(null)
        ret
    }
  }
  
}

