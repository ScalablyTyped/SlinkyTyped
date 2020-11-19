package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets info about smart card readers and smart cards; configures physical smart cards; and creates, configures, and deletes Trusted Platform Module (TPM) virtual smart cards. */
@JSGlobal("Windows.Devices.SmartCards")
@js.native
object SmartCards extends js.Object {
  
  /** Provides data for the CardAdded event. */
  @js.native
  abstract class CardAddedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.CardAddedEventArgs
  
  /** Provides data for the CardRemoved event. */
  @js.native
  abstract class CardRemovedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.CardRemovedEventArgs
  
  /** Represents info about a smart card. */
  @js.native
  abstract class SmartCard ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCard
  
  /** Represents a smart card authentication challenge/response operation. */
  @js.native
  abstract class SmartCardChallengeContext ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardChallengeContext
  
  /** Represents a connection to a smart card. */
  @js.native
  abstract class SmartCardConnection ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardConnection
  
  /** Specifies the rules for characters in a smart card personal identification number (PIN). */
  @js.native
  object SmartCardPinCharacterPolicyOption extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption with Double
      ] = js.native
    
    /* 0 */ val allow: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.allow with Double = js.native
    
    /* 2 */ val disallow: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.disallow with Double = js.native
    
    /* 1 */ val requireAtLeastOne: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.requireAtLeastOne with Double = js.native
  }
  
  /** Represents a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
  @js.native
  /** Creates and initializes a new instance of a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
  class SmartCardPinPolicy ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy
  
  /** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
  @js.native
  abstract class SmartCardPinResetDeferral ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetDeferral
  
  /** Represents a smart card personal identification number (PIN) reset request. */
  @js.native
  abstract class SmartCardPinResetRequest ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetRequest
  
  /** Represents info about, and operations for, configuring smart cards. */
  @js.native
  abstract class SmartCardProvisioning ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning
  /* static members */
  @js.native
  object SmartCardProvisioning extends js.Object {
    
    /**
      * Returns a smart card to be configured.
      * @param card The specified smart card.
      * @return An instance of SmartCardProvisioning , representing the smart card to be configured.
      */
    def fromSmartCardAsync(card: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCard): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = js.native
    
    var requestAttestedVirtualSmartCardCreationAsync: js.Any = js.native
    
    /**
      * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, and personal identification number (PIN) rules set.
      * @param friendlyName The smart card's human-readable name.
      * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
      * @param pinPolicy The smart card's PIN rules set.
      * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
      */
    def requestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy
    ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = js.native
     /* unmapped type */ /**
      * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, personal identification number (PIN) rules set, and ID.
      * @param friendlyName The smart card's human-readable name.
      * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
      * @param pinPolicy The smart card's PIN rules set.
      * @param cardId The smart card's ID.
      * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
      */
    def requestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy,
      cardId: String
    ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = js.native
    
    /**
      * Deletes a Trusted Platform Module (TPM) virtual smart card.
      * @param card The TPM virtual smart card to delete.
      * @return After the deletion attempt completes, returns true if the TPM virtual smart card was successfully deleted; otherwise false.
      */
    def requestVirtualSmartCardDeletionAsync(card: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCard): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
  /** Represents info about a smart card reader. */
  @js.native
  abstract class SmartCardReader ()
    extends typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReader
  /* static members */
  @js.native
  object SmartCardReader extends js.Object {
    
    /**
      * Returns a smart card reader that matches the specified device ID.
      * @param deviceId The smart card reader's device ID.
      * @return The matching smart card reader.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReader] = js.native
    
    /**
      * Returns an Advanced Query Syntax (AQS) string representing all smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
      * @return The Advanced Query Syntax (AQS) string representing all smart card readers connected to the device.
      */
    def getDeviceSelector(): String = js.native
    /**
      * Returns an Advanced Query Syntax (AQS) string representing a set of a specific type of smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
      * @param kind One of the enumeration values, representing a specific smart card reader type.
      * @return The Advanced Query Syntax (AQS) string representing a set of the specified type of smart card readers connected to the device.
      */
    def getDeviceSelector(kind: SmartCardReaderKind): String = js.native
  }
  
  /** Represents the smart card reader's type. */
  @js.native
  object SmartCardReaderKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind with Double
      ] = js.native
    
    /* 0 */ val any: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.any with Double = js.native
    
    /* 1 */ val generic: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.generic with Double = js.native
    
    /* 3 */ val nfc: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.nfc with Double = js.native
    
    /* 2 */ val tpm: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.tpm with Double = js.native
    
    /* 4 */ val uicc: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.uicc with Double = js.native
  }
  
  /** Specifies the smart card reader's status. */
  @js.native
  object SmartCardReaderStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus with Double
      ] = js.native
    
    /* 0 */ val disconnected: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.disconnected with Double = js.native
    
    /* 2 */ val exclusive: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.exclusive with Double = js.native
    
    /* 1 */ val ready: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.ready with Double = js.native
  }
  
  /** Specifies the smart card's status. */
  @js.native
  object SmartCardStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus with Double] = js.native
    
    /* 0 */ val disconnected: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.disconnected with Double = js.native
    
    /* 3 */ val exclusive: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.exclusive with Double = js.native
    
    /* 1 */ val ready: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.ready with Double = js.native
    
    /* 2 */ val shared: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.shared with Double = js.native
    
    /* 4 */ val unresponsive: typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.unresponsive with Double = js.native
  }
}
