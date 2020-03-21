package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/jsdocFormatRule", JSImport.Namespace)
@js.native
object jsdocFormatRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var ALIGNMENT_FAILURE_STRING: String = js.native
    var FORMAT_FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

