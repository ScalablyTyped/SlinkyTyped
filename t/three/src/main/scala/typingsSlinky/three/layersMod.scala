package typingsSlinky.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layersMod {
  
  @JSImport("three/src/core/Layers", "Layers")
  @js.native
  class Layers () extends StObject {
    
    def disable(channel: Double): Unit = js.native
    
    def disableAll(): Unit = js.native
    
    def enable(channel: Double): Unit = js.native
    
    def enableAll(): Unit = js.native
    
    /**
    	 * @default 1 | 0
    	 */
    var mask: Double = js.native
    
    def set(channel: Double): Unit = js.native
    
    def test(layers: Layers): Boolean = js.native
    
    def toggle(channel: Double): Unit = js.native
  }
}
