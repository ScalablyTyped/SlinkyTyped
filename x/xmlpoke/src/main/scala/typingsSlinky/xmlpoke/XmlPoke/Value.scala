package typingsSlinky.xmlpoke.XmlPoke

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Boolean
  - scala.Double
  - typingsSlinky.xmlpoke.XmlPoke.XmlValue
  - typingsSlinky.xmlpoke.XmlPoke.CDataValue
  - typingsSlinky.xmlpoke.XmlPoke.PathToValueMap
  - typingsSlinky.xmlpoke.XmlPoke.Transform
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: Boolean): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: CDataValue): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: PathToValueMap): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Transform): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: XmlValue): Value = value.asInstanceOf[Value]
}

