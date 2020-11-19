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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioChatStrings {
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @scala.inline
  def attributes: attributes = "attributes".asInstanceOf[attributes]
  
  @scala.inline
  def author: author = "author".asInstanceOf[author]
  
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  
  @scala.inline
  def chat: chat = "chat".asInstanceOf[chat]
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @scala.inline
  def createdBy: createdBy = "createdBy".asInstanceOf[createdBy]
  
  @scala.inline
  def dateCreated: dateCreated = "dateCreated".asInstanceOf[dateCreated]
  
  @scala.inline
  def dateUpdated: dateUpdated = "dateUpdated".asInstanceOf[dateUpdated]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def descending: descending = "descending".asInstanceOf[descending]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def friendlyName: friendlyName = "friendlyName".asInstanceOf[friendlyName]
  
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def initializing: initializing = "initializing".asInstanceOf[initializing]
  
  @scala.inline
  def invited: invited = "invited".asInstanceOf[invited]
  
  @scala.inline
  def joined: joined = "joined".asInstanceOf[joined]
  
  @scala.inline
  def lastConsumedMessageIndex: lastConsumedMessageIndex = "lastConsumedMessageIndex".asInstanceOf[lastConsumedMessageIndex]
  
  @scala.inline
  def lastConsumptionTimestamp: lastConsumptionTimestamp = "lastConsumptionTimestamp".asInstanceOf[lastConsumptionTimestamp]
  
  @scala.inline
  def lastMessage: lastMessage = "lastMessage".asInstanceOf[lastMessage]
  
  @scala.inline
  def lastUpdatedBy: lastUpdatedBy = "lastUpdatedBy".asInstanceOf[lastUpdatedBy]
  
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @scala.inline
  def muted: muted = "muted".asInstanceOf[muted]
  
  @scala.inline
  def notParticipating: notParticipating = "notParticipating".asInstanceOf[notParticipating]
  
  @scala.inline
  def notifiable: notifiable = "notifiable".asInstanceOf[notifiable]
  
  @scala.inline
  def notificationLevel: notificationLevel = "notificationLevel".asInstanceOf[notificationLevel]
  
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @scala.inline
  def roleSid: roleSid = "roleSid".asInstanceOf[roleSid]
  
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  
  @scala.inline
  def state: state = "state".asInstanceOf[state]
  
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  
  @scala.inline
  def synclist: synclist = "synclist".asInstanceOf[synclist]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @scala.inline
  def twilioDotchannelDotadded_to_channel: twilioDotchannelDotadded_to_channel = "twilio.channel.added_to_channel".asInstanceOf[twilioDotchannelDotadded_to_channel]
  
  @scala.inline
  def twilioDotchannelDotinvited_to_channel: twilioDotchannelDotinvited_to_channel = "twilio.channel.invited_to_channel".asInstanceOf[twilioDotchannelDotinvited_to_channel]
  
  @scala.inline
  def twilioDotchannelDotnew_message: twilioDotchannelDotnew_message = "twilio.channel.new_message".asInstanceOf[twilioDotchannelDotnew_message]
  
  @scala.inline
  def twilioDotchannelDotremoved_from_channel: twilioDotchannelDotremoved_from_channel = "twilio.channel.removed_from_channel".asInstanceOf[twilioDotchannelDotremoved_from_channel]
  
  @scala.inline
  def uniqueName: uniqueName = "uniqueName".asInstanceOf[uniqueName]
  
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @scala.inline
  def whatsapp: whatsapp = "whatsapp".asInstanceOf[whatsapp]
  
  @js.native
  sealed trait active extends js.Object
  
  @js.native
  sealed trait ascending extends ChannelSortingOrder
  
  @js.native
  sealed trait attributes
    extends UpdateReason
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.userMod.User.UpdateReason
       with typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  
  @js.native
  sealed trait author extends UpdateReason
  
  @js.native
  sealed trait body extends UpdateReason
  
  @js.native
  sealed trait chat
    extends DataSource
       with Type
  
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait createdBy
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  
  @js.native
  sealed trait dateCreated
    extends UpdateReason
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  
  @js.native
  sealed trait dateUpdated
    extends UpdateReason
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  
  @js.native
  sealed trait debug extends _LogLevel
  
  @js.native
  sealed trait default extends NotificationLevel
  
  @js.native
  sealed trait descending extends ChannelSortingOrder
  
  @js.native
  sealed trait error extends _LogLevel
  
  @js.native
  sealed trait friendlyName
    extends ChannelSortingCriteria
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.userMod.User.UpdateReason
  
  @js.native
  sealed trait inactive extends js.Object
  
  @js.native
  sealed trait info extends _LogLevel
  
  @js.native
  sealed trait initializing extends SubscriptionState
  
  @js.native
  sealed trait invited extends Status
  
  @js.native
  sealed trait joined extends Status
  
  @js.native
  sealed trait lastConsumedMessageIndex
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
       with typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  
  @js.native
  sealed trait lastConsumptionTimestamp
    extends typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  
  @js.native
  sealed trait lastMessage
    extends ChannelSortingCriteria
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  
  @js.native
  sealed trait lastUpdatedBy extends UpdateReason
  
  @js.native
  sealed trait media
    extends typingsSlinky.twilioChat.messageMod.Message.Type
  
  @js.native
  sealed trait muted extends NotificationLevel
  
  @js.native
  sealed trait notParticipating extends Status
  
  @js.native
  sealed trait notifiable
    extends typingsSlinky.twilioChat.userMod.User.UpdateReason
  
  @js.native
  sealed trait notificationLevel
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  
  @js.native
  sealed trait online
    extends typingsSlinky.twilioChat.userMod.User.UpdateReason
  
  @js.native
  sealed trait `private`
    extends typingsSlinky.twilioChat.channelMod.Channel.Type
  
  @js.native
  sealed trait public
    extends typingsSlinky.twilioChat.channelMod.Channel.Type
  
  @js.native
  sealed trait roleSid
    extends typingsSlinky.twilioChat.memberMod.Member.UpdateReason
  
  @js.native
  sealed trait silent extends _LogLevel
  
  @js.native
  sealed trait sms extends Type
  
  @js.native
  sealed trait state
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  
  @js.native
  sealed trait status
    extends typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  
  @js.native
  sealed trait subscribed extends SubscriptionState
  
  @js.native
  sealed trait sync extends DataSource
  
  @js.native
  sealed trait synclist extends DataSource
  
  @js.native
  sealed trait text
    extends typingsSlinky.twilioChat.messageMod.Message.Type
  
  @js.native
  sealed trait trace extends _LogLevel
  
  @js.native
  sealed trait twilioDotchannelDotadded_to_channel
    extends typingsSlinky.twilioChat.pushnotificationMod.PushNotification.Type
  
  @js.native
  sealed trait twilioDotchannelDotinvited_to_channel
    extends typingsSlinky.twilioChat.pushnotificationMod.PushNotification.Type
  
  @js.native
  sealed trait twilioDotchannelDotnew_message
    extends typingsSlinky.twilioChat.pushnotificationMod.PushNotification.Type
  
  @js.native
  sealed trait twilioDotchannelDotremoved_from_channel
    extends typingsSlinky.twilioChat.pushnotificationMod.PushNotification.Type
  
  @js.native
  sealed trait uniqueName
    extends ChannelSortingCriteria
       with typingsSlinky.twilioChat.channelMod.Channel.UpdateReason
  
  @js.native
  sealed trait unknown extends Status
  
  @js.native
  sealed trait unsubscribed extends SubscriptionState
  
  @js.native
  sealed trait warn extends _LogLevel
  
  @js.native
  sealed trait whatsapp extends Type
}
