package typingsSlinky.spectacle.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.spectacle.spectacleMod.CSSProperties
import typingsSlinky.spectacle.spectacleMod.LinkProps
import typingsSlinky.spectacle.spectacleMod.targetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.spectacle.spectacleMod.Link] {
  @JSImport("spectacle", "Link")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, href */
  def apply(
    bgColor: String = null,
    bgDarken: Int | Double = null,
    bgImage: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    caps: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    margin: Double | String = null,
    padding: Double | String = null,
    style: CSSProperties = null,
    target: targetType = null,
    textAlign: String = null,
    textColor: String = null,
    textFont: String = null,
    textSize: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Link] = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (bgDarken != null) __obj.updateDynamic("bgDarken")(bgDarken.asInstanceOf[js.Any])
    if (bgImage != null) __obj.updateDynamic("bgImage")(bgImage.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (!js.isUndefined(caps)) __obj.updateDynamic("caps")(caps.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textFont != null) __obj.updateDynamic("textFont")(textFont.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Link] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.spectacle.spectacleMod.Link](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LinkProps
}

