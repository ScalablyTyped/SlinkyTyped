package typingsSlinky.trezorDashConnect.trezorDashConnectMod

import typingsSlinky.trezorDashConnect.trezorDashConnectStrings.opreturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpReturnOutput extends Output {
  var dataHex: String
  var `type`: opreturn
}

object OpReturnOutput {
  @scala.inline
  def apply(dataHex: String, `type`: opreturn): OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpReturnOutput]
  }
}

