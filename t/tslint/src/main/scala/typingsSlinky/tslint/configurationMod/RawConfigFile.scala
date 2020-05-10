package typingsSlinky.tslint.configurationMod

import typingsSlinky.tslint.PartialexcludeArraystring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawConfigFile extends js.Object {
  var defaultSeverity: js.UndefOr[String] = js.native
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var jsRules: js.UndefOr[RawRulesConfig | Boolean] = js.native
  var linterOptions: js.UndefOr[PartialexcludeArraystring] = js.native
  var rules: js.UndefOr[RawRulesConfig] = js.native
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.native
}

object RawConfigFile {
  @scala.inline
  def apply(): RawConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawConfigFile]
  }
  @scala.inline
  implicit class RawConfigFileOps[Self <: RawConfigFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSeverity")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
    @scala.inline
    def withJsRules(value: RawRulesConfig | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsRules")(js.undefined)
        ret
    }
    @scala.inline
    def withLinterOptions(value: PartialexcludeArraystring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: RawRulesConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesDirectory(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesDirectory")(js.undefined)
        ret
    }
  }
  
}

