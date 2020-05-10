package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyEnum extends js.Object {
  var attention: Double = js.native
  var entropy: Double = js.native
}

object StrategyEnum {
  @scala.inline
  def apply(attention: Double, entropy: Double): StrategyEnum = {
    val __obj = js.Dynamic.literal(attention = attention.asInstanceOf[js.Any], entropy = entropy.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyEnum]
  }
  @scala.inline
  implicit class StrategyEnumOps[Self <: StrategyEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttention(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntropy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

