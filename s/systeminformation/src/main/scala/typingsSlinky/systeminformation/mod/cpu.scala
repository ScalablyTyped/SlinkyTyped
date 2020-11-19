package typingsSlinky.systeminformation.mod

import typingsSlinky.systeminformation.mod.Systeminformation.CpuData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "cpu")
@js.native
object cpu extends js.Object {
  
  def apply(): js.Promise[CpuData] = js.native
  def apply(cb: js.Function1[/* data */ CpuData, _]): js.Promise[CpuData] = js.native
}
