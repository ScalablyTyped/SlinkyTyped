package typingsSlinky.sipDotJs.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typingsSlinky.sipDotJs.libCoreMessagesMod.DigestAuthentication {
  def this(loggerFactory: typingsSlinky.sipDotJs.libCoreLogMod.LoggerFactory) = this()
  def this(loggerFactory: typingsSlinky.sipDotJs.libCoreLogMod.LoggerFactory, username: String) = this()
  def this(
    loggerFactory: typingsSlinky.sipDotJs.libCoreLogMod.LoggerFactory,
    username: js.UndefOr[scala.Nothing],
    password: String
  ) = this()
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(
    loggerFactory: typingsSlinky.sipDotJs.libCoreLogMod.LoggerFactory,
    username: String,
    password: String
  ) = this()
}

