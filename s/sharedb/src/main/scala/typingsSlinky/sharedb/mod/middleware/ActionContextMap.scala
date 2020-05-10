package typingsSlinky.sharedb.mod.middleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionContextMap extends js.Object {
  var afterSubmit: SubmitContext = js.native
  @JSName("apply")
  var apply: ApplyContext = js.native
  var commit: CommitContext = js.native
  var connect: ConnectContext = js.native
  var doc: DocContext = js.native
    // Deprecated, use 'readSnapshots' instead.
  var op: OpContext = js.native
  var query: QueryContext = js.native
  var readSnapshots: ReadSnapshotsContext = js.native
  var receive: ReceiveContext = js.native
  var reply: ReplyContext = js.native
  var submit: SubmitContext = js.native
}

object ActionContextMap {
  @scala.inline
  def apply(
    afterSubmit: SubmitContext,
    apply: ApplyContext,
    commit: CommitContext,
    connect: ConnectContext,
    doc: DocContext,
    op: OpContext,
    query: QueryContext,
    readSnapshots: ReadSnapshotsContext,
    receive: ReceiveContext,
    reply: ReplyContext,
    submit: SubmitContext
  ): ActionContextMap = {
    val __obj = js.Dynamic.literal(afterSubmit = afterSubmit.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], readSnapshots = readSnapshots.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionContextMap]
  }
  @scala.inline
  implicit class ActionContextMapOps[Self <: ActionContextMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSubmit(value: SubmitContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApply(value: ApplyContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: CommitContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect(value: ConnectContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc(value: DocContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: OpContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: QueryContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadSnapshots(value: ReadSnapshotsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceive(value: ReceiveContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReply(value: ReplyContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmit(value: SubmitContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

