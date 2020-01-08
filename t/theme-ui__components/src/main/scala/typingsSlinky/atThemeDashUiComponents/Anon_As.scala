package typingsSlinky.atThemeDashUiComponents

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As[T /* <: ReactElement */] extends js.Object {
  /**
    * form control to render, default Input
    */
  var as: js.UndefOr[T] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply[T /* <: ReactElement */](as: T = null): Anon_As[T] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_As[T]]
  }
}

