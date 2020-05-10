package typingsSlinky.vegaTypings.dataMod

import typingsSlinky.vegaTypings.onTriggerMod.OnTrigger
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  values  :std.Array<vega-typings.vega-typings/types/spec/data.Datum> | object,   format ? :vega-typings.vega-typings/types/spec/data.Format | vega-typings.vega-typings/types/spec.SignalRef,   async ? :boolean | vega-typings.vega-typings/types/spec.SignalRef} & vega-typings.vega-typings/types/spec/data.BaseData */
@js.native
trait ValuesData extends Data {
  var async: js.UndefOr[Boolean | SignalRef] = js.native
  var format: js.UndefOr[Format | SignalRef] = js.native
  var name: String = js.native
  var on: js.UndefOr[js.Array[OnTrigger]] = js.native
  var transform: js.UndefOr[js.Array[Transforms]] = js.native
  var values: js.Array[Datum] | js.Object = js.native
}

object ValuesData {
  @scala.inline
  def apply(name: String, values: js.Array[Datum] | js.Object): ValuesData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesData]
  }
  @scala.inline
  implicit class ValuesDataOps[Self <: ValuesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Datum] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsync(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Format | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: js.Array[OnTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[Transforms]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

