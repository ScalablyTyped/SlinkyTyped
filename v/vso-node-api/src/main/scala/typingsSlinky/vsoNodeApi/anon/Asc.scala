package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asc extends js.Object {
  var asc: scala.Double = js.native
  var desc: scala.Double = js.native
}

object Asc {
  @scala.inline
  def apply(asc: scala.Double, desc: scala.Double): Asc = {
    val __obj = js.Dynamic.literal(asc = asc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asc]
  }
  @scala.inline
  implicit class AscOps[Self <: Asc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsc(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesc(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

