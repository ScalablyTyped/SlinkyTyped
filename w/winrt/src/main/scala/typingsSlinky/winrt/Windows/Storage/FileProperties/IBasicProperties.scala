package typingsSlinky.winrt.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasicProperties extends js.Object {
  var dateModified: js.Date = js.native
  var itemDate: js.Date = js.native
  var size: Double = js.native
}

object IBasicProperties {
  @scala.inline
  def apply(dateModified: js.Date, itemDate: js.Date, size: Double): IBasicProperties = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], itemDate = itemDate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicProperties]
  }
  @scala.inline
  implicit class IBasicPropertiesOps[Self <: IBasicProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

