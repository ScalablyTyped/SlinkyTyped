package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnBehalfOf extends js.Object {
  var onBehalfOf: Double = js.native
  var revalidateApproverIdentity: Double = js.native
}

object AnonOnBehalfOf {
  @scala.inline
  def apply(onBehalfOf: Double, revalidateApproverIdentity: Double): AnonOnBehalfOf = {
    val __obj = js.Dynamic.literal(onBehalfOf = onBehalfOf.asInstanceOf[js.Any], revalidateApproverIdentity = revalidateApproverIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnBehalfOf]
  }
  @scala.inline
  implicit class AnonOnBehalfOfOps[Self <: AnonOnBehalfOf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnBehalfOf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevalidateApproverIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidateApproverIdentity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

