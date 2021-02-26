package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceWithinParensRuleMod {
  
  @JSImport("tslint/lib/rules/spaceWithinParensRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/spaceWithinParensRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/spaceWithinParensRule", "Rule.FAILURE_NEEDS_SPACE")
    @js.native
    def FAILURE_NEEDS_SPACE(count: Double): String = js.native
    
    @JSImport("tslint/lib/rules/spaceWithinParensRule", "Rule.FAILURE_NO_EXTRA_SPACE")
    @js.native
    def FAILURE_NO_EXTRA_SPACE(count: Double): String = js.native
    
    @JSImport("tslint/lib/rules/spaceWithinParensRule", "Rule.FAILURE_NO_SPACE")
    @js.native
    def FAILURE_NO_SPACE: String = js.native
    @scala.inline
    def FAILURE_NO_SPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_NO_SPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/spaceWithinParensRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
