package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linebreakStyleRuleMod {
  
  @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule.FAILURE_CRLF")
    @js.native
    def FAILURE_CRLF: String = js.native
    @scala.inline
    def FAILURE_CRLF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_CRLF")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule.FAILURE_LF")
    @js.native
    def FAILURE_LF: String = js.native
    @scala.inline
    def FAILURE_LF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_LF")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
