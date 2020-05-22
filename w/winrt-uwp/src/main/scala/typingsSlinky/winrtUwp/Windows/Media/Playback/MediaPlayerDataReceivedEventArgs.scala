package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MessageReceivedFromBackground and MessageReceivedFromForeground events. */
trait MediaPlayerDataReceivedEventArgs extends js.Object {
  /** Gets the data from the MessageReceivedFromBackground or MessageReceivedFromForeground event. */
  var data: IMap[String, String]
}

object MediaPlayerDataReceivedEventArgs {
  @scala.inline
  def apply(data: IMap[String, String]): MediaPlayerDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerDataReceivedEventArgs]
  }
}

