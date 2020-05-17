package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsPnpObject extends js.Object {
  /** Provides the destination for the result. Size the initial array size as a "capacity" in order to specify how many results should be retrieved. */ var items: PnpObject = js.native
  /** The number of items retrieved. */ var returnValue: Double = js.native
}

object ItemsPnpObject {
  @scala.inline
  def apply(items: PnpObject, returnValue: Double): ItemsPnpObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsPnpObject]
  }
  @scala.inline
  implicit class ItemsPnpObjectOps[Self <: ItemsPnpObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: PnpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

