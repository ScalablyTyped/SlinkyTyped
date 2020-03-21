package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.clientContextMod.ClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ClientContext")
@js.native
class ClientContext protected ()
  extends typingsSlinky.sipJs.clientContextMod.ClientContext {
  def this(ua: typingsSlinky.sipJs.uAMod.UA, method: String, target: String) = this()
  def this(ua: typingsSlinky.sipJs.uAMod.UA, method: String, target: typingsSlinky.sipJs.coreMod.URI) = this()
  def this(ua: typingsSlinky.sipJs.uAMod.UA, method: String, target: String, options: Options) = this()
  def this(
    ua: typingsSlinky.sipJs.uAMod.UA,
    method: String,
    target: typingsSlinky.sipJs.coreMod.URI,
    options: Options
  ) = this()
}

/* static members */
@JSImport("sip.js", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(
    objToConstruct: typingsSlinky.sipJs.clientContextMod.ClientContext,
    ua: typingsSlinky.sipJs.uAMod.UA,
    method: String,
    originalTarget: String
  ): Unit = js.native
  def initializer(
    objToConstruct: typingsSlinky.sipJs.clientContextMod.ClientContext,
    ua: typingsSlinky.sipJs.uAMod.UA,
    method: String,
    originalTarget: String,
    options: Options
  ): Unit = js.native
  def initializer(
    objToConstruct: typingsSlinky.sipJs.clientContextMod.ClientContext,
    ua: typingsSlinky.sipJs.uAMod.UA,
    method: String,
    originalTarget: typingsSlinky.sipJs.coreMod.URI
  ): Unit = js.native
  def initializer(
    objToConstruct: typingsSlinky.sipJs.clientContextMod.ClientContext,
    ua: typingsSlinky.sipJs.uAMod.UA,
    method: String,
    originalTarget: typingsSlinky.sipJs.coreMod.URI,
    options: Options
  ): Unit = js.native
}

