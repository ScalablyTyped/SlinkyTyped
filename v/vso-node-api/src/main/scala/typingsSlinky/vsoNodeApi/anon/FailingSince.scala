package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailingSince extends js.Object {
  var failingSince: scala.Double = js.native
  var regular: scala.Double = js.native
}

object FailingSince {
  @scala.inline
  def apply(failingSince: scala.Double, regular: scala.Double): FailingSince = {
    val __obj = js.Dynamic.literal(failingSince = failingSince.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingSince]
  }
  @scala.inline
  implicit class FailingSinceOps[Self <: FailingSince] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailingSince(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failingSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegular(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regular")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

