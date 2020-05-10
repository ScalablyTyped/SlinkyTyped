package typingsSlinky.xmldsigjs.signedXmlMod

import org.scalajs.dom.crypto.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSign extends js.Object {
  /**
    * Id of Signature
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Public key for KeyInfo block
    *
    * @type {boolean}
    * @memberOf OptionsSign
    */
  var keyValue: js.UndefOr[CryptoKey] = js.native
  /**
    * List of Reference
    * Default is Reference with hash alg SHA-256 and exc-c14n transform
    *
    * @type {OptionsSignReference[]}
    * @memberOf OptionsSign
    */
  var references: js.UndefOr[js.Array[OptionsSignReference]] = js.native
  /**
    * List of X509 Certificates
    *
    * @type {string[]}
    * @memberOf OptionsSign
    */
  var x509: js.UndefOr[js.Array[String]] = js.native
}

object OptionsSign {
  @scala.inline
  def apply(): OptionsSign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSign]
  }
  @scala.inline
  implicit class OptionsSignOps[Self <: OptionsSign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyValue(value: CryptoKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: js.Array[OptionsSignReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.undefined)
        ret
    }
    @scala.inline
    def withX509(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x509")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX509: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x509")(js.undefined)
        ret
    }
  }
  
}

