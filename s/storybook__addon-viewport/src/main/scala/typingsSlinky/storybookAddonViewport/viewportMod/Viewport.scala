package typingsSlinky.storybookAddonViewport.viewportMod

import typingsSlinky.storybookAddonViewport.storybookAddonViewportStrings.desktop
import typingsSlinky.storybookAddonViewport.storybookAddonViewportStrings.mobile
import typingsSlinky.storybookAddonViewport.storybookAddonViewportStrings.other
import typingsSlinky.storybookAddonViewport.storybookAddonViewportStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var name: String
  var styles: Styles
  var `type`: desktop | mobile | tablet | other
}

object Viewport {
  @scala.inline
  def apply(
    name: String,
    `type`: desktop | mobile | tablet | other,
    default: js.UndefOr[Boolean] = js.undefined,
    styles: Styles = null
  ): Viewport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}

