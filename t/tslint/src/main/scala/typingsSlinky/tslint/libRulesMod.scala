package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.IOptions
import typingsSlinky.tslint.libLanguageRuleRuleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules", JSImport.Namespace)
@js.native
object libRulesMod extends js.Object {
  @js.native
  abstract class AbstractRule protected ()
    extends typingsSlinky.tslint.libLanguageRuleAbstractRuleMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  
  @js.native
  abstract class OptionallyTypedRule ()
    extends typingsSlinky.tslint.libLanguageRuleOptionallyTypedRuleMod.OptionallyTypedRule
  
  @js.native
  abstract class TypedRule ()
    extends typingsSlinky.tslint.libLanguageRuleTypedRuleMod.TypedRule
  
  /* static members */
  @js.native
  object AbstractRule extends js.Object {
    var metadata: IRuleMetadata = js.native
  }
  
}

