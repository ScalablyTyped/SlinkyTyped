package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sparklines extends js.Object {
  var paddingX: Double = js.native
  var paddingY: Double = js.native
  var radius: Double = js.native
  def template(item: js.Any, common: String, data: js.Array[_], column: js.Any, index: Double): String = js.native
}

object Sparklines {
  @scala.inline
  def apply(
    paddingX: Double,
    paddingY: Double,
    radius: Double,
    template: (js.Any, String, js.Array[_], js.Any, Double) => String
  ): Sparklines = {
    val __obj = js.Dynamic.literal(paddingX = paddingX.asInstanceOf[js.Any], paddingY = paddingY.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], template = js.Any.fromFunction5(template))
    __obj.asInstanceOf[Sparklines]
  }
  @scala.inline
  implicit class SparklinesOps[Self <: Sparklines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: (js.Any, String, js.Array[_], js.Any, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

