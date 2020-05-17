package typingsSlinky.xmldsigjs.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "SignedXml")
@js.native
/**
  * Creates an instance of SignedXml.
  *
  * @param {(Document | Element)} [node]
  *
  * @memberOf SignedXml
  */
class SignedXml ()
  extends typingsSlinky.xmldsigjs.signedXmlMod.SignedXml {
  def this(node: Document) = this()
  def this(node: Element) = this()
}

