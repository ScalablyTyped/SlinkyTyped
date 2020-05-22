package typingsSlinky.winrtUwp.global.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedTextSource::Resolved event. */
@JSGlobal("Windows.Media.Core.TimedTextSourceResolveResultEventArgs")
@js.native
abstract class TimedTextSourceResolveResultEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Core.TimedTextSourceResolveResultEventArgs {
  /** Gets an object representing the asynchronous error that occurred when the TimedTextSource was resolved. */
  /* CompleteClass */
  override var error: typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataTrackError = js.native
  /** Gets the list of TimedMetadataTrack objects resulting from resolving the TimedTextSource . */
  /* CompleteClass */
  override var tracks: IVectorView[typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataTrack] = js.native
}

