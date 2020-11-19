package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.matcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-mockito/lib/MethodAction", JSImport.Namespace)
@js.native
object methodActionMod extends js.Object {
  
  @js.native
  class MethodAction protected () extends js.Object {
    def this(methodName: String, args: js.Array[_]) = this()
    
    var args: js.Array[_] = js.native
    
    var callIndex: js.Any = js.native
    
    def getCallIndex(): Double = js.native
    
    def hasBeenCalledBefore(action: MethodAction): Boolean = js.native
    
    def isApplicable(methodName: String, matchers: js.Array[Matcher]): Boolean = js.native
    
    var methodName: String = js.native
  }
  /* static members */
  @js.native
  object MethodAction extends js.Object {
    
    var globalCallIndex: js.Any = js.native
  }
}
