package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typingsSlinky.tsMockito.matcherMod.Matcher
import typingsSlinky.tsMockito.methodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/stub/RejectPromiseMethodStub", JSImport.Namespace)
@js.native
object rejectPromiseMethodStubMod extends js.Object {
  @js.native
  class RejectPromiseMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], value: js.Any) = this()
    var matchers: js.Any = js.native
    var validator: js.Any = js.native
    var value: js.Any = js.native
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
  }
  
}

