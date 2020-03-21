package typingsSlinky.uifabricUtilities.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.uifabricUtilities.ReadonlyICustomizerContex
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.customizationsMod.ISettings
import typingsSlinky.uifabricUtilities.customizationsMod.ISettingsFunction
import typingsSlinky.uifabricUtilities.customizerContextMod.ICustomizerContext
import typingsSlinky.uifabricUtilities.customizerTypesMod.ICustomizerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Customizer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.uifabricUtilities.mod.Customizer] {
  @JSImport("@uifabric/utilities", "Customizer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    componentRef: IRefObject[_] = null,
    contextTransform: /* context */ ReadonlyICustomizerContex => ICustomizerContext = null,
    scopedSettings: ISettings | ISettingsFunction = null,
    settings: ISettings | ISettingsFunction = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.uifabricUtilities.mod.Customizer] = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextTransform != null) __obj.updateDynamic("contextTransform")(js.Any.fromFunction1(contextTransform))
    if (scopedSettings != null) __obj.updateDynamic("scopedSettings")(scopedSettings.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.uifabricUtilities.mod.Customizer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.uifabricUtilities.mod.Customizer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ICustomizerProps
}

