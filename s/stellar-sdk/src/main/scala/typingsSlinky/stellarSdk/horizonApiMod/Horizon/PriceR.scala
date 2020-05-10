package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriceR extends js.Object {
  var denominator: Double = js.native
  var numerator: Double = js.native
}

object PriceR {
  @scala.inline
  def apply(denominator: Double, numerator: Double): PriceR = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceR]
  }
  @scala.inline
  implicit class PriceROps[Self <: PriceR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDenominator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denominator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumerator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numerator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

