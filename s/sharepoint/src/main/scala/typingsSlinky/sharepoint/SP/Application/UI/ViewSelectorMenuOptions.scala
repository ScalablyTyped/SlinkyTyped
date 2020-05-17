package typingsSlinky.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewSelectorMenuOptions extends js.Object {
  var listId: String = js.native
  var showApproverView: Boolean = js.native
  var showCreateView: Boolean = js.native
  var showEditView: Boolean = js.native
  var showMergeView: Boolean = js.native
  var showRepairView: Boolean = js.native
  var viewId: String = js.native
  var viewParameters: String = js.native
}

object ViewSelectorMenuOptions {
  @scala.inline
  def apply(
    listId: String,
    showApproverView: Boolean,
    showCreateView: Boolean,
    showEditView: Boolean,
    showMergeView: Boolean,
    showRepairView: Boolean,
    viewId: String,
    viewParameters: String
  ): ViewSelectorMenuOptions = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any], showApproverView = showApproverView.asInstanceOf[js.Any], showCreateView = showCreateView.asInstanceOf[js.Any], showEditView = showEditView.asInstanceOf[js.Any], showMergeView = showMergeView.asInstanceOf[js.Any], showRepairView = showRepairView.asInstanceOf[js.Any], viewId = viewId.asInstanceOf[js.Any], viewParameters = viewParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorMenuOptions]
  }
  @scala.inline
  implicit class ViewSelectorMenuOptionsOps[Self <: ViewSelectorMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowApproverView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showApproverView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCreateView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCreateView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowEditView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMergeView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMergeView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRepairView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRepairView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

