package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result of the request to trigger a background task. The RequestAsync method returns a value of this enumeration type. */
@JSGlobal("Windows.ApplicationModel.Background.ApplicationTriggerResult")
@js.native
object ApplicationTriggerResult extends js.Object {
  /* 0 */ val allowed: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.allowed with Double = js.native
  /* 1 */ val currentlyRunning: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.currentlyRunning with Double = js.native
  /* 2 */ val disabledByPolicy: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.disabledByPolicy with Double = js.native
  /* 3 */ val unknownError: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.unknownError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult with Double
  ] = js.native
}

