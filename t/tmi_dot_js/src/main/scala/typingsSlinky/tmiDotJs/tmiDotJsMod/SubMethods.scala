package typingsSlinky.tmiDotJs.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMethods extends js.Object {
  var plan: js.UndefOr[SubMethod] = js.undefined
  var planName: js.UndefOr[String] = js.undefined
  var prime: js.UndefOr[Boolean] = js.undefined
}

object SubMethods {
  @scala.inline
  def apply(plan: SubMethod = null, planName: String = null, prime: js.UndefOr[Boolean] = js.undefined): SubMethods = {
    val __obj = js.Dynamic.literal()
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (planName != null) __obj.updateDynamic("planName")(planName.asInstanceOf[js.Any])
    if (!js.isUndefined(prime)) __obj.updateDynamic("prime")(prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMethods]
  }
}

