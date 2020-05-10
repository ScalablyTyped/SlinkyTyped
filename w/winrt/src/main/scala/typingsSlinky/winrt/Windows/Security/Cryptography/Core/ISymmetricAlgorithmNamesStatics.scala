package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISymmetricAlgorithmNamesStatics extends js.Object {
  var aesCbc: String = js.native
  var aesCbcPkcs7: String = js.native
  var aesCcm: String = js.native
  var aesEcb: String = js.native
  var aesEcbPkcs7: String = js.native
  var aesGcm: String = js.native
  var desCbc: String = js.native
  var desCbcPkcs7: String = js.native
  var desEcb: String = js.native
  var desEcbPkcs7: String = js.native
  var rc2Cbc: String = js.native
  var rc2CbcPkcs7: String = js.native
  var rc2Ecb: String = js.native
  var rc2EcbPkcs7: String = js.native
  var rc4: String = js.native
  var tripleDesCbc: String = js.native
  var tripleDesCbcPkcs7: String = js.native
  var tripleDesEcb: String = js.native
  var tripleDesEcbPkcs7: String = js.native
}

object ISymmetricAlgorithmNamesStatics {
  @scala.inline
  def apply(
    aesCbc: String,
    aesCbcPkcs7: String,
    aesCcm: String,
    aesEcb: String,
    aesEcbPkcs7: String,
    aesGcm: String,
    desCbc: String,
    desCbcPkcs7: String,
    desEcb: String,
    desEcbPkcs7: String,
    rc2Cbc: String,
    rc2CbcPkcs7: String,
    rc2Ecb: String,
    rc2EcbPkcs7: String,
    rc4: String,
    tripleDesCbc: String,
    tripleDesCbcPkcs7: String,
    tripleDesEcb: String,
    tripleDesEcbPkcs7: String
  ): ISymmetricAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal(aesCbc = aesCbc.asInstanceOf[js.Any], aesCbcPkcs7 = aesCbcPkcs7.asInstanceOf[js.Any], aesCcm = aesCcm.asInstanceOf[js.Any], aesEcb = aesEcb.asInstanceOf[js.Any], aesEcbPkcs7 = aesEcbPkcs7.asInstanceOf[js.Any], aesGcm = aesGcm.asInstanceOf[js.Any], desCbc = desCbc.asInstanceOf[js.Any], desCbcPkcs7 = desCbcPkcs7.asInstanceOf[js.Any], desEcb = desEcb.asInstanceOf[js.Any], desEcbPkcs7 = desEcbPkcs7.asInstanceOf[js.Any], rc2Cbc = rc2Cbc.asInstanceOf[js.Any], rc2CbcPkcs7 = rc2CbcPkcs7.asInstanceOf[js.Any], rc2Ecb = rc2Ecb.asInstanceOf[js.Any], rc2EcbPkcs7 = rc2EcbPkcs7.asInstanceOf[js.Any], rc4 = rc4.asInstanceOf[js.Any], tripleDesCbc = tripleDesCbc.asInstanceOf[js.Any], tripleDesCbcPkcs7 = tripleDesCbcPkcs7.asInstanceOf[js.Any], tripleDesEcb = tripleDesEcb.asInstanceOf[js.Any], tripleDesEcbPkcs7 = tripleDesEcbPkcs7.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISymmetricAlgorithmNamesStatics]
  }
  @scala.inline
  implicit class ISymmetricAlgorithmNamesStaticsOps[Self <: ISymmetricAlgorithmNamesStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAesCbc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aesCbc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAesCbcPkcs7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aesCbcPkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAesCcm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aesCcm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAesEcb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aesEcb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAesEcbPkcs7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aesEcbPkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAesGcm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aesGcm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesCbc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desCbc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesCbcPkcs7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desCbcPkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesEcb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desEcb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesEcbPkcs7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desEcbPkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRc2Cbc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rc2Cbc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRc2CbcPkcs7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rc2CbcPkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRc2Ecb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rc2Ecb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRc2EcbPkcs7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rc2EcbPkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRc4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rc4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTripleDesCbc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripleDesCbc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTripleDesCbcPkcs7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripleDesCbcPkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTripleDesEcb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripleDesEcb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTripleDesEcbPkcs7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripleDesEcbPkcs7")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

