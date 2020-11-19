package typingsSlinky.sipJs.apiMod

import typingsSlinky.sipJs.anon.PartialUserAgentOptions
import typingsSlinky.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "UserAgent")
@js.native
/**
  * Constructs a new instance of the `UserAgent` class.
  * @param options - Options bucket. See {@link UserAgentOptions} for details.
  */
class UserAgent ()
  extends typingsSlinky.sipJs.userAgentMod.UserAgent {
  def this(options: PartialUserAgentOptions) = this()
}
/* static members */
@JSImport("sip.js/lib/api", "UserAgent")
@js.native
object UserAgent extends js.Object {
  
  /** Default user agent options. */
  var defaultOptions: js.Any = js.native
  
  /**
    * Create a URI instance from a string.
    * @param uri - The string to parse.
    *
    * @example
    * ```ts
    * const uri = UserAgent.makeURI("sip:edgar@example.com");
    * ```
    */
  def makeURI(uri: String): js.UndefOr[URI] = js.native
  
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  var stripUndefinedProperties: js.Any = js.native
}
