package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/key_infos/key_info_clause", JSImport.Namespace)
@js.native
object keyInfoClauseMod extends js.Object {
  
  @js.native
  abstract class KeyInfoClause () extends XmlObject {
    
    var Key: CryptoKey | Null = js.native
    
    def exportKey(alg: Algorithm): js.Promise[CryptoKey] = js.native
    
    def importKey(key: CryptoKey): js.Promise[this.type] = js.native
  }
}
