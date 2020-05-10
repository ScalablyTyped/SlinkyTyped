package typingsSlinky.winrt.Windows.Globalization.NumberFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumberFormatter extends js.Object {
  def format(value: Double): String = js.native
}

object INumberFormatter {
  @scala.inline
  def apply(format: Double => String): INumberFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
    __obj.asInstanceOf[INumberFormatter]
  }
  @scala.inline
  implicit class INumberFormatterOps[Self <: INumberFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

