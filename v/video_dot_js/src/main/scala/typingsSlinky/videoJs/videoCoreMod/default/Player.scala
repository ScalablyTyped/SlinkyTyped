package typingsSlinky.videoJs.videoCoreMod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.videoJs.mod.VideoJsPlayer
import typingsSlinky.videoJs.mod.videojs.PlayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Player {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js/dist/alt/video.core", "default.Player")
  @js.native
  class ^ protected () extends VideoJsPlayer {
    /**
      * An instance of the `Player` class is created when any of the Video.js setup methods
      * are used to initialize a video.
      *
      * After an instance has been created it can be accessed globally in two ways:
      * 1. By calling `videojs('example_video_1');`
      * 2. By using it directly via  `videojs.players.example_video_1;`
      */
    def this(player: typingsSlinky.videoJs.mod.videojs.Player) = this()
    def this(player: typingsSlinky.videoJs.mod.videojs.Player, options: PlayerOptions) = this()
  }
  
  /**
    * Gets tag settings
    *
    * @param tag
    *        The player tag
    * @check
    * @return An object containing all of the settings
    *         for a player tag
    */
  @JSImport("video.js/dist/alt/video.core", "default.Player.getTagSettings")
  @js.native
  def getTagSettings(tag: Element): js.Any = js.native
}
