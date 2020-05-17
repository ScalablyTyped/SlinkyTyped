package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fail extends js.Object {
  var fail: scala.Double = js.native
  var omit: scala.Double = js.native
}

object Fail {
  @scala.inline
  def apply(fail: scala.Double, omit: scala.Double): Fail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  @scala.inline
  implicit class FailOps[Self <: Fail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFail(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOmit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

