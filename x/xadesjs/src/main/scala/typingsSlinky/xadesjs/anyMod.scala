package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import typingsSlinky.xmlCore.mod.XmlCollection
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/any", JSImport.Namespace)
@js.native
object anyMod extends js.Object {
  
  @js.native
  class Any () extends XmlObject {
    
    var Value: String = js.native
  }
  
  @js.native
  class AnyCollection () extends XmlCollection[XadesObject]
}
