package typingsSlinky.shot.anon

import typingsSlinky.shot.mod.SimulatedRequestObject
import typingsSlinky.shot.mod.SimulatedResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Req extends js.Object {
  /** the simulated request object. */
  var req: SimulatedRequestObject = js.native
  /** the simulated response object. */
  var res: SimulatedResponseObject = js.native
}

object Req {
  @scala.inline
  def apply(req: SimulatedRequestObject, res: SimulatedResponseObject): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  @scala.inline
  implicit class ReqOps[Self <: Req] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReq(value: SimulatedRequestObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: SimulatedResponseObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

