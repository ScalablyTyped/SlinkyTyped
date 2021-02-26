package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a signature attached to a signed CMS message. */
@js.native
trait CmsAttachedSignature extends StObject {
  
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  var certificates: IVectorView[Certificate] = js.native
  
  /** Gets the content of the signed CMS message. */
  var content: Double = js.native
  
  /** Gets the list of signers that are used for creating or verifying the signature. */
  var signers: IVectorView[CmsSignerInfo] = js.native
  
  /**
    * Verifies the signature contained in the signed CMS message.
    * @return The result of the signature verification operation.
    */
  def verifySignature(): SignatureValidationResult = js.native
}
object CmsAttachedSignature {
  
  @scala.inline
  def apply(
    certificates: IVectorView[Certificate],
    content: Double,
    signers: IVectorView[CmsSignerInfo],
    verifySignature: () => SignatureValidationResult
  ): CmsAttachedSignature = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], verifySignature = js.Any.fromFunction0(verifySignature))
    __obj.asInstanceOf[CmsAttachedSignature]
  }
  
  @scala.inline
  implicit class CmsAttachedSignatureMutableBuilder[Self <: CmsAttachedSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Double): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigners(value: IVectorView[CmsSignerInfo]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifySignature(value: () => SignatureValidationResult): Self = StObject.set(x, "verifySignature", js.Any.fromFunction0(value))
  }
}
