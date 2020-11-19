package typingsSlinky.winrtUwp.Windows.Networking.XboxLive

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.anon.Buffer
import typingsSlinky.winrtUwp.winrtUwpStrings.snapshotchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveDeviceAddress extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_snapshotchanged(`type`: snapshotchanged, listener: TypedEventHandler[XboxLiveDeviceAddress, _]): Unit = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param otherDeviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def compare(otherDeviceAddress: XboxLiveDeviceAddress): Double = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getSnapshotAsBase64(): String = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getSnapshotAsBuffer(): IBuffer = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getSnapshotAsBytes(): Buffer = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isLocal: Boolean = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isValid: Boolean = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var networkAccessKind: XboxLiveNetworkAccessKind = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  def onsnapshotchanged(ev: js.Any with WinRTEvent[XboxLiveDeviceAddress]): Unit = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSName("onsnapshotchanged")
  var onsnapshotchanged_Original: TypedEventHandler[XboxLiveDeviceAddress, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_snapshotchanged(`type`: snapshotchanged, listener: TypedEventHandler[XboxLiveDeviceAddress, _]): Unit = js.native
}
