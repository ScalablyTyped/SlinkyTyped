package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typingsSlinky.tsMockito.matcherMod.Matcher
import typingsSlinky.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throwErrorMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/ThrowErrorMethodStub", "ThrowErrorMethodStub")
  @js.native
  class ThrowErrorMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], error: js.Error) = this()
    
    var error: js.Any = js.native
    
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    
    var matchers: js.Any = js.native
    
    var validator: js.Any = js.native
  }
}
