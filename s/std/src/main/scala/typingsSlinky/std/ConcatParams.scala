package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatParams extends Algorithm {
  var algorithmId: scala.scalajs.js.typedarray.Uint8Array
  var hash: js.UndefOr[java.lang.String | org.scalajs.dom.crypto.Algorithm] = js.undefined
  var partyUInfo: scala.scalajs.js.typedarray.Uint8Array
  var partyVInfo: scala.scalajs.js.typedarray.Uint8Array
  var privateInfo: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.undefined
  var publicInfo: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.undefined
}

object ConcatParams {
  @scala.inline
  def apply(
    algorithmId: scala.scalajs.js.typedarray.Uint8Array,
    name: java.lang.String,
    partyUInfo: scala.scalajs.js.typedarray.Uint8Array,
    partyVInfo: scala.scalajs.js.typedarray.Uint8Array,
    hash: java.lang.String | org.scalajs.dom.crypto.Algorithm = null,
    privateInfo: scala.scalajs.js.typedarray.Uint8Array = null,
    publicInfo: scala.scalajs.js.typedarray.Uint8Array = null
  ): ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partyUInfo = partyUInfo.asInstanceOf[js.Any], partyVInfo = partyVInfo.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (privateInfo != null) __obj.updateDynamic("privateInfo")(privateInfo.asInstanceOf[js.Any])
    if (publicInfo != null) __obj.updateDynamic("publicInfo")(publicInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatParams]
  }
}

