package typingsSlinky.senchaTouch.Ext.device.purchases

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProduct extends IModel {
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  @JSName("getFields")
  var getFields_IProduct: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Will attempt to purchase this product
  		* @param config Object
  		*/
  var purchase: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  @JSName("setFields")
  var setFields_IProduct: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.native
}

object IProduct {
  @scala.inline
  def apply(): IProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProduct]
  }
  @scala.inline
  implicit class IProductOps[Self <: IProduct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFields(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchase(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.undefined)
        ret
    }
  }
  
}

