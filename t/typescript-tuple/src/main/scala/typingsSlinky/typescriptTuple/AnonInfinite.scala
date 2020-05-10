package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInfinite[Default, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Default = js.native
  var infinite: js.Any = js.native
  var multi: Default = js.native
  var single: js.Any = js.native
}

object AnonInfinite {
  @scala.inline
  def apply[Default, Tuple](empty: Default, infinite: js.Any, multi: Default, single: js.Any): AnonInfinite[Default, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfinite[Default, Tuple]]
  }
  @scala.inline
  implicit class AnonInfiniteOps[Self[default, tuple] <: AnonInfinite[default, tuple], Default, Tuple] (val x: Self[Default, Tuple]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Default, Tuple] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Default, Tuple]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Default, Tuple]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Default, Tuple]) with Other]
    @scala.inline
    def withEmpty(value: Default): Self[Default, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: js.Any): Self[Default, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulti(value: Default): Self[Default, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingle(value: js.Any): Self[Default, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

