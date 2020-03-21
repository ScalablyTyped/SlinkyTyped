package typingsSlinky.soap.mod.security

import typingsSlinky.soap.securityMod.WSSecurity
import typingsSlinky.soap.wssecurityMod.IWSSecurityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security.WSSecurity")
@js.native
class WSSecurityCls protected () extends WSSecurity {
  def this(username: String, password: String) = this()
  def this(username: String, password: String, options: String) = this()
  def this(username: String, password: String, options: IWSSecurityOptions) = this()
}

