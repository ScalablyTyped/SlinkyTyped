package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegList extends js.Object {
  val numberOfItems: Double = js.native
  def appendItem(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
  def initialize(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg = js.native
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
  def removeItem(index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
  def replaceItem(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
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
  @scala.inline
  implicit class SVGPathSegListOps[Self <: org.scalajs.dom.raw.SVGPathSegList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendItem(value: org.scalajs.dom.raw.SVGPathSeg => org.scalajs.dom.raw.SVGPathSeg): Self = this.set("appendItem", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: Double => org.scalajs.dom.raw.SVGPathSeg): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setInitialize(value: org.scalajs.dom.raw.SVGPathSeg => org.scalajs.dom.raw.SVGPathSeg): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertItemBefore(value: (org.scalajs.dom.raw.SVGPathSeg, Double) => org.scalajs.dom.raw.SVGPathSeg): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: Double => org.scalajs.dom.raw.SVGPathSeg): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceItem(value: (org.scalajs.dom.raw.SVGPathSeg, Double) => org.scalajs.dom.raw.SVGPathSeg): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
  
}

