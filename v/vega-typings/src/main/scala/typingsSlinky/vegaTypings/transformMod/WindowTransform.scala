package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.markMod.Compare
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.vegaTypingsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowTransform extends Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.native
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.native
  var frame: js.UndefOr[(Vector2[Double | SignalRef | Null]) | SignalRef] = js.native
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var ignorePeers: js.UndefOr[Boolean | SignalRef] = js.native
  var ops: js.UndefOr[js.Array[AggregateOp | WindowOnlyOp | SignalRef]] = js.native
  var params: js.UndefOr[(js.Array[Double | SignalRef | Null]) | SignalRef] = js.native
  var sort: js.UndefOr[Compare] = js.native
  var `type`: window = js.native
}

object WindowTransform {
  @scala.inline
  def apply(`type`: window): WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowTransform]
  }
  @scala.inline
  implicit class WindowTransformOps[Self <: WindowTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = {
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
    def withFields(value: (js.Array[FieldRef | Null]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: (Vector2[Double | SignalRef | Null]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
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
    def withIgnorePeers(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePeers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePeers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePeers")(js.undefined)
        ret
    }
    @scala.inline
    def withOps(value: js.Array[AggregateOp | WindowOnlyOp | SignalRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: (js.Array[Double | SignalRef | Null]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
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

