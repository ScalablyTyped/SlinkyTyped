package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSFIDOCredentialAssertion extends MSAssertion {
  val algorithm: java.lang.String | org.scalajs.dom.crypto.Algorithm = js.native
  val attestation: js.Any = js.native
  val publicKey: java.lang.String = js.native
  val transportHints: js.Array[MSTransportType] = js.native
}

object MSFIDOCredentialAssertion {
  @scala.inline
  def apply(
    algorithm: java.lang.String | org.scalajs.dom.crypto.Algorithm,
    attestation: js.Any,
    id: java.lang.String,
    publicKey: java.lang.String,
    transportHints: js.Array[MSTransportType],
    `type`: MSCredentialType
  ): MSFIDOCredentialAssertion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], attestation = attestation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], transportHints = transportHints.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOCredentialAssertion]
  }
  @scala.inline
  implicit class MSFIDOCredentialAssertionOps[Self <: MSFIDOCredentialAssertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithm(value: java.lang.String | org.scalajs.dom.crypto.Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttestation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportHints(value: js.Array[MSTransportType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportHints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

