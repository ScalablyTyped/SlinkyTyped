package typingsSlinky.vueTelInput.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputMethods extends js.Object {
  def choose(country: js.Any): Unit = js.native
  def clickedOutside(): Unit = js.native
  def findCountry(iso: String): js.Array[_] = js.native
  def getCountries(list: js.Array[_]): js.Array[_] = js.native
  def getItemClass(index: Double, iso2: String): js.Any = js.native
  def initializeCountry(): Unit = js.native
  def keyboardNav(e: Event): Unit = js.native
  def onBlur(): Unit = js.native
  def onInput(): Unit = js.native
  def reset(): Unit = js.native
  def toggleDropdown(): Unit = js.native
}

object VueTelInputMethods {
  @scala.inline
  def apply(
    choose: js.Any => Unit,
    clickedOutside: () => Unit,
    findCountry: String => js.Array[_],
    getCountries: js.Array[_] => js.Array[_],
    getItemClass: (Double, String) => js.Any,
    initializeCountry: () => Unit,
    keyboardNav: Event => Unit,
    onBlur: () => Unit,
    onInput: () => Unit,
    reset: () => Unit,
    toggleDropdown: () => Unit
  ): VueTelInputMethods = {
    val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose), clickedOutside = js.Any.fromFunction0(clickedOutside), findCountry = js.Any.fromFunction1(findCountry), getCountries = js.Any.fromFunction1(getCountries), getItemClass = js.Any.fromFunction2(getItemClass), initializeCountry = js.Any.fromFunction0(initializeCountry), keyboardNav = js.Any.fromFunction1(keyboardNav), onBlur = js.Any.fromFunction0(onBlur), onInput = js.Any.fromFunction0(onInput), reset = js.Any.fromFunction0(reset), toggleDropdown = js.Any.fromFunction0(toggleDropdown))
    __obj.asInstanceOf[VueTelInputMethods]
  }
  @scala.inline
  implicit class VueTelInputMethodsOps[Self <: VueTelInputMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoose(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClickedOutside(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickedOutside")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindCountry(value: String => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findCountry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCountries(value: js.Array[_] => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCountries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemClass(value: (Double, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInitializeCountry(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializeCountry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeyboardNav(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNav")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnInput(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleDropdown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleDropdown")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

