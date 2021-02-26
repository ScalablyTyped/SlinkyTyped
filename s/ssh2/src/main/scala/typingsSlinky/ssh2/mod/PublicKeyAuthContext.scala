package typingsSlinky.ssh2.mod

import typingsSlinky.node.Buffer
import typingsSlinky.ssh2.ssh2Strings.publickey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyAuthContext
  extends AuthContextBase
     with AuthContext {
  
  /** The data used to verify the key, or `undefined` if the client is only checking the validity of the key. */
  var blob: Buffer = js.native
  
  /** The public key sent by the client. */
  var key: PublicKey = js.native
  
  /** The method of authentication. */
  @JSName("method")
  var method_PublicKeyAuthContext: publickey = js.native
  
  /** The signature algorithm, or `undefined` if the client is only checking the validity of the key. */
  var sigAlgo: String = js.native
  
  /** The signature to verify, or `undefined` if the client is only checking the validity of the key. */
  var signature: js.UndefOr[Buffer] = js.native
}
