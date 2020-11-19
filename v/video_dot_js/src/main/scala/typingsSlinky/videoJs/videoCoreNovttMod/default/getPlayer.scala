package typingsSlinky.videoJs.videoCoreNovttMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core.novtt", "getPlayer")
@js.native
object getPlayer extends js.Object {
  
  /**
    * Get a single player based on an ID or DOM element.
    *
    * This is useful if you want to check if an element or ID has an associated
    * Video.js player, but not create one if it doesn't.
    *
    * @param id
    *          An HTML element - `<video>`, `<audio>`, or `<video-js>` -
    *          or a string matching the `id` of such an element.
    *
    * @return    A player instance or `undefined` if there is no player instance
    *          matching the argument.
    */
  def apply(id: String): typingsSlinky.videoJs.mod.videojs.Player = js.native
}
