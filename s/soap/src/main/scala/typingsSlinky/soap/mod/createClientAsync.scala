package typingsSlinky.soap.mod

import typingsSlinky.bluebird.mod.^
import typingsSlinky.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "createClientAsync")
@js.native
object createClientAsync extends js.Object {
  def apply(url: String): ^[typingsSlinky.soap.clientMod.Client] = js.native
  def apply(url: String, options: IOptions): ^[typingsSlinky.soap.clientMod.Client] = js.native
  def apply(url: String, options: IOptions, endpoint: String): ^[typingsSlinky.soap.clientMod.Client] = js.native
}

