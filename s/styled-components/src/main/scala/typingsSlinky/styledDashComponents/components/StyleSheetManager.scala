package typingsSlinky.styledDashComponents.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ServerStyleSheet
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyleSheetManager
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.styledDashComponents.macroMod.StyleSheetManager] {
  @JSImport("styled-components/macro", "StyleSheetManager")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def Anon_Sheet(sheet: ServerStyleSheet, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.styledDashComponents.macroMod.StyleSheetManager] = {
    val __obj = js.Dynamic.literal(sheet = sheet.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def Anon_Target(target: HTMLElement, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.styledDashComponents.macroMod.StyleSheetManager] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StyleSheetManagerProps
}

