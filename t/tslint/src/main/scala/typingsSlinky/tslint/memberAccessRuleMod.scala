package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/memberAccessRule", JSImport.Namespace)
@js.native
object memberAccessRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING_FACTORY(memberType: String): String = js.native
    def FAILURE_STRING_FACTORY(memberType: String, memberName: String): String = js.native
    
    var FAILURE_STRING_NO_PUBLIC: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
