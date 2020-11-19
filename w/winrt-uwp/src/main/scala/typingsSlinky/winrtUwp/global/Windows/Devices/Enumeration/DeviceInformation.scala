package typingsSlinky.winrtUwp.global.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a device. This class allows access to well-known device properties as well as additional properties specified during device enumeration. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
abstract class DeviceInformation ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
/* static members */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
object DeviceInformation extends js.Object {
  
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID.
    * @param deviceId The device ID.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  def createFromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = js.native
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID and a list of additional properties.
    * @param deviceId A string containing the DeviceInformation ID.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  def createFromIdAsync(deviceId: String, additionalProperties: IIterable[String]): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = js.native
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID, a list of additional properties, and a DeviceInformationKind parameter.
    * @param deviceId A string containing the DeviceInformation ID.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The type of DeviceInformation object you want to create.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  def createFromIdAsync(
    deviceId: String,
    additionalProperties: IIterable[String],
    kind: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = js.native
  
  /**
    * Creates a DeviceWatcher for all devices.
    * @return The created DeviceWatcher .
    */
  def createWatcher(): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @return The created DeviceWatcher .
    */
  def createWatcher(aqsFilter: String): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string and the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return The created DeviceWatcher .
    */
  def createWatcher(aqsFilter: String, additionalProperties: IIterable[String]): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string, the specified collection of properties, and the kind of devices.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The specific types of devices the DeviceWatcher is interested in.
    * @return The created DeviceWatcher .
    */
  def createWatcher(
    aqsFilter: String,
    additionalProperties: IIterable[String],
    kind: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified DeviceClass .
    * @param deviceClass The class of device to enumerate using the DeviceWatcher .
    * @return The created DeviceWatcher .
    */
  def createWatcher(deviceClass: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceClass): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  
  /**
    * Enumerates all DeviceInformation objects.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(aqsFilter: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string and including the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(aqsFilter: String, additionalProperties: IIterable[String]): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string, the device kind, and including the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The specific type of device to find.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(
    aqsFilter: String,
    additionalProperties: IIterable[String],
    kind: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects of the specified class.
    * @param deviceClass The class of devices to enumerate.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(deviceClass: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceClass): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  
  /**
    * Creates a filter to use to enumerate through a subset of device types.
    * @param deviceClass The type of devices that you want to create a filter for.
    * @return The Advanced Query Syntax (AQS) filter used to specifically enumerate through the device type specified by deviceClass.
    */
  def getAqsFilterFromDeviceClass(deviceClass: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceClass): String = js.native
}
