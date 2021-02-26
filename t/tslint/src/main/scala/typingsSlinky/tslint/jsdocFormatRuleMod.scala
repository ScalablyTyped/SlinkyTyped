package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdocFormatRuleMod {
  
  @JSImport("tslint/lib/rules/jsdocFormatRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/jsdocFormatRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/jsdocFormatRule", "Rule.ALIGNMENT_FAILURE_STRING")
    @js.native
    def ALIGNMENT_FAILURE_STRING: String = js.native
    @scala.inline
    def ALIGNMENT_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNMENT_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/jsdocFormatRule", "Rule.FORMAT_FAILURE_STRING")
    @js.native
    def FORMAT_FAILURE_STRING: String = js.native
    @scala.inline
    def FORMAT_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/jsdocFormatRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
