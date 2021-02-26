package typingsSlinky.tslint

import typingsSlinky.tslint.abstractRuleMod.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.ITypedRule
import typingsSlinky.tslint.ruleMod.RuleFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedRuleMod {
  
  @JSImport("tslint/lib/language/rule/typedRule", "TypedRule")
  @js.native
  abstract class TypedRule protected ()
    extends AbstractRule
       with ITypedRule {
    def this(options: IOptions) = this()
    
    @JSName("apply")
    def apply(): js.Array[RuleFailure] = js.native
  }
}
