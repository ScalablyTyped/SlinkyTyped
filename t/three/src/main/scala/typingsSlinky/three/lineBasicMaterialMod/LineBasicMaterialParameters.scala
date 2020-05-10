package typingsSlinky.three.lineBasicMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.materialMod.MaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineBasicMaterialParameters extends MaterialParameters {
  var color: js.UndefOr[Color | String | Double] = js.native
  var linecap: js.UndefOr[String] = js.native
  var linejoin: js.UndefOr[String] = js.native
  var linewidth: js.UndefOr[Double] = js.native
}

object LineBasicMaterialParameters {
  @scala.inline
  def apply(): LineBasicMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineBasicMaterialParameters]
  }
  @scala.inline
  implicit class LineBasicMaterialParametersOps[Self <: LineBasicMaterialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withLinecap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecap")(js.undefined)
        ret
    }
    @scala.inline
    def withLinejoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinejoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withLinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinewidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewidth")(js.undefined)
        ret
    }
  }
  
}

