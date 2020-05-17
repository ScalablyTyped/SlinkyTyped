package typingsSlinky.x509Js.mod

import typingsSlinky.x509Js.anon.CommonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  var altNames: js.Array[String] = js.native
  var issuer: CommonName = js.native
  var notAfter: String = js.native
  var notBefore: String = js.native
  var ocspList: js.Array[String] = js.native
  var publicExponent: String = js.native
  var publicModulus: String = js.native
  var serial: String = js.native
  var subject: CommonName = js.native
}

object Certificate {
  @scala.inline
  def apply(
    altNames: js.Array[String],
    issuer: CommonName,
    notAfter: String,
    notBefore: String,
    ocspList: js.Array[String],
    publicExponent: String,
    publicModulus: String,
    serial: String,
    subject: CommonName
  ): Certificate = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], ocspList = ocspList.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], publicModulus = publicModulus.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: CommonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcspList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocspList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicExponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicModulus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicModulus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: CommonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

