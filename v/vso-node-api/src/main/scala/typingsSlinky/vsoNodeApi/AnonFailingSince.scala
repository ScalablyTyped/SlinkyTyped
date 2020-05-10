package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFailingSince extends js.Object {
  var failingSince: Double = js.native
  var regular: Double = js.native
}

object AnonFailingSince {
  @scala.inline
  def apply(failingSince: Double, regular: Double): AnonFailingSince = {
    val __obj = js.Dynamic.literal(failingSince = failingSince.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailingSince]
  }
  @scala.inline
  implicit class AnonFailingSinceOps[Self <: AnonFailingSince] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailingSince(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failingSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegular(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regular")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

