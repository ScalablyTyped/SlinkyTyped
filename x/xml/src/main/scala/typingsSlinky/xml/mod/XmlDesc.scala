package typingsSlinky.xml.mod

import typingsSlinky.xml.anon.Attr
import typingsSlinky.xml.anon.AttrCdata
import typingsSlinky.xml.anon.Cdata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xml.anon.Attr
  - typingsSlinky.xml.anon.Cdata
  - typingsSlinky.xml.anon.AttrCdata
  - typingsSlinky.xml.mod.XmlAtom
  - js.Array[typingsSlinky.xml.mod.XmlAtom]
  - typingsSlinky.xml.mod.XmlDescArray
*/
trait XmlDesc extends XmlObject

object XmlDesc {
  @scala.inline
  implicit def apply(value: js.Array[XmlAtom]): XmlDesc = value.asInstanceOf[XmlDesc]
  @scala.inline
  implicit def apply(value: Attr): XmlDesc = value.asInstanceOf[XmlDesc]
  @scala.inline
  implicit def apply(value: AttrCdata): XmlDesc = value.asInstanceOf[XmlDesc]
  @scala.inline
  implicit def apply(value: Cdata): XmlDesc = value.asInstanceOf[XmlDesc]
  @scala.inline
  implicit def apply(value: XmlAtom): XmlDesc = value.asInstanceOf[XmlDesc]
  @scala.inline
  implicit def apply(value: XmlDescArray): XmlDesc = value.asInstanceOf[XmlDesc]
}

