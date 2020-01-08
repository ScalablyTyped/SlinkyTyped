package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.buildTypesCanonicalizerMod.XmlCanonicalizer
import typingsSlinky.xmldsigjs.buildTypesXmlTransformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/transforms/c14n", JSImport.Namespace)
@js.native
object buildTypesXmlTransformsC14nMod extends js.Object {
  @js.native
  class XmlDsigC14NTransform () extends Transform {
    var xmlCanonicalizer: XmlCanonicalizer = js.native
  }
  
  @js.native
  class XmlDsigC14NWithCommentsTransform () extends XmlDsigC14NTransform
  
}

