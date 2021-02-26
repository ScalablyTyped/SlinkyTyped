package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegList extends StObject {
  
  def appendItem(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
  
  def initialize(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg = js.native
  
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
  
  val numberOfItems: Double = js.native
  
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
  ): org.scalajs.dom.raw.SVGPathSegList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGPathSegList]
  }
  
  @scala.inline
  implicit class SVGPathSegListMutableBuilder[Self <: org.scalajs.dom.raw.SVGPathSegList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: org.scalajs.dom.raw.SVGPathSeg => org.scalajs.dom.raw.SVGPathSeg): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => org.scalajs.dom.raw.SVGPathSeg): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: org.scalajs.dom.raw.SVGPathSeg => org.scalajs.dom.raw.SVGPathSeg): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (org.scalajs.dom.raw.SVGPathSeg, Double) => org.scalajs.dom.raw.SVGPathSeg): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => org.scalajs.dom.raw.SVGPathSeg): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (org.scalajs.dom.raw.SVGPathSeg, Double) => org.scalajs.dom.raw.SVGPathSeg): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
