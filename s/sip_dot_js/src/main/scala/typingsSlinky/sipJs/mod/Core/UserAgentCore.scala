package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.userAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typingsSlinky.sipJs.userAgentCoreDelegateMod.UserAgentCoreDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.UserAgentCore")
@js.native
class UserAgentCore protected ()
  extends typingsSlinky.sipJs.coreMod.UserAgentCore {
  /**
    * Constructor.
    * @param configuration - Configuration.
    * @param delegate - Delegate.
    */
  def this(configuration: UserAgentCoreConfiguration) = this()
  def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
}

