package typingsSlinky.sinon

import typingsSlinky.sinon.sinonMod.SinonSandbox
import typingsSlinky.sinon.sinonMod.SinonSandboxConfig
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Config extends js.Object {
  /**
    * @deprecated Since 5.0, use `sinon.createSandbox` instead
    */
  def create(): SinonSandbox = js.native
  def create(config: Partial[SinonSandboxConfig]): SinonSandbox = js.native
}

