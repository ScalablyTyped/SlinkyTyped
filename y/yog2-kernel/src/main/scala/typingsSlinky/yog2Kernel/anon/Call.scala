package typingsSlinky.yog2Kernel.anon

import typingsSlinky.express.anon.Typeofm
import typingsSlinky.expressServeStaticCore.mod.Handler
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(root: String): Handler = js.native
  def apply(root: String, options: ServeStaticOptions): Handler = js.native
  
  var mime: Typeofm = js.native
  
  def serveStatic(root: String): Handler = js.native
  def serveStatic(root: String, options: ServeStaticOptions): Handler = js.native
}
