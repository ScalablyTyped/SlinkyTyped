package typingsSlinky.atUifabricUtilities.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.libDelayedRenderMod.IDelayedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DelayedRender
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atUifabricUtilities.libDelayedRenderMod.DelayedRender] {
  @JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(delay: Int | Double = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atUifabricUtilities.libDelayedRenderMod.DelayedRender] = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDelayedRenderProps
}

