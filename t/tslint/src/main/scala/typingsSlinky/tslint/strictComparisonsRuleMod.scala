package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.TypedRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.tslintNumbers.`0`
import typingsSlinky.tslint.tslintNumbers.`1`
import typingsSlinky.tslint.tslintNumbers.`2`
import typingsSlinky.tslint.tslintNumbers.`3`
import typingsSlinky.tslint.tslintNumbers.`4`
import typingsSlinky.tslint.tslintNumbers.`5`
import typingsSlinky.tslint.tslintNumbers.`6`
import typingsSlinky.tslint.tslintNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictComparisonsRuleMod {
  
  @JSImport("tslint/lib/rules/strictComparisonsRule", "Rule")
  @js.native
  class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
    
    var getRuleOptions: js.Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/strictComparisonsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/strictComparisonsRule", "Rule.INVALID_TYPES")
    @js.native
    def INVALID_TYPES(types1: js.Array[TypeKind], types2: js.Array[TypeKind]): String = js.native
    
    @JSImport("tslint/lib/rules/strictComparisonsRule", "Rule.INVALID_TYPE_FOR_OPERATOR")
    @js.native
    def INVALID_TYPE_FOR_OPERATOR(`type`: TypeKind, comparator: String): String = js.native
    
    @JSImport("tslint/lib/rules/strictComparisonsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tslint.tslintNumbers.`0`
    - typingsSlinky.tslint.tslintNumbers.`1`
    - typingsSlinky.tslint.tslintNumbers.`2`
    - typingsSlinky.tslint.tslintNumbers.`3`
    - typingsSlinky.tslint.tslintNumbers.`4`
    - typingsSlinky.tslint.tslintNumbers.`5`
    - typingsSlinky.tslint.tslintNumbers.`6`
    - typingsSlinky.tslint.tslintNumbers.`7`
  */
  trait TypeKind extends StObject
  object TypeKind {
    
    @scala.inline
    def Any: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Boolean: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Enum: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Null: `5` = 5.asInstanceOf[`5`]
    
    @scala.inline
    def Number: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def Object: `7` = 7.asInstanceOf[`7`]
    
    @scala.inline
    def String: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def Undefined: `6` = 6.asInstanceOf[`6`]
  }
}
