package typingsSlinky.winrt.Windows.Globalization.NumberFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumberFormatter2 extends js.Object {
  def formatDouble(value: Double): String = js.native
  def formatInt(value: Double): String = js.native
  def formatUInt(value: Double): String = js.native
}

object INumberFormatter2 {
  @scala.inline
  def apply(formatDouble: Double => String, formatInt: Double => String, formatUInt: Double => String): INumberFormatter2 = {
    val __obj = js.Dynamic.literal(formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt))
    __obj.asInstanceOf[INumberFormatter2]
  }
  @scala.inline
  implicit class INumberFormatter2Ops[Self <: INumberFormatter2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatDouble(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDouble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatInt(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatUInt(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatUInt")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

