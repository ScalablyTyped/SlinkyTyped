package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHierarchyIncomingCall extends js.Object {
  var from: CallHierarchyItem = js.native
  var fromSpans: js.Array[TextSpan] = js.native
}

object CallHierarchyIncomingCall {
  @scala.inline
  def apply(from: CallHierarchyItem, fromSpans: js.Array[TextSpan]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromSpans = fromSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
  @scala.inline
  implicit class CallHierarchyIncomingCallOps[Self <: CallHierarchyIncomingCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: CallHierarchyItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSpans(value: js.Array[TextSpan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSpans")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

