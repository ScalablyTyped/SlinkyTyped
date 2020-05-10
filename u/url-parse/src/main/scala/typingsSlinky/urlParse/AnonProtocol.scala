package typingsSlinky.urlParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProtocol extends js.Object {
  var protocol: String = js.native
  var rest: String = js.native
  var slashes: Boolean = js.native
}

object AnonProtocol {
  @scala.inline
  def apply(protocol: String, rest: String, slashes: Boolean): AnonProtocol = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProtocol]
  }
  @scala.inline
  implicit class AnonProtocolOps[Self <: AnonProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

