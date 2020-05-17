package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.dotbin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotBinTransform extends Transforms {
  var as: js.UndefOr[String | SignalRef] = js.native
  var field: FieldRef = js.native
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var signal: js.UndefOr[SignalName] = js.native
  var smooth: js.UndefOr[Boolean | SignalRef] = js.native
  var step: js.UndefOr[Double | SignalRef] = js.native
  var `type`: dotbin = js.native
}

object DotBinTransform {
  @scala.inline
  def apply(field: FieldRef, `type`: dotbin): DotBinTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotBinTransform]
  }
  @scala.inline
  implicit class DotBinTransformOps[Self <: DotBinTransform] (val x: Self) extends AnyVal {
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
    def withType(value: dotbin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
    def withSignal(value: SignalName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
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

