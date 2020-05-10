package typingsSlinky.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRuleFailureJson extends js.Object {
  var endPosition: IRuleFailurePositionJson = js.native
  var failure: String = js.native
  var fix: js.UndefOr[FixJson] = js.native
  var name: String = js.native
  var ruleName: String = js.native
  var ruleSeverity: String = js.native
  var startPosition: IRuleFailurePositionJson = js.native
}

object IRuleFailureJson {
  @scala.inline
  def apply(
    endPosition: IRuleFailurePositionJson,
    failure: String,
    name: String,
    ruleName: String,
    ruleSeverity: String,
    startPosition: IRuleFailurePositionJson
  ): IRuleFailureJson = {
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSeverity = ruleSeverity.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleFailureJson]
  }
  @scala.inline
  implicit class IRuleFailureJsonOps[Self <: IRuleFailureJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPosition(value: IRuleFailurePositionJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPosition(value: IRuleFailurePositionJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFix(value: FixJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.undefined)
        ret
    }
  }
  
}

