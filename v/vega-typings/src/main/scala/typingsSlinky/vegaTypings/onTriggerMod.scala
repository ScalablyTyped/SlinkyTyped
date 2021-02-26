package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.exprMod.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onTriggerMod {
  
  @js.native
  trait OnMarkTrigger extends StObject {
    
    var modify: js.UndefOr[Expr] = js.native
    
    var trigger: Expr = js.native
    
    var values: js.UndefOr[Expr] = js.native
  }
  object OnMarkTrigger {
    
    @scala.inline
    def apply(trigger: Expr): OnMarkTrigger = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnMarkTrigger]
    }
    
    @scala.inline
    implicit class OnMarkTriggerMutableBuilder[Self <: OnMarkTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModify(value: Expr): Self = StObject.set(x, "modify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyUndefined: Self = StObject.set(x, "modify", js.undefined)
      
      @scala.inline
      def setTrigger(value: Expr): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Expr): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  @js.native
  trait OnTrigger extends StObject {
    
    var insert: js.UndefOr[Expr] = js.native
    
    var modify: js.UndefOr[Expr] = js.native
    
    var remove: js.UndefOr[Boolean | Expr] = js.native
    
    var toggle: js.UndefOr[Expr] = js.native
    
    var trigger: Expr = js.native
    
    var values: js.UndefOr[Expr] = js.native
  }
  object OnTrigger {
    
    @scala.inline
    def apply(trigger: Expr): OnTrigger = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnTrigger]
    }
    
    @scala.inline
    implicit class OnTriggerMutableBuilder[Self <: OnTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsert(value: Expr): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setModify(value: Expr): Self = StObject.set(x, "modify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyUndefined: Self = StObject.set(x, "modify", js.undefined)
      
      @scala.inline
      def setRemove(value: Boolean | Expr): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setToggle(value: Expr): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setTrigger(value: Expr): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Expr): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
