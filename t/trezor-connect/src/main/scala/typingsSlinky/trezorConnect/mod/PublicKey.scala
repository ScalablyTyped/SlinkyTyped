package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
   // optional for segwit accounts: xpub in segwit format
  var chainCode: String = js.native
   // BIP32 serialization format
  var childNum: Double = js.native
   // BIP32 serialization format
  var depth: Double = js.native
   // BIP32 serialization format
  var fingerprint: Double = js.native
  var path: js.Array[Double] = js.native
   // BIP32 serialization format
  var publicKey: String = js.native
   // hardended path
  var serializedPath: String = js.native
   // serialized path
  var xpub: String = js.native
   // xpub in legacy format
  var xpubSegwit: js.UndefOr[String] = js.native
}

object PublicKey {
  @scala.inline
  def apply(
    chainCode: String,
    childNum: Double,
    depth: Double,
    fingerprint: Double,
    path: js.Array[Double],
    publicKey: String,
    serializedPath: String,
    xpub: String
  ): PublicKey = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNum = childNum.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChainCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializedPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializedPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXpub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXpubSegwit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpubSegwit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpubSegwit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpubSegwit")(js.undefined)
        ret
    }
  }
  
}

