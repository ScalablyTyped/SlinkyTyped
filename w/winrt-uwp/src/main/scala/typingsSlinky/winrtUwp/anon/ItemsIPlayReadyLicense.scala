package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyLicense
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsIPlayReadyLicense extends js.Object {
  /** The items in the collection. */ var items: IPlayReadyLicense = js.native
  /** The number of items in the collection. */ var returnValue: Double = js.native
}

object ItemsIPlayReadyLicense {
  @scala.inline
  def apply(items: IPlayReadyLicense, returnValue: Double): ItemsIPlayReadyLicense = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadyLicense]
  }
  @scala.inline
  implicit class ItemsIPlayReadyLicenseOps[Self <: ItemsIPlayReadyLicense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: IPlayReadyLicense): Self = {
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

