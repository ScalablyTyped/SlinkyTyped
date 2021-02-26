package typingsSlinky.xadesjs

import typingsSlinky.xmlCore.mod.XmlCollection
import typingsSlinky.xmlCore.mod.XmlObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlBaseMod {
  
  @JSImport("xadesjs/build/types/xml/xml_base", "XadesCollection")
  @js.native
  abstract class XadesCollection[I /* <: XadesObject */] () extends XmlCollection[I] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/xml_base", "XadesObject")
  @js.native
  abstract class XadesObject () extends XmlObject {
    def this(properties: js.Object) = this()
  }
}
