package typingsSlinky.senchaTouch.Ext.device.purchases

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISencha extends IBase {
  /** [Method] Checks if the current user is able to make payments
  		* @param config Object
  		*/
  var canMakePayments: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
  		* @param config Object
  		*/
  var getCompletedPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns a Ext data Store instance of all products available to purchase
  		* @param config Object
  		*/
  var getProducts: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
  		* @param config Object
  		*/
  var getPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object ISencha {
  @scala.inline
  def apply(): ISencha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISencha]
  }
  @scala.inline
  implicit class ISenchaOps[Self <: ISencha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanMakePayments(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMakePayments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanMakePayments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMakePayments")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCompletedPurchases(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompletedPurchases")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCompletedPurchases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompletedPurchases")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProducts(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProducts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProducts")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPurchases(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPurchases")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPurchases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPurchases")(js.undefined)
        ret
    }
  }
  
}

