package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideLocale extends js.Object {
  /**
    * Returns the decimal separator.
    *
    * @returns The decimal separator.
    * @example
    *
    * var locale = GlideLocale.get();
    * var decimalSeparator = locale.getDecimalSeparator();
    * gs.info( "The decimal separator is " + decimalSeparator);
    * // The decimal separator is .
    */
  def getDecimalSeparator(): String = js.native
  /**
    * Returns the grouping separator.
    *
    * @returns The grouping separator.
    * @example
    *
    * var locale = GlideLocale.get();
    * var groupingSeparator = locale.getGroupingSeparator();
    * gs.info( "The grouping separator is " + groupingSeparator);
    */
  def getGroupingSeparator(): String = js.native
}

object GlideLocale {
  @scala.inline
  def apply(getDecimalSeparator: () => String, getGroupingSeparator: () => String): GlideLocale = {
    val __obj = js.Dynamic.literal(getDecimalSeparator = js.Any.fromFunction0(getDecimalSeparator), getGroupingSeparator = js.Any.fromFunction0(getGroupingSeparator))
    __obj.asInstanceOf[GlideLocale]
  }
  @scala.inline
  implicit class GlideLocaleOps[Self <: GlideLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDecimalSeparator(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecimalSeparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroupingSeparator(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupingSeparator")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

