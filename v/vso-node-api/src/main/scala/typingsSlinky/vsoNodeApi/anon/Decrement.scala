package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decrement extends js.Object {
  var decrement: scala.Double = js.native
  var delete: scala.Double = js.native
  var increment: scala.Double = js.native
  var none: scala.Double = js.native
  var set: scala.Double = js.native
}

object Decrement {
  @scala.inline
  def apply(
    decrement: scala.Double,
    delete: scala.Double,
    increment: scala.Double,
    none: scala.Double,
    set: scala.Double
  ): Decrement = {
    val __obj = js.Dynamic.literal(decrement = decrement.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decrement]
  }
  @scala.inline
  implicit class DecrementOps[Self <: Decrement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrement(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrement(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

