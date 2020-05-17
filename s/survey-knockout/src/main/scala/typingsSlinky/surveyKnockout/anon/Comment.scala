package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  var comment: String = js.native
  var content: String = js.native
  var contentLeft: String = js.native
  var description: String = js.native
  var flowRoot: String = js.native
  var footer: String = js.native
  var formGroup: String = js.native
  var hasError: String = js.native
  var header: String = js.native
  var headerLeft: String = js.native
  var indent: Double = js.native
  var mainRoot: String = js.native
  var number: String = js.native
  var required: String = js.native
  var requiredText: String = js.native
  var title: String = js.native
  var titleLeftRoot: String = js.native
  var titleRequired: String = js.native
}

object Comment {
  @scala.inline
  def apply(
    comment: String,
    content: String,
    contentLeft: String,
    description: String,
    flowRoot: String,
    footer: String,
    formGroup: String,
    hasError: String,
    header: String,
    headerLeft: String,
    indent: Double,
    mainRoot: String,
    number: String,
    required: String,
    requiredText: String,
    title: String,
    titleLeftRoot: String,
    titleRequired: String
  ): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentLeft = contentLeft.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], flowRoot = flowRoot.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], formGroup = formGroup.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerLeft = headerLeft.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], mainRoot = mainRoot.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleLeftRoot = titleLeftRoot.asInstanceOf[js.Any], titleRequired = titleRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleLeftRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLeftRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleRequired(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRequired")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

