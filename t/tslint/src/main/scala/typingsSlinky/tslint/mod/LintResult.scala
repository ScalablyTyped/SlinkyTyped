package typingsSlinky.tslint.mod

import typingsSlinky.tslint.formatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintResult extends js.Object {
  var errorCount: Double = js.native
  var failures: js.Array[typingsSlinky.tslint.ruleMod.RuleFailure] = js.native
  var fixes: js.UndefOr[js.Array[typingsSlinky.tslint.ruleMod.RuleFailure]] = js.native
  var format: String | FormatterConstructor = js.native
  var output: String = js.native
  var warningCount: Double = js.native
}

object LintResult {
  @scala.inline
  def apply(
    errorCount: Double,
    failures: js.Array[typingsSlinky.tslint.ruleMod.RuleFailure],
    format: String | FormatterConstructor,
    output: String,
    warningCount: Double
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  @scala.inline
  implicit class LintResultOps[Self <: LintResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: js.Array[typingsSlinky.tslint.ruleMod.RuleFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String | FormatterConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixes(value: js.Array[typingsSlinky.tslint.ruleMod.RuleFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixes")(js.undefined)
        ret
    }
  }
  
}

