package typingsSlinky.atStorybookRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachRouter.atReachRouterMod.History
import typingsSlinky.atReachRouter.atReachRouterMod.LocationProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocationProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atStorybookRouter.distRouterMod.LocationProvider] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atStorybookRouter.distRouterMod.LocationProvider].asInstanceOf[String | js.Object]
  def apply(history: History = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atStorybookRouter.distRouterMod.LocationProvider] = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocationProviderProps
}

