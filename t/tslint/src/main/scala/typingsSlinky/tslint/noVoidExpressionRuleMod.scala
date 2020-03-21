package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noVoidExpressionRule", JSImport.Namespace)
@js.native
object noVoidExpressionRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

