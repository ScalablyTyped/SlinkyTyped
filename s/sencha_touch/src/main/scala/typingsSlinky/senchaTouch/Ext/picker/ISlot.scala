package typingsSlinky.senchaTouch.Ext.picker

import typingsSlinky.senchaTouch.Ext.dataview.IDataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlot extends IDataView {
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  /** [Method] Looks at the data configuration and turns it into store
  		* @param data Object
  		* @returns Object
  		*/
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the title for this dataview by creating element
  		* @param title String
  		* @returns String
  		*/
  var applyTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], String]] = js.native
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.native
  /** [Method] Returns the value of align
  		* @returns String
  		*/
  var getAlign: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of displayField
  		* @returns String
  		*/
  var getDisplayField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of valueField
  		* @returns String
  		*/
  var getValueField: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  @JSName("itemTpl")
  var itemTpl_ISlot: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Method] Sets the value of align
  		* @param align String The new value.
  		*/
  var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String The new value.
  		*/
  @JSName("setItemTpl")
  var setItemTpl_ISlot: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of valueField
  		* @param valueField String The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Method] Updates the align configuration
  		* @param newAlign Object
  		* @param oldAlign Object
  		*/
  var updateAlign: js.UndefOr[
    js.Function2[/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.native
}

object ISlot {
  @scala.inline
  def apply(): ISlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlot]
  }
  @scala.inline
  implicit class ISlotOps[Self <: ISlot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyData(value: /* data */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyData")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyTitle(value: /* title */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAlign(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisplayField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValueField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueField")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAlign(value: /* align */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisplayField(value: /* displayField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemTpl(value: /* itemTpl */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemTpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetName(value: /* name */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValueField(value: /* valueField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueField")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateAlign(value: (/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAlign")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

