package typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsBreadcrumbBreadcrumbMod

import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsBreadcrumbBreadcrumbSectionMod.BreadcrumbSectionProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.big
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictBreadcrumbProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content of the Breadcrumb.Divider. */
  var divider: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** For use with the sections prop. Render as an `Icon` component with `divider` class instead of a `div` in
    *  Breadcrumb.Divider.
    */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  /** Shorthand array of props for Breadcrumb.Section. */
  var sections: js.UndefOr[SemanticShorthandCollection[BreadcrumbSectionProps]] = js.undefined
  /** Size of Breadcrumb */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
}

object StrictBreadcrumbProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    divider: SemanticShorthandContent = null,
    icon: SemanticShorthandItem[IconProps] = null,
    sections: SemanticShorthandCollection[BreadcrumbSectionProps] = null,
    size: mini | tiny | small | large | big | huge | massive = null
  ): StrictBreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictBreadcrumbProps]
  }
}

