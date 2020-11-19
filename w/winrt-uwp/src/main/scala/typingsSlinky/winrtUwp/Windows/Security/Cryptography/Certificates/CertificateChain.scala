package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a certificate chain used for signature verification. */
@js.native
trait CertificateChain extends js.Object {
  
  /**
    * Gets the list of certificates from the certificate chain.
    * @param includeRoot True to include the root certificate in the results; otherwise false.
    * @return The list of certificates from the certificate chain.
    */
  def getCertificates(includeRoot: Boolean): IVectorView[Certificate] = js.native
  
  /**
    * Verifies whether or not the certificate chain is valid.
    * @return The result of the certificate chain verification operation.
    */
  def validate(): ChainValidationResult = js.native
  /**
    * Verifies whether or not the certificate chain is valid using the specified validation parameters.
    * @param parameter The validation parameters to use when verifying the certificate chain.
    * @return The result of the certificate chain verification operation.
    */
  def validate(parameter: ChainValidationParameters): ChainValidationResult = js.native
}
