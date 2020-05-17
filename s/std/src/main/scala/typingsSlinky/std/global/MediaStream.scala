package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStream")
@js.native
class MediaStream ()
  extends typingsSlinky.std.MediaStream {
  def this(stream: org.scalajs.dom.experimental.mediastream.MediaStream) = this()
  def this(tracks: js.Array[org.scalajs.dom.experimental.mediastream.MediaStreamTrack]) = this()
}

@JSGlobal("MediaStream")
@js.native
object MediaStream
  extends Instantiable0[org.scalajs.dom.experimental.mediastream.MediaStream]
     with Instantiable1[
      (/* tracks */ js.Array[org.scalajs.dom.experimental.mediastream.MediaStreamTrack]) | (/* stream */ org.scalajs.dom.experimental.mediastream.MediaStream), 
      org.scalajs.dom.experimental.mediastream.MediaStream
    ]

