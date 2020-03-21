package typingsSlinky.web3EthContract.mod

import typingsSlinky.std.Error
import typingsSlinky.web3Core.mod.PromiEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContractSendMethod extends js.Object {
  def encodeABI(): String = js.native
  def estimateGas(): js.Promise[Double] = js.native
  def estimateGas(callback: js.Function2[/* err */ Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
  def estimateGas(options: EstimateGasOptions): js.Promise[Double] = js.native
  def estimateGas(options: EstimateGasOptions, callback: js.Function2[/* err */ js.Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
  def send(options: SendOptions): PromiEvent[Contract] = js.native
  def send(
    options: SendOptions,
    callback: js.Function2[/* err */ js.Error, /* transactionHash */ String, Unit]
  ): PromiEvent[Contract] = js.native
}

