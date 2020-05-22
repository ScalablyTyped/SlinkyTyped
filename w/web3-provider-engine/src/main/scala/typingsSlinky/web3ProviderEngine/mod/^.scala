package typingsSlinky.web3ProviderEngine.mod

import typingsSlinky.ethereumProtocol.mod.JSONRPCErrorCallback
import typingsSlinky.ethereumProtocol.mod.JSONRPCRequestPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-provider-engine", JSImport.Namespace)
@js.native
class ^ () extends Web3ProviderEngine {
  def this(options: Web3ProviderEngineOptions) = this()
  /* CompleteClass */
  override def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): Unit = js.native
}

