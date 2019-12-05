package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandDeviceType extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
@js.native
object MobileBroadbandDeviceType extends js.Object {
  @js.native
  sealed trait embedded extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait remote extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait removable extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait unknown extends MobileBroadbandDeviceType
  
  /* 1 */ val embedded: typingsSlinky.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.embedded with Double = js.native
  /* 3 */ val remote: typingsSlinky.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.remote with Double = js.native
  /* 2 */ val removable: typingsSlinky.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.removable with Double = js.native
  /* 0 */ val unknown: typingsSlinky.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandDeviceType with Double] = js.native
}

