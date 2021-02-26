package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDataFormat
import typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterActionType
import typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to send and receive Short Message Service (SMS) messages, filter incoming messages, and send messages silently, as well as to query properties about a Mobile Broadband SMS Device. Use this API to implement Mobile Operator (MO) applications that use app-directed SMS to implement MO features such as visual voice mail apps. */
object Sms {
  
  /** This enumerated type defines the type of radio standard in a device. */
  @JSGlobal("Windows.Devices.Sms.CellularClass")
  @js.native
  object CellularClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.CellularClass with Double] = js.native
    
    /* 2 */ val cdma: typingsSlinky.winrtUwp.Windows.Devices.Sms.CellularClass.cdma with Double = js.native
    
    /* 1 */ val gsm: typingsSlinky.winrtUwp.Windows.Devices.Sms.CellularClass.gsm with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Devices.Sms.CellularClass.none with Double = js.native
  }
  
  /** Enables start, track, and end an asynchronous message delete operation for a single message. */
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
  @js.native
  abstract class DeleteSmsMessageOperation ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.DeleteSmsMessageOperation
  
  /** Enables start, track, and end asynchronous SMS message delete operations for multiple messages. */
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessagesOperation")
  @js.native
  abstract class DeleteSmsMessagesOperation ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.DeleteSmsMessagesOperation
  
  /** Retrieves an SmsDevice object asynchronously. */
  @JSGlobal("Windows.Devices.Sms.GetSmsDeviceOperation")
  @js.native
  abstract class GetSmsDeviceOperation ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.GetSmsDeviceOperation
  
  /** Supports the retrieval of a message from the SMS message store. */
  @JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
  @js.native
  abstract class GetSmsMessageOperation ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.GetSmsMessageOperation
  
  /** Supports the retrieval of messages. */
  @JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
  @js.native
  abstract class GetSmsMessagesOperation ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.GetSmsMessagesOperation
  
  /** Enables the sending of a message. */
  @JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
  @js.native
  abstract class SendSmsMessageOperation ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SendSmsMessageOperation
  
  /** The interface for manipulating an SMS Application message. Application messages are those which cannot be characterized as any other message type. */
  @JSGlobal("Windows.Devices.Sms.SmsAppMessage")
  @js.native
  /** Constructor. Used to create an SmsAppMessage prior to sending it. */
  class SmsAppMessage ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsAppMessage
  
  /** Represents an SMS message in raw PDU format. The data format differs depending on whether the message format (indicated by the value of the Format property) is GSM or CDMA. */
  @JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
  @js.native
  /** Creates an instance of the SmsBinaryMessage class. */
  class SmsBinaryMessage ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage
  
  /** Represents a broadcast SMS message. */
  @JSGlobal("Windows.Devices.Sms.SmsBroadcastMessage")
  @js.native
  abstract class SmsBroadcastMessage ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastMessage
  
  /** Values that describe the type of a broadcast (emergency alert) message. */
  @JSGlobal("Windows.Devices.Sms.SmsBroadcastType")
  @js.native
  object SmsBroadcastType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType with Double] = js.native
    
    /* 4 */ val cmasAmber: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasAmber with Double = js.native
    
    /* 2 */ val cmasExtreme: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasExtreme with Double = js.native
    
    /* 1 */ val cmasPresidential: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasPresidential with Double = js.native
    
    /* 3 */ val cmasSevere: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasSevere with Double = js.native
    
    /* 5 */ val cmasTest: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasTest with Double = js.native
    
    /* 11 */ val etwsEarthquake: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.etwsEarthquake with Double = js.native
    
    /* 12 */ val etwsTsunami: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.etwsTsunami with Double = js.native
    
    /* 13 */ val etwsTsunamiAndEarthquake: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.etwsTsunamiAndEarthquake with Double = js.native
    
    /* 6 */ val euAlert1: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert1 with Double = js.native
    
    /* 7 */ val euAlert2: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert2 with Double = js.native
    
    /* 8 */ val euAlert3: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert3 with Double = js.native
    
    /* 9 */ val euAlertAmber: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlertAmber with Double = js.native
    
    /* 10 */ val euAlertInfo: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlertInfo with Double = js.native
    
    /* 14 */ val latAlertLocal: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.latAlertLocal with Double = js.native
    
    /* 0 */ val other: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.other with Double = js.native
  }
  
  /** This enumerated type identifies the format of a given protocol description unit (PDU) buffer. */
  @JSGlobal("Windows.Devices.Sms.SmsDataFormat")
  @js.native
  object SmsDataFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDataFormat with Double] = js.native
    
    /* 3 */ val cdmaDeliver: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDataFormat.cdmaDeliver with Double = js.native
    
    /* 1 */ val cdmaSubmit: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDataFormat.cdmaSubmit with Double = js.native
    
    /* 4 */ val gsmDeliver: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDataFormat.gsmDeliver with Double = js.native
    
    /* 2 */ val gsmSubmit: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDataFormat.gsmSubmit with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDataFormat.unknown with Double = js.native
  }
  
  /** Supports the operation of a mobile broadband SMS device. */
  @JSGlobal("Windows.Devices.Sms.SmsDevice")
  @js.native
  abstract class SmsDevice ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDevice
  object SmsDevice {
    
    /**
      * Creates an instance of SmsDevice for the device that received the SMS message.
      * @param deviceId A string representation of the DeviceInformation ID of the SMS device that received the SMS message.
      * @return The SMS device operation object.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsDevice.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDevice] = js.native
    
    /**
      * Creates an instance of SmsDevice for the specified Mobile Broadband network account ID.
      * @param networkAccountId The Mobile Broadband network account ID to use to select the corresponding mobile broadband device to use for the SMS device
      * @return When this method completes, it returns the SmsDevice for the specified Mobile Broadband network account ID.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsDevice.fromNetworkAccountIdAsync")
    @js.native
    def fromNetworkAccountIdAsync(networkAccountId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDevice] = js.native
    
    /**
      * Creates an instance of an SmsDevice object associated with the default SMS device. Because the device might be busy, the operation executes asynchronously. The asynchronous operation object returns immediately.
      * @return A reference to an IAsyncOperation(SmsDevice) object that supports asynchronous SmsDevice object retrieval.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsDevice.getDefaultAsync")
    @js.native
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDevice] = js.native
    
    /**
      * Retrieves the class selection string that can be used to enumerate SMS devices.
      * @return A reference to an Advanced Query Syntax (AQS) string that identifies an SMS device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
  
  /** Extends the SmsDevice class, and supports the operation of a mobile broadband SMS device. */
  @JSGlobal("Windows.Devices.Sms.SmsDevice2")
  @js.native
  abstract class SmsDevice2 ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDevice2
  object SmsDevice2 {
    
    /**
      * Creates an instance of SmsDevice2 for a device that received an SMS message.
      * @param deviceId A string representation of the device ID of the device that received an SMS message.
      * @return An instance of SmsDevice2 initialized for the device with the given ID.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsDevice2.fromId")
    @js.native
    def fromId(deviceId: String): typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDevice2 = js.native
    
    /**
      * Creates an instance of SmsDevice2 for a device, given the device ID of the parent device.
      * @param parentDeviceId The device ID of the parent device.
      * @return An instance of SmsDevice2 initialized for the device with the given parent ID.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsDevice2.fromParentId")
    @js.native
    def fromParentId(parentDeviceId: String): typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDevice2 = js.native
    
    /**
      * Creates an instance of SmsDevice2 associated with the default SMS device.
      * @return An instance of SmsDevice2 initialized for the default SMS device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsDevice2.getDefault")
    @js.native
    def getDefault(): typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDevice2 = js.native
    
    /**
      * Retrieves the class selection string that can be used to enumerate SMS devices.
      * @return A reference to an Advanced Query Syntax (AQS) string that identifies an SMS device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsDevice2.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
  
  /** Provides access to the messages stored on an SMS Device and information about the message store. */
  @JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
  @js.native
  abstract class SmsDeviceMessageStore ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceMessageStore
  
  /** Contains values that indicate the readiness of an SMS device to engage in cellular network traffic operations. */
  @JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
  @js.native
  object SmsDeviceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus with Double] = js.native
    
    /* 3 */ val badSim: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.badSim with Double = js.native
    
    /* 7 */ val deviceBlocked: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked with Double = js.native
    
    /* 4 */ val deviceFailure: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure with Double = js.native
    
    /* 6 */ val deviceLocked: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked with Double = js.native
    
    /* 0 */ val off: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.off with Double = js.native
    
    /* 1 */ val ready: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.ready with Double = js.native
    
    /* 2 */ val simNotInserted: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted with Double = js.native
    
    /* 5 */ val subscriptionNotActivated: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated with Double = js.native
  }
  
  /** This enumerated type is used to determine the encoding algorithm to send or calculate the length of an SmsTextMessage object. */
  @JSGlobal("Windows.Devices.Sms.SmsEncoding")
  @js.native
  object SmsEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding with Double] = js.native
    
    /* 5 */ val eightBit: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.eightBit with Double = js.native
    
    /* 4 */ val gsmSevenBit: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.gsmSevenBit with Double = js.native
    
    /* 8 */ val ia5: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.ia5 with Double = js.native
    
    /* 7 */ val korean: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.korean with Double = js.native
    
    /* 6 */ val latin: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.latin with Double = js.native
    
    /* 10 */ val latinHebrew: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.latinHebrew with Double = js.native
    
    /* 1 */ val optimal: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.optimal with Double = js.native
    
    /* 2 */ val sevenBitAscii: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.sevenBitAscii with Double = js.native
    
    /* 9 */ val shiftJis: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.shiftJis with Double = js.native
    
    /* 3 */ val unicode: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.unicode with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsEncoding.unknown with Double = js.native
  }
  
  /** Values that describe the action to be taken on a message filter. */
  @JSGlobal("Windows.Devices.Sms.SmsFilterActionType")
  @js.native
  object SmsFilterActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterActionType with Double] = js.native
    
    /* 3 */ val accept: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterActionType.accept with Double = js.native
    
    /* 0 */ val acceptImmediately: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterActionType.acceptImmediately with Double = js.native
    
    /* 1 */ val drop: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterActionType.drop with Double = js.native
    
    /* 2 */ val peek: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterActionType.peek with Double = js.native
  }
  
  /** Describes an SMS filtering rule. */
  @JSGlobal("Windows.Devices.Sms.SmsFilterRule")
  @js.native
  class SmsFilterRule protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterRule {
    /**
      * Creates a new, empty SmsFilterRule .
      * @param messageType An enumeration value specifying the message type that will match this rule.
      */
    def this(messageType: SmsMessageType) = this()
  }
  
  /** A collection of SmsFilterRule instances. */
  @JSGlobal("Windows.Devices.Sms.SmsFilterRules")
  @js.native
  class SmsFilterRules protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterRules {
    /**
      * Creates an instance of SmsFilterRules .
      * @param actionType An enumeration value that specifies which action type is to be associated with the rules for this instance. Action type determines the order in which rules are evaluated, as well as the action to be taken when a rule is matched.
      */
    def this(actionType: SmsFilterActionType) = this()
  }
  
  /** Values that describe the geographical scope of a cell broadcast message. */
  @JSGlobal("Windows.Devices.Sms.SmsGeographicalScope")
  @js.native
  object SmsGeographicalScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope with Double] = js.native
    
    /* 4 */ val cell: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.cell with Double = js.native
    
    /* 1 */ val cellWithImmediateDisplay: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.cellWithImmediateDisplay with Double = js.native
    
    /* 2 */ val locationArea: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.locationArea with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.none with Double = js.native
    
    /* 3 */ val plmn: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.plmn with Double = js.native
  }
  
  /** This enumerated type specifies the message class of a message. The message class typically originates on the network, not the mobile device. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageClass")
  @js.native
  object SmsMessageClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageClass with Double] = js.native
    
    /* 1 */ val class0: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageClass.class0 with Double = js.native
    
    /* 2 */ val class1: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageClass.class1 with Double = js.native
    
    /* 3 */ val class2: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageClass.class2 with Double = js.native
    
    /* 4 */ val class3: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageClass.class3 with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageClass.none with Double = js.native
  }
  
  /** This enumerated type specifies which messages in the device message store an operation is performed on. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
  @js.native
  object SmsMessageFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageFilter with Double] = js.native
    
    /* 0 */ val all: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.all with Double = js.native
    
    /* 4 */ val draft: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.draft with Double = js.native
    
    /* 2 */ val read: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.read with Double = js.native
    
    /* 3 */ val sent: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.sent with Double = js.native
    
    /* 1 */ val unread: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.unread with Double = js.native
  }
  
  /** Provides data for ISmsBinaryMessage event handlers. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageReceivedEventArgs")
  @js.native
  abstract class SmsMessageReceivedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageReceivedEventArgs
  
  /** Contains event details for the event raised when an SMS message is received. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageReceivedTriggerDetails")
  @js.native
  abstract class SmsMessageReceivedTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageReceivedTriggerDetails
  
  /** Class used to represent registered message filters. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
  @js.native
  abstract class SmsMessageRegistration ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration
  object SmsMessageRegistration {
    
    @JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
    @js.native
    val ^ : js.Any = js.native
    
    /** Static property that gets a list of currently registered message filters.. */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsMessageRegistration.allRegistrations")
    @js.native
    def allRegistrations: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration] = js.native
    @scala.inline
    def allRegistrations_=(x: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allRegistrations")(x.asInstanceOf[js.Any])
    
    /**
      * Registers a message filter.
      * @param id Identifier used to describe this message filter.
      * @param filterRules An object that represents the filter rules to be used for this registered message filter.
      * @return On successful completion, the SmsMessageRegistration object that represents this registered message filter.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsMessageRegistration.register")
    @js.native
    def register(id: String, filterRules: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterRules): typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration = js.native
  }
  
  /** This enumerated type defines the format of the SMS message. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageType")
  @js.native
  object SmsMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType with Double] = js.native
    
    /* 3 */ val app: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType.app with Double = js.native
    
    /* 0 */ val binary: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType.binary with Double = js.native
    
    /* 4 */ val broadcast: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType.broadcast with Double = js.native
    
    /* 6 */ val status: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType.status with Double = js.native
    
    /* 1 */ val text: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType.text with Double = js.native
    
    /* 5 */ val voicemail: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType.voicemail with Double = js.native
    
    /* 2 */ val wap: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType.wap with Double = js.native
  }
  
  /** Values that describe error codes from the SMS modem in an SmsSendMessageResult. */
  @JSGlobal("Windows.Devices.Sms.SmsModemErrorCode")
  @js.native
  object SmsModemErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode with Double] = js.native
    
    /* 4 */ val deviceFailure: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.deviceFailure with Double = js.native
    
    /* 7 */ val deviceNotReady: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.deviceNotReady with Double = js.native
    
    /* 11 */ val fixedDialingNumberRestricted: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.fixedDialingNumberRestricted with Double = js.native
    
    /* 9 */ val invalidSmscAddress: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.invalidSmscAddress with Double = js.native
    
    /* 5 */ val messageNotEncodedProperly: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.messageNotEncodedProperly with Double = js.native
    
    /* 6 */ val messageTooLarge: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.messageTooLarge with Double = js.native
    
    /* 1 */ val messagingNetworkError: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.messagingNetworkError with Double = js.native
    
    /* 10 */ val networkFailure: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.networkFailure with Double = js.native
    
    /* 8 */ val networkNotReady: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.networkNotReady with Double = js.native
    
    /* 0 */ val other: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.other with Double = js.native
    
    /* 2 */ val smsOperationNotSupportedByDevice: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.smsOperationNotSupportedByDevice with Double = js.native
    
    /* 3 */ val smsServiceNotSupportedByNetwork: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.smsServiceNotSupportedByNetwork with Double = js.native
  }
  
  /** Presents the details of SMS message events to the background work item that handles messages while your app is suspended. */
  @JSGlobal("Windows.Devices.Sms.SmsReceivedEventDetails")
  @js.native
  abstract class SmsReceivedEventDetails ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsReceivedEventDetails
  
  /** Encapsulates the results of calling SmsDevice2.SendMessageAndGetResultAsync . */
  @JSGlobal("Windows.Devices.Sms.SmsSendMessageResult")
  @js.native
  abstract class SmsSendMessageResult ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsSendMessageResult
  
  /** Encapsulates an SMS status message. */
  @JSGlobal("Windows.Devices.Sms.SmsStatusMessage")
  @js.native
  abstract class SmsStatusMessage ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsStatusMessage
  
  /** Manages a decoded SMS text message, providing direct access to the plain text body of the message, as well as key header properties, such as time stamp. */
  @JSGlobal("Windows.Devices.Sms.SmsTextMessage")
  @js.native
  /** Creates an instance of the SmsTextMessage class. */
  class SmsTextMessage ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsTextMessage
  object SmsTextMessage {
    
    /**
      * Decodes a binary message and places the results in a new instance of a text message. This method represents the binary message as a reference to a buffer of bytes and a selection of how the buffer is encoded. Therefore, it can be used when the message did not originate directly from the device or as an instance of an SmsBinaryMessage class.
      * @param format An SmsDataFormat enumerated value that identifies the format of a particular protocol description unit (PDU) buffer.
      * @param value An array of bytes containing the binary data to decode.
      * @return A new SmsTextMessage object if the decoding was successful.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsTextMessage.fromBinaryData")
    @js.native
    def fromBinaryData(format: SmsDataFormat, value: js.Array[Double]): typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsTextMessage = js.native
    
    /**
      * Reads a binary message and decodes it. The results are placed in a new instance of a text message.
      * @param binaryMessage An instance of a binary message to decode.
      * @return A new SmsTextMessage object.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsTextMessage.fromBinaryMessage")
    @js.native
    def fromBinaryMessage(binaryMessage: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage): typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsTextMessage = js.native
  }
  
  /** Encapsulates a decoded SMS text message. Prefer this class to the older SmsTextMessage class. */
  @JSGlobal("Windows.Devices.Sms.SmsTextMessage2")
  @js.native
  /** Constructs a new, default instance of this class. */
  class SmsTextMessage2 ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsTextMessage2
  
  /** Encapsulates an SMS voicemail message. */
  @JSGlobal("Windows.Devices.Sms.SmsVoicemailMessage")
  @js.native
  abstract class SmsVoicemailMessage ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsVoicemailMessage
  
  /** Represents an SMS WAP push message. */
  @JSGlobal("Windows.Devices.Sms.SmsWapMessage")
  @js.native
  abstract class SmsWapMessage ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsWapMessage
}
