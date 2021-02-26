package typingsSlinky.winrt.global.Windows.Devices

import typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sms {
  
  @JSGlobal("Windows.Devices.Sms.CellularClass")
  @js.native
  object CellularClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Sms.CellularClass with Double] = js.native
    
    /* 2 */ val cdma: typingsSlinky.winrt.Windows.Devices.Sms.CellularClass.cdma with Double = js.native
    
    /* 1 */ val gsm: typingsSlinky.winrt.Windows.Devices.Sms.CellularClass.gsm with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Devices.Sms.CellularClass.none with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
  @js.native
  class DeleteSmsMessageOperation ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.DeleteSmsMessageOperation
  
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessagesOperation")
  @js.native
  class DeleteSmsMessagesOperation ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.DeleteSmsMessagesOperation
  
  @JSGlobal("Windows.Devices.Sms.GetSmsDeviceOperation")
  @js.native
  class GetSmsDeviceOperation ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.GetSmsDeviceOperation
  
  @JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
  @js.native
  class GetSmsMessageOperation ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.GetSmsMessageOperation
  
  @JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
  @js.native
  class GetSmsMessagesOperation ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.GetSmsMessagesOperation
  
  @JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
  @js.native
  class SendSmsMessageOperation ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.SendSmsMessageOperation
  
  @JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
  @js.native
  class SmsBinaryMessage ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.SmsBinaryMessage
  
  @JSGlobal("Windows.Devices.Sms.SmsDataFormat")
  @js.native
  object SmsDataFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat with Double] = js.native
    
    /* 3 */ val cdmaDeliver: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat.cdmaDeliver with Double = js.native
    
    /* 1 */ val cdmaSubmit: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat.cdmaSubmit with Double = js.native
    
    /* 4 */ val gsmDeliver: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat.gsmDeliver with Double = js.native
    
    /* 2 */ val gsmSubmit: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat.gsmSubmit with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat.unknown with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDevice")
  @js.native
  class SmsDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice
  /* static members */
  object SmsDevice {
    
    @JSGlobal("Windows.Devices.Sms.SmsDevice.fromIdAsync")
    @js.native
    def fromIdAsync(deviceInstanceId: String): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice] = js.native
    
    @JSGlobal("Windows.Devices.Sms.SmsDevice.getDefaultAsync")
    @js.native
    def getDefaultAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice] = js.native
    
    @JSGlobal("Windows.Devices.Sms.SmsDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
  @js.native
  class SmsDeviceMessageStore ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceMessageStore
  
  @JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
  @js.native
  object SmsDeviceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus with Double] = js.native
    
    /* 3 */ val badSim: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus.badSim with Double = js.native
    
    /* 7 */ val deviceBlocked: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked with Double = js.native
    
    /* 4 */ val deviceFailure: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure with Double = js.native
    
    /* 6 */ val deviceLocked: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked with Double = js.native
    
    /* 0 */ val off: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus.off with Double = js.native
    
    /* 1 */ val ready: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus.ready with Double = js.native
    
    /* 2 */ val simNotInserted: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted with Double = js.native
    
    /* 5 */ val subscriptionNotActivated: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsEncoding")
  @js.native
  object SmsEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Sms.SmsEncoding with Double] = js.native
    
    /* 4 */ val gsmSevenBit: typingsSlinky.winrt.Windows.Devices.Sms.SmsEncoding.gsmSevenBit with Double = js.native
    
    /* 1 */ val optimal: typingsSlinky.winrt.Windows.Devices.Sms.SmsEncoding.optimal with Double = js.native
    
    /* 2 */ val sevenBitAscii: typingsSlinky.winrt.Windows.Devices.Sms.SmsEncoding.sevenBitAscii with Double = js.native
    
    /* 3 */ val unicode: typingsSlinky.winrt.Windows.Devices.Sms.SmsEncoding.unicode with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Devices.Sms.SmsEncoding.unknown with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageClass")
  @js.native
  object SmsMessageClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageClass with Double] = js.native
    
    /* 1 */ val class0: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageClass.class0 with Double = js.native
    
    /* 2 */ val class1: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageClass.class1 with Double = js.native
    
    /* 3 */ val class2: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageClass.class2 with Double = js.native
    
    /* 4 */ val class3: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageClass.class3 with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageClass.none with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
  @js.native
  object SmsMessageFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter with Double] = js.native
    
    /* 0 */ val all: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.all with Double = js.native
    
    /* 4 */ val draft: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.draft with Double = js.native
    
    /* 2 */ val read: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.read with Double = js.native
    
    /* 3 */ val sent: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.sent with Double = js.native
    
    /* 1 */ val unread: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.unread with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageReceivedEventArgs")
  @js.native
  class SmsMessageReceivedEventArgs ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageReceivedEventArgs
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageType")
  @js.native
  object SmsMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageType with Double] = js.native
    
    /* 0 */ val binary: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageType.binary with Double = js.native
    
    /* 1 */ val text: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageType.text with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsReceivedEventDetails")
  @js.native
  class SmsReceivedEventDetails ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.SmsReceivedEventDetails
  
  @JSGlobal("Windows.Devices.Sms.SmsTextMessage")
  @js.native
  class SmsTextMessage ()
    extends typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage
  /* static members */
  object SmsTextMessage {
    
    @JSGlobal("Windows.Devices.Sms.SmsTextMessage.fromBinaryData")
    @js.native
    def fromBinaryData(format: SmsDataFormat, value: js.typedarray.Uint8Array): typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
    
    @JSGlobal("Windows.Devices.Sms.SmsTextMessage.fromBinaryMessage")
    @js.native
    def fromBinaryMessage(binaryMessage: typingsSlinky.winrt.Windows.Devices.Sms.SmsBinaryMessage): typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
  }
}
