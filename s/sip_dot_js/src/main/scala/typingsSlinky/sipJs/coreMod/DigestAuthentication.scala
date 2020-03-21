package typingsSlinky.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typingsSlinky.sipJs.messagesMod.DigestAuthentication {
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

