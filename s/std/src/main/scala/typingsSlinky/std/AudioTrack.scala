package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single audio track from one of the HTML media elements, <audio> or <video>.  */
@js.native
trait AudioTrack extends js.Object {
  var enabled: scala.Boolean = js.native
  val id: java.lang.String = js.native
  var kind: java.lang.String = js.native
  val label: java.lang.String = js.native
  var language: java.lang.String = js.native
  val sourceBuffer: SourceBuffer | Null = js.native
}

@JSGlobal("AudioTrack")
@js.native
object AudioTrack
  extends Instantiable0[org.scalajs.dom.raw.AudioTrack]

