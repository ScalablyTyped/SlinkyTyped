package typingsSlinky.senchaTouch.Ext.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel
  extends typingsSlinky.senchaTouch.Ext.IContainer {
  /** [Config Option] (Number/Boolean/String) */
  var bodyBorder: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Boolean/String) */
  var bodyMargin: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Boolean/String) */
  var bodyPadding: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of bodyBorder
  		* @returns Number/Boolean/String
  		*/
  var getBodyBorder: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of bodyMargin
  		* @returns Number/Boolean/String
  		*/
  var getBodyMargin: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of bodyPadding
  		* @returns Number/Boolean/String
  		*/
  var getBodyPadding: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of bodyBorder
  		* @param bodyBorder Number/Boolean/String The new value.
  		*/
  var setBodyBorder: js.UndefOr[js.Function1[/* bodyBorder */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of bodyMargin
  		* @param bodyMargin Number/Boolean/String The new value.
  		*/
  var setBodyMargin: js.UndefOr[js.Function1[/* bodyMargin */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of bodyPadding
  		* @param bodyPadding Number/Boolean/String The new value.
  		*/
  var setBodyPadding: js.UndefOr[js.Function1[/* bodyPadding */ js.UndefOr[js.Any], Unit]] = js.native
}

object IPanel {
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyBorder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBodyBorder(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyBorder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBodyBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBodyMargin(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyMargin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBodyMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBodyPadding(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyPadding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBodyPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBodyBorder(value: /* bodyBorder */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyBorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBodyBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBodyMargin(value: /* bodyMargin */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyMargin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBodyMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBodyPadding(value: /* bodyPadding */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBodyPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyPadding")(js.undefined)
        ret
    }
  }
  
}

