package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.TypedRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awaitPromiseRuleMod {
  
  @JSImport("tslint/lib/rules/awaitPromiseRule", "Rule")
  @js.native
  class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/awaitPromiseRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/awaitPromiseRule", "Rule.FAILURE_FOR_AWAIT_OF")
    @js.native
    def FAILURE_FOR_AWAIT_OF: String = js.native
    @scala.inline
    def FAILURE_FOR_AWAIT_OF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_FOR_AWAIT_OF")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/awaitPromiseRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: String = js.native
    @scala.inline
    def FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/awaitPromiseRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
