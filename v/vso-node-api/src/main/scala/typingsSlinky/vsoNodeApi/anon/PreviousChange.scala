package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousChange extends js.Object {
  var firstParent: scala.Double = js.native
  var none: scala.Double = js.native
  var previousChange: scala.Double = js.native
}

object PreviousChange {
  @scala.inline
  def apply(firstParent: scala.Double, none: scala.Double, previousChange: scala.Double): PreviousChange = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], previousChange = previousChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousChange]
  }
  @scala.inline
  implicit class PreviousChangeOps[Self <: PreviousChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstParent(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousChange(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousChange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

