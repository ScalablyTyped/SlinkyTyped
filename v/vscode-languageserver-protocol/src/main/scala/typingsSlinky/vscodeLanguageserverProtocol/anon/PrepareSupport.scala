package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrepareSupport extends js.Object {
  /**
    * Whether rename supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * Client supports testing for validity of rename operations
    * before execution.
    */
  var prepareSupport: js.UndefOr[Boolean] = js.undefined
}

object PrepareSupport {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    prepareSupport: js.UndefOr[Boolean] = js.undefined
  ): PrepareSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prepareSupport)) __obj.updateDynamic("prepareSupport")(prepareSupport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareSupport]
  }
}

