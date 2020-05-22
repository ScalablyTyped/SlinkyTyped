package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProvider extends js.Object {
  /**
    * Capabilities specific to the colorProvider
    */
  var colorProvider: js.UndefOr[DynamicRegistration] = js.undefined
}

object ColorProvider {
  @scala.inline
  def apply(colorProvider: DynamicRegistration = null): ColorProvider = {
    val __obj = js.Dynamic.literal()
    if (colorProvider != null) __obj.updateDynamic("colorProvider")(colorProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProvider]
  }
}

