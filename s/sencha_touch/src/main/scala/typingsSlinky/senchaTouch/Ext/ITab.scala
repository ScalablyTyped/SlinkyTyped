package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITab extends IButton {
  /** [Config Option] (Boolean) */
  var active: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of active
  		* @returns Boolean
  		*/
  var getActive: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of activeCls
  		* @returns String
  		*/
  var getActiveCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Sets the value of active
  		* @param active Boolean The new value.
  		*/
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of activeCls
  		* @param activeCls String The new value.
  		*/
  var setActiveCls: js.UndefOr[js.Function1[/* activeCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
}

object ITab {
  @scala.inline
  def apply(): ITab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITab]
  }
  @scala.inline
  implicit class ITabOps[Self <: ITab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActive")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveCls")(js.undefined)
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
    def withSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActiveCls(value: /* activeCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveCls")(js.undefined)
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
  }
  
}

