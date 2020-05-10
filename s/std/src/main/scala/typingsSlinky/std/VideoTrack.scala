package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single video track from a <video> element. */
@js.native
trait VideoTrack extends js.Object {
  val id: java.lang.String = js.native
  var kind: java.lang.String = js.native
  val label: java.lang.String = js.native
  var language: java.lang.String = js.native
  var selected: scala.Boolean = js.native
  val sourceBuffer: SourceBuffer | Null = js.native
}

@JSGlobal("VideoTrack")
@js.native
object VideoTrack extends Instantiable0[VideoTrack]

