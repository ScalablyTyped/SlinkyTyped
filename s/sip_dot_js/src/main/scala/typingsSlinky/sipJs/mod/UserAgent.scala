package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.anon.PartialUserAgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "UserAgent")
@js.native
/**
  * Constructs a new instance of the `UserAgent` class.
  * @param options - Options bucket. See {@link UserAgentOptions} for details.
  */
class UserAgent ()
  extends typingsSlinky.sipJs.apiMod.UserAgent {
  def this(options: PartialUserAgentOptions) = this()
}
/* static members */
object UserAgent {
  
  @JSImport("sip.js", "UserAgent")
  @js.native
  val ^ : js.Any = js.native
  
  /** Default user agent options. */
  @JSImport("sip.js", "UserAgent.defaultOptions")
  @js.native
  def defaultOptions: js.Any = js.native
  @scala.inline
  def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Create a URI instance from a string.
    * @param uri - The string to parse.
    *
    * @example
    * ```ts
    * const uri = UserAgent.makeURI("sip:edgar@example.com");
    * ```
    */
  @JSImport("sip.js", "UserAgent.makeURI")
  @js.native
  def makeURI(uri: String): js.UndefOr[typingsSlinky.sipJs.coreMod.URI] = js.native
  
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  @JSImport("sip.js", "UserAgent.stripUndefinedProperties")
  @js.native
  def stripUndefinedProperties: js.Any = js.native
  @scala.inline
  def stripUndefinedProperties_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
}
