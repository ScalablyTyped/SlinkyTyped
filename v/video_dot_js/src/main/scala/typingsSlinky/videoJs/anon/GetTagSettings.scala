package typingsSlinky.videoJs.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Element
import typingsSlinky.videoJs.mod.videojs.Player
import typingsSlinky.videoJs.mod.videojs.PlayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTagSettings
  extends /**
  * An instance of the `Player` class is created when any of the Video.js setup methods
  * are used to initialize a video.
  *
  * After an instance has been created it can be accessed globally in two ways:
  * 1. By calling `videojs('example_video_1');`
  * 2. By using it directly via  `videojs.players.example_video_1;`
  */
Instantiable1[/* player */ Player, Player]
     with Instantiable2[/* player */ Player, /* options */ PlayerOptions, Player] {
  
  /**
    * Gets tag settings
    *
    * @param tag
    *        The player tag
    * @check
    * @return An object containing all of the settings
    *         for a player tag
    */
  def getTagSettings(tag: Element): js.Any = js.native
}
