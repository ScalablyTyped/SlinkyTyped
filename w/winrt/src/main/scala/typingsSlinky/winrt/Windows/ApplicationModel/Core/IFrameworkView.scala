package typingsSlinky.winrt.Windows.ApplicationModel.Core

import typingsSlinky.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFrameworkView extends js.Object {
  def initialize(applicationView: CoreApplicationView): Unit = js.native
  def load(entryPoint: String): Unit = js.native
  def run(): Unit = js.native
  def setWindow(window: CoreWindow): Unit = js.native
  def uninitialize(): Unit = js.native
}

object IFrameworkView {
  @scala.inline
  def apply(
    initialize: CoreApplicationView => Unit,
    load: String => Unit,
    run: () => Unit,
    setWindow: CoreWindow => Unit,
    uninitialize: () => Unit
  ): IFrameworkView = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), load = js.Any.fromFunction1(load), run = js.Any.fromFunction0(run), setWindow = js.Any.fromFunction1(setWindow), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[IFrameworkView]
  }
  @scala.inline
  implicit class IFrameworkViewOps[Self <: IFrameworkView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialize(value: CoreApplicationView => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetWindow(value: CoreWindow => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUninitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninitialize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

