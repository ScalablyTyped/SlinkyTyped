package typingsSlinky.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  /**
    * name of option (ex. "Size", "Color")
    */
  var name: String = js.native
  /**
    * get/set the currently selected option value with one of the values from the Product Options/values array.
    * For instance if the option values array had the following ["Large", "Medium", "Small"] setting selected to be
    * "Large", "Medium", or "Small" would be valid any other value would throw an Error.
    */
  var selected: String = js.native
  /**
    * an Array possible values for option. For instance if this option
    * is a "Size" option an example value for values could be: ["Large", "Medium", "Small"]
    */
  var values: js.Array[OptionValue] = js.native
}

object Option {
  @scala.inline
  def apply(name: String, selected: String, values: js.Array[OptionValue]): Option = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[OptionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

