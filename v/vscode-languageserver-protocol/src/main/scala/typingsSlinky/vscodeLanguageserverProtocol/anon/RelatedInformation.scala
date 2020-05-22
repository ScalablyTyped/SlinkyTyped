package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedInformation extends js.Object {
  /**
    * Whether the clients accepts diagnostics with related information.
    */
  var relatedInformation: js.UndefOr[Boolean] = js.undefined
}

object RelatedInformation {
  @scala.inline
  def apply(relatedInformation: js.UndefOr[Boolean] = js.undefined): RelatedInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relatedInformation)) __obj.updateDynamic("relatedInformation")(relatedInformation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedInformation]
  }
}

