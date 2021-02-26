package typingsSlinky.videoJs.mod.videojs

import typingsSlinky.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An {@link AudioTrack} {@link MenuItem}
  */
@js.native
trait AudioTrackMenuItem extends MenuItem {
  
  /**
    * Handle any {@link AudioTrack} change.
    *
    * @param [event]
    *        The {@link AudioTrackList#change} event that caused this to run.
    *
    * @listens AudioTrackList#change
    */
  def handleTracksChange(event: Event): Unit = js.native
}
