package typingsSlinky.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackedCartesian extends ICartesian {
  /** [Method] Get the nearest item index from point x y
  		* @param x Object
  		* @param y Object
  		* @returns Number The index
  		*/
  @JSName("getIndexNearPoint")
  var getIndexNearPoint_IStackedCartesian: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], Double]] = js.native
}

object IStackedCartesian {
  @scala.inline
  def apply(): IStackedCartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackedCartesian]
  }
  @scala.inline
  implicit class IStackedCartesianOps[Self <: IStackedCartesian] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIndexNearPoint(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexNearPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetIndexNearPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexNearPoint")(js.undefined)
        ret
    }
  }
  
}

