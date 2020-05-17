package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.independent
import typingsSlinky.vegaTypings.vegaTypingsStrings.isocontour
import typingsSlinky.vegaTypings.vegaTypingsStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsocontourTransform extends Transforms {
  var as: js.UndefOr[String | Null | SignalRef] = js.native
  var field: js.UndefOr[String | TransformField] = js.native
  var levels: js.UndefOr[Double | SignalRef] = js.native
  var nice: js.UndefOr[Boolean | SignalRef] = js.native
  var resolve: js.UndefOr[shared | independent | SignalRef] = js.native
  var scale: js.UndefOr[Double | TransformField] = js.native
  var smooth: js.UndefOr[Boolean | SignalRef] = js.native
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  var translate: js.UndefOr[js.Array[Double] | TransformField] = js.native
  var `type`: isocontour = js.native
  var zero: js.UndefOr[Boolean | SignalRef] = js.native
}

object IsocontourTransform {
  @scala.inline
  def apply(`type`: isocontour): IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsocontourTransform]
  }
  @scala.inline
  implicit class IsocontourTransformOps[Self <: IsocontourTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: isocontour): Self = {
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
    def withAsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(null)
        ret
    }
    @scala.inline
    def withField(value: String | TransformField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
        ret
    }
    @scala.inline
    def withNice(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: shared | independent | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double | TransformField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
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
    def withThresholds(value: (js.Array[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: js.Array[Double] | TransformField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
    @scala.inline
    def withZero(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(js.undefined)
        ret
    }
  }
  
}

