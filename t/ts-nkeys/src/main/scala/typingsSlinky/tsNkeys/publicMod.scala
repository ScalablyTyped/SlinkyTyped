package typingsSlinky.tsNkeys

import typingsSlinky.node.Buffer
import typingsSlinky.tsNkeys.mod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicMod {
  
  @JSImport("ts-nkeys/lib/public", "PublicKey")
  @js.native
  class PublicKey protected () extends KeyPair {
    def this(publicKey: Buffer) = this()
    
    var publicKey: Buffer = js.native
  }
}
