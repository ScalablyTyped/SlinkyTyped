package typingsSlinky.uifabricStyling.iconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconRecord extends js.Object {
  var code: js.UndefOr[String] = js.native
  var subset: IIconSubsetRecord = js.native
}

object IIconRecord {
  @scala.inline
  def apply(subset: IIconSubsetRecord): IIconRecord = {
    val __obj = js.Dynamic.literal(subset = subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconRecord]
  }
  @scala.inline
  implicit class IIconRecordOps[Self <: IIconRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubset(value: IIconSubsetRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
  }
  
}

