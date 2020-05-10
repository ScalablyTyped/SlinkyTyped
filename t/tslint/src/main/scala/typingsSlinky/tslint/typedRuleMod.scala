package typingsSlinky.tslint

import typingsSlinky.tslint.abstractRuleMod.AbstractRule
import typingsSlinky.tslint.ruleMod.ITypedRule
import typingsSlinky.tslint.ruleMod.RuleFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/typedRule", JSImport.Namespace)
@js.native
object typedRuleMod extends js.Object {
  @js.native
  abstract class TypedRule ()
    extends AbstractRule
       with ITypedRule {
    @JSName("apply")
    def apply(): js.Array[RuleFailure] = js.native
  }
  
}

