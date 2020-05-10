package typingsSlinky.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBar extends IStackedCartesian {
  /** [Config Option] (Number) */
  var inGroupGapWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxBarWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minBarWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minGapWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  /** [Method] Render the given visible clip range
  		* @param surface Object
  		* @param ctx Object
  		* @param clip Object
  		*/
  @JSName("renderClipped")
  var renderClipped_IBar: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IBar {
  @scala.inline
  def apply(): IBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBar]
  }
  @scala.inline
  implicit class IBarOps[Self <: IBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInGroupGapWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGroupGapWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInGroupGapWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGroupGapWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinGapWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minGapWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinGapWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minGapWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderClipped(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderClipped")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderClipped")(js.undefined)
        ret
    }
  }
  
}

