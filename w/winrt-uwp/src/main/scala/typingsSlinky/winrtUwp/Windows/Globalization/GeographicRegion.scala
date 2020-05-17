package typingsSlinky.winrtUwp.Windows.Globalization

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a region. This is usually a country, but may be a macroregion. */
@js.native
trait GeographicRegion extends js.Object {
  /** Gets the string that contains the best available identifier that represents the region. */
  var code: String = js.native
  /** Gets the three-digit identifier for this region, as a string. */
  var codeThreeDigit: String = js.native
  /** Gets the three-letter identifier for this region. */
  var codeThreeLetter: String = js.native
  /** Gets the two-letter identifier for this region. */
  var codeTwoLetter: String = js.native
  /** Gets the set of currencies in use in this region. */
  var currenciesInUse: IVectorView[String] = js.native
  /** Gets a localized string that is suitable for display to the user for identifying the region. */
  var displayName: String = js.native
  /** Gets the name of the region in the primary language spoken in this region. */
  var nativeName: String = js.native
}

object GeographicRegion {
  @scala.inline
  def apply(
    code: String,
    codeThreeDigit: String,
    codeThreeLetter: String,
    codeTwoLetter: String,
    currenciesInUse: IVectorView[String],
    displayName: String,
    nativeName: String
  ): GeographicRegion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], codeThreeDigit = codeThreeDigit.asInstanceOf[js.Any], codeThreeLetter = codeThreeLetter.asInstanceOf[js.Any], codeTwoLetter = codeTwoLetter.asInstanceOf[js.Any], currenciesInUse = currenciesInUse.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicRegion]
  }
  @scala.inline
  implicit class GeographicRegionOps[Self <: GeographicRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeThreeDigit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeThreeDigit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeThreeLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeThreeLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeTwoLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeTwoLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrenciesInUse(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currenciesInUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

