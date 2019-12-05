package typingsSlinky.spectacle.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.spectacle.spectacleMod.AnimProps
import typingsSlinky.spectacle.spectacleMod.CSSProperties
import typingsSlinky.spectacle.spectacleMod.easeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Anim
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.spectacle.spectacleMod.Anim] {
  @JSImport("spectacle", "Anim")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    easing: easeType,
    fromStyle: CSSProperties | js.Array[CSSProperties],
    toStyle: CSSProperties | js.Array[CSSProperties],
    transitionDuration: Double,
    onAnim: (/* forwards */ js.UndefOr[Boolean], /* animIndex */ js.UndefOr[Double]) => Unit = null,
    order: Int | Double = null,
    route: js.Object = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Anim] = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any], fromStyle = fromStyle.asInstanceOf[js.Any], toStyle = toStyle.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any])
    if (onAnim != null) __obj.updateDynamic("onAnim")(js.Any.fromFunction2(onAnim))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnimProps
}

