package typingsSlinky.atStorybookComponents.distTooltipListItemMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends js.Object {
  var LinkWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[TagMod[Any]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var href: js.UndefOr[String | js.Object] = js.undefined
  var left: js.UndefOr[TagMod[Any]] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var right: js.UndefOr[TagMod[Any]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    LinkWrapper: ReactComponentClass[js.Object] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    center: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String | js.Object = null,
    left: TagMod[Any] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null,
    right: TagMod[Any] = null,
    title: TagMod[Any] = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

