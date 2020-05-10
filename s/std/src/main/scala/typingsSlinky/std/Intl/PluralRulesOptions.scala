package typingsSlinky.std.Intl

import typingsSlinky.std.stdStrings.`best fit`
import typingsSlinky.std.stdStrings.cardinal
import typingsSlinky.std.stdStrings.lookup
import typingsSlinky.std.stdStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralRulesOptions extends js.Object {
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.native
  var `type`: js.UndefOr[cardinal | ordinal] = js.native
}

object PluralRulesOptions {
  @scala.inline
  def apply(): PluralRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluralRulesOptions]
  }
  @scala.inline
  implicit class PluralRulesOptionsOps[Self <: PluralRulesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocaleMatcher(value: lookup | (`best fit`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: cardinal | ordinal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

