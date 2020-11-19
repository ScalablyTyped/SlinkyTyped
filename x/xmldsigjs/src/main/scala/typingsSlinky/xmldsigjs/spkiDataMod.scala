package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/key_infos/spki_data", JSImport.Namespace)
@js.native
object spkiDataMod extends js.Object {
  
  @js.native
  class SPKIData () extends KeyInfoClause {
    
    @JSName("Key")
    var Key_SPKIData: CryptoKey = js.native
    
    var SPKIexp: js.typedarray.Uint8Array | Null = js.native
  }
}
