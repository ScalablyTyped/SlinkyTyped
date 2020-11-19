package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typingsSlinky.tsMockito.matcherMod.Matcher
import typingsSlinky.tsMockito.methodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-mockito/lib/stub/CallFunctionMethodStub", JSImport.Namespace)
@js.native
object callFunctionMethodStubMod extends js.Object {
  
  @js.native
  class CallFunctionMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], func: js.Any) = this()
    
    var func: js.Any = js.native
    
    var functionResult: js.Any = js.native
    
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    
    var matchers: js.Any = js.native
    
    var validator: js.Any = js.native
  }
}
