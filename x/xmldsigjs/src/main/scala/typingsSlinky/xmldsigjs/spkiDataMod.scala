package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spkiDataMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/spki_data", "SPKIData")
  @js.native
  class SPKIData () extends KeyInfoClause {
    def this(properties: js.Object) = this()
    
    @JSName("Key")
    var Key_SPKIData: CryptoKey = js.native
    
    var SPKIexp: js.typedarray.Uint8Array | Null = js.native
  }
}
