package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/adjacentOverloadSignaturesRule", JSImport.Namespace)
@js.native
object adjacentOverloadSignaturesRuleMod extends js.Object {
  
  def getOverloadKey(node: SignatureDeclaration): js.UndefOr[String] = js.native
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING(name: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
