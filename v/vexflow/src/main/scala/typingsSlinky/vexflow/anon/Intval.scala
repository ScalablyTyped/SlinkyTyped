package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intval extends js.Object {
  var int_val: Double = js.native
  var root_index: Double = js.native
}

object Intval {
  @scala.inline
  def apply(int_val: Double, root_index: Double): Intval = {
    val __obj = js.Dynamic.literal(int_val = int_val.asInstanceOf[js.Any], root_index = root_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intval]
  }
  @scala.inline
  implicit class IntvalOps[Self <: Intval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInt_val(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int_val")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root_index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

