package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that occurs in relation to a MediaStream. Two events of this type can be thrown: addstream and removestream. */
@js.native
trait MediaStreamEvent extends Event {
  val stream: org.scalajs.dom.experimental.mediastream.MediaStream | Null = js.native
}

