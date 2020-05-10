package typingsSlinky.uifabricUtilities.asAsyncMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsAsyncOptions[TProps] extends js.Object {
  /**
    * Callback when async loading fails.
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Callback executed when async loading is complete.
    */
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback which returns a promise resolving an object which exports the component.
    */
  def load(): js.Promise[ReactElement] = js.native
}

object IAsAsyncOptions {
  @scala.inline
  def apply[TProps](load: () => js.Promise[ReactElement]): IAsAsyncOptions[TProps] = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[IAsAsyncOptions[TProps]]
  }
  @scala.inline
  implicit class IAsAsyncOptionsOps[Self[tprops] <: IAsAsyncOptions[tprops], TProps] (val x: Self[TProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TProps] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TProps] with Other]
    @scala.inline
    def withLoad(value: () => js.Promise[ReactElement]): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
  }
  
}

