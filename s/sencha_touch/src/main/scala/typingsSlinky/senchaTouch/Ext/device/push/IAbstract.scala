package typingsSlinky.senchaTouch.Ext.device.push

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Property] (Number) */
  var ALERT: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var BADGE: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var SOUND: js.UndefOr[Double] = js.native
  /** [Method] Registers a push notification
  		* @param config Object The configuration for to pass when registering this push notification service.
  		*/
  var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALERT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALERT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(js.undefined)
        ret
    }
    @scala.inline
    def withBADGE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BADGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBADGE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BADGE")(js.undefined)
        ret
    }
    @scala.inline
    def withSOUND(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOUND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSOUND: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOUND")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
  }
  
}

