package typingsSlinky.sipJs

import typingsSlinky.sipJs.userAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typingsSlinky.sipJs.userAgentCoreDelegateMod.UserAgentCoreDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentCoreMod {
  
  @JSImport("sip.js/lib/core/user-agent-core", "UserAgentCore")
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
