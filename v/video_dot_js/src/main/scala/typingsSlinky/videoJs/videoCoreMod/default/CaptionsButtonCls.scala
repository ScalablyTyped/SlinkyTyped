package typingsSlinky.videoJs.videoCoreMod.default

import typingsSlinky.videoJs.mod.videojs.Component.ReadyCallback
import typingsSlinky.videoJs.mod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "CaptionsButton")
@js.native
class CaptionsButtonCls protected ()
  extends typingsSlinky.videoJs.mod.videojs.CaptionsButton {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [ready]
    *        The function to call when this function is ready.
    */
  def this(player: typingsSlinky.videoJs.mod.videojs.Player) = this()
  def this(player: typingsSlinky.videoJs.mod.videojs.Player, options: TrackButtonOptions) = this()
  def this(
    player: typingsSlinky.videoJs.mod.videojs.Player,
    options: TrackButtonOptions,
    ready: ReadyCallback
  ) = this()
}

