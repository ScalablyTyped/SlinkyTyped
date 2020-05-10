package typingsSlinky.stripe.mod.plans

import typingsSlinky.stripe.stripeStrings.down
import typingsSlinky.stripe.stripeStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransformUsage extends js.Object {
  /**
    * Divide usage by this number.
    */
  var divide_by: Double = js.native
  /**
    * After division, either round the result `up` or `down`.
    */
  var round: up | down = js.native
}

object ITransformUsage {
  @scala.inline
  def apply(divide_by: Double, round: up | down): ITransformUsage = {
    val __obj = js.Dynamic.literal(divide_by = divide_by.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransformUsage]
  }
  @scala.inline
  implicit class ITransformUsageOps[Self <: ITransformUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivide_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divide_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRound(value: up | down): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

