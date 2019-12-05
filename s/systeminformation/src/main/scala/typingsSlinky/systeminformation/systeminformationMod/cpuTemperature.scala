package typingsSlinky.systeminformation.systeminformationMod

import typingsSlinky.systeminformation.systeminformationMod.Systeminformation.CpuTemperatureData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "cpuTemperature")
@js.native
object cpuTemperature extends js.Object {
  def apply(): js.Promise[CpuTemperatureData] = js.native
  def apply(cb: js.Function1[/* data */ CpuTemperatureData, _]): js.Promise[CpuTemperatureData] = js.native
}

