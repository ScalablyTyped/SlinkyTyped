package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGLengthList defines a list of SVGLength objects. */
@js.native
trait SVGLengthList extends /* index */ NumberDictionary[SVGLength] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.SVGLength]] = js.native
  val length: Double = js.native
  val numberOfItems: Double = js.native
  def appendItem(newItem: org.scalajs.dom.raw.SVGLength): org.scalajs.dom.raw.SVGLength = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): org.scalajs.dom.raw.SVGLength = js.native
  def initialize(newItem: org.scalajs.dom.raw.SVGLength): org.scalajs.dom.raw.SVGLength = js.native
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGLength, index: Double): org.scalajs.dom.raw.SVGLength = js.native
  def removeItem(index: Double): org.scalajs.dom.raw.SVGLength = js.native
  def replaceItem(newItem: org.scalajs.dom.raw.SVGLength, index: Double): org.scalajs.dom.raw.SVGLength = js.native
}

@JSGlobal("SVGLengthList")
@js.native
object SVGLengthList extends Instantiable0[SVGLengthList]

