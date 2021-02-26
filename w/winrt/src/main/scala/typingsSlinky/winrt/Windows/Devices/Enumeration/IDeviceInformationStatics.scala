package typingsSlinky.winrt.Windows.Devices.Enumeration

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceInformationStatics extends StObject {
  
  def createFromIdAsync(id: String): IAsyncOperation[DeviceInformation] = js.native
  def createFromIdAsync(id: String, additionalProperties: IIterable[String]): IAsyncOperation[DeviceInformation] = js.native
  
  def createWatcher(): DeviceWatcher = js.native
  def createWatcher(aqsFilter: String): DeviceWatcher = js.native
  def createWatcher(aqsFilter: String, additionalProperties: IIterable[String]): DeviceWatcher = js.native
  def createWatcher(deviceClass: DeviceClass): DeviceWatcher = js.native
  
  def findAllAsync(): IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(aqsFilter: String): IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(aqsFilter: String, additionalProperties: IIterable[String]): IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(deviceClass: DeviceClass): IAsyncOperation[DeviceInformationCollection] = js.native
}
