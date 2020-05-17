package typingsSlinky.std

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
  @scala.inline
  implicit class SVGTransformListOps[Self <: org.scalajs.dom.raw.SVGTransformList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendItem(value: org.scalajs.dom.raw.SVGTransform => org.scalajs.dom.raw.SVGTransform): Self = {
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
    def withConsolidate(value: () => org.scalajs.dom.raw.SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGTransformFromMatrix(value: org.scalajs.dom.raw.SVGMatrix => org.scalajs.dom.raw.SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGTransformFromMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => org.scalajs.dom.raw.SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: org.scalajs.dom.raw.SVGTransform => org.scalajs.dom.raw.SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertItemBefore(value: (org.scalajs.dom.raw.SVGTransform, Double) => org.scalajs.dom.raw.SVGTransform): Self = {
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
    def withRemoveItem(value: Double => org.scalajs.dom.raw.SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceItem(value: (org.scalajs.dom.raw.SVGTransform, Double) => org.scalajs.dom.raw.SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

