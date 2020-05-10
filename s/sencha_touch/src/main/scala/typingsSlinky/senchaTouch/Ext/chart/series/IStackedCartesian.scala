package typingsSlinky.senchaTouch.Ext.chart.series

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackedCartesian extends ICartesian {
  /** [Method] Returns the value of stacked
  		* @returns Boolean
  		*/
  var getStacked: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Array) */
  @JSName("hidden")
  var hidden_IStackedCartesian: js.UndefOr[Array] = js.native
  /** [Method] Sets the value of hidden
  		* @param hidden Array The new value.
  		*/
  @JSName("setHidden")
  var setHidden_IStackedCartesian: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of stacked
  		* @param stacked Boolean The new value.
  		*/
  var setStacked: js.UndefOr[js.Function1[/* stacked */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var stacked: js.UndefOr[Boolean] = js.native
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
    def withGetStacked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStacked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStacked")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHidden(value: /* hidden */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStacked(value: /* stacked */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStacked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStacked")(js.undefined)
        ret
    }
    @scala.inline
    def withStacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(js.undefined)
        ret
    }
  }
  
}

