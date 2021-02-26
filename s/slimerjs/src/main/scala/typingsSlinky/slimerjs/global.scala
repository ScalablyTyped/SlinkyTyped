package typingsSlinky.slimerjs

import typingsSlinky.slimerjs.slimerjsStrings.fs
import typingsSlinky.slimerjs.slimerjsStrings.system
import typingsSlinky.slimerjs.slimerjsStrings.webpage
import typingsSlinky.slimerjs.slimerjsStrings.webserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("phantom")
  @js.native
  def phantom: Phantom = js.native
  @scala.inline
  def phantom_=(x: Phantom): Unit = js.Dynamic.global.updateDynamic("phantom")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require(module: js.Any): js.Any = js.native
  @JSGlobal("require")
  @js.native
  def require_fs(module: fs): FsModule = js.native
  @JSGlobal("require")
  @js.native
  def require_system(module: system): SystemModule = js.native
  @JSGlobal("require")
  @js.native
  def require_webpage(module: webpage): WebPageModule = js.native
  @JSGlobal("require")
  @js.native
  def require_webserver(module: webserver): WebServerModule = js.native
  
  @JSGlobal("slimer")
  @js.native
  def slimer: Slimer = js.native
  @scala.inline
  def slimer_=(x: Slimer): Unit = js.Dynamic.global.updateDynamic("slimer")(x.asInstanceOf[js.Any])
}
