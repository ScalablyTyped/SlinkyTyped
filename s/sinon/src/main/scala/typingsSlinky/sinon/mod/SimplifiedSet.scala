package typingsSlinky.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplifiedSet extends js.Object {
  def has(el: js.Any): Boolean = js.native
}

object SimplifiedSet {
  @scala.inline
  def apply(has: js.Any => Boolean): SimplifiedSet = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[SimplifiedSet]
  }
  @scala.inline
  implicit class SimplifiedSetOps[Self <: SimplifiedSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

