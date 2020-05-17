package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.kde2d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KDE2DTransform extends Transforms {
  var as: js.UndefOr[String | SignalRef] = js.native
  var bandwidth: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  var cellSize: js.UndefOr[Double | SignalRef] = js.native
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var counts: js.UndefOr[Boolean | SignalRef] = js.native
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.native
  var size: (js.Array[Double | SignalRef]) | SignalRef = js.native
  var `type`: kde2d = js.native
  var weight: js.UndefOr[String | TransformField] = js.native
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var x: String | TransformField = js.native
  var y: String | TransformField = js.native
}

object KDE2DTransform {
  @scala.inline
  def apply(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: kde2d,
    x: String | TransformField,
    y: String | TransformField
  ): KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDE2DTransform]
  }
  @scala.inline
  implicit class KDE2DTransformOps[Self <: KDE2DTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: (js.Array[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: kde2d): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: String | TransformField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: String | TransformField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withBandwidth(value: (js.Array[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSize(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCounts(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupby(value: (js.Array[String | TransformField]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupby")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: String | TransformField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

