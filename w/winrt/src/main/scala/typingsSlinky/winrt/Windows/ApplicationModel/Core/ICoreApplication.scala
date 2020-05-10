package typingsSlinky.winrt.Windows.ApplicationModel.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.IGetActivationFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreApplication extends js.Object {
  var id: String = js.native
  var onresuming: js.Any = js.native
  var onsuspending: js.Any = js.native
  var properties: IPropertySet = js.native
  def getCurrentView(): CoreApplicationView = js.native
  def run(viewSource: IFrameworkViewSource): Unit = js.native
  def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit = js.native
}

object ICoreApplication {
  @scala.inline
  def apply(
    getCurrentView: () => CoreApplicationView,
    id: String,
    onresuming: js.Any,
    onsuspending: js.Any,
    properties: IPropertySet,
    run: IFrameworkViewSource => Unit,
    runWithActivationFactories: IGetActivationFactory => Unit
  ): ICoreApplication = {
    val __obj = js.Dynamic.literal(getCurrentView = js.Any.fromFunction0(getCurrentView), id = id.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], run = js.Any.fromFunction1(run), runWithActivationFactories = js.Any.fromFunction1(runWithActivationFactories))
    __obj.asInstanceOf[ICoreApplication]
  }
  @scala.inline
  implicit class ICoreApplicationOps[Self <: ICoreApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCurrentView(value: () => CoreApplicationView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnresuming(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresuming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsuspending(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuspending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: IFrameworkViewSource => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunWithActivationFactories(value: IGetActivationFactory => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runWithActivationFactories")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

