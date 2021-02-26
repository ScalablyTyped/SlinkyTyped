package typingsSlinky.senchaTouch.Ext.form

import typingsSlinky.senchaTouch.Ext.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldSet extends IContainer {
  
  /** [Method] A convenient method to disable all fields in this FieldSet
    * @param newDisabled Object
    * @returns Ext.form.FieldSet This FieldSet
    */
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (String) */
  var instructions: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of instructions
    * @param instructions String The new value.
    */
  var setInstructions: js.UndefOr[js.Function1[/* instructions */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
}
object IFieldSet {
  
  @scala.inline
  def apply(): IFieldSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldSet]
  }
  
  @scala.inline
  implicit class IFieldSetMutableBuilder[Self <: IFieldSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoSetDisabled(value: /* newDisabled */ js.UndefOr[js.Any] => IFieldSet): Self = StObject.set(x, "doSetDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoSetDisabledUndefined: Self = StObject.set(x, "doSetDisabled", js.undefined)
    
    @scala.inline
    def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    @scala.inline
    def setSetInstructions(value: /* instructions */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setInstructions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInstructionsUndefined: Self = StObject.set(x, "setInstructions", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
