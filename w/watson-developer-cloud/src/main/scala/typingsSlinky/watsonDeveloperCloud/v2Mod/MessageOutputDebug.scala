package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Additional detailed information about a message response and how it was generated. */
@js.native
trait MessageOutputDebug extends js.Object {
  /** Assistant sets this to true when this message response concludes or interrupts a dialog. */
  var branch_exited: js.UndefOr[Boolean] = js.native
  /** When `branch_exited` is set to `true` by the Assistant, the `branch_exited_reason` specifies whether the dialog completed by itself or got interrupted. */
  var branch_exited_reason: js.UndefOr[String] = js.native
  /** An array of up to 50 messages logged with the request. */
  var log_messages: js.UndefOr[js.Array[DialogLogMessage]] = js.native
  /** An array of objects containing detailed diagnostic information about the nodes that were triggered during processing of the input message. */
  var nodes_visited: js.UndefOr[js.Array[DialogNodesVisited]] = js.native
}

object MessageOutputDebug {
  @scala.inline
  def apply(): MessageOutputDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOutputDebug]
  }
  @scala.inline
  implicit class MessageOutputDebugOps[Self <: MessageOutputDebug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch_exited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch_exited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch_exited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch_exited")(js.undefined)
        ret
    }
    @scala.inline
    def withBranch_exited_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch_exited_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch_exited_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch_exited_reason")(js.undefined)
        ret
    }
    @scala.inline
    def withLog_messages(value: js.Array[DialogLogMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog_messages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_messages")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes_visited(value: js.Array[DialogNodesVisited]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes_visited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes_visited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes_visited")(js.undefined)
        ret
    }
  }
  
}

