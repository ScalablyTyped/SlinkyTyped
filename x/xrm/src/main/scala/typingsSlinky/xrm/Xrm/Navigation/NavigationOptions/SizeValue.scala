package typingsSlinky.xrm.Xrm.Navigation.NavigationOptions

import typingsSlinky.xrm.xrmStrings.Percentsign
import typingsSlinky.xrm.xrmStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeValue extends js.Object {
  /**
    * The unit of measurement. Specify "%" or "px". Default value is "px"
    * */
  var unit: Percentsign | px
  /**
    * The numerical value
    * */
  var value: Double
}

object SizeValue {
  @scala.inline
  def apply(unit: Percentsign | px, value: Double): SizeValue = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeValue]
  }
}

