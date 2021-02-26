package typingsSlinky.udpDiscovery

import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("udp-discovery", "Discovery")
  @js.native
  /**
    * Invokes the constructor to create an instance of Discovery to receive discovery events. The config options object is optional, but if included, the following options are available:
    * @param options constructor options
    */
  class Discovery () extends EventEmitter {
    def this(options: DiscoveryConstructorOptions) = this()
    
    /**
      * Starts announcing the service at the specified interval. The parameter, serviceObject, is an object describing the service that udp-discoveryy announces.
      * @param name The name of the service being announced. It must be unique, or it will collide with another.
      * @param userData The duration between announcements in milliseconds.
      * @param interval Any data that can be serialized into JSON.
      * @param available Optional parameter to set availability of the service. If not specified, the default is 'true', meaning available.
      */
    def announce(name: String, userData: js.Any): Unit = js.native
    def announce(name: String, userData: js.Any, interval: js.UndefOr[scala.Nothing], available: Boolean): Unit = js.native
    def announce(name: String, userData: js.Any, interval: Double): Unit = js.native
    def announce(name: String, userData: js.Any, interval: Double, available: Boolean): Unit = js.native
    
    /**
      * Returns the service object, which can be modified. For example, if you need to alter the userData, you can. You cannot, however, alter the name (it's a constant property).
      * @param name name of the service.
      * @returns Returns Object serviceObject from announce.
      */
    def getData(name: String): js.Any = js.native
    
    /**
      * Halts announcements.
      * @param name The name of the service.
      * @returns Returns true if successful, false otherwise.
      */
    def pause(name: String): Boolean = js.native
    
    /**
      * Resumes the announcements at the time interval.
      * @param name The name of the service.
      * @param interval optional interval between announcements in ms.
      * @returns Returns true if successful, false otherwise.
      */
    def resume(name: String): Boolean = js.native
    def resume(name: String, interval: Double): Boolean = js.native
    
    /**
      * Not documented at the time this type definition was created.
      * Network traffic inspection shows that it sends an event as UDP multicast, and a listener receives it.
      * @param eventName The name of the event.
      * @param data The payload for the event.
      */
    def sendEvent(eventName: String, data: js.Any): Unit = js.native
    
    /**
      * Updates the existing service.
      * @param name The name of the service being announced. It must be unique, or it will collide with another.
      * @param userData The duration between announcements in milliseconds.
      * @param interval Any data that can be serialized into JSON.
      * @param available Optional parameter to set availability of the service. If not specified, the default is 'true', meaning available.
      */
    def update(name: String, userData: js.Any): Unit = js.native
    def update(name: String, userData: js.Any, interval: js.UndefOr[scala.Nothing], available: Boolean): Unit = js.native
    def update(name: String, userData: js.Any, interval: Double): Unit = js.native
    def update(name: String, userData: js.Any, interval: Double, available: Boolean): Unit = js.native
  }
  
  @js.native
  trait DiscoveryConstructorOptions extends StObject {
    
    /**
      * The address to bind to. Default: listens to all interfaces.
      */
    var bindAddr: js.UndefOr[String] = js.native
    
    /**
      * Either 'udp4' or 'udp6'. Default: 'udp4'.
      */
    var dgramType: js.UndefOr[String] = js.native
    
    /**
      * The port to listen upon for service announcements. Default: 44201.
      */
    var port: js.UndefOr[Double] = js.native
  }
  object DiscoveryConstructorOptions {
    
    @scala.inline
    def apply(): DiscoveryConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiscoveryConstructorOptions]
    }
    
    @scala.inline
    implicit class DiscoveryConstructorOptionsMutableBuilder[Self <: DiscoveryConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindAddrUndefined: Self = StObject.set(x, "bindAddr", js.undefined)
      
      @scala.inline
      def setDgramType(value: String): Self = StObject.set(x, "dgramType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDgramTypeUndefined: Self = StObject.set(x, "dgramType", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait DiscoveryEvents extends StObject {
    
    /**
      * Not documented at the time this type definition was created.
      * Although, it does capture events that appear to come from a listener's sendEvent.
      * @param eventName The name of the event.
      * @param data The payload for the event.
      */
    var MessageBus: js.UndefOr[js.Function2[/* eventName */ String, /* data */ js.Any, Unit]] = js.native
    
    /**
      * This event can happen when:
      *  - The first announcement for a service is received.
      *  - The availability changes, if the available status changes from false to true.
      * @param name name of the service.
      * @param data user-defined object describing the service.
      * @param reason why this event was sent: 'new', 'availabilityChange', 'timedOut'.
      */
    def available(name: String, data: js.Any, reason: ReasonType): Unit = js.native
    
    /**
      * This event can happen when:
      *  - The first announcement for a service is received and the service is unavailable..
      *  - The availability changes, if the available status changes from true to false.
      *  - When 2x the announce interval time for the service elapsed without an announcement being seen. The service is considered unavailable and removed from the list of services.
      * @param name name of the service.
      * @param data user-defined object describing the service.
      * @param reason why this event was sent: 'new', 'availabilityChange', 'timedOut'.
      */
    def unavailable(name: String, data: js.Any, reason: ReasonType): Unit = js.native
  }
  object DiscoveryEvents {
    
    @scala.inline
    def apply(available: (String, js.Any, ReasonType) => Unit, unavailable: (String, js.Any, ReasonType) => Unit): DiscoveryEvents = {
      val __obj = js.Dynamic.literal(available = js.Any.fromFunction3(available), unavailable = js.Any.fromFunction3(unavailable))
      __obj.asInstanceOf[DiscoveryEvents]
    }
    
    @scala.inline
    implicit class DiscoveryEventsMutableBuilder[Self <: DiscoveryEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailable(value: (String, js.Any, ReasonType) => Unit): Self = StObject.set(x, "available", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMessageBus(value: (/* eventName */ String, /* data */ js.Any) => Unit): Self = StObject.set(x, "MessageBus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMessageBusUndefined: Self = StObject.set(x, "MessageBus", js.undefined)
      
      @scala.inline
      def setUnavailable(value: (String, js.Any, ReasonType) => Unit): Self = StObject.set(x, "unavailable", js.Any.fromFunction3(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.udpDiscovery.udpDiscoveryStrings.`new`
    - typingsSlinky.udpDiscovery.udpDiscoveryStrings.availabilityChange
    - typingsSlinky.udpDiscovery.udpDiscoveryStrings.timedOut
  */
  trait ReasonType extends StObject
  object ReasonType {
    
    @scala.inline
    def availabilityChange: typingsSlinky.udpDiscovery.udpDiscoveryStrings.availabilityChange = "availabilityChange".asInstanceOf[typingsSlinky.udpDiscovery.udpDiscoveryStrings.availabilityChange]
    
    @scala.inline
    def `new`: typingsSlinky.udpDiscovery.udpDiscoveryStrings.`new` = "new".asInstanceOf[typingsSlinky.udpDiscovery.udpDiscoveryStrings.`new`]
    
    @scala.inline
    def timedOut: typingsSlinky.udpDiscovery.udpDiscoveryStrings.timedOut = "timedOut".asInstanceOf[typingsSlinky.udpDiscovery.udpDiscoveryStrings.timedOut]
  }
}
