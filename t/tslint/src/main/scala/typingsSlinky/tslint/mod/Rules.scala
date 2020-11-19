package typingsSlinky.tslint.mod

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "Rules")
@js.native
object Rules extends js.Object {
  
  @js.native
  abstract class AbstractRule protected ()
    extends typingsSlinky.tslint.rulesMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  @js.native
  object AbstractRule extends js.Object {
    
    var metadata: IRuleMetadata = js.native
  }
  
  @js.native
  abstract class OptionallyTypedRule ()
    extends typingsSlinky.tslint.optionallyTypedRuleMod.OptionallyTypedRule
  
  @js.native
  abstract class TypedRule ()
    extends typingsSlinky.tslint.typedRuleMod.TypedRule
}
