package typingsSlinky.atStorybookComponents.distTabsTabsMod

import slinky.core.TagMod
import typingsSlinky.atStorybookComponents.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
  var actions: js.UndefOr[Anon_Id] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
  var tools: js.UndefOr[TagMod[Any]] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    actions: Anon_Id = null,
    backgroundColor: String = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    id: String = null,
    selected: String = null,
    tools: TagMod[Any] = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

