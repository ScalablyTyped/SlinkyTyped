package typingsSlinky.std.Intl

import typingsSlinky.std.stdStrings.cardinal
import typingsSlinky.std.stdStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedPluralRulesOptions extends js.Object {
  var locale: String = js.native
  var maximumFractionDigits: Double = js.native
  var maximumSignificantDigits: Double = js.native
  var minimumFractionDigits: Double = js.native
  var minimumIntegerDigits: Double = js.native
  var minimumSignificantDigits: Double = js.native
  var pluralCategories: js.Array[String] = js.native
  var `type`: cardinal | ordinal = js.native
}

object ResolvedPluralRulesOptions {
  @scala.inline
  def apply(
    locale: String,
    maximumFractionDigits: Double,
    maximumSignificantDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    minimumSignificantDigits: Double,
    pluralCategories: js.Array[String],
    `type`: cardinal | ordinal
  ): ResolvedPluralRulesOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], maximumSignificantDigits = maximumSignificantDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], minimumSignificantDigits = minimumSignificantDigits.asInstanceOf[js.Any], pluralCategories = pluralCategories.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedPluralRulesOptions]
  }
  @scala.inline
  implicit class ResolvedPluralRulesOptionsOps[Self <: ResolvedPluralRulesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumIntegerDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumIntegerDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluralCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: cardinal | ordinal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

