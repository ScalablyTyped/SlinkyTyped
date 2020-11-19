package typingsSlinky.xmlrpc.mod

import typingsSlinky.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmlrpc", "createSecureServer")
@js.native
object createSecureServer extends js.Object {
  
  def apply(options: String): Server = js.native
  def apply(options: String, callback: js.Function0[Unit]): Server = js.native
  def apply(options: TlsOptions): Server = js.native
  def apply(options: TlsOptions, callback: js.Function0[Unit]): Server = js.native
}
