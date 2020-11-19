package typingsSlinky.web3ProvidersHttp.mod

import typingsSlinky.web3CoreHelpers.mod.HttpProviderBase
import typingsSlinky.web3CoreHelpers.mod.JsonRpcResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-providers-http", "HttpProvider")
@js.native
class HttpProvider () extends HttpProviderBase {
  def this(host: String) = this()
  def this(host: js.UndefOr[scala.Nothing], options: HttpProviderOptions) = this()
  def this(host: String, options: HttpProviderOptions) = this()
  
  var agent: js.UndefOr[HttpProviderAgent] = js.native
  
  var headers: js.UndefOr[js.Array[HttpHeader]] = js.native
  
  def send(payload: js.Object): Unit = js.native
  def send(
    payload: js.Object,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  
  var timeout: Double = js.native
  
  var withCredentials: Boolean = js.native
}
