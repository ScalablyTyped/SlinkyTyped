package typingsSlinky.winrtUwp.global.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for enumerating a collection of Pnp device objects, and event handlers for monitoring changes to the objects in the collection asynchronously. */
@JSGlobal("Windows.Devices.Enumeration.Pnp")
@js.native
object Pnp extends js.Object {
  
  /** Represents a PnP object. This class allows access to well-known properties of a PnP object as well as a property store of additional properties that are specified to be retrieved from the the PnP object. */
  @js.native
  abstract class PnpObject ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObject
  /* static members */
  @js.native
  object PnpObject extends js.Object {
    
    /**
      * Creates a PnpObject object asynchronously from a previously saved DeviceInformation ID.
      * @param type The type of the PnpObject .
      * @param id The string value identifying the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject object to create. For more info on what the properties represent, see Device information properties.
      * @return The PnpObject created from the previously saved DeviceInformation ID.
      */
    def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObject] = js.native
    
    /**
      * Returns a PnpObjectWatcher object that is used to enumerate the PnP objects in the collection using events.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @return A PnpObjectWatcher object used to enumerate the collection by registering event notification delegates and by issuing start and stop event notifications.
      */
    def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = js.native
    /**
      * Returns a PnpObjectWatcher object that is used to enumerate a filtered collection of PnP objects using events.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @param aqsFilter An AQS string that filters the PnP objects that will be returned. Typically, this string is retrieved from the GetDeviceSelector method of a class that interacts with devices.
      * @return A PnpObjectWatcher object used to enumerate the collection by registering event notification delegates and by issuing start and stop event notifications.
      */
    def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = js.native
    
    /**
      * Returns all of the PnP objects of a specified type that match the specified criteria.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @return An object that represents the asynchronous operation.
      */
    def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = js.native
    /**
      * Returns all of the PnP objects of a specified type that match the specified filter.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @param aqsFilter An AQS string that filters the PnP objects that will be returned. Typically, this string is retrieved from the GetDeviceSelector method of a class that interacts with devices.
      * @return An object that represents the asynchronous operation.
      */
    def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = js.native
  }
  
  /** Represents an iterable collection of Pnp device objects. */
  @js.native
  abstract class PnpObjectCollection ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectCollection
  
  /** Indicates the device type of a PnpObject . */
  @js.native
  object PnpObjectType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType with Double] = js.native
    
    /* 5 */ val associationEndpoint: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.associationEndpoint with Double = js.native
    
    /* 6 */ val associationEndpointContainer: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.associationEndpointContainer with Double = js.native
    
    /* 7 */ val associationEndpointService: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.associationEndpointService with Double = js.native
    
    /* 3 */ val device: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.device with Double = js.native
    
    /* 2 */ val deviceContainer: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceContainer with Double = js.native
    
    /* 1 */ val deviceInterface: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterface with Double = js.native
    
    /* 4 */ val deviceInterfaceClass: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterfaceClass with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.unknown with Double = js.native
  }
  
  /** Contains the updated properties of a PnpObject . */
  @js.native
  abstract class PnpObjectUpdate ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate
  
  /** Raises events to notify the client that a PnpObject has been added, updated, or removed from an enumerated collection of Pnp device objects in an incremental and asynchronous way. */
  @js.native
  abstract class PnpObjectWatcher ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher
}
