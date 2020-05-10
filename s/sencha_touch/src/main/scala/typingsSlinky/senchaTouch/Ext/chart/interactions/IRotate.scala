package typingsSlinky.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRotate extends IAbstract {
  /** [Method] Placeholder method
  		* @param e Object
  		*/
  @JSName("onGesture")
  var onGesture_IRotate: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}

object IRotate {
  @scala.inline
  def apply(): IRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRotate]
  }
  @scala.inline
  implicit class IRotateOps[Self <: IRotate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.undefined)
        ret
    }
  }
  
}

