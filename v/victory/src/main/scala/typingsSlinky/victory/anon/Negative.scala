package typingsSlinky.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Negative extends js.Object {
  var negative: js.UndefOr[String] = js.native
  var positive: js.UndefOr[String] = js.native
}

object Negative {
  @scala.inline
  def apply(): Negative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Negative]
  }
  @scala.inline
  implicit class NegativeOps[Self <: Negative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNegative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(js.undefined)
        ret
    }
    @scala.inline
    def withPositive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(js.undefined)
        ret
    }
  }
  
}

