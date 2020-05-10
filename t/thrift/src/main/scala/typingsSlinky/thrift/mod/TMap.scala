package typingsSlinky.thrift.mod

import typingsSlinky.thrift.mod.Thrift.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TMap extends js.Object {
  var ktype: Type = js.native
  var size: Double = js.native
  var vtype: Type = js.native
}

object TMap {
  @scala.inline
  def apply(ktype: Type, size: Double, vtype: Type): TMap = {
    val __obj = js.Dynamic.literal(ktype = ktype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vtype = vtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMap]
  }
  @scala.inline
  implicit class TMapOps[Self <: TMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKtype(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ktype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVtype(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

