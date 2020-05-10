package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.`bin-ordinal`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinOrdinalScale
  extends BaseScale
     with Scale {
  var bins: js.UndefOr[ScaleBins] = js.native
  var interpolate: js.UndefOr[ScaleInterpolate] = js.native
  var range: js.UndefOr[RangeScheme | ScaleData] = js.native
  @JSName("type")
  var type_BinOrdinalScale: `bin-ordinal` = js.native
}

object BinOrdinalScale {
  @scala.inline
  def apply(name: String, `type`: `bin-ordinal`): BinOrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinOrdinalScale]
  }
  @scala.inline
  implicit class BinOrdinalScaleOps[Self <: BinOrdinalScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `bin-ordinal`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBins(value: ScaleBins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bins")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolate(value: ScaleInterpolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: RangeScheme | ScaleData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

