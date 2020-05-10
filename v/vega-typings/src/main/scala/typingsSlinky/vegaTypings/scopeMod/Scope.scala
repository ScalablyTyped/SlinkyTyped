package typingsSlinky.vegaTypings.scopeMod

import typingsSlinky.vegaTypings.axisMod.Axis
import typingsSlinky.vegaTypings.dataMod.Data
import typingsSlinky.vegaTypings.layoutMod.Layout
import typingsSlinky.vegaTypings.legendMod.Legend
import typingsSlinky.vegaTypings.markMod.Mark
import typingsSlinky.vegaTypings.projectionMod.Projection
import typingsSlinky.vegaTypings.scaleMod.Scale
import typingsSlinky.vegaTypings.signalMod.Signal
import typingsSlinky.vegaTypings.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  var axes: js.UndefOr[js.Array[Axis]] = js.native
  var data: js.UndefOr[js.Array[Data]] = js.native
  var layout: js.UndefOr[Layout] = js.native
  var legends: js.UndefOr[js.Array[Legend]] = js.native
  var marks: js.UndefOr[js.Array[Mark]] = js.native
  var projections: js.UndefOr[js.Array[Projection]] = js.native
  var scales: js.UndefOr[js.Array[Scale]] = js.native
  var signals: js.UndefOr[js.Array[Signal]] = js.native
  var title: js.UndefOr[String | Title] = js.native
  var usermeta: js.UndefOr[js.Object] = js.native
}

object Scope {
  @scala.inline
  def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  @scala.inline
  implicit class ScopeOps[Self <: Scope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: js.Array[Axis]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[Data]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[Legend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(js.undefined)
        ret
    }
    @scala.inline
    def withMarks(value: js.Array[Mark]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(js.undefined)
        ret
    }
    @scala.inline
    def withProjections(value: js.Array[Projection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projections")(js.undefined)
        ret
    }
    @scala.inline
    def withScales(value: js.Array[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(js.undefined)
        ret
    }
    @scala.inline
    def withSignals(value: js.Array[Signal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signals")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | Title): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUsermeta(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usermeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsermeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usermeta")(js.undefined)
        ret
    }
  }
  
}

