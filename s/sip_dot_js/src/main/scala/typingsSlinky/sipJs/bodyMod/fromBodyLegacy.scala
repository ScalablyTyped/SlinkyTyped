package typingsSlinky.sipJs.bodyMod

import typingsSlinky.sipJs.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/body", "fromBodyLegacy")
@js.native
object fromBodyLegacy extends js.Object {
  def apply(bodyLegacy: String): Body = js.native
  def apply(bodyLegacy: AnonBody): Body = js.native
}

