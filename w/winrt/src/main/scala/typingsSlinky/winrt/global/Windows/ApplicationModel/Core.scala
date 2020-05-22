package typingsSlinky.winrt.global.Windows.ApplicationModel

import typingsSlinky.winrt.Windows.ApplicationModel.Core.IFrameworkViewSource
import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IGetActivationFactory
import typingsSlinky.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Core")
@js.native
object Core extends js.Object {
  @js.native
  class CoreApplication ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Core.CoreApplication
  
  @js.native
  class CoreApplicationView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Core.CoreApplicationView {
    /* CompleteClass */
    override var coreWindow: CoreWindow = js.native
    /* CompleteClass */
    override var isHosted: Boolean = js.native
    /* CompleteClass */
    override var isMain: Boolean = js.native
    /* CompleteClass */
    override var onactivated: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object CoreApplication extends js.Object {
    var id: String = js.native
    var mainView: typingsSlinky.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    var onexiting: js.Any = js.native
    var onresuming: js.Any = js.native
    var onsuspending: js.Any = js.native
    var properties: IPropertySet = js.native
    var views: IVectorView[typingsSlinky.winrt.Windows.ApplicationModel.Core.CoreApplicationView] = js.native
    def createNewView(runtimeType: String, entryPoint: String): typingsSlinky.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    def decrementApplicationUseCount(): Unit = js.native
    def exit(): Unit = js.native
    def getCurrentView(): typingsSlinky.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    def incrementApplicationUseCount(): Unit = js.native
    def run(viewSource: IFrameworkViewSource): Unit = js.native
    def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit = js.native
  }
  
}

