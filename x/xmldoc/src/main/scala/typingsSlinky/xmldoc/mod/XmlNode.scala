package typingsSlinky.xmldoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xmldoc.mod.XmlElement
  - typingsSlinky.xmldoc.mod.XmlTextNode
  - typingsSlinky.xmldoc.mod.XmlCDataNode
  - typingsSlinky.xmldoc.mod.XmlCommentNode
*/
trait XmlNode extends js.Object

object XmlNode {
  @scala.inline
  implicit def apply(value: XmlCDataNode): XmlNode = value.asInstanceOf[XmlNode]
  @scala.inline
  implicit def apply(value: XmlCommentNode): XmlNode = value.asInstanceOf[XmlNode]
  @scala.inline
  implicit def apply(value: XmlElement): XmlNode = value.asInstanceOf[XmlNode]
  @scala.inline
  implicit def apply(value: XmlTextNode): XmlNode = value.asInstanceOf[XmlNode]
}

