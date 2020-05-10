package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITitleBar extends IContainer {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ITitleBar: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of maxButtonWidth
  		* @returns String
  		*/
  var getMaxButtonWidth: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of titleAlign
  		* @returns String
  		*/
  var getTitleAlign: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (String) */
  var maxButtonWidth: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_ITitleBar: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ITitleBar: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of maxButtonWidth
  		* @param maxButtonWidth String The new value.
  		*/
  var setMaxButtonWidth: js.UndefOr[js.Function1[/* maxButtonWidth */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_ITitleBar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of titleAlign
  		* @param titleAlign String The new value.
  		*/
  var setTitleAlign: js.UndefOr[js.Function1[/* titleAlign */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.native
}

object ITitleBar {
  @scala.inline
  def apply(): ITitleBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITitleBar]
  }
  @scala.inline
  implicit class ITitleBarOps[Self <: ITitleBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxButtonWidth(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxButtonWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxButtonWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxButtonWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTitle(value: () => java.lang.String): Self = {
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
    def withGetTitleAlign(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitleAlign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTitleAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitleAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxButtonWidth(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxButtonWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxButtonWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxButtonWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxButtonWidth(value: /* maxButtonWidth */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxButtonWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxButtonWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxButtonWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinHeight(value: /* minHeight */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = {
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
    def withSetTitleAlign(value: /* titleAlign */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitleAlign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitleAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitleAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
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
    def withTitleAlign(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(js.undefined)
        ret
    }
  }
  
}

