package typingsSlinky.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDetails extends js.Object {
  /**
    * Is this request for a binary file (as opposed to a json file)
    */
  var isBinary: js.UndefOr[Boolean] = js.native
}

object RequestDetails {
  @scala.inline
  def apply(): RequestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDetails]
  }
  @scala.inline
  implicit class RequestDetailsOps[Self <: RequestDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBinary")(js.undefined)
        ret
    }
  }
  
}

