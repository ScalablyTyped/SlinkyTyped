package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/tripleEqualsRule", JSImport.Namespace)
@js.native
object tripleEqualsRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var EQ_FAILURE_STRING: String = js.native
    var NEQ_FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

