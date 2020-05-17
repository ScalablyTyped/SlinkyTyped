package typingsSlinky.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines levels of granularity used when retrieving data usage statistics with GetNetworkUsageAsync . */
@JSGlobal("Windows.Networking.Connectivity.DataUsageGranularity")
@js.native
object DataUsageGranularity extends js.Object {
  /* 2 */ val perDay: typingsSlinky.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perDay with Double = js.native
  /* 1 */ val perHour: typingsSlinky.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perHour with Double = js.native
  /* 0 */ val perMinute: typingsSlinky.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perMinute with Double = js.native
  /* 3 */ val total: typingsSlinky.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.total with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity with Double
  ] = js.native
}

