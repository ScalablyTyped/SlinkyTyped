package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg
  def clear(): Unit
  def getItem(index: Double): org.scalajs.dom.raw.SVGPathSeg
  def initialize(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg
  def removeItem(index: Double): org.scalajs.dom.raw.SVGPathSeg
  def replaceItem(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg
}

object SVGPathSegList {
  @scala.inline
  def apply(
    appendItem: org.scalajs.dom.raw.SVGPathSeg => org.scalajs.dom.raw.SVGPathSeg,
    clear: () => Unit,
    getItem: Double => org.scalajs.dom.raw.SVGPathSeg,
    initialize: org.scalajs.dom.raw.SVGPathSeg => org.scalajs.dom.raw.SVGPathSeg,
    insertItemBefore: (org.scalajs.dom.raw.SVGPathSeg, Double) => org.scalajs.dom.raw.SVGPathSeg,
    numberOfItems: Double,
    removeItem: Double => org.scalajs.dom.raw.SVGPathSeg,
    replaceItem: (org.scalajs.dom.raw.SVGPathSeg, Double) => org.scalajs.dom.raw.SVGPathSeg
  ): SVGPathSegList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGPathSegList]
  }
}

