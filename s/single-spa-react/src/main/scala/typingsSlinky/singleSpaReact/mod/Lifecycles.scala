package typingsSlinky.singleSpaReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lifecycles extends js.Object {
  var update: js.UndefOr[js.Function1[/* props */ js.Any, js.Promise[Unit]]] = js.native
  def bootstrap(props: js.Any): js.Promise[Unit] = js.native
  def mount(props: js.Any): js.Promise[Unit] = js.native
  def unmount(props: js.Any): js.Promise[Unit] = js.native
}

object Lifecycles {
  @scala.inline
  def apply(
    bootstrap: js.Any => js.Promise[Unit],
    mount: js.Any => js.Promise[Unit],
    unmount: js.Any => js.Promise[Unit]
  ): Lifecycles = {
    val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap), mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount))
    __obj.asInstanceOf[Lifecycles]
  }
  @scala.inline
  implicit class LifecyclesOps[Self <: Lifecycles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrap(value: js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMount(value: js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnmount(value: js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: /* props */ js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

