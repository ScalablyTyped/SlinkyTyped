package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import typingsSlinky.useSidecar.typesMod.MediumCallback
import typingsSlinky.useSidecar.typesMod.removeCb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium> */
trait ReadonlySideCarMedium extends js.Object {
  val assignMedium: js.Function1[/* handler */ MediumCallback[ReactComponentClass[js.Object]], Unit]
  val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ReactComponentClass[js.Object]], Unit]
  val options: js.UndefOr[js.Object] = js.undefined
  val read: js.Function0[js.UndefOr[ReactComponentClass[js.Object]]]
  val useMedium: js.Function1[/* effect */ ReactComponentClass[js.Object], removeCb]
}

object ReadonlySideCarMedium {
  @scala.inline
  def apply(
    assignMedium: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit,
    assignSyncMedium: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit,
    read: () => js.UndefOr[ReactComponentClass[js.Object]],
    useMedium: /* effect */ ReactComponentClass[js.Object] => removeCb,
    options: js.Object = null
  ): ReadonlySideCarMedium = {
    val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySideCarMedium]
  }
}

