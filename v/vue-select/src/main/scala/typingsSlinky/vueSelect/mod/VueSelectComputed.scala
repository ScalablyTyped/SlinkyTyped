package typingsSlinky.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueSelectComputed extends js.Object {
  def clearSearchOnBlur(): Boolean = js.native
  def dropdownClasses(): DropdownClasses = js.native
  def dropdownOpen(): Boolean = js.native
  def filteredOptions(): js.Array[_] = js.native
  def isValueEmpty(): Boolean = js.native
  def searchPlaceholder(): Boolean = js.native
  def searching(): Boolean = js.native
  def showClearButton(): Boolean = js.native
  def valueAsArray(): js.Array[_] = js.native
}

object VueSelectComputed {
  @scala.inline
  def apply(
    clearSearchOnBlur: () => Boolean,
    dropdownClasses: () => DropdownClasses,
    dropdownOpen: () => Boolean,
    filteredOptions: () => js.Array[_],
    isValueEmpty: () => Boolean,
    searchPlaceholder: () => Boolean,
    searching: () => Boolean,
    showClearButton: () => Boolean,
    valueAsArray: () => js.Array[_]
  ): VueSelectComputed = {
    val __obj = js.Dynamic.literal(clearSearchOnBlur = js.Any.fromFunction0(clearSearchOnBlur), dropdownClasses = js.Any.fromFunction0(dropdownClasses), dropdownOpen = js.Any.fromFunction0(dropdownOpen), filteredOptions = js.Any.fromFunction0(filteredOptions), isValueEmpty = js.Any.fromFunction0(isValueEmpty), searchPlaceholder = js.Any.fromFunction0(searchPlaceholder), searching = js.Any.fromFunction0(searching), showClearButton = js.Any.fromFunction0(showClearButton), valueAsArray = js.Any.fromFunction0(valueAsArray))
    __obj.asInstanceOf[VueSelectComputed]
  }
  @scala.inline
  implicit class VueSelectComputedOps[Self <: VueSelectComputed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearSearchOnBlur(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSearchOnBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDropdownClasses(value: () => DropdownClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownClasses")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDropdownOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFilteredOptions(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValueEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValueEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSearching(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowClearButton(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueAsArray(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAsArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

