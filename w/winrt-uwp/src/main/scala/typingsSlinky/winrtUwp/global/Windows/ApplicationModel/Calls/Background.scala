package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Calls

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The classes in Windows.ApplicationModel.Calls.Background are used by device background tasks to handle changes to phone lines, call states, and voice mail counts for the device. */
@JSGlobal("Windows.ApplicationModel.Calls.Background")
@js.native
object Background extends js.Object {
  /** Used to provide the details about a call that was just blocked. */
  @js.native
  abstract class PhoneCallBlockedTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedTriggerDetails {
    /** Gets the reason why a phone call was blocked. */
    /* CompleteClass */
    override var callBlockedReason: PhoneCallBlockedReason = js.native
    /** Gets the ID of the phone call that was just blocked. */
    /* CompleteClass */
    override var lineId: String = js.native
    /** Gets the phone number of the blocked call. */
    /* CompleteClass */
    override var phoneNumber: String = js.native
  }
  
  /** Used to provide the origin details of the phone call. */
  @js.native
  abstract class PhoneCallOriginDataRequestTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallOriginDataRequestTriggerDetails {
    /** Gets the phone number for the origin of the phone call. */
    /* CompleteClass */
    override var phoneNumber: String = js.native
    /** Gets the unique identifier for this phone call. */
    /* CompleteClass */
    override var requestId: String = js.native
  }
  
  /** Used to provide the details about a change to the properties of a phone line. */
  @js.native
  abstract class PhoneLineChangedTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangedTriggerDetails {
    /** Gets a PhoneLineChangeKind value that indicates if the phone line was added, removed, or changed. */
    /* CompleteClass */
    override var changeType: PhoneLineChangeKind = js.native
    /** Gets the ID of the phone line that was added, removed, or changed. */
    /* CompleteClass */
    override var lineId: String = js.native
    /**
      * Checks a phone line against a set of flags to see if any of the specified properties of the phone line have changed.
      * @param lineProperty A set of flags which indicate the phone line properties to query for changes.
      * @return Returns true if any of the properties indicated by the lineProperty parameter have changed on the phone line.
      */
    /* CompleteClass */
    override def hasLinePropertyChanged(lineProperty: PhoneLineProperties): Boolean = js.native
  }
  
  /** Used to provide the details about a new voice mail message on a phone line. */
  @js.native
  abstract class PhoneNewVoicemailMessageTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneNewVoicemailMessageTriggerDetails {
    /** Gets the ID of the phone line for which the new voice mail arrived. */
    /* CompleteClass */
    override var lineId: String = js.native
    /** Gets the optional voice mail changed message set by an operator when they send a voice mail changed SMS. */
    /* CompleteClass */
    override var operatorMessage: String = js.native
    /** Gets the new count of voice mail messages for the phone line. */
    /* CompleteClass */
    override var voicemailCount: Double = js.native
  }
  
  /** Provides the reason why a phone call was rejected. */
  @js.native
  object PhoneCallBlockedReason extends js.Object {
    /* 0 */ val inCallBlockingList: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.inCallBlockingList with Double = js.native
    /* 1 */ val privateNumber: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.privateNumber with Double = js.native
    /* 2 */ val unknownNumber: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.unknownNumber with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason with Double
      ] = js.native
  }
  
  /** Indicates the type of change for a background phone line change trigger. */
  @js.native
  object PhoneLineChangeKind extends js.Object {
    /* 0 */ val added: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.added with Double = js.native
    /* 2 */ val propertiesChanged: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.propertiesChanged with Double = js.native
    /* 1 */ val removed: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.removed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind with Double
      ] = js.native
  }
  
  /** Indicates a set of property flags that are part of a phone line changed trigger. Multiple properties can be set at one time. */
  @js.native
  object PhoneLineProperties extends js.Object {
    /* 1 */ val brandingOptions: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.brandingOptions with Double = js.native
    /* 2 */ val canDial: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.canDial with Double = js.native
    /* 3 */ val cellularDetails: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.cellularDetails with Double = js.native
    /* 4 */ val displayColor: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.displayColor with Double = js.native
    /* 5 */ val displayName: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.displayName with Double = js.native
    /* 6 */ val networkName: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.networkName with Double = js.native
    /* 7 */ val networkState: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.networkState with Double = js.native
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.none with Double = js.native
    /* 8 */ val transport: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.transport with Double = js.native
    /* 9 */ val voicemail: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.voicemail with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties with Double
      ] = js.native
  }
  
  /** Indicates a type of event for a phone trigger. */
  @js.native
  object PhoneTriggerType extends js.Object {
    /* 3 */ val airplaneModeDisabledForEmergencyCall: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.airplaneModeDisabledForEmergencyCall with Double = js.native
    /* 5 */ val callBlocked: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callBlocked with Double = js.native
    /* 1 */ val callHistoryChanged: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callHistoryChanged with Double = js.native
    /* 4 */ val callOriginDataRequest: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callOriginDataRequest with Double = js.native
    /* 2 */ val lineChanged: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.lineChanged with Double = js.native
    /* 0 */ val newVoicemailMessage: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.newVoicemailMessage with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType with Double
      ] = js.native
  }
  
}

