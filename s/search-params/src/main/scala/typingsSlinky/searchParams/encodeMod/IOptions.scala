package typingsSlinky.searchParams.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var arrayFormat: js.UndefOr[typingsSlinky.searchParams.encodeMod.arrayFormat] = js.native
  var booleanFormat: js.UndefOr[typingsSlinky.searchParams.encodeMod.booleanFormat] = js.native
  var nullFormat: js.UndefOr[typingsSlinky.searchParams.encodeMod.nullFormat] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def withoutArrayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanFormat(value: booleanFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNullFormat(value: nullFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormat")(js.undefined)
        ret
    }
  }
  
}

