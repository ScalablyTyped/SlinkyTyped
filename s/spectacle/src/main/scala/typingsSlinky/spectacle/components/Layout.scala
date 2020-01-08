package typingsSlinky.spectacle.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.spectacle.spectacleMod.CSSProperties
import typingsSlinky.spectacle.spectacleMod.LayoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layout
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.spectacle.spectacleMod.Layout] {
  @JSImport("spectacle", "Layout")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(style: CSSProperties = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Layout] = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Layout] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.spectacle.spectacleMod.Layout](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LayoutProps
}

