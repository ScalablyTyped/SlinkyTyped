package typingsSlinky.twilioChat

import typingsSlinky.twilioChat.channelMod.Channel.NotificationLevel
import typingsSlinky.twilioChat.channelMod.Channel.Status
import typingsSlinky.twilioChat.channelsMod.Channels.DataSource
import typingsSlinky.twilioChat.memberMod.Member.Type
import typingsSlinky.twilioChat.messageMod.Message.UpdateReason
import typingsSlinky.twilioChat.mod.Client.ChannelSortingCriteria
import typingsSlinky.twilioChat.mod.Client.ChannelSortingOrder
import typingsSlinky.twilioChat.mod.Client._LogLevel
import typingsSlinky.twilioChat.userMod.User.SubscriptionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioChatStrings {
  
  @js.native
  sealed trait default extends NotificationLevel
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait active extends StObject
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait ascending extends ChannelSortingOrder
  @scala.inline
  def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait attributes
    extends UpdateReason
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.userMod.User.UpdateReason
       with typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  @scala.inline
  def attributes: attributes = "attributes".asInstanceOf[attributes]
  
  @js.native
  sealed trait author extends UpdateReason
  @scala.inline
  def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait body extends UpdateReason
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait chat
    extends DataSource
       with Type
  @scala.inline
  def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait closed extends StObject
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait createdBy
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  @scala.inline
  def createdBy: createdBy = "createdBy".asInstanceOf[createdBy]
  
  @js.native
  sealed trait dateCreated
    extends UpdateReason
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  @scala.inline
  def dateCreated: dateCreated = "dateCreated".asInstanceOf[dateCreated]
  
  @js.native
  sealed trait dateUpdated
    extends UpdateReason
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  @scala.inline
  def dateUpdated: dateUpdated = "dateUpdated".asInstanceOf[dateUpdated]
  
  @js.native
  sealed trait debug extends _LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait descending extends ChannelSortingOrder
  @scala.inline
  def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait error extends _LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait friendlyName
    extends ChannelSortingCriteria
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.userMod.User.UpdateReason
  @scala.inline
  def friendlyName: friendlyName = "friendlyName".asInstanceOf[friendlyName]
  
  @js.native
  sealed trait inactive extends StObject
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait info extends _LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait initializing extends SubscriptionState
  @scala.inline
  def initializing: initializing = "initializing".asInstanceOf[initializing]
  
  @js.native
  sealed trait invited extends Status
  @scala.inline
  def invited: invited = "invited".asInstanceOf[invited]
  
  @js.native
  sealed trait joined extends Status
  @scala.inline
  def joined: joined = "joined".asInstanceOf[joined]
  
  @js.native
  sealed trait lastConsumedMessageIndex
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  @scala.inline
  def lastConsumedMessageIndex: lastConsumedMessageIndex = "lastConsumedMessageIndex".asInstanceOf[lastConsumedMessageIndex]
  
  @js.native
  sealed trait lastConsumptionTimestamp
    extends typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  @scala.inline
  def lastConsumptionTimestamp: lastConsumptionTimestamp = "lastConsumptionTimestamp".asInstanceOf[lastConsumptionTimestamp]
  
  @js.native
  sealed trait lastMessage
    extends ChannelSortingCriteria
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  @scala.inline
  def lastMessage: lastMessage = "lastMessage".asInstanceOf[lastMessage]
  
  @js.native
  sealed trait lastUpdatedBy extends UpdateReason
  @scala.inline
  def lastUpdatedBy: lastUpdatedBy = "lastUpdatedBy".asInstanceOf[lastUpdatedBy]
  
  @js.native
  sealed trait media
    extends typingsSlinky.twilioChat.messageMod.Message.Type
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait muted extends NotificationLevel
  @scala.inline
  def muted: muted = "muted".asInstanceOf[muted]
  
  @js.native
  sealed trait notParticipating extends Status
  @scala.inline
  def notParticipating: notParticipating = "notParticipating".asInstanceOf[notParticipating]
  
  @js.native
  sealed trait notifiable
    extends typingsSlinky.twilioChat.userMod.User.UpdateReason
  @scala.inline
  def notifiable: notifiable = "notifiable".asInstanceOf[notifiable]
  
  @js.native
  sealed trait notificationLevel
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  @scala.inline
  def notificationLevel: notificationLevel = "notificationLevel".asInstanceOf[notificationLevel]
  
  @js.native
  sealed trait online
    extends typingsSlinky.twilioChat.userMod.User.UpdateReason
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait `private`
    extends typingsSlinky.twilioChat.channelMod.Channel.Type
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public
    extends typingsSlinky.twilioChat.channelMod.Channel.Type
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait roleSid
    extends typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  @scala.inline
  def roleSid: roleSid = "roleSid".asInstanceOf[roleSid]
  
  @js.native
  sealed trait silent extends _LogLevel
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait sms extends Type
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait state
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  @scala.inline
  def state: state = "state".asInstanceOf[state]
  
  @js.native
  sealed trait status
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait subscribed extends SubscriptionState
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait sync extends DataSource
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait synclist extends DataSource
  @scala.inline
  def synclist: synclist = "synclist".asInstanceOf[synclist]
  
  @js.native
  sealed trait text
    extends typingsSlinky.twilioChat.messageMod.Message.Type
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait trace extends _LogLevel
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait twilioDotchannelDotadded_to_channel
    extends typingsSlinky.twilioChat.pushnotificationMod.PushNotification.Type
  @scala.inline
  def twilioDotchannelDotadded_to_channel: twilioDotchannelDotadded_to_channel = "twilio.channel.added_to_channel".asInstanceOf[twilioDotchannelDotadded_to_channel]
  
  @js.native
  sealed trait twilioDotchannelDotinvited_to_channel
    extends typingsSlinky.twilioChat.pushnotificationMod.PushNotification.Type
  @scala.inline
  def twilioDotchannelDotinvited_to_channel: twilioDotchannelDotinvited_to_channel = "twilio.channel.invited_to_channel".asInstanceOf[twilioDotchannelDotinvited_to_channel]
  
  @js.native
  sealed trait twilioDotchannelDotnew_message
    extends typingsSlinky.twilioChat.pushnotificationMod.PushNotification.Type
  @scala.inline
  def twilioDotchannelDotnew_message: twilioDotchannelDotnew_message = "twilio.channel.new_message".asInstanceOf[twilioDotchannelDotnew_message]
  
  @js.native
  sealed trait twilioDotchannelDotremoved_from_channel
    extends typingsSlinky.twilioChat.pushnotificationMod.PushNotification.Type
  @scala.inline
  def twilioDotchannelDotremoved_from_channel: twilioDotchannelDotremoved_from_channel = "twilio.channel.removed_from_channel".asInstanceOf[twilioDotchannelDotremoved_from_channel]
  
  @js.native
  sealed trait uniqueName
    extends ChannelSortingCriteria
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  @scala.inline
  def uniqueName: uniqueName = "uniqueName".asInstanceOf[uniqueName]
  
  @js.native
  sealed trait unknown extends Status
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unsubscribed extends SubscriptionState
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
  
  @js.native
  sealed trait warn extends _LogLevel
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait whatsapp extends Type
  @scala.inline
  def whatsapp: whatsapp = "whatsapp".asInstanceOf[whatsapp]
}
