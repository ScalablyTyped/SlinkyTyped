package typingsSlinky.slimerjs

import typingsSlinky.slimerjs.slimerjsStrings.fs
import typingsSlinky.slimerjs.slimerjsStrings.system
import typingsSlinky.slimerjs.slimerjsStrings.webpage
import typingsSlinky.slimerjs.slimerjsStrings.webserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var phantom: Phantom = js.native
  
  def require(module: js.Any): js.Any = js.native
  @JSName("require")
  def require_fs(module: fs): FsModule = js.native
  @JSName("require")
  def require_system(module: system): SystemModule = js.native
  @JSName("require")
  def require_webpage(module: webpage): WebPageModule = js.native
  @JSName("require")
  def require_webserver(module: webserver): WebServerModule = js.native
  
  var slimer: Slimer = js.native
}
