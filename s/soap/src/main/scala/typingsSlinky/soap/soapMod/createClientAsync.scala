package typingsSlinky.soap.soapMod

import typingsSlinky.bluebird.bluebirdMod.^
import typingsSlinky.soap.libTypesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "createClientAsync")
@js.native
object createClientAsync extends js.Object {
  def apply(url: String): ^[typingsSlinky.soap.libClientMod.Client] = js.native
  def apply(url: String, options: IOptions): ^[typingsSlinky.soap.libClientMod.Client] = js.native
  def apply(url: String, options: IOptions, endpoint: String): ^[typingsSlinky.soap.libClientMod.Client] = js.native
}

