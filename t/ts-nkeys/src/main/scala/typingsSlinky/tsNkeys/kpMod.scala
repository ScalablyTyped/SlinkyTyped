package typingsSlinky.tsNkeys

import typingsSlinky.node.Buffer
import typingsSlinky.tsNkeys.mod.KeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-nkeys/lib/kp", JSImport.Namespace)
@js.native
object kpMod extends js.Object {
  
  @js.native
  class KP protected () extends KeyPair {
    def this(seed: Buffer) = this()
    
    def getRawSeed(): Buffer = js.native
    
    var seed: Buffer = js.native
  }
}
