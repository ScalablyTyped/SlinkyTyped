package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHierarchyOutgoingCall extends js.Object {
  var fromSpans: js.Array[TextSpan] = js.native
  var to: CallHierarchyItem = js.native
}

object CallHierarchyOutgoingCall {
  @scala.inline
  def apply(fromSpans: js.Array[TextSpan], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
    val __obj = js.Dynamic.literal(fromSpans = fromSpans.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCall]
  }
  @scala.inline
  implicit class CallHierarchyOutgoingCallOps[Self <: CallHierarchyOutgoingCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSpans(value: js.Array[TextSpan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: CallHierarchyItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

