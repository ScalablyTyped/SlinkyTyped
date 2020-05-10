package typingsSlinky.senchaTouch.Ext.device.purchases

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPurchase extends IModel {
  /** [Method] Attempts to mark this purchase as complete
  		* @param config Object
  		*/
  var complete: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  @JSName("getFields")
  var getFields_IPurchase: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  @JSName("setFields")
  var setFields_IPurchase: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.native
}

object IPurchase {
  @scala.inline
  def apply(): IPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPurchase]
  }
  @scala.inline
  implicit class IPurchaseOps[Self <: IPurchase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
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

