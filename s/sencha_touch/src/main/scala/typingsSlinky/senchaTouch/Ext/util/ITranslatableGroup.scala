package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.util.translatable.IAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslatableGroup extends IAbstract {
  /** [Method] Returns the value of activeIndex
  		* @returns Number
  		*/
  var getActiveIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of itemLength
  		* @returns Object
  		*/
  var getItemLength: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of items
  		* @returns Array
  		*/
  var getItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Sets the value of activeIndex
  		* @param activeIndex Number The new value.
  		*/
  var setActiveIndex: js.UndefOr[js.Function1[/* activeIndex */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of itemLength
  		* @param itemLength Object The new value.
  		*/
  var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of items
  		* @param items Array The new value.
  		*/
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.native
}

object ITranslatableGroup {
  @scala.inline
  def apply(): ITranslatableGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITranslatableGroup]
  }
  @scala.inline
  implicit class ITranslatableGroupOps[Self <: ITranslatableGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActiveIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemLength(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLength")(js.undefined)
        ret
    }
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
    def withSetActiveIndex(value: /* activeIndex */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemLength(value: /* itemLength */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemLength")(js.undefined)
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

