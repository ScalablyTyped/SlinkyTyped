package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkEncryptionType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
@js.native
object NetworkEncryptionType extends js.Object {
  @js.native
  sealed trait ccmp extends NetworkEncryptionType
  
  @js.native
  sealed trait ihv extends NetworkEncryptionType
  
  @js.native
  sealed trait none extends NetworkEncryptionType
  
  @js.native
  sealed trait rsnUseGroup extends NetworkEncryptionType
  
  @js.native
  sealed trait tkip extends NetworkEncryptionType
  
  @js.native
  sealed trait unknown extends NetworkEncryptionType
  
  @js.native
  sealed trait wep extends NetworkEncryptionType
  
  @js.native
  sealed trait wep104 extends NetworkEncryptionType
  
  @js.native
  sealed trait wep40 extends NetworkEncryptionType
  
  @js.native
  sealed trait wpaUseGroup extends NetworkEncryptionType
  
  /* 6 */ val ccmp: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ccmp with Double = js.native
  /* 9 */ val ihv: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ihv with Double = js.native
  /* 0 */ val none: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.none with Double = js.native
  /* 8 */ val rsnUseGroup: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.rsnUseGroup with Double = js.native
  /* 5 */ val tkip: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.tkip with Double = js.native
  /* 1 */ val unknown: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.unknown with Double = js.native
  /* 2 */ val wep: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep with Double = js.native
  /* 4 */ val wep104: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep104 with Double = js.native
  /* 3 */ val wep40: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep40 with Double = js.native
  /* 7 */ val wpaUseGroup: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wpaUseGroup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkEncryptionType with Double] = js.native
}

