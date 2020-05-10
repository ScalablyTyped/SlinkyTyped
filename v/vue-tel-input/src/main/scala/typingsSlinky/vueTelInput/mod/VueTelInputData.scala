package typingsSlinky.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputData extends js.Object {
  var activeCountry: VueTelInputCountryOption = js.native
  var open: Boolean = js.native
  var phone: String = js.native
  var selectedIndex: js.Any = js.native
  var typeToFindInput: String = js.native
  var typeToFindTimer: js.Any = js.native
}

object VueTelInputData {
  @scala.inline
  def apply(
    activeCountry: VueTelInputCountryOption,
    open: Boolean,
    phone: String,
    selectedIndex: js.Any,
    typeToFindInput: String,
    typeToFindTimer: js.Any
  ): VueTelInputData = {
    val __obj = js.Dynamic.literal(activeCountry = activeCountry.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], typeToFindInput = typeToFindInput.asInstanceOf[js.Any], typeToFindTimer = typeToFindTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputData]
  }
  @scala.inline
  implicit class VueTelInputDataOps[Self <: VueTelInputData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCountry(value: VueTelInputCountryOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeToFindInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeToFindInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeToFindTimer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeToFindTimer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

