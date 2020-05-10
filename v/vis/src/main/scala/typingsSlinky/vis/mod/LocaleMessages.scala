package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleMessages extends js.Object {
  var addDescription: String = js.native
  var addEdge: String = js.native
  var addNode: String = js.native
  var back: String = js.native
  var createEdgeError: String = js.native
  var del: String = js.native
  var deleteClusterError: String = js.native
  var edgeDescription: String = js.native
  var edit: String = js.native
  var editClusterError: String = js.native
  var editEdge: String = js.native
  var editEdgeDescription: String = js.native
  var editNode: String = js.native
}

object LocaleMessages {
  @scala.inline
  def apply(
    addDescription: String,
    addEdge: String,
    addNode: String,
    back: String,
    createEdgeError: String,
    del: String,
    deleteClusterError: String,
    edgeDescription: String,
    edit: String,
    editClusterError: String,
    editEdge: String,
    editEdgeDescription: String,
    editNode: String
  ): LocaleMessages = {
    val __obj = js.Dynamic.literal(addDescription = addDescription.asInstanceOf[js.Any], addEdge = addEdge.asInstanceOf[js.Any], addNode = addNode.asInstanceOf[js.Any], back = back.asInstanceOf[js.Any], createEdgeError = createEdgeError.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], deleteClusterError = deleteClusterError.asInstanceOf[js.Any], edgeDescription = edgeDescription.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], editClusterError = editClusterError.asInstanceOf[js.Any], editEdge = editEdge.asInstanceOf[js.Any], editEdgeDescription = editEdgeDescription.asInstanceOf[js.Any], editNode = editNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleMessages]
  }
  @scala.inline
  implicit class LocaleMessagesOps[Self <: LocaleMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddEdge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateEdgeError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEdgeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteClusterError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteClusterError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditClusterError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editClusterError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditEdge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditEdgeDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editEdgeDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

