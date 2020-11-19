package typingsSlinky.three

import typingsSlinky.std.ArrayLike
import typingsSlinky.three.anon.Buffer
import typingsSlinky.three.anon.Count
import typingsSlinky.three.constantsMod.Usage
import typingsSlinky.three.interleavedBufferAttributeMod.InterleavedBufferAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/InterleavedBuffer", JSImport.Namespace)
@js.native
object interleavedBufferMod extends js.Object {
  
  @js.native
  class InterleavedBuffer protected () extends js.Object {
    def this(array: ArrayLike[Double], stride: Double) = this()
    
    var array: ArrayLike[Double] = js.native
    
    def clone(data: js.Object): this.type = js.native
    
    def copy(source: InterleavedBuffer): this.type = js.native
    
    def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): InterleavedBuffer = js.native
    
    var count: Double = js.native
    
    var length: Double = js.native
    
    var needsUpdate: Boolean = js.native
    
    def set(value: ArrayLike[Double], index: Double): InterleavedBuffer = js.native
    
    def setUsage(usage: Usage): InterleavedBuffer = js.native
    
    var stride: Double = js.native
    
    def toJSON(data: js.Object): Buffer = js.native
    
    var updateRange: Count = js.native
    
    var usage: Usage = js.native
    
    var uuid: String = js.native
    
    var version: Double = js.native
  }
}
