package typingsSlinky.xmldsigjs

import org.scalajs.dom.raw.Node
import typingsSlinky.std.XPathEvaluator
import typingsSlinky.xmldsigjs.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/transforms/xpath", JSImport.Namespace)
@js.native
object xpathMod extends js.Object {
  
  @js.native
  class XmlDsigXPathTransform () extends Transform {
    
    /* protected */ def Evaluate(node: Node, xpath: String): Boolean = js.native
    
    /* protected */ def Filter(node: Node, xpath: String): Unit = js.native
    
    /* protected */ def GetEvaluator(node: Node): XPathEvaluator = js.native
  }
}
