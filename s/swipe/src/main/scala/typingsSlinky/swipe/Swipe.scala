package typingsSlinky.swipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Swipe extends StObject {
  
  def attachEvents(): Unit = js.native
  
  def getNumSlides(): Double = js.native
  
  def getPos(): Double = js.native
  
  def kill(): Unit = js.native
  
  def next(): Unit = js.native
  
  def prev(): Unit = js.native
  
  def setup(): Unit = js.native
  
  def slide(index: Double, duration: Double): Unit = js.native
}
object Swipe {
  
  @scala.inline
  def apply(
    attachEvents: () => Unit,
    getNumSlides: () => Double,
    getPos: () => Double,
    kill: () => Unit,
    next: () => Unit,
    prev: () => Unit,
    setup: () => Unit,
    slide: (Double, Double) => Unit
  ): Swipe = {
    val __obj = js.Dynamic.literal(attachEvents = js.Any.fromFunction0(attachEvents), getNumSlides = js.Any.fromFunction0(getNumSlides), getPos = js.Any.fromFunction0(getPos), kill = js.Any.fromFunction0(kill), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), setup = js.Any.fromFunction0(setup), slide = js.Any.fromFunction2(slide))
    __obj.asInstanceOf[Swipe]
  }
  
  @scala.inline
  implicit class SwipeMutableBuilder[Self <: Swipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachEvents(value: () => Unit): Self = StObject.set(x, "attachEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumSlides(value: () => Double): Self = StObject.set(x, "getNumSlides", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPos(value: () => Double): Self = StObject.set(x, "getPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKill(value: () => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetup(value: () => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlide(value: (Double, Double) => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction2(value))
  }
}
