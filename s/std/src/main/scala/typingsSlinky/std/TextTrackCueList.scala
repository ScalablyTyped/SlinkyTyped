package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackCueList
  extends /* index */ NumberDictionary[org.scalajs.dom.raw.TextTrackCue] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.TextTrackCue]] = js.native
  val length: Double = js.native
  def getCueById(id: java.lang.String): org.scalajs.dom.raw.TextTrackCue = js.native
  def item(index: Double): org.scalajs.dom.raw.TextTrackCue = js.native
}

@JSGlobal("TextTrackCueList")
@js.native
object TextTrackCueList
  extends Instantiable0[org.scalajs.dom.raw.TextTrackCueList]

