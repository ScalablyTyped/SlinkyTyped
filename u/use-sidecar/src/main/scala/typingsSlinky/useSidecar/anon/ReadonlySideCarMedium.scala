package typingsSlinky.useSidecar.anon

import slinky.core.ReactComponentClass
import typingsSlinky.useSidecar.typesMod.MediumCallback
import typingsSlinky.useSidecar.typesMod.removeCb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium> */
@js.native
trait ReadonlySideCarMedium extends js.Object {
  val assignMedium: js.Function1[/* handler */ MediumCallback[ReactComponentClass[js.Object]], Unit] = js.native
  val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ReactComponentClass[js.Object]], Unit] = js.native
  val options: js.UndefOr[js.Object] = js.native
  val read: js.Function0[js.UndefOr[ReactComponentClass[js.Object]]] = js.native
  val useMedium: js.Function1[/* effect */ ReactComponentClass[js.Object], removeCb] = js.native
}

object ReadonlySideCarMedium {
  @scala.inline
  def apply(
    assignMedium: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit,
    assignSyncMedium: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit,
    read: () => js.UndefOr[ReactComponentClass[js.Object]],
    useMedium: /* effect */ ReactComponentClass[js.Object] => removeCb
  ): ReadonlySideCarMedium = {
    val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
    __obj.asInstanceOf[ReadonlySideCarMedium]
  }
  @scala.inline
  implicit class ReadonlySideCarMediumOps[Self <: ReadonlySideCarMedium] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignMedium(value: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignMedium")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAssignSyncMedium(value: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignSyncMedium")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: () => js.UndefOr[ReactComponentClass[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseMedium(value: /* effect */ ReactComponentClass[js.Object] => removeCb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMedium")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

