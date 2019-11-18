package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGTransformList defines a list of SVGTransform objects. */
trait SVGTransformList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: org.scalajs.dom.raw.SVGTransform): org.scalajs.dom.raw.SVGTransform
  def clear(): Unit
  def consolidate(): org.scalajs.dom.raw.SVGTransform
  def createSVGTransformFromMatrix(matrix: org.scalajs.dom.raw.SVGMatrix): org.scalajs.dom.raw.SVGTransform
  def getItem(index: Double): org.scalajs.dom.raw.SVGTransform
  def initialize(newItem: org.scalajs.dom.raw.SVGTransform): org.scalajs.dom.raw.SVGTransform
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGTransform, index: Double): org.scalajs.dom.raw.SVGTransform
  def removeItem(index: Double): org.scalajs.dom.raw.SVGTransform
  def replaceItem(newItem: org.scalajs.dom.raw.SVGTransform, index: Double): org.scalajs.dom.raw.SVGTransform
}

@JSGlobal("SVGTransformList")
@js.native
object SVGTransformList extends Instantiable0[SVGTransformList]

