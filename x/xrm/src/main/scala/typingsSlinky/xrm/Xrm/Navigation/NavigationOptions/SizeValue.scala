package typingsSlinky.xrm.Xrm.Navigation.NavigationOptions

import typingsSlinky.xrm.xrmStrings.Percentsign
import typingsSlinky.xrm.xrmStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeValue extends js.Object {
  /**
    * The unit of measurement. Specify "%" or "px". Default value is "px"
    * */
  var unit: Percentsign | px = js.native
  /**
    * The numerical value
    * */
  var value: Double = js.native
}

object SizeValue {
  @scala.inline
  def apply(unit: Percentsign | px, value: Double): SizeValue = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeValue]
  }
  @scala.inline
  implicit class SizeValueOps[Self <: SizeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnit(value: Percentsign | px): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

