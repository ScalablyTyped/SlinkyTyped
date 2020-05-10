package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGTransformList defines a list of SVGTransform objects. */
@js.native
trait SVGTransformList extends js.Object {
  val numberOfItems: Double = js.native
  def appendItem(newItem: org.scalajs.dom.raw.SVGTransform): org.scalajs.dom.raw.SVGTransform = js.native
  def clear(): Unit = js.native
  def consolidate(): org.scalajs.dom.raw.SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: org.scalajs.dom.raw.SVGMatrix): org.scalajs.dom.raw.SVGTransform = js.native
  def getItem(index: Double): org.scalajs.dom.raw.SVGTransform = js.native
  def initialize(newItem: org.scalajs.dom.raw.SVGTransform): org.scalajs.dom.raw.SVGTransform = js.native
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGTransform, index: Double): org.scalajs.dom.raw.SVGTransform = js.native
  def removeItem(index: Double): org.scalajs.dom.raw.SVGTransform = js.native
  def replaceItem(newItem: org.scalajs.dom.raw.SVGTransform, index: Double): org.scalajs.dom.raw.SVGTransform = js.native
}

@JSGlobal("SVGTransformList")
@js.native
object SVGTransformList
  extends Instantiable0[org.scalajs.dom.raw.SVGTransformList]

