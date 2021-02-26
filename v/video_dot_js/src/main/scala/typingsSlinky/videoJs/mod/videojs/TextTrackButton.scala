package typingsSlinky.videoJs.mod.videojs

import typingsSlinky.videoJs.anon.InstantiableTextTrackMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for buttons that toggle specific text track types (e.g. subtitles)
  */
@js.native
trait TextTrackButton extends MenuButton {
  
  def createItems(items: js.UndefOr[scala.Nothing], TrackMenuItem: InstantiableTextTrackMenuItem): js.Array[TextTrackMenuItem] = js.native
  def createItems(items: js.Array[TextTrackMenuItem]): js.Array[TextTrackMenuItem] = js.native
  def createItems(items: js.Array[TextTrackMenuItem], TrackMenuItem: InstantiableTextTrackMenuItem): js.Array[TextTrackMenuItem] = js.native
}
