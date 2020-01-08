package typingsSlinky.spectacle.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.spectacle.spectacleMod.CSSProperties
import typingsSlinky.spectacle.spectacleMod.FitProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fit
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.spectacle.spectacleMod.Fit] {
  @JSImport("spectacle", "Fit")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(style: CSSProperties = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Fit] = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Fit] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.spectacle.spectacleMod.Fit](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FitProps
}

