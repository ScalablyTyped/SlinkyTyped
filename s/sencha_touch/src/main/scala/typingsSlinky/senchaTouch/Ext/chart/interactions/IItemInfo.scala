package typingsSlinky.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemInfo extends IAbstract {
  /** [Method] Returns the value of panel
  		* @returns Object
  		*/
  var getPanel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Placeholder method
  		* @param series Object
  		* @param item Object
  		*/
  @JSName("onGesture")
  var onGesture_IItemInfo: js.UndefOr[
    js.Function2[/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Object) */
  var panel: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of panel
  		* @param panel Object The new value.
  		*/
  var setPanel: js.UndefOr[js.Function1[/* panel */ js.UndefOr[js.Any], Unit]] = js.native
}

object IItemInfo {
  @scala.inline
  def apply(): IItemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemInfo]
  }
  @scala.inline
  implicit class IItemInfoOps[Self <: IItemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPanel(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGesture(value: (/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withPanel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPanel(value: /* panel */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPanel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPanel")(js.undefined)
        ret
    }
  }
  
}

