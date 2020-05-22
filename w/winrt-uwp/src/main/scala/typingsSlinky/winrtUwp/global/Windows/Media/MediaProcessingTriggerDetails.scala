package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a media processing background task access to the set of arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
@JSGlobal("Windows.Media.MediaProcessingTriggerDetails")
@js.native
abstract class MediaProcessingTriggerDetails ()
  extends typingsSlinky.winrtUwp.Windows.Media.MediaProcessingTriggerDetails {
  /** Gets a value set containing the arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
  /* CompleteClass */
  override var arguments: ValueSet = js.native
}

