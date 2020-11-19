package typingsSlinky.videoJs.mod.videojs

import typingsSlinky.videoJs.mod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Toggle fullscreen video
  */
@js.native
trait FullscreenToggle extends Button {
  
  /**
    * Handles fullscreenchange on the player and change control text accordingly.
    *
    * @param [event]
    *        The {@link Player#fullscreenchange} event that caused this function to be
    *        called.
    *
    * @listens Player#fullscreenchange
    */
  def handleFullscreenChange(event: Event): Unit = js.native
}
