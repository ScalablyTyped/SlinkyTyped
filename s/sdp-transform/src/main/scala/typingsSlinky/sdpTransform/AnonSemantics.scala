package typingsSlinky.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSemantics extends js.Object {
  var semantics: String = js.native
  var ssrcs: String = js.native
}

object AnonSemantics {
  @scala.inline
  def apply(semantics: String, ssrcs: String): AnonSemantics = {
    val __obj = js.Dynamic.literal(semantics = semantics.asInstanceOf[js.Any], ssrcs = ssrcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSemantics]
  }
  @scala.inline
  implicit class AnonSemanticsOps[Self <: AnonSemantics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSemantics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semantics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsrcs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrcs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

