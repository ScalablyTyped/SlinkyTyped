package typingsSlinky.storybookReadme.mod

import slinky.core.facade.ReactElement
import typingsSlinky.storybookReadme.AnonChildrenElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomComponents extends js.Object {
  var FooterComponent: js.UndefOr[js.Function1[/* props */ AnonChildrenElement, ReactElement]] = js.undefined
  var PreviewComponent: js.UndefOr[js.Function1[/* props */ AnonChildrenElement, ReactElement]] = js.undefined
}

object CustomComponents {
  @scala.inline
  def apply(
    FooterComponent: /* props */ AnonChildrenElement => ReactElement = null,
    PreviewComponent: /* props */ AnonChildrenElement => ReactElement = null
  ): CustomComponents = {
    val __obj = js.Dynamic.literal()
    if (FooterComponent != null) __obj.updateDynamic("FooterComponent")(js.Any.fromFunction1(FooterComponent))
    if (PreviewComponent != null) __obj.updateDynamic("PreviewComponent")(js.Any.fromFunction1(PreviewComponent))
    __obj.asInstanceOf[CustomComponents]
  }
}

