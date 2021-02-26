package typingsSlinky.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IMessageBoxMutableBuilder[Self <: IMessageBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlert(
      value: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = StObject.set(x, "alert", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setConfirm(
      value: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = StObject.set(x, "confirm", js.Any.fromFunction4(value))
    
    @scala.inline
    def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    @scala.inline
    def setDefaultTextHeight(value: Double): Self = StObject.set(x, "defaultTextHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTextHeightUndefined: Self = StObject.set(x, "defaultTextHeight", js.undefined)
    
    @scala.inline
    def setGetButtons(value: () => _): Self = StObject.set(x, "getButtons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetButtonsUndefined: Self = StObject.set(x, "getButtons", js.undefined)
    
    @scala.inline
    def setGetDefaultTextHeight(value: () => Double): Self = StObject.set(x, "getDefaultTextHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultTextHeightUndefined: Self = StObject.set(x, "getDefaultTextHeight", js.undefined)
    
    @scala.inline
    def setGetLayout(value: () => _): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    @scala.inline
    def setGetPrompt(value: () => _): Self = StObject.set(x, "getPrompt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPromptUndefined: Self = StObject.set(x, "getPrompt", js.undefined)
    
    @scala.inline
    def setGetTitle(value: () => java.lang.String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    @scala.inline
    def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconCls(value: java.lang.String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMsg(value: java.lang.String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    @scala.inline
    def setPrompt(value: js.Any): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setSetButtons(value: /* buttons */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setButtons", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetButtonsUndefined: Self = StObject.set(x, "setButtons", js.undefined)
    
    @scala.inline
    def setSetDefaultTextHeight(value: /* defaultTextHeight */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDefaultTextHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultTextHeightUndefined: Self = StObject.set(x, "setDefaultTextHeight", js.undefined)
    
    @scala.inline
    def setSetIcon(value: /* iconCls */ js.UndefOr[java.lang.String] => IMessageBox): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconCls(value: /* iconCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIconCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconClsUndefined: Self = StObject.set(x, "setIconCls", js.undefined)
    
    @scala.inline
    def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
    
    @scala.inline
    def setSetMessage(value: /* message */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMessageUndefined: Self = StObject.set(x, "setMessage", js.undefined)
    
    @scala.inline
    def setSetPrompt(value: /* prompt */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPrompt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPromptUndefined: Self = StObject.set(x, "setPrompt", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateText(value: /* message */ js.UndefOr[java.lang.String] => IMessageBox): Self = StObject.set(x, "updateText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateTextUndefined: Self = StObject.set(x, "updateText", js.undefined)
  }
}
