package typingsSlinky.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralRules extends js.Object {
  def resolvedOptions(): ResolvedPluralRulesOptions = js.native
  def select(n: Double): String = js.native
}

object PluralRules {
  @scala.inline
  def apply(resolvedOptions: () => ResolvedPluralRulesOptions, select: Double => String): PluralRules = {
    val __obj = js.Dynamic.literal(resolvedOptions = js.Any.fromFunction0(resolvedOptions), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[PluralRules]
  }
  @scala.inline
  implicit class PluralRulesOps[Self <: PluralRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolvedOptions(value: () => ResolvedPluralRulesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

