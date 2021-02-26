package typingsSlinky.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISheet extends IPanel {
  
  /** [Config Option] (String) */
  var enter: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var exit: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the value of enter
    * @returns String
    */
  var getEnter: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of exit
    * @returns String
    */
  var getExit: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of stretchX
    * @returns Boolean
    */
  var getStretchX: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of stretchY
    * @returns Boolean
    */
  var getStretchY: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Sets the value of enter
    * @param enter String The new value.
    */
  var setEnter: js.UndefOr[js.Function1[/* enter */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of exit
    * @param exit String The new value.
    */
  var setExit: js.UndefOr[js.Function1[/* exit */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of stretchX
    * @param stretchX Boolean The new value.
    */
  var setStretchX: js.UndefOr[js.Function1[/* stretchX */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of stretchY
    * @param stretchY Boolean The new value.
    */
  var setStretchY: js.UndefOr[js.Function1[/* stretchY */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var stretchX: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var stretchY: js.UndefOr[Boolean] = js.native
}
object ISheet {
  
  @scala.inline
  def apply(): ISheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISheet]
  }
  
  @scala.inline
  implicit class ISheetMutableBuilder[Self <: ISheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: java.lang.String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: java.lang.String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setGetEnter(value: () => java.lang.String): Self = StObject.set(x, "getEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnterUndefined: Self = StObject.set(x, "getEnter", js.undefined)
    
    @scala.inline
    def setGetExit(value: () => java.lang.String): Self = StObject.set(x, "getExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExitUndefined: Self = StObject.set(x, "getExit", js.undefined)
    
    @scala.inline
    def setGetStretchX(value: () => Boolean): Self = StObject.set(x, "getStretchX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStretchXUndefined: Self = StObject.set(x, "getStretchX", js.undefined)
    
    @scala.inline
    def setGetStretchY(value: () => Boolean): Self = StObject.set(x, "getStretchY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStretchYUndefined: Self = StObject.set(x, "getStretchY", js.undefined)
    
    @scala.inline
    def setSetEnter(value: /* enter */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnterUndefined: Self = StObject.set(x, "setEnter", js.undefined)
    
    @scala.inline
    def setSetExit(value: /* exit */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExitUndefined: Self = StObject.set(x, "setExit", js.undefined)
    
    @scala.inline
    def setSetStretchX(value: /* stretchX */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStretchX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStretchXUndefined: Self = StObject.set(x, "setStretchX", js.undefined)
    
    @scala.inline
    def setSetStretchY(value: /* stretchY */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStretchY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStretchYUndefined: Self = StObject.set(x, "setStretchY", js.undefined)
    
    @scala.inline
    def setStretchX(value: Boolean): Self = StObject.set(x, "stretchX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchXUndefined: Self = StObject.set(x, "stretchX", js.undefined)
    
    @scala.inline
    def setStretchY(value: Boolean): Self = StObject.set(x, "stretchY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchYUndefined: Self = StObject.set(x, "stretchY", js.undefined)
  }
}
