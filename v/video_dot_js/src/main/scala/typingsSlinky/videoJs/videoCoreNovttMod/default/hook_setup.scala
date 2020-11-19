package typingsSlinky.videoJs.videoCoreNovttMod.default

import typingsSlinky.videoJs.mod.videojs.Hook.Setup
import typingsSlinky.videoJs.videoJsStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core.novtt", "hook")
@js.native
object hook_setup extends js.Object {
  
  def apply(`type`: setup, fn: js.Array[Setup]): Unit = js.native
  /**
    * Add a function hook to a specific videojs lifecycle.
    *
    * @param type
    *        the lifecycle to hook the function to.
    *
    * @param fn
    *        The function or array of functions to attach.
    */
  def apply(`type`: setup, fn: Setup): Unit = js.native
}
