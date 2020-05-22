package typingsSlinky.std

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

object SVGTransformList {
  @scala.inline
  def apply(
    appendItem: org.scalajs.dom.raw.SVGTransform => org.scalajs.dom.raw.SVGTransform,
    clear: () => Unit,
    consolidate: () => org.scalajs.dom.raw.SVGTransform,
    createSVGTransformFromMatrix: org.scalajs.dom.raw.SVGMatrix => org.scalajs.dom.raw.SVGTransform,
    getItem: Double => org.scalajs.dom.raw.SVGTransform,
    initialize: org.scalajs.dom.raw.SVGTransform => org.scalajs.dom.raw.SVGTransform,
    insertItemBefore: (org.scalajs.dom.raw.SVGTransform, Double) => org.scalajs.dom.raw.SVGTransform,
    numberOfItems: Double,
    removeItem: Double => org.scalajs.dom.raw.SVGTransform,
    replaceItem: (org.scalajs.dom.raw.SVGTransform, Double) => org.scalajs.dom.raw.SVGTransform
  ): SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), consolidate = js.Any.fromFunction0(consolidate), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGTransformList]
  }
}

