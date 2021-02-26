package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.matcherMod.Matcher
import typingsSlinky.tsMockito.methodStubCollectionMod.MethodStubCollection
import typingsSlinky.tsMockito.mockMod.Mocker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodToStubMod {
  
  @JSImport("ts-mockito/lib/MethodToStub", "MethodToStub")
  @js.native
  class MethodToStub protected () extends StObject {
    def this(
      methodStubCollection: MethodStubCollection,
      matchers: js.Array[Matcher],
      mocker: Mocker,
      name: String
    ) = this()
    
    var matchers: js.Array[Matcher] = js.native
    
    var methodStubCollection: MethodStubCollection = js.native
    
    var mocker: Mocker = js.native
    
    var name: String = js.native
  }
}
