package typingsSlinky.testingLibraryReactHooks.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderHookOptions[P] extends js.Object {
  var initialProps: js.UndefOr[P] = js.undefined
  var wrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
}

object RenderHookOptions {
  @scala.inline
  def apply[P](initialProps: P = null, wrapper: ReactComponentClass[js.Object] = null): RenderHookOptions[P] = {
    val __obj = js.Dynamic.literal()
    if (initialProps != null) __obj.updateDynamic("initialProps")(initialProps.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderHookOptions[P]]
  }
}

