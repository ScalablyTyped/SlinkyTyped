package typingsSlinky.atUifabricUtilities

import slinky.core.ReactComponentClass
import typingsSlinky.enzyme.enzymeMod.ReactWrapper
import typingsSlinky.sinon.sinonMod.SinonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/test", JSImport.Namespace)
@js.native
object libTestMod extends js.Object {
  def injectWrapperMethod(
    wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]],
    methodName: String,
    fn: js.Function0[Unit]
  ): Unit = js.native
  def setRenderSpy(wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]]): SinonSpy = js.native
}

