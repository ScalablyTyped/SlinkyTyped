package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array. */
@js.native
trait NamedNodeMap
  extends /* index */ NumberDictionary[org.scalajs.dom.raw.Attr] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.Attr]] = js.native
  val length: Double = js.native
  def getNamedItem(qualifiedName: java.lang.String): org.scalajs.dom.raw.Attr | Null = js.native
  def getNamedItemNS(namespace: java.lang.String, localName: java.lang.String): org.scalajs.dom.raw.Attr | Null = js.native
  def getNamedItemNS(namespace: Null, localName: java.lang.String): org.scalajs.dom.raw.Attr | Null = js.native
  def item(index: Double): org.scalajs.dom.raw.Attr | Null = js.native
  def removeNamedItem(qualifiedName: java.lang.String): org.scalajs.dom.raw.Attr = js.native
  def removeNamedItemNS(namespace: java.lang.String, localName: java.lang.String): org.scalajs.dom.raw.Attr = js.native
  def removeNamedItemNS(namespace: Null, localName: java.lang.String): org.scalajs.dom.raw.Attr = js.native
  def setNamedItem(attr: org.scalajs.dom.raw.Attr): org.scalajs.dom.raw.Attr | Null = js.native
  def setNamedItemNS(attr: org.scalajs.dom.raw.Attr): org.scalajs.dom.raw.Attr | Null = js.native
}

@JSGlobal("NamedNodeMap")
@js.native
object NamedNodeMap
  extends Instantiable0[org.scalajs.dom.raw.NamedNodeMap]

