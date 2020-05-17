package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.quantile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantileTransform extends Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.native
  var field: FieldRef = js.native
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var probs: js.UndefOr[js.Array[Double] | SignalRef] = js.native
  var step: js.UndefOr[Double | SignalRef] = js.native
  var `type`: quantile = js.native
}

object QuantileTransform {
  @scala.inline
  def apply(field: FieldRef, `type`: quantile): QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileTransform]
  }
  @scala.inline
  implicit class QuantileTransformOps[Self <: QuantileTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: FieldRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: quantile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = {
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
    def withGroupby(value: js.Array[FieldRef] | SignalRef): Self = {
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
    def withProbs(value: js.Array[Double] | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probs")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

