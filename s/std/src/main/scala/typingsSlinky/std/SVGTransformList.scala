package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGTransformList defines a list of SVGTransform objects. */
@js.native
trait SVGTransformList extends StObject {
  
  def appendItem(newItem: org.scalajs.dom.raw.SVGTransform): org.scalajs.dom.raw.SVGTransform = js.native
  
  def clear(): Unit = js.native
  
  def consolidate(): org.scalajs.dom.raw.SVGTransform = js.native
  
  def createSVGTransformFromMatrix(matrix: org.scalajs.dom.raw.SVGMatrix): org.scalajs.dom.raw.SVGTransform = js.native
  
  def getItem(index: Double): org.scalajs.dom.raw.SVGTransform = js.native
  
  def initialize(newItem: org.scalajs.dom.raw.SVGTransform): org.scalajs.dom.raw.SVGTransform = js.native
  
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGTransform, index: Double): org.scalajs.dom.raw.SVGTransform = js.native
  
  val numberOfItems: Double = js.native
  
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
  ): org.scalajs.dom.raw.SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), consolidate = js.Any.fromFunction0(consolidate), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGTransformList]
  }
  
  @scala.inline
  implicit class SVGTransformListMutableBuilder[Self <: org.scalajs.dom.raw.SVGTransformList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: org.scalajs.dom.raw.SVGTransform => org.scalajs.dom.raw.SVGTransform): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConsolidate(value: () => org.scalajs.dom.raw.SVGTransform): Self = StObject.set(x, "consolidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGTransformFromMatrix(value: org.scalajs.dom.raw.SVGMatrix => org.scalajs.dom.raw.SVGTransform): Self = StObject.set(x, "createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItem(value: Double => org.scalajs.dom.raw.SVGTransform): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: org.scalajs.dom.raw.SVGTransform => org.scalajs.dom.raw.SVGTransform): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (org.scalajs.dom.raw.SVGTransform, Double) => org.scalajs.dom.raw.SVGTransform): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => org.scalajs.dom.raw.SVGTransform): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (org.scalajs.dom.raw.SVGTransform, Double) => org.scalajs.dom.raw.SVGTransform): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
