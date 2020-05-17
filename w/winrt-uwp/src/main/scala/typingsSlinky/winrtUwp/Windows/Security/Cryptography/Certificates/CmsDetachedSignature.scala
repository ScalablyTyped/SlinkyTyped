package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a detached signature for a signed CMS message. */
@js.native
trait CmsDetachedSignature extends js.Object {
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  var certificates: IVectorView[Certificate] = js.native
  /** Gets the list of signers that are used for creating or verifying the signature. */
  var signers: IVectorView[CmsSignerInfo] = js.native
  /**
    * Verifies a signed CMS message against the original streaming input.
    * @param data The original input stream for the signed CMS message.
    * @return An asynchronous operation to retrieve the result of the signature validation operation.
    */
  def verifySignatureAsync(data: IInputStream): IPromiseWithIAsyncOperation[SignatureValidationResult] = js.native
}

object CmsDetachedSignature {
  @scala.inline
  def apply(
    certificates: IVectorView[Certificate],
    signers: IVectorView[CmsSignerInfo],
    verifySignatureAsync: IInputStream => IPromiseWithIAsyncOperation[SignatureValidationResult]
  ): CmsDetachedSignature = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], verifySignatureAsync = js.Any.fromFunction1(verifySignatureAsync))
    __obj.asInstanceOf[CmsDetachedSignature]
  }
  @scala.inline
  implicit class CmsDetachedSignatureOps[Self <: CmsDetachedSignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificates(value: IVectorView[Certificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigners(value: IVectorView[CmsSignerInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifySignatureAsync(value: IInputStream => IPromiseWithIAsyncOperation[SignatureValidationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifySignatureAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

