package typingsSlinky.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextTContext[TContext] extends StObject {
  
  var context: TContext = js.native
  
  var value: js.Any = js.native
}
object ContextTContext {
  
  @scala.inline
  def apply[TContext](context: TContext, value: js.Any): ContextTContext[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTContext[TContext]]
  }
  
  @scala.inline
  implicit class ContextTContextMutableBuilder[Self <: ContextTContext[_], TContext] (val x: Self with ContextTContext[TContext]) extends AnyVal {
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
