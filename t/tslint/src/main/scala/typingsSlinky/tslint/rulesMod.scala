package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rulesMod {
  
  @JSImport("tslint/lib/rules", "AbstractRule")
  @js.native
  abstract class AbstractRule protected ()
    extends typingsSlinky.tslint.abstractRuleMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object AbstractRule {
    
    @JSImport("tslint/lib/rules", "AbstractRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules", "AbstractRule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("tslint/lib/rules", "OptionallyTypedRule")
  @js.native
  abstract class OptionallyTypedRule protected ()
    extends typingsSlinky.tslint.optionallyTypedRuleMod.OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/rules", "TypedRule")
  @js.native
  abstract class TypedRule protected ()
    extends typingsSlinky.tslint.typedRuleMod.TypedRule {
    def this(options: IOptions) = this()
  }
}
