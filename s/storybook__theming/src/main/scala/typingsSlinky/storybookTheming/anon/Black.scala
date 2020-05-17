package typingsSlinky.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Black extends js.Object {
  var black: Double = js.native
  var bold: Double = js.native
  var regular: Double = js.native
}

object Black {
  @scala.inline
  def apply(black: Double, bold: Double, regular: Double): Black = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Black]
  }
  @scala.inline
  implicit class BlackOps[Self <: Black] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegular(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regular")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

