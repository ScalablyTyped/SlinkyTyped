package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.markMod.Compare
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.utilMod.Vector7
import typingsSlinky.vegaTypings.vegaTypingsStrings.begin
import typingsSlinky.vegaTypings.vegaTypingsStrings.end
import typingsSlinky.vegaTypings.vegaTypingsStrings.label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelTransform extends Transforms {
  var anchor: js.UndefOr[js.Array[String] | String | SignalRef] = js.native
  var as: js.UndefOr[(Vector7[String | SignalRef]) | SignalRef] = js.native
  var avoidBaseMark: js.UndefOr[Boolean | SignalRef] = js.native
  var avoidMarks: js.UndefOr[js.Array[String]] = js.native
  var lineAnchor: js.UndefOr[begin | end | SignalRef] = js.native
  var markIndex: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[js.Array[Double] | Double | SignalRef] = js.native
  var padding: js.UndefOr[Double | SignalRef] = js.native
  var size: (Vector2[Double | SignalRef]) | SignalRef = js.native
  var sort: js.UndefOr[Compare] = js.native
  var `type`: label = js.native
}

object LabelTransform {
  @scala.inline
  def apply(size: (Vector2[Double | SignalRef]) | SignalRef, `type`: label): LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelTransform]
  }
  @scala.inline
  implicit class LabelTransformOps[Self <: LabelTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchor(value: js.Array[String] | String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: (Vector7[String | SignalRef]) | SignalRef): Self = {
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
    def withAvoidBaseMark(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidBaseMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidBaseMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidBaseMark")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidMarks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidMarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidMarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidMarks")(js.undefined)
        ret
    }
    @scala.inline
    def withLineAnchor(value: begin | end | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Array[Double] | Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Compare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

