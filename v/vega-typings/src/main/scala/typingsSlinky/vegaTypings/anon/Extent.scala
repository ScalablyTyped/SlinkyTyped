package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.scaleMod.RangeScheme
import typingsSlinky.vegaTypings.schemeMod.ColorScheme
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extent extends RangeScheme {
  var count: js.UndefOr[Double | SignalRef] = js.native
  var extent: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  var scheme: String | js.Array[String] | SignalRef | ColorScheme = js.native
}

object Extent {
  @scala.inline
  def apply(scheme: String | js.Array[String] | SignalRef | ColorScheme): Extent = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extent]
  }
  @scala.inline
  implicit class ExtentOps[Self <: Extent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheme(value: String | js.Array[String] | SignalRef | ColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: (js.Array[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
  }
  
}

