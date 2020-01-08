package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCommentCommentGroupMod.CommentGroupProps
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

object CommentGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    as: js.Any = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    minimal: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null,
    threaded: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(threaded)) __obj.updateDynamic("threaded")(threaded.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CommentGroupProps
}

