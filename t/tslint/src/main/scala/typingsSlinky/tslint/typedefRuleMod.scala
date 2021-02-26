package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedefRuleMod {
  
  @JSImport("tslint/lib/rules/typedefRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/typedefRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/typedefRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("tslint/lib/rules/typedefRule", "isNodeArray")
  @js.native
  def isNodeArray(nodeOrArray: Node): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = js.native
  @JSImport("tslint/lib/rules/typedefRule", "isNodeArray")
  @js.native
  def isNodeArray(nodeOrArray: NodeArray[Node]): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = js.native
}
