package typingsSlinky.xadesjs.xadesjsMod.xml

import typingsSlinky.xadesjs.xadesjsStrings.OIDAsURI
import typingsSlinky.xadesjs.xadesjsStrings.OIDAsURN
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "xml.Identifier")
@js.native
class Identifier () extends XmlObject {
  var Qualifier: OIDAsURI | OIDAsURN = js.native
  var Value: String = js.native
}

