package typingsSlinky.atStorybookComponents.distBadgeBadgeMod

import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.critical
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.negative
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.neutral
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.positive
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var status: positive | negative | neutral | warning | critical
}

object BadgeProps {
  @scala.inline
  def apply(status: positive | negative | neutral | warning | critical): BadgeProps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadgeProps]
  }
}

