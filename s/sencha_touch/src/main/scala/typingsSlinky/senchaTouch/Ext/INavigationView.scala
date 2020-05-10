package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavigationView extends IContainer {
  /** [Config Option] (String) */
  var defaultBackButtonText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of defaultBackButtonText
  		* @returns String
  		*/
  var getDefaultBackButtonText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of navigationBar
  		* @returns Boolean/Object
  		*/
  var getNavigationBar: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the previous item if one exists
  		* @returns Mixed The previous view
  		*/
  var getPreviousItem: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of useTitleForBackButtonText
  		* @returns Boolean
  		*/
  var getUseTitleForBackButtonText: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean/Object) */
  var navigationBar: js.UndefOr[js.Any] = js.native
  /** [Method] Removes the current active view from the stack and sets the previous view using the default animation of this view
  		* @param count Number/String/Object If a Number, the number of views you want to pop. If a String, the pops to a matching component query. If an Object, the pops to a matching view instance.
  		* @returns Ext.Component The new active item
  		*/
  var pop: js.UndefOr[js.Function1[/* count */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Pushes a new view into this navigation view using the default animation that this view has
  		* @param view Object The view to push.
  		* @returns Ext.Component The new item you just pushed.
  		*/
  var push: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Resets the view by removing all items between the first and last item
  		* @returns Ext.Component The view that is now active
  		*/
  var reset: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the value of defaultBackButtonText
  		* @param defaultBackButtonText String The new value.
  		*/
  var setDefaultBackButtonText: js.UndefOr[js.Function1[/* defaultBackButtonText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of navigationBar
  		* @param navigationBar Boolean/Object The new value.
  		*/
  var setNavigationBar: js.UndefOr[js.Function1[/* navigationBar */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of useTitleForBackButtonText
  		* @param useTitleForBackButtonText Boolean The new value.
  		*/
  var setUseTitleForBackButtonText: js.UndefOr[js.Function1[/* useTitleForBackButtonText */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useTitleForBackButtonText: js.UndefOr[Boolean] = js.native
}

object INavigationView {
  @scala.inline
  def apply(): INavigationView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigationView]
  }
  @scala.inline
  implicit class INavigationViewOps[Self <: INavigationView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultBackButtonText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBackButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBackButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultBackButtonText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultBackButtonText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultBackButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayout(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNavigationBar(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNavigationBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNavigationBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNavigationBar")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreviousItem(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPreviousItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousItem")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseTitleForBackButtonText(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseTitleForBackButtonText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseTitleForBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseTitleForBackButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationBar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBar")(js.undefined)
        ret
    }
    @scala.inline
    def withPop(value: /* count */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: /* view */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultBackButtonText(value: /* defaultBackButtonText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultBackButtonText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultBackButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNavigationBar(value: /* navigationBar */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNavigationBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNavigationBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNavigationBar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseTitleForBackButtonText(value: /* useTitleForBackButtonText */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseTitleForBackButtonText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseTitleForBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseTitleForBackButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTitleForBackButtonText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTitleForBackButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTitleForBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTitleForBackButtonText")(js.undefined)
        ret
    }
  }
  
}

