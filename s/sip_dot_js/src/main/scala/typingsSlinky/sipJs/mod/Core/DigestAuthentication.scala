package typingsSlinky.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typingsSlinky.sipJs.coreMod.DigestAuthentication {
  def this(loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory) = this()
  def this(loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory, username: String) = this()
  def this(
    loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory,
    username: js.UndefOr[scala.Nothing],
    password: String
  ) = this()
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory, username: String, password: String) = this()
}

