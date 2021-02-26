package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curlyRuleMod {
  
  @JSImport("tslint/lib/rules/curlyRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/curlyRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/curlyRule", "Rule.FAILURE_STRING_AS_NEEDED")
    @js.native
    def FAILURE_STRING_AS_NEEDED: String = js.native
    @scala.inline
    def FAILURE_STRING_AS_NEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_AS_NEEDED")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/curlyRule", "Rule.FAILURE_STRING_FACTORY")
    @js.native
    def FAILURE_STRING_FACTORY(kind: String): String = js.native
    
    @JSImport("tslint/lib/rules/curlyRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
