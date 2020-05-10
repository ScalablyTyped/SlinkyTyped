package typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod

import typingsSlinky.tensorflowTfjsLayers.logsMod.Logs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomCallbackArgs extends js.Object {
  var onBatchBegin: js.UndefOr[
    js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.native
  var onBatchEnd: js.UndefOr[
    js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.native
  var onEpochBegin: js.UndefOr[
    js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.native
  var onEpochEnd: js.UndefOr[
    js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.native
  var onTrainBegin: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.native
  var onTrainEnd: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.native
  var onYield: js.UndefOr[
    js.Function3[/* epoch */ Double, /* batch */ Double, /* logs */ Logs, Unit | js.Promise[Unit]]
  ] = js.native
}

object CustomCallbackArgs {
  @scala.inline
  def apply(): CustomCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomCallbackArgs]
  }
  @scala.inline
  implicit class CustomCallbackArgsOps[Self <: CustomCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnBatchBegin(value: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBatchBegin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBatchBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBatchBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBatchEnd(value: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBatchEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBatchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBatchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEpochBegin(value: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEpochBegin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEpochBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEpochBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEpochEnd(value: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEpochEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEpochEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEpochEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTrainBegin(value: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrainBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTrainBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrainBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTrainEnd(value: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrainEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTrainEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrainEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnYield(value: (/* epoch */ Double, /* batch */ Double, /* logs */ Logs) => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYield")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnYield: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYield")(js.undefined)
        ret
    }
  }
  
}

