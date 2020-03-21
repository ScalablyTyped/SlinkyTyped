package typingsSlinky.storybookComponents.badgeMod

import typingsSlinky.storybookComponents.storybookComponentsStrings.critical
import typingsSlinky.storybookComponents.storybookComponentsStrings.negative
import typingsSlinky.storybookComponents.storybookComponentsStrings.neutral
import typingsSlinky.storybookComponents.storybookComponentsStrings.positive
import typingsSlinky.storybookComponents.storybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeProps extends js.Object {
  var status: positive | negative | neutral | warning | critical = js.native
}

object BadgeProps {
  @scala.inline
  def apply(status: positive | negative | neutral | warning | critical): BadgeProps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadgeProps]
  }
}

