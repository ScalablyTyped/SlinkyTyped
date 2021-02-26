package typingsSlinky.scrollLock

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-lock", "addFillGapSelector")
  @js.native
  def addFillGapSelector(fillGapSelector: FillGapSelector): Unit = js.native
  
  @JSImport("scroll-lock", "addFillGapTarget")
  @js.native
  def addFillGapTarget(fillGapTarget: FillGapTarget): Unit = js.native
  
  @JSImport("scroll-lock", "addLockableSelector")
  @js.native
  def addLockableSelector(lockableSelector: LockableSelector): Unit = js.native
  
  @JSImport("scroll-lock", "addLockableTarget")
  @js.native
  def addLockableTarget(lockableTarget: LockableTarget): Unit = js.native
  
  @JSImport("scroll-lock", "addScrollableSelector")
  @js.native
  def addScrollableSelector(scrollableSelector: ScrollableSelector): Unit = js.native
  
  @JSImport("scroll-lock", "addScrollableTarget")
  @js.native
  def addScrollableTarget(scrollableTarget: ScrollableTarget): Unit = js.native
  
  @JSImport("scroll-lock", "clearQueueScrollLocks")
  @js.native
  def clearQueueScrollLocks(): Unit = js.native
  
  @JSImport("scroll-lock", "disablePageScroll")
  @js.native
  def disablePageScroll(): Unit = js.native
  @JSImport("scroll-lock", "disablePageScroll")
  @js.native
  def disablePageScroll(scrollableTarget: ScrollableTarget): Unit = js.native
  
  @JSImport("scroll-lock", "enablePageScroll")
  @js.native
  def enablePageScroll(): Unit = js.native
  @JSImport("scroll-lock", "enablePageScroll")
  @js.native
  def enablePageScroll(scrollableTarget: ScrollableTarget): Unit = js.native
  
  @JSImport("scroll-lock", "getCurrentPageScrollBarWidth")
  @js.native
  def getCurrentPageScrollBarWidth(): Double = js.native
  
  @JSImport("scroll-lock", "getPageScrollBarWidth")
  @js.native
  def getPageScrollBarWidth(): Double = js.native
  @JSImport("scroll-lock", "getPageScrollBarWidth")
  @js.native
  def getPageScrollBarWidth(onlyExists: Boolean): Double = js.native
  
  @JSImport("scroll-lock", "getScrollState")
  @js.native
  def getScrollState(): Boolean = js.native
  
  @JSImport("scroll-lock", "refillGaps")
  @js.native
  def refillGaps(): Unit = js.native
  
  @JSImport("scroll-lock", "removeFillGapSelector")
  @js.native
  def removeFillGapSelector(fillGapSelector: FillGapSelector): Unit = js.native
  
  @JSImport("scroll-lock", "removeFillGapTarget")
  @js.native
  def removeFillGapTarget(fillGapTarget: FillGapTarget): Unit = js.native
  
  @JSImport("scroll-lock", "removeScrollableSelector")
  @js.native
  def removeScrollableSelector(scrollableSelector: ScrollableSelector): Unit = js.native
  
  @JSImport("scroll-lock", "removeScrollableTarget")
  @js.native
  def removeScrollableTarget(scrollableTarget: ScrollableTarget): Unit = js.native
  
  @JSImport("scroll-lock", "setFillGapMethod")
  @js.native
  def setFillGapMethod(fillGapMethod: FillGapMethod): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.scrollLock.scrollLockStrings.padding
    - typingsSlinky.scrollLock.scrollLockStrings.margin
    - typingsSlinky.scrollLock.scrollLockStrings.width
    - typingsSlinky.scrollLock.scrollLockStrings.`max-width`
    - typingsSlinky.scrollLock.scrollLockStrings.none
  */
  trait FillGapMethod extends StObject
  object FillGapMethod {
    
    @scala.inline
    def margin: typingsSlinky.scrollLock.scrollLockStrings.margin = "margin".asInstanceOf[typingsSlinky.scrollLock.scrollLockStrings.margin]
    
    @scala.inline
    def `max-width`: typingsSlinky.scrollLock.scrollLockStrings.`max-width` = "max-width".asInstanceOf[typingsSlinky.scrollLock.scrollLockStrings.`max-width`]
    
    @scala.inline
    def none: typingsSlinky.scrollLock.scrollLockStrings.none = "none".asInstanceOf[typingsSlinky.scrollLock.scrollLockStrings.none]
    
    @scala.inline
    def padding: typingsSlinky.scrollLock.scrollLockStrings.padding = "padding".asInstanceOf[typingsSlinky.scrollLock.scrollLockStrings.padding]
    
    @scala.inline
    def width: typingsSlinky.scrollLock.scrollLockStrings.width = "width".asInstanceOf[typingsSlinky.scrollLock.scrollLockStrings.width]
  }
  
  type FillGapSelector = String | js.Array[String]
  
  type FillGapTarget = Element | js.Array[Element] | NodeList
  
  type LockableSelector = String | js.Array[String]
  
  type LockableTarget = Element | js.Array[Element] | NodeList
  
  type ScrollableSelector = String | js.Array[String]
  
  type ScrollableTarget = Element | js.Array[Element] | NodeList
}
