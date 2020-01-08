package typingsSlinky.spectacle.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.spectacle.spectacleMod.AppearProps
import typingsSlinky.spectacle.spectacleMod.CSSProperties
import typingsSlinky.spectacle.spectacleMod.easeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Appear
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.spectacle.spectacleMod.Appear] {
  @JSImport("spectacle", "Appear")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    easing: easeType = null,
    endValue: js.Object = null,
    fid: String = null,
    order: Int | Double = null,
    startValue: js.Object = null,
    style: CSSProperties = null,
    transitionDuration: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Appear] = {
    val __obj = js.Dynamic.literal()
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (fid != null) __obj.updateDynamic("fid")(fid.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Appear] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.spectacle.spectacleMod.Appear](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AppearProps
}

