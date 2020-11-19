package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.canonicalizerMod.XmlCanonicalizer
import typingsSlinky.xmldsigjs.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/transforms/c14n", JSImport.Namespace)
@js.native
object c14nMod extends js.Object {
  
  @js.native
  class XmlDsigC14NTransform () extends Transform {
    
    var xmlCanonicalizer: XmlCanonicalizer = js.native
  }
  
  @js.native
  class XmlDsigC14NWithCommentsTransform () extends XmlDsigC14NTransform
}
