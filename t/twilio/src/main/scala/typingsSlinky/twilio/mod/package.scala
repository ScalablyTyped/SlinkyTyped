package typingsSlinky.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typingsSlinky.twilio.mod.RestClient = typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.twilio.mod.RestClient]
  @scala.inline
  def apply(
    sid: js.UndefOr[scala.Nothing],
    tkn: js.UndefOr[scala.Nothing],
    options: typingsSlinky.twilio.mod.ClientOptions
  ): typingsSlinky.twilio.mod.RestClient = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: js.UndefOr[scala.Nothing], tkn: java.lang.String): typingsSlinky.twilio.mod.RestClient = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.twilio.mod.RestClient]
  @scala.inline
  def apply(
    sid: js.UndefOr[scala.Nothing],
    tkn: java.lang.String,
    options: typingsSlinky.twilio.mod.ClientOptions
  ): typingsSlinky.twilio.mod.RestClient = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: java.lang.String): typingsSlinky.twilio.mod.RestClient = typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.twilio.mod.RestClient]
  @scala.inline
  def apply(
    sid: java.lang.String,
    tkn: js.UndefOr[scala.Nothing],
    options: typingsSlinky.twilio.mod.ClientOptions
  ): typingsSlinky.twilio.mod.RestClient = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: java.lang.String, tkn: java.lang.String): typingsSlinky.twilio.mod.RestClient = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: java.lang.String, tkn: java.lang.String, options: typingsSlinky.twilio.mod.ClientOptions): typingsSlinky.twilio.mod.RestClient = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.twilio.mod.RestClient]
  
  type AddressResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.AddressInstance]
  
  type AlertInstance = typingsSlinky.twilio.mod.Resource
  
  type ApplicationInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type ApplicationResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.ApplicationInstance]
  
  type AuthorizedConnectAppInstance = typingsSlinky.twilio.mod.Resource
  
  type AuthorizedConnectAppResource = typingsSlinky.twilio.mod.MappedResource[typingsSlinky.twilio.mod.AuthorizedConnectAppInstance]
  
  type AvailablePhoneNumberResource = typingsSlinky.twilio.mod.BaseMappedResource[typingsSlinky.twilio.mod.AvailablePhoneNumberInstance]
  
  type BaseMappedResource[T] = js.Function1[/* resourceSid */ java.lang.String, T]
  
  type CallFeedbackSummaryInstance = typingsSlinky.twilio.mod.DeletableResource
  
  type CallNotificationResource = typingsSlinky.twilio.mod.ListableResource
  
  type CallRecordingResource = typingsSlinky.twilio.mod.ListableResource
  
  type ConnectAppResource = typingsSlinky.twilio.mod.MappedResource[typingsSlinky.twilio.mod.ConnectAppInstance]
  
  type CountryInstance = typingsSlinky.twilio.mod.Resource
  
  type CredentialInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type CredentialListMappingInstance = typingsSlinky.twilio.mod.DeletableResource
  
  type CredentialListMappingResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.CredentialListMappingInstance]
  
  type CredentialListResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.CredentialListInstance]
  
  type CredentialResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.CredentialInstance]
  
  type DependentPhoneNumberResource = typingsSlinky.twilio.mod.ListableResource
  
  type DomainResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.DomainInstance]
  
  type EventInstance = typingsSlinky.twilio.mod.Resource
  
  type IPAccessControlListMappingInstance = typingsSlinky.twilio.mod.DeletableResource
  
  type IPAccessControlListMappingResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.IPAccessControlListMappingInstance]
  
  type IPAccessControlListResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.IPAccessControlListInstance]
  
  type IPAddressInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type IPAddressResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.IPAddressInstance]
  
  type KeyInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type KeyResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.KeyInstance]
  
  type MessageMediaInstance = typingsSlinky.twilio.mod.DeletableResource
  
  type MessageResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.MessageInstance]
  
  type MiddlewareFunction = js.Function3[
    /* request */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* response */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    scala.Unit
  ]
  
  type NotificationInstance = typingsSlinky.twilio.mod.DeletableResource
  
  type NotificationResource = typingsSlinky.twilio.mod.MappedResource[typingsSlinky.twilio.mod.NotificationInstance]
  
  type NumberInstance = typingsSlinky.twilio.mod.Resource
  
  type OriginationURLInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type OriginationURLResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.OriginationURLInstance]
  
  type OutgoingCallerIdResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.OutgoingCallerIdInstance]
  
  type PhoneNumberInstance = typingsSlinky.twilio.mod.Resource
  
  type PhoneNumberResource = typingsSlinky.twilio.mod.BaseMappedResource[typingsSlinky.twilio.mod.PhoneNumberInstance]
  
  type QueueResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.QueueInstance]
  
  type RecordingTranscriptionResource = typingsSlinky.twilio.mod.ListableResource
  
  type RequestCallback = js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  
  type SMSMessageInstance = typingsSlinky.twilio.mod.Resource
  
  type SMSMessageResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.SMSMessageInstance]
  
  type SMSShortCodeResource = typingsSlinky.twilio.mod.MappedResource[typingsSlinky.twilio.mod.SMSShortCodeInstance]
  
  type ServiceChannelMemberInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type ServiceChannelMemberResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.ServiceChannelMemberInstance]
  
  type ServiceChannelMessageInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type ServiceChannelMessageResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.ServiceChannelMessageInstance]
  
  type ServiceChannelResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.ServiceChannelInstance]
  
  type ServiceResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.ServiceInstance]
  
  type ServiceRoleInstance = typingsSlinky.twilio.mod.Resource
  
  type ServiceUserInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type ServiceUserResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.ServiceUserInstance]
  
  type TranscriptionInstance = typingsSlinky.twilio.mod.DeletableResource
  
  type TranscriptionResource = typingsSlinky.twilio.mod.MappedResource[typingsSlinky.twilio.mod.TranscriptionInstance]
  
  type TrunkResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.TrunkInstance]
  
  type TwimlCallback = js.Function1[/* node */ typingsSlinky.twilio.mod.Node, scala.Unit]
  
  type UsageRecordInstance = typingsSlinky.twilio.mod.Resource
  
  type UsageRecordRange = typingsSlinky.twilio.mod.ListableResource
  
  type UsageTriggerInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type UsageTriggerResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.UsageTriggerInstance]
  
  type WorkspaceActivityInstance = typingsSlinky.twilio.mod.InstanceResource
  
  type WorkspaceActivityResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.WorkspaceActivityInstance]
  
  type WorkspaceEventInstance = typingsSlinky.twilio.mod.Resource
  
  type WorkspaceInstanceStatisticResource = typingsSlinky.twilio.mod.Resource
  
  type WorkspaceResource = typingsSlinky.twilio.mod.CreatableMappedResource[typingsSlinky.twilio.mod.WorkspaceInstance]
  
  type WorkspaceStatisticResource = typingsSlinky.twilio.mod.ListableResource
  
  type WorkspaceTaskResource = typingsSlinky.twilio.mod.ListMappedResource[typingsSlinky.twilio.mod.WorkspaceTaskInstance]
  
  type twilio = js.Function3[
    /* sid */ js.UndefOr[java.lang.String], 
    /* tkn */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typingsSlinky.twilio.mod.ClientOptions], 
    typingsSlinky.twilio.mod.RestClient
  ]
  
  @scala.inline
  def validateExpressRequest(
    request: typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      _, 
      _, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ],
    authToken: java.lang.String
  ): scala.Boolean = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateExpressRequest")(request.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def validateExpressRequest(
    request: typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      _, 
      _, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ],
    authToken: java.lang.String,
    options: typingsSlinky.twilio.mod.WebhookExpressOptions
  ): scala.Boolean = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateExpressRequest")(request.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def validateRequest(authToken: java.lang.String, twilioHeader: java.lang.String, url: java.lang.String): scala.Boolean = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateRequest")(authToken.asInstanceOf[js.Any], twilioHeader.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def validateRequest(authToken: java.lang.String, twilioHeader: java.lang.String, url: java.lang.String, params: js.Any): scala.Boolean = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateRequest")(authToken.asInstanceOf[js.Any], twilioHeader.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def webhook(): typingsSlinky.twilio.mod.MiddlewareFunction = typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("webhook")().asInstanceOf[typingsSlinky.twilio.mod.MiddlewareFunction]
  @scala.inline
  def webhook(authToken: java.lang.String): typingsSlinky.twilio.mod.MiddlewareFunction = typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(authToken.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.twilio.mod.MiddlewareFunction]
  @scala.inline
  def webhook(authToken: java.lang.String, options: typingsSlinky.twilio.mod.WebhookOptions): typingsSlinky.twilio.mod.MiddlewareFunction = (typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(authToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.twilio.mod.MiddlewareFunction]
  @scala.inline
  def webhook(options: typingsSlinky.twilio.mod.WebhookOptions): typingsSlinky.twilio.mod.MiddlewareFunction = typingsSlinky.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.twilio.mod.MiddlewareFunction]
}
