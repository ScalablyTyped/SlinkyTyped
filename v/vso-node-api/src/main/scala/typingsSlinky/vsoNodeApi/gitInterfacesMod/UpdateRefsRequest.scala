package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRefsRequest extends js.Object {
  var refUpdateRequests: js.Array[GitRefUpdate] = js.native
  var updateMode: GitRefUpdateMode = js.native
}

object UpdateRefsRequest {
  @scala.inline
  def apply(refUpdateRequests: js.Array[GitRefUpdate], updateMode: GitRefUpdateMode): UpdateRefsRequest = {
    val __obj = js.Dynamic.literal(refUpdateRequests = refUpdateRequests.asInstanceOf[js.Any], updateMode = updateMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRefsRequest]
  }
  @scala.inline
  implicit class UpdateRefsRequestOps[Self <: UpdateRefsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefUpdateRequests(value: js.Array[GitRefUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refUpdateRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateMode(value: GitRefUpdateMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

