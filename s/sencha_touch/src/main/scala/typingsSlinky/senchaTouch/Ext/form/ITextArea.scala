package typingsSlinky.senchaTouch.Ext.form

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextArea
  extends typingsSlinky.senchaTouch.Ext.field.IText {
  
  /** [Method] Returns the value of maxRows
    * @returns Number
    */
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.native
  
  /** [Method] Sets the value of maxRows
    * @param maxRows Number The new value.
    */
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.native
}
object ITextArea {
  
  @scala.inline
  def apply(): ITextArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextArea]
  }
  
  @scala.inline
  implicit class ITextAreaMutableBuilder[Self <: ITextArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMaxRows(value: () => Double): Self = StObject.set(x, "getMaxRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxRowsUndefined: Self = StObject.set(x, "getMaxRows", js.undefined)
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    @scala.inline
    def setSetMaxRows(value: /* maxRows */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxRowsUndefined: Self = StObject.set(x, "setMaxRows", js.undefined)
  }
}
