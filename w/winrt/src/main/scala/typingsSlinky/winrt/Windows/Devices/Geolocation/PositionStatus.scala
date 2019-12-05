package typingsSlinky.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionStatus extends js.Object

@JSGlobal("Windows.Devices.Geolocation.PositionStatus")
@js.native
object PositionStatus extends js.Object {
  @js.native
  sealed trait disabled extends PositionStatus
  
  @js.native
  sealed trait initializing extends PositionStatus
  
  @js.native
  sealed trait noData extends PositionStatus
  
  @js.native
  sealed trait notAvailable extends PositionStatus
  
  @js.native
  sealed trait notInitialized extends PositionStatus
  
  @js.native
  sealed trait ready extends PositionStatus
  
  /* 3 */ val disabled: typingsSlinky.winrt.Windows.Devices.Geolocation.PositionStatus.disabled with Double = js.native
  /* 1 */ val initializing: typingsSlinky.winrt.Windows.Devices.Geolocation.PositionStatus.initializing with Double = js.native
  /* 2 */ val noData: typingsSlinky.winrt.Windows.Devices.Geolocation.PositionStatus.noData with Double = js.native
  /* 5 */ val notAvailable: typingsSlinky.winrt.Windows.Devices.Geolocation.PositionStatus.notAvailable with Double = js.native
  /* 4 */ val notInitialized: typingsSlinky.winrt.Windows.Devices.Geolocation.PositionStatus.notInitialized with Double = js.native
  /* 0 */ val ready: typingsSlinky.winrt.Windows.Devices.Geolocation.PositionStatus.ready with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionStatus with Double] = js.native
}

