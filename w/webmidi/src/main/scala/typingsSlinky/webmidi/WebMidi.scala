package typingsSlinky.webmidi

import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.Event
import typingsSlinky.std.EventInit
import typingsSlinky.std.EventTarget
import typingsSlinky.std.Map
import typingsSlinky.webmidi.webmidiStrings.input
import typingsSlinky.webmidi.webmidiStrings.midimessage
import typingsSlinky.webmidi.webmidiStrings.output
import typingsSlinky.webmidi.webmidiStrings.statechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebMidi {
  
  @js.native
  trait MIDIAccess extends EventTarget {
    
    @JSName("addEventListener")
    def addEventListener_statechange(
      `type`: statechange,
      listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_statechange(
      `type`: statechange,
      listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_statechange(
      `type`: statechange,
      listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * The MIDI input ports available to the system.
      */
    var inputs: MIDIInputMap = js.native
    
    /**
      * The handler called when a new port is connected or an existing port changes the
      * state attribute.
      */
    def onstatechange(e: MIDIConnectionEvent): Unit = js.native
    
    /**
      * The MIDI output ports available to the system.
      */
    var outputs: MIDIOutputMap = js.native
    
    /**
      * This attribute informs the user whether system exclusive support is enabled on
      * this MIDIAccess.
      */
    var sysexEnabled: Boolean = js.native
  }
  
  @js.native
  trait MIDIConnectionEvent extends Event {
    
    /**
      * The port that has been connected or disconnected.
      */
    var port: MIDIPort = js.native
  }
  
  @js.native
  trait MIDIConnectionEventInit extends EventInit {
    
    /**
      * The port that has been connected or disconnected.
      */
    var port: MIDIPort = js.native
  }
  object MIDIConnectionEventInit {
    
    @scala.inline
    def apply(port: MIDIPort): MIDIConnectionEventInit = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIDIConnectionEventInit]
    }
    
    @scala.inline
    implicit class MIDIConnectionEventInitMutableBuilder[Self <: MIDIConnectionEventInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: MIDIPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MIDIInput extends MIDIPort {
    
    @JSName("addEventListener")
    def addEventListener_midimessage(`type`: midimessage, listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_midimessage(
      `type`: midimessage,
      listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_midimessage(
      `type`: midimessage,
      listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def onmidimessage(e: MIDIMessageEvent): Unit = js.native
    
    @JSName("type")
    var type_MIDIInput: input = js.native
  }
  
  /**
    * This is a maplike interface whose value is a MIDIInput instance and key is its
    * ID.
    */
  type MIDIInputMap = Map[String, MIDIInput]
  
  @js.native
  trait MIDIMessageEvent extends Event {
    
    /**
      * A Uint8Array containing the MIDI data bytes of a single MIDI message.
      */
    var data: js.typedarray.Uint8Array = js.native
    
    /**
      * A timestamp specifying when the event occurred.
      */
    var receivedTime: Double = js.native
  }
  
  @js.native
  trait MIDIMessageEventInit extends EventInit {
    
    /**
      * A Uint8Array containing the MIDI data bytes of a single MIDI message.
      */
    var data: js.typedarray.Uint8Array = js.native
    
    /**
      * A timestamp specifying when the event occurred.
      */
    var receivedTime: Double = js.native
  }
  object MIDIMessageEventInit {
    
    @scala.inline
    def apply(data: js.typedarray.Uint8Array, receivedTime: Double): MIDIMessageEventInit = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], receivedTime = receivedTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIDIMessageEventInit]
    }
    
    @scala.inline
    implicit class MIDIMessageEventInitMutableBuilder[Self <: MIDIMessageEventInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceivedTime(value: Double): Self = StObject.set(x, "receivedTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MIDIOptions extends StObject {
    
    /**
      * This member informs the system whether the ability to send and receive system
      * exclusive messages is requested or allowed on a given MIDIAccess object.
      */
    var sysex: Boolean = js.native
  }
  object MIDIOptions {
    
    @scala.inline
    def apply(sysex: Boolean): MIDIOptions = {
      val __obj = js.Dynamic.literal(sysex = sysex.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIDIOptions]
    }
    
    @scala.inline
    implicit class MIDIOptionsMutableBuilder[Self <: MIDIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSysex(value: Boolean): Self = StObject.set(x, "sysex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MIDIOutput extends MIDIPort {
    
    /**
      * Clears any pending send data that has not yet been sent from the MIDIOutput 's
      * queue. The implementation will need to ensure the MIDI stream is left in a good
      * state, so if the output port is in the middle of a sysex message, a sysex
      * termination byte (0xf7) should be sent.
      */
    def clear(): Unit = js.native
    
    /**
      * Enqueues the message to be sent to the corresponding MIDI port.
      * @param data The data to be enqueued, with each sequence entry representing a single byte of data.
      * @param timestamp The time at which to begin sending the data to the port. If timestamp is set
      * to zero (or another time in the past), the data is to be sent as soon as
      * possible.
      */
    def send(data: js.Array[Double]): Unit = js.native
    def send(data: js.Array[Double], timestamp: Double): Unit = js.native
    def send(data: js.typedarray.Uint8Array): Unit = js.native
    def send(data: js.typedarray.Uint8Array, timestamp: Double): Unit = js.native
    
    @JSName("type")
    var type_MIDIOutput: output = js.native
  }
  
  /**
    * This is a maplike interface whose value is a MIDIOutput instance and key is its
    * ID.
    */
  type MIDIOutputMap = Map[String, MIDIOutput]
  
  @js.native
  trait MIDIPort extends EventTarget {
    
    @JSName("addEventListener")
    def addEventListener_statechange(
      `type`: statechange,
      listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_statechange(
      `type`: statechange,
      listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_statechange(
      `type`: statechange,
      listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * Makes the MIDI device corresponding to the MIDIPort
      * explicitly unavailable (subsequently changing the state from "open" to
      * "connected"). Note that successful invocation of this method will result in MIDI
      * messages no longer being delivered to MIDIMessageEvent handlers on a
      * MIDIInputPort (although setting a new handler will cause an implicit open()).
      *
      * When invoked, this method returns a Promise object representing a request for
      * access to the given MIDI port on the user's system. When the port has been
      * closed (and therefore, in exclusive access systems, the port is available to
      * other applications), the vended Promise is resolved. If the port is
      * disconnected, the Promise is rejected.
      */
    def close(): js.Promise[MIDIPort] = js.native
    
    /**
      * The state of the connection to the device.
      */
    var connection: MIDIPortConnectionState = js.native
    
    /**
      * A unique ID of the port. This can be used by developers to remember ports the
      * user has chosen for their application.
      */
    var id: String = js.native
    
    /**
      * The manufacturer of the port.
      */
    var manufacturer: js.UndefOr[String] = js.native
    
    /**
      * The system name of the port.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The handler called when an existing port changes its state or connection
      * attributes.
      */
    def onstatechange(e: MIDIConnectionEvent): Unit = js.native
    
    /**
      * Makes the MIDI device corresponding to the MIDIPort explicitly available. Note
      * that this call is NOT required in order to use the MIDIPort - calling send() on
      * a MIDIOutput or attaching a MIDIMessageEvent handler on a MIDIInputPort will
      * cause an implicit open().
      *
      * When invoked, this method returns a Promise object representing a request for
      * access to the given MIDI port on the user's system.
      */
    def open(): js.Promise[MIDIPort] = js.native
    
    /**
      * The state of the device.
      */
    var state: MIDIPortDeviceState = js.native
    
    /**
      * A descriptor property to distinguish whether the port is an input or an output
      * port.
      */
    var `type`: MIDIPortType = js.native
    
    /**
      * The version of the port.
      */
    var version: js.UndefOr[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webmidi.webmidiStrings.open
    - typingsSlinky.webmidi.webmidiStrings.closed
    - typingsSlinky.webmidi.webmidiStrings.pending
  */
  trait MIDIPortConnectionState extends StObject
  object MIDIPortConnectionState {
    
    @scala.inline
    def closed: typingsSlinky.webmidi.webmidiStrings.closed = "closed".asInstanceOf[typingsSlinky.webmidi.webmidiStrings.closed]
    
    @scala.inline
    def open: typingsSlinky.webmidi.webmidiStrings.open = "open".asInstanceOf[typingsSlinky.webmidi.webmidiStrings.open]
    
    @scala.inline
    def pending: typingsSlinky.webmidi.webmidiStrings.pending = "pending".asInstanceOf[typingsSlinky.webmidi.webmidiStrings.pending]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webmidi.webmidiStrings.disconnected
    - typingsSlinky.webmidi.webmidiStrings.connected
  */
  trait MIDIPortDeviceState extends StObject
  object MIDIPortDeviceState {
    
    @scala.inline
    def connected: typingsSlinky.webmidi.webmidiStrings.connected = "connected".asInstanceOf[typingsSlinky.webmidi.webmidiStrings.connected]
    
    @scala.inline
    def disconnected: typingsSlinky.webmidi.webmidiStrings.disconnected = "disconnected".asInstanceOf[typingsSlinky.webmidi.webmidiStrings.disconnected]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webmidi.webmidiStrings.input
    - typingsSlinky.webmidi.webmidiStrings.output
  */
  trait MIDIPortType extends StObject
  object MIDIPortType {
    
    @scala.inline
    def input: typingsSlinky.webmidi.webmidiStrings.input = "input".asInstanceOf[typingsSlinky.webmidi.webmidiStrings.input]
    
    @scala.inline
    def output: typingsSlinky.webmidi.webmidiStrings.output = "output".asInstanceOf[typingsSlinky.webmidi.webmidiStrings.output]
  }
}
