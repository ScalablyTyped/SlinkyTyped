package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** (Applies to Windows Phone only) The details of an ApplicationTrigger . */
@JSGlobal("Windows.ApplicationModel.Background.ApplicationTriggerDetails")
@js.native
abstract class ApplicationTriggerDetails ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerDetails {
  /** The arguments that were passed to the background task using the ApplicationTrigger.RequestAsync(ValueSet) method. */
  /* CompleteClass */
  override var arguments: ValueSet = js.native
}

