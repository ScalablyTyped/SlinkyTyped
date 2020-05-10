package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  var exprContextCritical: js.UndefOr[Boolean] = js.native
  var exprContextRecursive: js.UndefOr[Boolean] = js.native
  var exprContextRegExp: js.UndefOr[js.RegExp] = js.native
  var exprContextRequest: js.UndefOr[String] = js.native
  /** A RegExp or an array of RegExps. Don’t parse files matching. */
  var noParse: js.UndefOr[js.RegExp | js.Array[js.RegExp] | (js.Function1[/* content */ String, Boolean])] = js.native
  /** An array of rules applied for modules. */
  var rules: js.Array[RuleSetRule] = js.native
  var strictExportPresence: js.UndefOr[Boolean] = js.native
  var unknownContextCritical: js.UndefOr[Boolean] = js.native
  var unknownContextRecursive: js.UndefOr[Boolean] = js.native
  var unknownContextRegExp: js.UndefOr[js.RegExp] = js.native
  var unknownContextRequest: js.UndefOr[String] = js.native
  var wrappedContextCritical: js.UndefOr[Boolean] = js.native
  var wrappedContextRecursive: js.UndefOr[Boolean] = js.native
  var wrappedContextRegExp: js.UndefOr[js.RegExp] = js.native
}

object Module {
  @scala.inline
  def apply(rules: js.Array[RuleSetRule]): Module = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[RuleSetRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExprContextCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprContextCritical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExprContextCritical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprContextCritical")(js.undefined)
        ret
    }
    @scala.inline
    def withExprContextRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprContextRecursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExprContextRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprContextRecursive")(js.undefined)
        ret
    }
    @scala.inline
    def withExprContextRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprContextRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExprContextRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprContextRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withExprContextRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprContextRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExprContextRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprContextRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withNoParseFunction1(value: /* content */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noParse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNoParseRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoParse(value: js.RegExp | js.Array[js.RegExp] | (js.Function1[/* content */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noParse")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictExportPresence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictExportPresence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictExportPresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictExportPresence")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownContextCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownContextCritical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownContextCritical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownContextCritical")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownContextRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownContextRecursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownContextRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownContextRecursive")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownContextRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownContextRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownContextRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownContextRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownContextRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownContextRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownContextRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownContextRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withWrappedContextCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedContextCritical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappedContextCritical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedContextCritical")(js.undefined)
        ret
    }
    @scala.inline
    def withWrappedContextRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedContextRecursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappedContextRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedContextRecursive")(js.undefined)
        ret
    }
    @scala.inline
    def withWrappedContextRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedContextRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappedContextRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedContextRegExp")(js.undefined)
        ret
    }
  }
  
}

