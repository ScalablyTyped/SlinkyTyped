package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBox extends ISheet {
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
  		* @param title String The title bar text.
  		* @param message String The message box body text.
  		* @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window
  		* @returns Ext.MessageBox this
  		*/
  var alert: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Config Option] (Array/Object) */
  var buttons: js.UndefOr[js.Any] = js.native
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
  		* @param title String The title bar text.
  		* @param message String The message box body text.
  		* @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window
  		* @returns Ext.MessageBox this
  		*/
  var confirm: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Config Option] (Number) */
  var defaultTextHeight: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of buttons
  		* @returns Array/Object
  		*/
  var getButtons: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of defaultTextHeight
  		* @returns Number
  		*/
  var getDefaultTextHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of prompt
  		* @returns Object
  		*/
  var getPrompt: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var prompt: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of buttons
  		* @param buttons Array/Object The new value.
  		*/
  var setButtons: js.UndefOr[js.Function1[/* buttons */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of defaultTextHeight
  		* @param defaultTextHeight Number The new value.
  		*/
  var setDefaultTextHeight: js.UndefOr[js.Function1[/* defaultTextHeight */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets icon
  		* @param iconCls String A CSS class name or empty string to clear the icon.
  		* @returns Ext.MessageBox this
  		*/
  var setIcon: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], this.type]] = js.native
  /** [Method] Sets the value of iconCls
  		* @param iconCls String The new value.
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of prompt
  		* @param prompt Object The new value.
  		*/
  var setPrompt: js.UndefOr[js.Function1[/* prompt */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		* @returns Ext.MessageBox this
  		*/
  var updateText: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], this.type]] = js.native
}

object IMessageBox {
  @scala.inline
  def apply(): IMessageBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBox]
  }
  @scala.inline
  implicit class IMessageBoxOps[Self <: IMessageBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(
      value: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirm(
      value: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTextHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTextHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTextHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTextHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetButtons(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getButtons")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultTextHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultTextHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultTextHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultTextHeight")(js.undefined)
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
    def withGetPrompt(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrompt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrompt")(js.undefined)
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
    def withIcon(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMsg(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withSetButtons(value: /* buttons */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setButtons")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultTextHeight(value: /* defaultTextHeight */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultTextHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultTextHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultTextHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIcon(value: /* iconCls */ js.UndefOr[java.lang.String] => IMessageBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIconCls(value: /* iconCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMessage(value: /* message */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPrompt(value: /* prompt */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrompt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrompt")(js.undefined)
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
    @scala.inline
    def withUpdateText(value: /* message */ js.UndefOr[java.lang.String] => IMessageBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateText")(js.undefined)
        ret
    }
  }
  
}

