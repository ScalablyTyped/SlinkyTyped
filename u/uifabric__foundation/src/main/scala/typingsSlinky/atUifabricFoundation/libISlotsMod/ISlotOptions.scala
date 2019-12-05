package typingsSlinky.atUifabricFoundation.libISlotsMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.reactMod.PropsWithChildren
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlotOptions[TProps] extends js.Object {
  var component: js.UndefOr[ReactElement] = js.undefined
  var render: js.UndefOr[ISlotRender[TProps]] = js.undefined
}

object ISlotOptions {
  @scala.inline
  def apply[TProps](
    component: ReactElement = null,
    render: (/* props */ PropsWithChildren[TProps], /* defaultComponent */ ReactComponentClass[TProps]) => ReturnType[ReactComponentClass[TProps]] = null
  ): ISlotOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    __obj.asInstanceOf[ISlotOptions[TProps]]
  }
}

