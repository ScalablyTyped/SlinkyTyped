package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsymmetricAlgorithmNamesStatics extends js.Object {
  var dsaSha1: String = js.native
  var dsaSha256: String = js.native
  var ecdsaP256Sha256: String = js.native
  var ecdsaP384Sha384: String = js.native
  var ecdsaP521Sha512: String = js.native
  var rsaOaepSha1: String = js.native
  var rsaOaepSha256: String = js.native
  var rsaOaepSha384: String = js.native
  var rsaOaepSha512: String = js.native
  var rsaPkcs1: String = js.native
  var rsaSignPkcs1Sha1: String = js.native
  var rsaSignPkcs1Sha256: String = js.native
  var rsaSignPkcs1Sha384: String = js.native
  var rsaSignPkcs1Sha512: String = js.native
  var rsaSignPssSha1: String = js.native
  var rsaSignPssSha256: String = js.native
  var rsaSignPssSha384: String = js.native
  var rsaSignPssSha512: String = js.native
}

object IAsymmetricAlgorithmNamesStatics {
  @scala.inline
  def apply(
    dsaSha1: String,
    dsaSha256: String,
    ecdsaP256Sha256: String,
    ecdsaP384Sha384: String,
    ecdsaP521Sha512: String,
    rsaOaepSha1: String,
    rsaOaepSha256: String,
    rsaOaepSha384: String,
    rsaOaepSha512: String,
    rsaPkcs1: String,
    rsaSignPkcs1Sha1: String,
    rsaSignPkcs1Sha256: String,
    rsaSignPkcs1Sha384: String,
    rsaSignPkcs1Sha512: String,
    rsaSignPssSha1: String,
    rsaSignPssSha256: String,
    rsaSignPssSha384: String,
    rsaSignPssSha512: String
  ): IAsymmetricAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal(dsaSha1 = dsaSha1.asInstanceOf[js.Any], dsaSha256 = dsaSha256.asInstanceOf[js.Any], ecdsaP256Sha256 = ecdsaP256Sha256.asInstanceOf[js.Any], ecdsaP384Sha384 = ecdsaP384Sha384.asInstanceOf[js.Any], ecdsaP521Sha512 = ecdsaP521Sha512.asInstanceOf[js.Any], rsaOaepSha1 = rsaOaepSha1.asInstanceOf[js.Any], rsaOaepSha256 = rsaOaepSha256.asInstanceOf[js.Any], rsaOaepSha384 = rsaOaepSha384.asInstanceOf[js.Any], rsaOaepSha512 = rsaOaepSha512.asInstanceOf[js.Any], rsaPkcs1 = rsaPkcs1.asInstanceOf[js.Any], rsaSignPkcs1Sha1 = rsaSignPkcs1Sha1.asInstanceOf[js.Any], rsaSignPkcs1Sha256 = rsaSignPkcs1Sha256.asInstanceOf[js.Any], rsaSignPkcs1Sha384 = rsaSignPkcs1Sha384.asInstanceOf[js.Any], rsaSignPkcs1Sha512 = rsaSignPkcs1Sha512.asInstanceOf[js.Any], rsaSignPssSha1 = rsaSignPssSha1.asInstanceOf[js.Any], rsaSignPssSha256 = rsaSignPssSha256.asInstanceOf[js.Any], rsaSignPssSha384 = rsaSignPssSha384.asInstanceOf[js.Any], rsaSignPssSha512 = rsaSignPssSha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsymmetricAlgorithmNamesStatics]
  }
  @scala.inline
  implicit class IAsymmetricAlgorithmNamesStaticsOps[Self <: IAsymmetricAlgorithmNamesStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDsaSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsaSha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDsaSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsaSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEcdsaP256Sha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP256Sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEcdsaP384Sha384(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP384Sha384")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEcdsaP521Sha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP521Sha512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaOaepSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaOaepSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaOaepSha384(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha384")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaOaepSha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaPkcs1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaPkcs1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaSignPkcs1Sha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaSignPkcs1Sha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaSignPkcs1Sha384(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha384")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaSignPkcs1Sha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaSignPssSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaSignPssSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaSignPssSha384(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha384")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsaSignPssSha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha512")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

