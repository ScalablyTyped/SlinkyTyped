package typingsSlinky.uifabricUtilities

import slinky.core.ReactComponentClass
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.sinon.mod.SinonSpy
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricUtilities.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
  @JSImport("@uifabric/utilities/lib/test", "create")
  @js.native
  def create(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof defaultCreate> is not an array type */ args: Parameters[FnCall]
  ): ReturnType[FnCall] = js.native
  
  @JSImport("@uifabric/utilities/lib/test", "injectWrapperMethod")
  @js.native
  def injectWrapperMethod(
    wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]],
    methodName: String,
    fn: js.Function0[Unit]
  ): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/test", "setRenderSpy")
  @js.native
  def setRenderSpy(wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]]): SinonSpy[js.Array[_], _] = js.native
}
