package typingsSlinky.solidReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.solidReact.AnonSubscribe
import typingsSlinky.solidReact.solidReactStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LiveUpdate
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.solidReact.mod.LiveUpdate] {
  @JSImport("@solid/react", "LiveUpdate")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    subscribe: Asterisk | String | js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.solidReact.mod.LiveUpdate] = {
    val __obj = js.Dynamic.literal()
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.solidReact.mod.LiveUpdate] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.solidReact.mod.LiveUpdate](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AnonSubscribe
}

