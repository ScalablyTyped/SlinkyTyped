package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeySize extends StObject
/** Specifies commonly used RSA algorithm key sizes. This enumeration type can be used in the KeySize property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
@js.native
object KeySize extends StObject {
  
  /** No size is specified. */
  @js.native
  sealed trait invalid extends KeySize
  
  /** The key length is 2048 bits. */
  @js.native
  sealed trait rsa2048 extends KeySize
  
  /** The key length is 4096 bits. */
  @js.native
  sealed trait rsa4096 extends KeySize
}
