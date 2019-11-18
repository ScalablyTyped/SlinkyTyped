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
  override val component: String | js.Object = js.constructorOf[typingsSlinky.styledDashComponents.macroMod.StyleSheetManager].asInstanceOf[String | js.Object]
  def apply(
    sheet: ServerStyleSheet = null,
    target: HTMLElement = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.styledDashComponents.macroMod.StyleSheetManager] = {
    val __obj = js.Dynamic.literal()
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StyleSheetManagerProps
}

