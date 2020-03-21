package typingsSlinky.styledComponents.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.styledComponents.styledComponentsMod.ServerStyleSheet
import typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManagerProps
import typingsSlinky.styledComponents.styledComponentsMod.StylisPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyleSheetManager
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManager] {
  @JSImport("styled-components", "StyleSheetManager")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    disableCSSOMInjection: js.UndefOr[Boolean] = js.undefined,
    disableVendorPrefixes: js.UndefOr[Boolean] = js.undefined,
    sheet: ServerStyleSheet = null,
    stylisPlugins: js.Array[StylisPlugin] = null,
    target: HTMLElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManager] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCSSOMInjection)) __obj.updateDynamic("disableCSSOMInjection")(disableCSSOMInjection.asInstanceOf[js.Any])
    if (!js.isUndefined(disableVendorPrefixes)) __obj.updateDynamic("disableVendorPrefixes")(disableVendorPrefixes.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    if (stylisPlugins != null) __obj.updateDynamic("stylisPlugins")(stylisPlugins.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManager] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManager](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StyleSheetManagerProps
}

