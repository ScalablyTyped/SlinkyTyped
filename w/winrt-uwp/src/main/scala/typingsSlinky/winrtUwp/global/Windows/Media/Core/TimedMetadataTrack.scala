package typingsSlinky.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a timed metadata track. The track contains a list of IMediaCue objects and raises events at the beginning and end of the time window of each cue. */
@JSGlobal("Windows.Media.Core.TimedMetadataTrack")
@js.native
class TimedMetadataTrack protected ()
  extends typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataTrack {
  /**
    * Initializes a new instance of the TimedMetadataTrack class.
    * @param id An identifier for the new timed metadata track.
    * @param language A string indicating the language of the new timed metadata track.
    * @param kind A value indicating the kind of metadata contained in the new track.
    */
  def this(id: String, language: String, kind: typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataKind) = this()
}
