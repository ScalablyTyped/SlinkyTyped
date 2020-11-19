package typingsSlinky.vanillaSwipe

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.vanillaSwipe.anon.AbsX
import typingsSlinky.vanillaSwipe.typesMod.ConstructorProps
import typingsSlinky.vanillaSwipe.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vanilla-swipe", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait VanillaSwipe extends js.Object {
    
    def cleanupMouseListeners(): Unit = js.native
    
    def cleanupTouchListeners(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getPosition(e: MouseEvent): AbsX = js.native
    def getPosition(e: TouchEvent): AbsX = js.native
    
    def handleMouseDown(e: MouseEvent): Unit = js.native
    
    def handleMouseLeave(): Unit = js.native
    
    def handleMouseMove(e: MouseEvent): Unit = js.native
    
    def handleMouseUp(e: MouseEvent): Unit = js.native
    
    def handleSwipeEnd(e: js.Any): Unit = js.native
    
    def handleSwipeMove(e: js.Any): Unit = js.native
    
    def handleSwipeStart(e: js.Any): Unit = js.native
    
    def init(): Unit = js.native
    
    var props: ConstructorProps = js.native
    
    def setupMouseListeners(): Unit = js.native
    
    def setupTouchListeners(): Unit = js.native
    
    var state: State = js.native
    
    def update(props: ConstructorProps): Unit = js.native
  }
  
  @js.native
  class default protected () extends VanillaSwipe {
    def this(props: ConstructorProps) = this()
  }
}
