package typingsSlinky.xmlCore

import typingsSlinky.xmlCore.typesMod.XmlAttributeType
import typingsSlinky.xmlCore.typesMod.XmlChildElementType
import typingsSlinky.xmlCore.typesMod.XmlContentType
import typingsSlinky.xmlCore.typesMod.XmlElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-core/dist/types/decorators", JSImport.Namespace)
@js.native
object decoratorsMod extends js.Object {
  
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, Unit] = js.native
}
