package typingsSlinky.winrt.global.Windows.System

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Profile")
@js.native
object Profile extends js.Object {
  @js.native
  class HardwareIdentification ()
    extends typingsSlinky.winrt.Windows.System.Profile.HardwareIdentification
  
  @js.native
  class HardwareToken ()
    extends typingsSlinky.winrt.Windows.System.Profile.HardwareToken
  
  /* static members */
  @js.native
  object HardwareIdentification extends js.Object {
    def getPackageSpecificToken(nonce: IBuffer): typingsSlinky.winrt.Windows.System.Profile.HardwareToken = js.native
  }
  
}

