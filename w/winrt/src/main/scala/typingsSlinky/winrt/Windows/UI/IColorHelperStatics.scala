package typingsSlinky.winrt.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorHelperStatics extends js.Object {
  def fromArgb(a: Double, r: Double, g: Double, b: Double): Color = js.native
}

object IColorHelperStatics {
  @scala.inline
  def apply(fromArgb: (Double, Double, Double, Double) => Color): IColorHelperStatics = {
    val __obj = js.Dynamic.literal(fromArgb = js.Any.fromFunction4(fromArgb))
    __obj.asInstanceOf[IColorHelperStatics]
  }
  @scala.inline
  implicit class IColorHelperStaticsOps[Self <: IColorHelperStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromArgb(value: (Double, Double, Double, Double) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromArgb")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

