package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Family extends js.Object {
  var family: String = js.native
  var size: Double = js.native
  var weight: String = js.native
}

object Family {
  @scala.inline
  def apply(family: String, size: Double, weight: String): Family = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
  @scala.inline
  implicit class FamilyOps[Self <: Family] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

