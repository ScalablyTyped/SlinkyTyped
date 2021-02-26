package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typingsSlinky.tsMockito.matcherMod.Matcher
import typingsSlinky.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolvePromiseMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/ResolvePromiseMethodStub", "ResolvePromiseMethodStub")
  @js.native
  class ResolvePromiseMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], value: js.Any) = this()
    
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    
    var matchers: js.Any = js.native
    
    var validator: js.Any = js.native
    
    var value: js.Any = js.native
  }
}
