package typingsSlinky.atUifabricUtilities

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncPlaceholder extends js.Object {
  var asyncPlaceholder: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object Anon_AsyncPlaceholder {
  @scala.inline
  def apply(asyncPlaceholder: ReactComponentClass[_] = null): Anon_AsyncPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (asyncPlaceholder != null) __obj.updateDynamic("asyncPlaceholder")(asyncPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsyncPlaceholder]
  }
}

