package typingsSlinky.searchParams.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFinalOptions extends js.Object {
  var arrayFormat: typingsSlinky.searchParams.encodeMod.arrayFormat = js.native
  var booleanFormat: typingsSlinky.searchParams.encodeMod.booleanFormat = js.native
  var nullFormat: typingsSlinky.searchParams.encodeMod.nullFormat = js.native
}

object IFinalOptions {
  @scala.inline
  def apply(arrayFormat: arrayFormat, booleanFormat: booleanFormat, nullFormat: nullFormat): IFinalOptions = {
    val __obj = js.Dynamic.literal(arrayFormat = arrayFormat.asInstanceOf[js.Any], booleanFormat = booleanFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFinalOptions]
  }
  @scala.inline
  implicit class IFinalOptionsOps[Self <: IFinalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayFormat(value: arrayFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBooleanFormat(value: booleanFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullFormat(value: nullFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

