package typingsSlinky.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackCueList
  extends /* index */ NumberDictionary[org.scalajs.dom.raw.TextTrackCue] {
  
  /**
    * Returns the first text track cue (in text track cue order) with text track cue identifier id.
    * 
    * Returns null if none of the cues have the given identifier or if the argument is the empty string.
    */
  def getCueById(id: java.lang.String): org.scalajs.dom.raw.TextTrackCue | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.TextTrackCue]] = js.native
  
  /**
    * Returns the number of cues in the list.
    */
  val length: Double = js.native
}
