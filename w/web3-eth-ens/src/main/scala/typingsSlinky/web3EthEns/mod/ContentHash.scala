package typingsSlinky.web3EthEns.mod

import typingsSlinky.web3EthEns.web3EthEnsStrings.bzz
import typingsSlinky.web3EthEns.web3EthEnsStrings.ipfs
import typingsSlinky.web3EthEns.web3EthEnsStrings.onion
import typingsSlinky.web3EthEns.web3EthEnsStrings.onion3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentHash extends js.Object {
  var decoded: String | Null
  var error: js.UndefOr[js.Error | Null] = js.undefined
  var protocolType: ipfs | bzz | onion | onion3 | Null
}

object ContentHash {
  @scala.inline
  def apply(
    decoded: String = null,
    error: js.UndefOr[Null | js.Error] = js.undefined,
    protocolType: ipfs | bzz | onion | onion3 = null
  ): ContentHash = {
    val __obj = js.Dynamic.literal(decoded = decoded.asInstanceOf[js.Any], protocolType = protocolType.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHash]
  }
}

