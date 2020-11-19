package typingsSlinky.sipJs

import typingsSlinky.sipJs.userAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typingsSlinky.sipJs.userAgentCoreDelegateMod.UserAgentCoreDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agent-core", JSImport.Namespace)
@js.native
object userAgentCoreMod extends js.Object {
  
  @js.native
  class UserAgentCore protected ()
    extends typingsSlinky.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore {
    /**
      * Constructor.
      * @param configuration - Configuration.
      * @param delegate - Delegate.
      */
    def this(configuration: UserAgentCoreConfiguration) = this()
    def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
  }
}
