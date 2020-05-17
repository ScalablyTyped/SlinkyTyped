package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseY extends js.Object {
  var baseY: Double = js.native
  var topY: Double = js.native
}

object BaseY {
  @scala.inline
  def apply(baseY: Double, topY: Double): BaseY = {
    val __obj = js.Dynamic.literal(baseY = baseY.asInstanceOf[js.Any], topY = topY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseY]
  }
  @scala.inline
  implicit class BaseYOps[Self <: BaseY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

