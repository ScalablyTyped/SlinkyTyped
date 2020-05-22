package typingsSlinky.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monotype extends js.Object {
  var projectId: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Monotype {
  @scala.inline
  def apply(projectId: String = null, version: js.UndefOr[Double] = js.undefined): Monotype = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monotype]
  }
}

