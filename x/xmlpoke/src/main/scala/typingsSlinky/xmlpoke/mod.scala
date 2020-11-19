package typingsSlinky.xmlpoke

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.xmlpoke.XmlPoke.API
import typingsSlinky.xmlpoke.XmlPoke.XmlValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmlpoke", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(xml: String, modify: js.Function1[/* api */ API, Unit]): String = js.native
  
  @js.native
  class CDataValue protected ()
    extends typingsSlinky.xmlpoke.XmlPoke.CDataValue {
    def this(value: String) = this()
  }
  @js.native
  object CDataValue
    extends TopLevel[Instantiable1[/* value */ String, typingsSlinky.xmlpoke.XmlPoke.CDataValue]]
  
  @js.native
  class XmlString protected () extends XmlValue {
    def this(value: String) = this()
  }
  @js.native
  object XmlString extends TopLevel[Instantiable1[/* value */ String, XmlValue]]
}
