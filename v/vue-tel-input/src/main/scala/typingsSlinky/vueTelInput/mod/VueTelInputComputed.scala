package typingsSlinky.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputComputed extends js.Object {
  def filteredCountries(): js.Array[String] = js.native
  def formattedResult(): String = js.native
  def mode(): String = js.native
  def response(): VueTelInputResponse = js.native
  def sortedCountries(): js.Array[String] = js.native
  def state(): Boolean = js.native
}

object VueTelInputComputed {
  @scala.inline
  def apply(
    filteredCountries: () => js.Array[String],
    formattedResult: () => String,
    mode: () => String,
    response: () => VueTelInputResponse,
    sortedCountries: () => js.Array[String],
    state: () => Boolean
  ): VueTelInputComputed = {
    val __obj = js.Dynamic.literal(filteredCountries = js.Any.fromFunction0(filteredCountries), formattedResult = js.Any.fromFunction0(formattedResult), mode = js.Any.fromFunction0(mode), response = js.Any.fromFunction0(response), sortedCountries = js.Any.fromFunction0(sortedCountries), state = js.Any.fromFunction0(state))
    __obj.asInstanceOf[VueTelInputComputed]
  }
  @scala.inline
  implicit class VueTelInputComputedOps[Self <: VueTelInputComputed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilteredCountries(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredCountries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFormattedResult(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponse(value: () => VueTelInputResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSortedCountries(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedCountries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withState(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

