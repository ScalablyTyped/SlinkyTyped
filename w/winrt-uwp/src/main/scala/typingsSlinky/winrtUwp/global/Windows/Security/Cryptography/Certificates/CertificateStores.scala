package typingsSlinky.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of certificate stores. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
@js.native
abstract class CertificateStores ()
  extends typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStores
/* static members */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
@js.native
object CertificateStores extends js.Object {
  
  /**
    * Get all certificates from the certificate stores.
    * @return An asynchronous operation to retrieve the list of certificates.
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Get all certificates from the certificate stores that match the specified query parameters.
    * @param query The certificate values to search for.
    * @return An asynchronous operation to retrieve the list of certificates.
    */
  def findAllAsync(query: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateQuery): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets a certificate store from the collection of certificate stores by name.
    * @param storeName The name of the certificate store to return. The storeName parameter value cannot be "MY".
    * @return The requested certificate store.
    */
  def getStoreByName(storeName: String): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
  
  /** Gets the certificate store of intermediate certification authorities for an app. */
  var intermediateCertificationAuthorities: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
  
  /** Gets the certificate store of trusted root certificates for an app. */
  var trustedRootCertificationAuthorities: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
}
