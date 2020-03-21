package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.matcherMod.Matcher
import typingsSlinky.tsMockito.methodStubCollectionMod.MethodStubCollection
import typingsSlinky.tsMockito.mockMod.Mocker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodToStub", JSImport.Namespace)
@js.native
object methodToStubMod extends js.Object {
  @js.native
  class MethodToStub protected () extends js.Object {
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

