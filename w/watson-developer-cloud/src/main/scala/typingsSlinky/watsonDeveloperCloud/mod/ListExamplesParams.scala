package typingsSlinky.watsonDeveloperCloud.mod

import typingsSlinky.watsonDeveloperCloud.mod.ListExamplesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listExamples` operation. */
@js.native
trait ListExamplesParams extends js.Object {
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.native
  /** Whether to include information about the number of records returned. */
  var include_count: js.UndefOr[Boolean] = js.native
  /** The intent name. */
  var intent: String = js.native
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The attribute by which returned examples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object ListExamplesParams {
  @scala.inline
  def apply(intent: String, workspace_id: String): ListExamplesParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExamplesParams]
  }
  @scala.inline
  implicit class ListExamplesParamsOps[Self <: ListExamplesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_audit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_audit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_audit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_audit")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_count(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_count")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_limit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_limit")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Sort | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

