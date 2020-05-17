package typingsSlinky.xml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
*/
trait XmlAtom extends XmlDesc

object XmlAtom {
  @scala.inline
  implicit def apply(value: Boolean): XmlAtom = value.asInstanceOf[XmlAtom]
  @scala.inline
  implicit def apply(value: Double): XmlAtom = value.asInstanceOf[XmlAtom]
  @scala.inline
  implicit def apply(value: Null): XmlAtom = value.asInstanceOf[XmlAtom]
  @scala.inline
  implicit def apply(value: String): XmlAtom = value.asInstanceOf[XmlAtom]
}

