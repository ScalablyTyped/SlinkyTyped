package typingsSlinky.winrt.Windows.Globalization.NumberFormatting

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumberFormatterOptions extends js.Object {
  var fractionDigits: Double = js.native
  var geographicRegion: String = js.native
  var integerDigits: Double = js.native
  var isDecimalPointAlwaysDisplayed: Boolean = js.native
  var isGrouped: Boolean = js.native
  var languages: IVectorView[String] = js.native
  var numeralSystem: String = js.native
  var resolvedGeographicRegion: String = js.native
  var resolvedLanguage: String = js.native
}

object INumberFormatterOptions {
  @scala.inline
  def apply(
    fractionDigits: Double,
    geographicRegion: String,
    integerDigits: Double,
    isDecimalPointAlwaysDisplayed: Boolean,
    isGrouped: Boolean,
    languages: IVectorView[String],
    numeralSystem: String,
    resolvedGeographicRegion: String,
    resolvedLanguage: String
  ): INumberFormatterOptions = {
    val __obj = js.Dynamic.literal(fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumberFormatterOptions]
  }
  @scala.inline
  implicit class INumberFormatterOptionsOps[Self <: INumberFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeographicRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geographicRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegerDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDecimalPointAlwaysDisplayed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDecimalPointAlwaysDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumeralSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedGeographicRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedGeographicRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

