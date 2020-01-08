package typingsSlinky.sipDotJs.libApiMod

import typingsSlinky.sipDotJs.libApiRegistererDashOptionsMod.RegistererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Registerer")
@js.native
class Registerer protected ()
  extends typingsSlinky.sipDotJs.libApiRegistererMod.Registerer {
  /**
    * Constructs a new instance of the `Registerer` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param options - Options bucket. See {@link RegistererOptions} for details.
    */
  def this(userAgent: typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent) = this()
  def this(userAgent: typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent, options: RegistererOptions) = this()
}

/* static members */
@JSImport("sip.js/lib/api", "Registerer")
@js.native
object Registerer extends js.Object {
  /** Default registerer options. */
  val defaultOptions: js.Any = js.native
  var newUUID: js.Any = js.native
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  var stripUndefinedProperties: js.Any = js.native
}

