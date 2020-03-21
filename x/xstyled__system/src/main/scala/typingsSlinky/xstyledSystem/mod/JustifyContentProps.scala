package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.JustifyContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifyContentProps extends js.Object {
  val justifyContent: js.UndefOr[ResponsiveValue[JustifyContentProperty]] = js.undefined
}

object JustifyContentProps {
  @scala.inline
  def apply(justifyContent: ResponsiveValue[JustifyContentProperty] = null): JustifyContentProps = {
    val __obj = js.Dynamic.literal()
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifyContentProps]
  }
}

