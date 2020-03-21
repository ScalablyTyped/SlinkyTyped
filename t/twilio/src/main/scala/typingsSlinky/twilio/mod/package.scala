package typingsSlinky.twilio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlertInstance = typingsSlinky.twilio.mod.Resource
  type ApplicationInstance = typingsSlinky.twilio.mod.InstanceResource
  type ApplicationResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.ApplicationInstance]
  type AuthorizedConnectAppInstance = typingsSlinky.twilio.mod.Resource
  type AvailablePhoneNumberResource = typingsSlinky.twilio.mod.BaseMappedResource[typingsSlinky.twilio.mod.AvailablePhoneNumberInstance]
  type BaseMappedResource[T] = js.Function1[/* resourceSid */ java.lang.String, T]
  type CallFeedbackSummaryInstance = typingsSlinky.twilio.mod.DeletableResource
  type CallNotificationResource = typingsSlinky.twilio.mod.ListableResource
  type CallRecordingResource = typingsSlinky.twilio.mod.ListableResource
  type CountryInstance = typingsSlinky.twilio.mod.Resource
  type CredentialInstance = typingsSlinky.twilio.mod.InstanceResource
  type CredentialListMappingInstance = typingsSlinky.twilio.mod.DeletableResource
  type DependentPhoneNumberResource = typingsSlinky.twilio.mod.ListableResource
  type EventInstance = typingsSlinky.twilio.mod.Resource
  type IPAccessControlListMappingInstance = typingsSlinky.twilio.mod.DeletableResource
  type IPAddressInstance = typingsSlinky.twilio.mod.InstanceResource
  type KeyInstance = typingsSlinky.twilio.mod.InstanceResource
  type KeyResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.KeyInstance]
  type MessageMediaInstance = typingsSlinky.twilio.mod.DeletableResource
  type MiddlewareFunction = js.Function3[
    /* request */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* response */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    scala.Unit
  ]
  type NotificationInstance = typingsSlinky.twilio.mod.DeletableResource
  type NumberInstance = typingsSlinky.twilio.mod.Resource
  type OriginationURLInstance = typingsSlinky.twilio.mod.InstanceResource
  type OutgoingCallerIdResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.OutgoingCallerIdInstance]
  type PhoneNumberInstance = typingsSlinky.twilio.mod.Resource
  type PhoneNumberResource = typingsSlinky.twilio.mod.BaseMappedResource[typingsSlinky.twilio.mod.PhoneNumberInstance]
  type QueueResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.QueueInstance]
  type RecordingTranscriptionResource = typingsSlinky.twilio.mod.ListableResource
  type RequestCallback = js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  type SMSMessageInstance = typingsSlinky.twilio.mod.Resource
  type SMSMessageResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.SMSMessageInstance]
  type ServiceChannelMemberInstance = typingsSlinky.twilio.mod.InstanceResource
  type ServiceChannelMessageInstance = typingsSlinky.twilio.mod.InstanceResource
  type ServiceRoleInstance = typingsSlinky.twilio.mod.Resource
  type ServiceUserInstance = typingsSlinky.twilio.mod.InstanceResource
  type TranscriptionInstance = typingsSlinky.twilio.mod.DeletableResource
  type TwimlCallback = js.Function1[/* node */ typingsSlinky.twilio.mod.Node, scala.Unit]
  type UsageRecordInstance = typingsSlinky.twilio.mod.Resource
  type UsageRecordRange = typingsSlinky.twilio.mod.ListableResource
  type UsageTriggerInstance = typingsSlinky.twilio.mod.InstanceResource
  type UsageTriggerResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.UsageTriggerInstance]
  type WorkspaceActivityInstance = typingsSlinky.twilio.mod.InstanceResource
  type WorkspaceEventInstance = typingsSlinky.twilio.mod.Resource
  type WorkspaceInstanceStatisticResource = typingsSlinky.twilio.mod.Resource
  type WorkspaceResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.WorkspaceInstance]
  type WorkspaceStatisticResource = typingsSlinky.twilio.mod.ListableResource
  type twilio = js.Function3[
    /* sid */ js.UndefOr[java.lang.String], 
    /* tkn */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typingsSlinky.twilio.mod.ClientOptions], 
    typingsSlinky.twilio.mod.RestClient
  ]
}
