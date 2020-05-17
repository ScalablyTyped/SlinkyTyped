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
    def withAppendItem(value: org.scalajs.dom.raw.SVGPathSeg => org.scalajs.dom.raw.SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => org.scalajs.dom.raw.SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: org.scalajs.dom.raw.SVGPathSeg => org.scalajs.dom.raw.SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertItemBefore(value: (org.scalajs.dom.raw.SVGPathSeg, Double) => org.scalajs.dom.raw.SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertItemBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNumberOfItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveItem(value: Double => org.scalajs.dom.raw.SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceItem(value: (org.scalajs.dom.raw.SVGPathSeg, Double) => org.scalajs.dom.raw.SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

