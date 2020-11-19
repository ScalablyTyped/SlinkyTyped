package typingsSlinky.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies commonly used RSA algorithm key sizes. This enumeration type can be used in the KeySize property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
@js.native
object KeySize extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize with Double
  ] = js.native
  
  /* 0 */ val invalid: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.invalid with Double = js.native
  
  /* 1 */ val rsa2048: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.rsa2048 with Double = js.native
  
  /* 2 */ val rsa4096: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.rsa4096 with Double = js.native
}
