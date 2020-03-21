package typingsSlinky.styletronReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.styletronReact.mod.DebugEngine
import typingsSlinky.styletronReact.mod.DevProviderProps
import typingsSlinky.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DevProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.styletronReact.mod.DevProvider] {
  @JSImport("styletron-react", "DevProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    value: StandardEngine,
    debug: DebugEngine = null,
    debugAfterHydration: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.styletronReact.mod.DevProvider] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(debugAfterHydration)) __obj.updateDynamic("debugAfterHydration")(debugAfterHydration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DevProviderProps
}

