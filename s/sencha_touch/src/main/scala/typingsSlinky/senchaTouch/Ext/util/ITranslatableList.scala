package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.util.translatable.IAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslatableList extends IAbstract {
  /** [Method] Returns the value of items
  		* @returns Array
  		*/
  var getItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Sets the value of items
  		* @param items Array The new value.
  		*/
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.native
}

object ITranslatableList {
  @scala.inline
  def apply(): ITranslatableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITranslatableList]
  }
  @scala.inline
  implicit class ITranslatableListOps[Self <: ITranslatableList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItems(value: /* items */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItems")(js.undefined)
        ret
    }
  }
  
}

