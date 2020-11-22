package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.canonicalizerMod.XmlCanonicalizer
import typingsSlinky.xmldsigjs.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/transforms/exc_c14n", JSImport.Namespace)
@js.native
object excC14nMod extends js.Object {
  
  @js.native
  class XmlDsigExcC14NTransform () extends Transform {
    
    /**
      * Gets or sets a string that contains namespace prefixes to canonicalize
      * using the standard canonicalization algorithm.
      */
    def InclusiveNamespacesPrefixList: String = js.native
    def InclusiveNamespacesPrefixList_=(value: String): Unit = js.native
    
    var setInclusiveNamespacesElement: js.Any = js.native
    
    var xmlCanonicalizer: XmlCanonicalizer = js.native
  }
  
  @js.native
  class XmlDsigExcC14NWithCommentsTransform () extends XmlDsigExcC14NTransform
}
