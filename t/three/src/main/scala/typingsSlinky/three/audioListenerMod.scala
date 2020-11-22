package typingsSlinky.three

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.GainNode
import typingsSlinky.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/audio/AudioListener", JSImport.Namespace)
@js.native
object audioListenerMod extends js.Object {
  
  @js.native
  class AudioListener () extends Object3D {
    
    var context: AudioContext = js.native
    
    /**
    	 * @default null
    	 */
    var filter: Null | js.Any = js.native
    
    var gain: GainNode = js.native
    
    def getFilter(): js.Any = js.native
    
    def getInput(): GainNode = js.native
    
    def getMasterVolume(): Double = js.native
    
    def removeFilter(): this.type = js.native
    
    def setFilter(value: js.Any): this.type = js.native
    
    def setMasterVolume(value: Double): this.type = js.native
    
    /**
    	 * @default 0
    	 */
    var timeDelta: Double = js.native
    
    @JSName("type")
    var type_AudioListener: typingsSlinky.three.threeStrings.AudioListener = js.native
  }
}
