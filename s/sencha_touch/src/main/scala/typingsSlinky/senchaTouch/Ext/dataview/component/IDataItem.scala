package typingsSlinky.senchaTouch.Ext.dataview.component

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataItem
  extends typingsSlinky.senchaTouch.Ext.IContainer {
  /** [Config Option] (Object) */
  var dataMap: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of dataMap
  		* @returns Object
  		*/
  var getDataMap: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of itemCls
  		* @returns String
  		*/
  var getItemCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of items
  		* @returns Array
  		*/
  @JSName("getItems")
  var getItems_IDataItem: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.native
  /** [Method] Sets the value of dataMap
  		* @param dataMap Object The new value.
  		*/
  var setDataMap: js.UndefOr[js.Function1[/* dataMap */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of itemCls
  		* @param itemCls String The new value.
  		*/
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of items
  		* @param items Array The new value.
  		*/
  @JSName("setItems")
  var setItems_IDataItem: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of width
  		* @param width String The new value.
  		*/
  @JSName("setWidth")
  var setWidth_IDataItem: js.UndefOr[js.Function1[/* width */ js.UndefOr[String], Unit]] = js.native
}

object IDataItem {
  @scala.inline
  def apply(): IDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataItem]
  }
  @scala.inline
  implicit class IDataItemOps[Self <: IDataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMap")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDataMap(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDataMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataMap")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCls")(js.undefined)
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
    def withItemCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDataMap(value: /* dataMap */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDataMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemCls(value: /* itemCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemCls")(js.undefined)
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
    @scala.inline
    def withSetWidth(value: /* width */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
  }
  
}

