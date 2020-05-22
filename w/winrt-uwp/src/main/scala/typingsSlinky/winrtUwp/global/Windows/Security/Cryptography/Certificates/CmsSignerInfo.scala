package typingsSlinky.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents signer information for a signed CMS message which contains a set of properties. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsSignerInfo")
@js.native
/** Creates a new instance of the CmsSignerInfo class. */
class CmsSignerInfo ()
  extends typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo {
  /** Gets or sets the signer certificate that is used to sign the message. */
  /* CompleteClass */
  override var certificate: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate = js.native
  /** Gets or sets the hash algorithm that is used to sign the CMS message. */
  /* CompleteClass */
  override var hashAlgorithmName: String = js.native
  /** Gets the RFC3161 unauthenticated timestamp information. */
  /* CompleteClass */
  override var timestampInfo: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.CmsTimestampInfo = js.native
}

