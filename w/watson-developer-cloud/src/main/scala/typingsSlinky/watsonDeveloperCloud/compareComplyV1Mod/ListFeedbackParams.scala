package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listFeedback` operation. */
@js.native
trait ListFeedbackParams extends js.Object {
  /** An optional string in the format `YYYY-MM-DD` that filters the output to include only feedback that was added after the specified date. */
  var after: js.UndefOr[String] = js.native
  /** An optional string in the format `YYYY-MM-DD` that filters the output to include only feedback that was added before the specified date. */
  var before: js.UndefOr[String] = js.native
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list added. */
  var category_added: js.UndefOr[String] = js.native
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list unchanged. */
  var category_not_changed: js.UndefOr[String] = js.native
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list removed. */
  var category_removed: js.UndefOr[String] = js.native
  /** An optional string that returns the set of documents after the previous set. Use this parameter with the `page_limit` parameter. */
  var cursor: js.UndefOr[String] = js.native
  /** An optional string that filters the output to include only feedback from the document with the specified `document_title`. */
  var document_title: js.UndefOr[String] = js.native
  /** An optional string that filters the output to include only feedback with the specified feedback type. The only permitted value is `element_classification`. */
  var feedback_type: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** An optional boolean value. If specified as `true`, the `pagination` object in the output includes a value called `total` that gives the total count of feedback created. */
  var include_total: js.UndefOr[Boolean] = js.native
  /** An optional string that filters the output to include only feedback with the specified `model_id`. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** An optional string that filters the output to include only feedback with the specified `model_version`. */
  var model_version: js.UndefOr[String] = js.native
  /** An optional integer specifying the number of documents that you want the service to return. */
  var page_limit: js.UndefOr[Double] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** An optional comma-separated list of fields in the document to sort on. You can optionally specify the sort direction by prefixing the value of the field with `-` for descending order or `+` for ascending order (the default). Currently permitted sorting fields are `created`, `user_id`, and `document_title`. */
  var sort: js.UndefOr[String] = js.native
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list removed. */
  var type_added: js.UndefOr[String] = js.native
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list unchanged. */
  var type_not_changed: js.UndefOr[String] = js.native
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list removed. */
  var type_removed: js.UndefOr[String] = js.native
}

object ListFeedbackParams {
  @scala.inline
  def apply(): ListFeedbackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFeedbackParams]
  }
  @scala.inline
  implicit class ListFeedbackParamsOps[Self <: ListFeedbackParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory_added(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory_added: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_added")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory_not_changed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_not_changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory_not_changed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_not_changed")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory_removed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory_removed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_removed")(js.undefined)
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
    def withDocument_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_title")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedback_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedback_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_type")(js.undefined)
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
    def withInclude_total(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_total")(js.undefined)
        ret
    }
    @scala.inline
    def withModel_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(js.undefined)
        ret
    }
    @scala.inline
    def withModel_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_version")(js.undefined)
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
    def withSort(value: String): Self = {
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
    @scala.inline
    def withType_added(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType_added: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_added")(js.undefined)
        ret
    }
    @scala.inline
    def withType_not_changed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_not_changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType_not_changed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_not_changed")(js.undefined)
        ret
    }
    @scala.inline
    def withType_removed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType_removed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_removed")(js.undefined)
        ret
    }
  }
  
}

