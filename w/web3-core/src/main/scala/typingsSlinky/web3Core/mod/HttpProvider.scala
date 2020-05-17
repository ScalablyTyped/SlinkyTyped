package typingsSlinky.web3Core.mod

import typingsSlinky.web3CoreHelpers.mod.HttpProviderBase
import typingsSlinky.web3CoreHelpers.mod.HttpProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core", "HttpProvider")
@js.native
class HttpProvider protected ()
  extends HttpProviderBase
     with provider {
  def this(host: String) = this()
  def this(host: String, options: HttpProviderOptions) = this()
}

