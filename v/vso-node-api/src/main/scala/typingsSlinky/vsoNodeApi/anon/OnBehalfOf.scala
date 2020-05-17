package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBehalfOf extends js.Object {
  var onBehalfOf: scala.Double = js.native
  var revalidateApproverIdentity: scala.Double = js.native
}

object OnBehalfOf {
  @scala.inline
  def apply(onBehalfOf: scala.Double, revalidateApproverIdentity: scala.Double): OnBehalfOf = {
    val __obj = js.Dynamic.literal(onBehalfOf = onBehalfOf.asInstanceOf[js.Any], revalidateApproverIdentity = revalidateApproverIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOf]
  }
  @scala.inline
  implicit class OnBehalfOfOps[Self <: OnBehalfOf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnBehalfOf(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevalidateApproverIdentity(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidateApproverIdentity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

