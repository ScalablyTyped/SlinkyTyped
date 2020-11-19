package typingsSlinky.tslint

import typingsSlinky.tslint.abstractRuleMod.AbstractRule
import typingsSlinky.tslint.ruleMod.ITypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/language/rule/optionallyTypedRule", JSImport.Namespace)
@js.native
object optionallyTypedRuleMod extends js.Object {
  
  @js.native
  abstract class OptionallyTypedRule ()
    extends AbstractRule
       with ITypedRule
}
