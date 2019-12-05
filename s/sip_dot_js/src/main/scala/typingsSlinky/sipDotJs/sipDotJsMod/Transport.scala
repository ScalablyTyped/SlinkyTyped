package typingsSlinky.sipDotJs.sipDotJsMod

import typingsSlinky.sipDotJs.libCoreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Transport")
@js.native
abstract class Transport protected ()
  extends typingsSlinky.sipDotJs.libTransportMod.Transport {
  /**
    * Constructor
    * @param logger - Logger.
    * @param options - Options bucket. Deprecated.
    */
  def this(logger: Logger) = this()
  def this(logger: Logger, options: js.Any) = this()
}

