package typingsSlinky.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionSheet extends ISheet {
  
  /** [Method] Returns the value of bottom
    * @returns Number
    */
  @JSName("getBottom")
  var getBottom_IActionSheet: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of height
    * @returns String
    */
  @JSName("getHeight")
  var getHeight_IActionSheet: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of left
    * @returns Number
    */
  @JSName("getLeft")
  var getLeft_IActionSheet: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of right
    * @returns Number
    */
  @JSName("getRight")
  var getRight_IActionSheet: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of bottom
    * @param bottom Number The new value.
    */
  @JSName("setBottom")
  var setBottom_IActionSheet: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of height
    * @param height String The new value.
    */
  @JSName("setHeight")
  var setHeight_IActionSheet: js.UndefOr[js.Function1[/* height */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of left
    * @param left Number The new value.
    */
  @JSName("setLeft")
  var setLeft_IActionSheet: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of right
    * @param right Number The new value.
    */
  @JSName("setRight")
  var setRight_IActionSheet: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.native
}
object IActionSheet {
  
  @scala.inline
  def apply(): IActionSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActionSheet]
  }
  
  @scala.inline
  implicit class IActionSheetMutableBuilder[Self <: IActionSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBottom(value: () => Double): Self = StObject.set(x, "getBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
    
    @scala.inline
    def setGetHeight(value: () => java.lang.String): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
    
    @scala.inline
    def setGetLeft(value: () => Double): Self = StObject.set(x, "getLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
    
    @scala.inline
    def setGetRight(value: () => Double): Self = StObject.set(x, "getRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
    
    @scala.inline
    def setSetBottom(value: /* bottom */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
    
    @scala.inline
    def setSetHeight(value: /* height */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    @scala.inline
    def setSetLeft(value: /* left */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
    
    @scala.inline
    def setSetRight(value: /* right */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
  }
}
