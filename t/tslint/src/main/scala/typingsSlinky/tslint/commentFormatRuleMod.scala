package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/commentFormatRule", JSImport.Namespace)
@js.native
object commentFormatRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def IGNORE_PATTERN_FAILURE_FACTORY(pattern: String): String = js.native
    
    def IGNORE_WORDS_FAILURE_FACTORY(words: js.Array[String]): String = js.native
    
    var LEADING_SPACE_FAILURE: String = js.native
    
    var LOWERCASE_FAILURE: String = js.native
    
    var SPACE_LOWERCASE_FAILURE: String = js.native
    
    var SPACE_UPPERCASE_FAILURE: String = js.native
    
    var UPPERCASE_FAILURE: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
