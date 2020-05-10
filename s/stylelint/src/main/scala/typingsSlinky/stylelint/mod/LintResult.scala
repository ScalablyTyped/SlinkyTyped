package typingsSlinky.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintResult extends js.Object {
  var deprecations: js.Array[String] = js.native
  var errored: js.UndefOr[Boolean] = js.native
  var ignored: js.UndefOr[Boolean] = js.native
  var invalidOptionWarnings: js.Array[_] = js.native
  var source: String = js.native
  var warnings: js.Array[Warning] = js.native
}

object LintResult {
  @scala.inline
  def apply(
    deprecations: js.Array[String],
    invalidOptionWarnings: js.Array[_],
    source: String,
    warnings: js.Array[Warning]
  ): LintResult = {
    val __obj = js.Dynamic.literal(deprecations = deprecations.asInstanceOf[js.Any], invalidOptionWarnings = invalidOptionWarnings.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  @scala.inline
  implicit class LintResultOps[Self <: LintResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidOptionWarnings(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidOptionWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[Warning]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errored")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(js.undefined)
        ret
    }
  }
  
}

