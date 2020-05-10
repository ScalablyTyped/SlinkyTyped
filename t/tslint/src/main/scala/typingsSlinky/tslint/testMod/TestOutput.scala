package typingsSlinky.tslint.testMod

import typingsSlinky.tslint.lintErrorMod.LintError
import typingsSlinky.tslint.tslintBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOutput extends js.Object {
  var errorsFromLinter: js.Array[LintError] = js.native
  var errorsFromMarkup: js.Array[LintError] = js.native
  var fixesFromLinter: String = js.native
  var fixesFromMarkup: String = js.native
  var markupFromLinter: String = js.native
  var markupFromMarkup: String = js.native
  var skipped: `false` = js.native
}

object TestOutput {
  @scala.inline
  def apply(
    errorsFromLinter: js.Array[LintError],
    errorsFromMarkup: js.Array[LintError],
    fixesFromLinter: String,
    fixesFromMarkup: String,
    markupFromLinter: String,
    markupFromMarkup: String,
    skipped: `false`
  ): TestOutput = {
    val __obj = js.Dynamic.literal(errorsFromLinter = errorsFromLinter.asInstanceOf[js.Any], errorsFromMarkup = errorsFromMarkup.asInstanceOf[js.Any], fixesFromLinter = fixesFromLinter.asInstanceOf[js.Any], fixesFromMarkup = fixesFromMarkup.asInstanceOf[js.Any], markupFromLinter = markupFromLinter.asInstanceOf[js.Any], markupFromMarkup = markupFromMarkup.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOutput]
  }
  @scala.inline
  implicit class TestOutputOps[Self <: TestOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorsFromLinter(value: js.Array[LintError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsFromLinter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorsFromMarkup(value: js.Array[LintError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsFromMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixesFromLinter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixesFromLinter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixesFromMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixesFromMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkupFromLinter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markupFromLinter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkupFromMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markupFromMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipped(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

