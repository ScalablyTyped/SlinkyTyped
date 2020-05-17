package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events which indicate that a MediaStream has had tracks added to or removed from the stream through calls to Media Stream API methods. These events are sent to the stream when these changes occur. */
@js.native
trait MediaStreamTrackEvent extends Event {
  val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
}

