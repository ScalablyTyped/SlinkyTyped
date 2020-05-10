package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatParams extends Algorithm {
  var algorithmId: js.typedarray.Uint8Array = js.native
  var hash: js.UndefOr[java.lang.String | org.scalajs.dom.crypto.Algorithm] = js.native
  var partyUInfo: js.typedarray.Uint8Array = js.native
  var partyVInfo: js.typedarray.Uint8Array = js.native
  var privateInfo: js.UndefOr[js.typedarray.Uint8Array] = js.native
  var publicInfo: js.UndefOr[js.typedarray.Uint8Array] = js.native
}

object ConcatParams {
  @scala.inline
  def apply(
    algorithmId: js.typedarray.Uint8Array,
    name: java.lang.String,
    partyUInfo: js.typedarray.Uint8Array,
    partyVInfo: js.typedarray.Uint8Array
  ): ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partyUInfo = partyUInfo.asInstanceOf[js.Any], partyVInfo = partyVInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatParams]
  }
  @scala.inline
  implicit class ConcatParamsOps[Self <: org.scalajs.dom.crypto.ConcatParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartyUInfo(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partyUInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartyVInfo(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partyVInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: java.lang.String | org.scalajs.dom.crypto.Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateInfo(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicInfo(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicInfo")(js.undefined)
        ret
    }
  }
  
}

