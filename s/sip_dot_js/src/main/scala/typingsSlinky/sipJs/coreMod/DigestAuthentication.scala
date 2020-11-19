package typingsSlinky.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typingsSlinky.sipJs.messagesMod.DigestAuthentication {
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory) = this()
  def this(loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory, ha1: String) = this()
  def this(
    loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory,
    ha1: js.UndefOr[scala.Nothing],
    username: String
  ) = this()
  def this(loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory, ha1: String, username: String) = this()
  def this(
    loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory,
    ha1: js.UndefOr[scala.Nothing],
    username: js.UndefOr[scala.Nothing],
    password: String
  ) = this()
  def this(
    loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory,
    ha1: js.UndefOr[scala.Nothing],
    username: String,
    password: String
  ) = this()
  def this(
    loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory,
    ha1: String,
    username: js.UndefOr[scala.Nothing],
    password: String
  ) = this()
  def this(
    loggerFactory: typingsSlinky.sipJs.logMod.LoggerFactory,
    ha1: String,
    username: String,
    password: String
  ) = this()
}
