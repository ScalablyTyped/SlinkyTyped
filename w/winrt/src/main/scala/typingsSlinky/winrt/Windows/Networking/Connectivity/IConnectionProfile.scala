package typingsSlinky.winrt.Windows.Networking.Connectivity

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionProfile extends js.Object {
  var networkAdapter: NetworkAdapter = js.native
  var networkSecuritySettings: NetworkSecuritySettings = js.native
  var profileName: String = js.native
  def getConnectionCost(): ConnectionCost = js.native
  def getDataPlanStatus(): DataPlanStatus = js.native
  def getLocalUsage(StartTime: js.Date, EndTime: js.Date): DataUsage = js.native
  def getLocalUsage(StartTime: js.Date, EndTime: js.Date, States: RoamingStates): DataUsage = js.native
  def getNetworkConnectivityLevel(): NetworkConnectivityLevel = js.native
  def getNetworkNames(): IVectorView[String] = js.native
  def getSignalBars(): IReference[Double] = js.native
}

