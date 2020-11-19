package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/noIrregularWhitespaceRule", JSImport.Namespace)
@js.native
object noIrregularWhitespaceRuleMod extends js.Object {
  
  val IRREGULAR_WHITESPACE_REGEX: js.RegExp = js.native
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
