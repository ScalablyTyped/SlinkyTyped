package typingsSlinky.senchaTouch.Ext.chart

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICartesianChart extends IAbstractChart {
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of flipXY
  		* @returns Boolean
  		*/
  var getFlipXY: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of innerRegion
  		* @returns Array
  		*/
  var getInnerRegion: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of flipXY
  		* @param flipXY Boolean The new value.
  		*/
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of innerRegion
  		* @param innerRegion Array The new value.
  		*/
  var setInnerRegion: js.UndefOr[js.Function1[/* innerRegion */ js.UndefOr[Array], Unit]] = js.native
}

object ICartesianChart {
  @scala.inline
  def apply(): ICartesianChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesianChart]
  }
  @scala.inline
  implicit class ICartesianChartOps[Self <: ICartesianChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlipXY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFlipXY(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFlipXY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFlipXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFlipXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInnerRegion(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInnerRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPerformLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFlipXY(value: /* flipXY */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlipXY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFlipXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlipXY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInnerRegion(value: /* innerRegion */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInnerRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerRegion")(js.undefined)
        ret
    }
  }
  
}

