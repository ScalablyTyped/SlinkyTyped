package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.Services.FormatCodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesProvider extends js.Object {
  var activeRules: js.Any = js.native
  var globalRules: js.Any = js.native
  var logger: js.Any = js.native
  var options: js.Any = js.native
  var rulesMap: js.Any = js.native
  /* private */ def createActiveRules(options: js.Any): js.Any = js.native
  def ensureUpToDate(options: FormatCodeOptions): Unit = js.native
  def getRuleByName(name: String): Rule = js.native
  def getRuleName(rule: Rule): String = js.native
  def getRulesMap(): RulesMap = js.native
}

object RulesProvider {
  @scala.inline
  def apply(
    activeRules: js.Any,
    createActiveRules: js.Any => js.Any,
    ensureUpToDate: FormatCodeOptions => Unit,
    getRuleByName: String => Rule,
    getRuleName: Rule => String,
    getRulesMap: () => RulesMap,
    globalRules: js.Any,
    logger: js.Any,
    options: js.Any,
    rulesMap: js.Any
  ): RulesProvider = {
    val __obj = js.Dynamic.literal(activeRules = activeRules.asInstanceOf[js.Any], createActiveRules = js.Any.fromFunction1(createActiveRules), ensureUpToDate = js.Any.fromFunction1(ensureUpToDate), getRuleByName = js.Any.fromFunction1(getRuleByName), getRuleName = js.Any.fromFunction1(getRuleName), getRulesMap = js.Any.fromFunction0(getRulesMap), globalRules = globalRules.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rulesMap = rulesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesProvider]
  }
  @scala.inline
  implicit class RulesProviderOps[Self <: RulesProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateActiveRules(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createActiveRules")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnsureUpToDate(value: FormatCodeOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureUpToDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRuleByName(value: String => Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRuleByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRuleName(value: Rule => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRuleName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRulesMap(value: () => RulesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRulesMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGlobalRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulesMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

