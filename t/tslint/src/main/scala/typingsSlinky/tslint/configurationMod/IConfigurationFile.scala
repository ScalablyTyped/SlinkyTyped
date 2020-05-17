package typingsSlinky.tslint.configurationMod

import typingsSlinky.std.Map
import typingsSlinky.tslint.anon.PartialIOptions
import typingsSlinky.tslint.anon.PartialexcludeArraystring
import typingsSlinky.tslint.ruleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigurationFile extends js.Object {
  /**
    * @deprecated property is never set
    *
    * The severity that is applied to rules in this config file as well as rules
    * in any inherited config files which have their severity set to "default".
    * Not inherited.
    */
  var defaultSeverity: js.UndefOr[RuleSeverity] = js.native
  /**
    * An array of config files whose rules are inherited by this config file.
    */
  var `extends`: js.Array[String] = js.native
  /**
    * Rules that are used to lint to JavaScript files.
    */
  var jsRules: Map[String, PartialIOptions] = js.native
  /**
    * A subset of the CLI options.
    */
  var linterOptions: js.UndefOr[PartialexcludeArraystring] = js.native
  /**
    * Rules that are used to lint TypeScript files.
    */
  var rules: Map[String, PartialIOptions] = js.native
  /**
    * Directories containing custom rules. Resolved using node module semantics.
    */
  var rulesDirectory: js.Array[String] = js.native
}

object IConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[String],
    jsRules: Map[String, PartialIOptions],
    rules: Map[String, PartialIOptions],
    rulesDirectory: js.Array[String]
  ): IConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurationFile]
  }
  @scala.inline
  implicit class IConfigurationFileOps[Self <: IConfigurationFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtends(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsRules(value: Map[String, PartialIOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: Map[String, PartialIOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulesDirectory(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSeverity(value: RuleSeverity): Self = {
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
  }
  
}

