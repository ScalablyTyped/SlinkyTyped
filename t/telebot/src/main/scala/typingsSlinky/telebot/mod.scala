package typingsSlinky.telebot

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.telebot.anon.CacheTime
import typingsSlinky.telebot.anon.Caption
import typingsSlinky.telebot.anon.Cert
import typingsSlinky.telebot.anon.ChatId
import typingsSlinky.telebot.anon.Currency
import typingsSlinky.telebot.anon.Duration
import typingsSlinky.telebot.anon.ErrorMessage
import typingsSlinky.telebot.anon.FileName
import typingsSlinky.telebot.anon.FoursquareId
import typingsSlinky.telebot.anon.Height
import typingsSlinky.telebot.anon.InlineMessageId
import typingsSlinky.telebot.anon.InlineMsgId
import typingsSlinky.telebot.anon.Interval
import typingsSlinky.telebot.anon.Limit
import typingsSlinky.telebot.anon.MessageId
import typingsSlinky.telebot.anon.Notification
import typingsSlinky.telebot.anon.NotificationReplyMarkup
import typingsSlinky.telebot.anon.ReplyMarkup
import typingsSlinky.telebot.anon.ReplyToMessage
import typingsSlinky.telebot.anon.`0`
import typingsSlinky.telebot.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("telebot", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typingsSlinky.telebot.mod.telebot {
    def this(config: String) = this()
    def this(config: typingsSlinky.telebot.mod.config) = this()
  }
  
  @JSImport("telebot", "AnswerList")
  @js.native
  class AnswerList protected () extends StObject {
    def this(id: String) = this()
    def this(id: String, opt: js.Any) = this()
    
    def add(`type`: String): js.Any = js.native
    def add(`type`: String, set: js.Any): js.Any = js.native
    
    def addArticle(): js.Any = js.native
    def addArticle(set: js.Any): js.Any = js.native
    
    def addDocument(): js.Any = js.native
    def addDocument(set: js.Any): js.Any = js.native
    
    def addGame(): js.Any = js.native
    def addGame(set: js.Any): js.Any = js.native
    
    def addGif(): js.Any = js.native
    def addGif(set: js.Any): js.Any = js.native
    
    def addLocation(): js.Any = js.native
    def addLocation(set: js.Any): js.Any = js.native
    
    def addPhoto(): js.Any = js.native
    def addPhoto(set: js.Any): js.Any = js.native
    
    def addSticker(): js.Any = js.native
    def addSticker(set: js.Any): js.Any = js.native
    
    def addVenue(): js.Any = js.native
    def addVenue(set: js.Any): js.Any = js.native
    
    def addVideo(): js.Any = js.native
    def addVideo(set: js.Any): js.Any = js.native
    
    def addVideoGif(): js.Any = js.native
    def addVideoGif(set: js.Any): js.Any = js.native
    
    def addVoice(): js.Any = js.native
    def addVoice(set: js.Any): js.Any = js.native
    
    def cachedAudio(): js.Any = js.native
    def cachedAudio(set: js.Any): js.Any = js.native
    
    def cachedDocument(): js.Any = js.native
    def cachedDocument(set: js.Any): js.Any = js.native
    
    def cachedGif(): js.Any = js.native
    def cachedGif(set: js.Any): js.Any = js.native
    
    // Cached methods
    def cachedPhoto(): js.Any = js.native
    def cachedPhoto(set: js.Any): js.Any = js.native
    
    def cachedSticker(): js.Any = js.native
    def cachedSticker(set: js.Any): js.Any = js.native
    
    def cachedVideo(): js.Any = js.native
    def cachedVideo(set: js.Any): js.Any = js.native
    
    def cachedVideoGif(): js.Any = js.native
    def cachedVideoGif(set: js.Any): js.Any = js.native
    
    def cachedVoice(): js.Any = js.native
    def cachedVoice(set: js.Any): js.Any = js.native
    
    def results(): String = js.native
  }
  
  /* static member */
  @JSImport("telebot", "addMethods")
  @js.native
  def addMethods(methods: (genericCb | js.Any)*): js.Any = js.native
  
  @js.native
  trait config extends StObject {
    
    var allowedUpdates: js.UndefOr[js.Array[String]] = js.native
    
    // Optional. Plugin folder location relative to telebot package.
    var pluginConfig: js.UndefOr[js.Any] = js.native
    
    // Optional. Use build-in plugins from pluginFolder.
    var pluginFolder: js.UndefOr[String] = js.native
    
    // Required. Telegram Bot API token.
    var polling: js.UndefOr[Interval] = js.native
    
    var token: String = js.native
    
    // Optional. List the types of updates you want your bot to receive. Specify an empty list to receive all updates.
    var usePlugins: js.UndefOr[js.Array[String]] = js.native
    
    var webhook: js.UndefOr[Cert] = js.native
  }
  object config {
    
    @scala.inline
    def apply(token: String): config = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[config]
    }
    
    @scala.inline
    implicit class configMutableBuilder[Self <: config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedUpdates(value: js.Array[String]): Self = StObject.set(x, "allowedUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedUpdatesUndefined: Self = StObject.set(x, "allowedUpdates", js.undefined)
      
      @scala.inline
      def setAllowedUpdatesVarargs(value: String*): Self = StObject.set(x, "allowedUpdates", js.Array(value :_*))
      
      @scala.inline
      def setPluginConfig(value: js.Any): Self = StObject.set(x, "pluginConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginConfigUndefined: Self = StObject.set(x, "pluginConfig", js.undefined)
      
      @scala.inline
      def setPluginFolder(value: String): Self = StObject.set(x, "pluginFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginFolderUndefined: Self = StObject.set(x, "pluginFolder", js.undefined)
      
      @scala.inline
      def setPolling(value: Interval): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePlugins(value: js.Array[String]): Self = StObject.set(x, "usePlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePluginsUndefined: Self = StObject.set(x, "usePlugins", js.undefined)
      
      @scala.inline
      def setUsePluginsVarargs(value: String*): Self = StObject.set(x, "usePlugins", js.Array(value :_*))
      
      @scala.inline
      def setWebhook(value: Cert): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
    }
  }
  
  type genericCb = js.Function1[/* repeated */ js.Any, js.Any]
  
  @js.native
  trait module extends StObject {
    
    var defaultConfig: js.Any = js.native
    
    var id: String = js.native
    
    def plugin(args: js.Any*): Unit = js.native
  }
  object module {
    
    @scala.inline
    def apply(defaultConfig: js.Any, id: String, plugin: /* repeated */ js.Any => Unit): module = {
      val __obj = js.Dynamic.literal(defaultConfig = defaultConfig.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plugin = js.Any.fromFunction1(plugin))
      __obj.asInstanceOf[module]
    }
    
    @scala.inline
    implicit class moduleMutableBuilder[Self <: module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultConfig(value: js.Any): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "plugin", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait telebot extends StObject {
    
    def answerCallbackQuery(callback_query_id: String): Boolean = js.native
    def answerCallbackQuery(callback_query_id: String, opt: CacheTime): Boolean = js.native
    
    def answerList(id: String): AnswerList = js.native
    def answerList(id: String, opt: js.Any): AnswerList = js.native
    
    def answerPreCheckoutQuery(pre_checkout_query_id: String, ok: Boolean): Boolean = js.native
    def answerPreCheckoutQuery(pre_checkout_query_id: String, ok: Boolean, opt: `1`): Boolean = js.native
    
    def answerQuery(param: js.Any*): Boolean = js.native
    
    def answerShippingQuery(shipping_query_id: String, ok: Boolean): Boolean = js.native
    def answerShippingQuery(shipping_query_id: String, ok: Boolean, opt: ErrorMessage): Boolean = js.native
    
    def button(`type`: String): js.Any = js.native
    def button(`type`: String, text: String): js.Any = js.native
    
    def cleanEvent(`type`: String): Boolean = js.native
    
    def connect(args: js.Any*): Unit = js.native
    
    def deleteMessage(chat_id: String, from_message_id: Double): Boolean = js.native
    def deleteMessage(chat_id: Double, from_message_id: Double): Boolean = js.native
    
    def deleteWebhook(): Boolean = js.native
    
    def destroyEvent(`type`: String): Boolean = js.native
    
    def editMessageCaption(config: InlineMsgId, caption: String): js.Any | Boolean = js.native
    def editMessageCaption(config: MessageId, caption: String): js.Any | Boolean = js.native
    
    def editMessageReplyMarkup(config: InlineMsgId, replyMarkup: js.Any): js.Any | Boolean = js.native
    def editMessageReplyMarkup(config: MessageId, replyMarkup: js.Any): js.Any | Boolean = js.native
    
    def editMessageText(config: InlineMsgId, text: String): js.Any | Boolean = js.native
    def editMessageText(config: MessageId, text: String): js.Any | Boolean = js.native
    
    def event(types: String, data: js.Any): js.Promise[_] = js.native
    def event(types: String, data: js.Any, self: js.Any): js.Promise[_] = js.native
    def event(types: js.Array[String], data: js.Any): js.Promise[_] = js.native
    def event(types: js.Array[String], data: js.Any, self: js.Any): js.Promise[_] = js.native
    
    def forwardMessage(chat_id: String, from_chat_id: String, message_id: Double): js.Any = js.native
    def forwardMessage(chat_id: String, from_chat_id: String, message_id: Double, opt: `0`): js.Any = js.native
    def forwardMessage(chat_id: String, from_chat_id: Double, message_id: Double): js.Any = js.native
    def forwardMessage(chat_id: String, from_chat_id: Double, message_id: Double, opt: `0`): js.Any = js.native
    def forwardMessage(chat_id: Double, from_chat_id: String, message_id: Double): js.Any = js.native
    def forwardMessage(chat_id: Double, from_chat_id: String, message_id: Double, opt: `0`): js.Any = js.native
    def forwardMessage(chat_id: Double, from_chat_id: Double, message_id: Double): js.Any = js.native
    def forwardMessage(chat_id: Double, from_chat_id: Double, message_id: Double, opt: `0`): js.Any = js.native
    
    def getChat(chat_id: String): js.Any = js.native
    def getChat(chat_id: Double): js.Any = js.native
    
    def getChatAdministrators(chat_id: String): js.Array[_] | js.Any = js.native
    def getChatAdministrators(chat_id: Double): js.Array[_] | js.Any = js.native
    
    def getChatMember(chat_id: String, user_id: Double): js.Any = js.native
    def getChatMember(chat_id: Double, user_id: Double): js.Any = js.native
    
    def getChatMembersCount(chat_id: String): Double = js.native
    def getChatMembersCount(chat_id: Double): Double = js.native
    
    def getFile(file_id: String): js.Any = js.native
    
    def getGameHighScores(user_id: Double): js.Array[_] = js.native
    def getGameHighScores(user_id: Double, opt: InlineMessageId): js.Array[_] = js.native
    
    // Telegram API
    def getMe(): js.Any = js.native
    
    def getUpdates(offset: Double, limit: Double, timeout: Double, allowed_updates: String): Unit = js.native
    def getUpdates(offset: Double, limit: Double, timeout: Double, allowed_updates: js.Array[String]): Unit = js.native
    
    def getUserProfilePhotos(user_id: Double): js.Any = js.native
    def getUserProfilePhotos(user_id: Double, opt: Limit): js.Any = js.native
    
    def getWebhookInfo(): js.Any = js.native
    
    def inlineButton(text: String): js.Any = js.native
    def inlineButton(text: String, opt: js.Any): js.Any = js.native
    
    def inlineKeyboard(inlineButtons: js.Array[js.Array[_]]): js.Any = js.native
    
    def inlineQueryKeyboard(config: js.Array[js.Array[_]]): js.Any = js.native
    
    // methods.js
    def keyboard(buttons: js.Array[js.Array[_]]): js.Any = js.native
    def keyboard(buttons: js.Array[js.Array[_]], opt: js.Any): js.Any = js.native
    
    def kickChatMember(chat_id: String, user_id: Double): Boolean = js.native
    def kickChatMember(chat_id: Double, user_id: Double): Boolean = js.native
    
    def leaveChat(chat_id: String): Boolean = js.native
    def leaveChat(chat_id: Double): Boolean = js.native
    
    def mod(names: String, fn: genericCb): js.Any = js.native
    def mod(names: js.Array[String], fn: genericCb): js.Any = js.native
    
    def modRun(name: String, data: js.Any): js.Any = js.native
    
    def on(types: String, fn: genericCb): Boolean = js.native
    def on(types: String, fn: genericCb, opt: js.Any): Boolean = js.native
    def on(types: js.Array[String], fn: genericCb): Boolean = js.native
    def on(types: js.Array[String], fn: genericCb, opt: js.Any): Boolean = js.native
    def on(types: js.RegExp, fn: genericCb): Boolean = js.native
    def on(types: js.RegExp, fn: genericCb, opt: js.Any): Boolean = js.native
    
    def plug(module: module): Unit = js.native
    
    def properties(form: js.Any, opt: js.Any): js.Any = js.native
    
    def receiveUpdates(updateList: js.Array[_]): js.Promise[_] = js.native
    
    def removeEvent(`type`: String, fn: genericCb): Boolean = js.native
    
    def removeMod(name: String, fn: genericCb): Boolean = js.native
    
    def request(url: String, form: js.Any, data: js.Any): js.Promise[_] = js.native
    
    def sendAction(chat_id: String, action: String): Boolean = js.native
    def sendAction(chat_id: Double, action: String): Boolean = js.native
    
    def sendAudio(chat_id: String, file: String): js.Any = js.native
    def sendAudio(chat_id: String, file: String, opt: Duration): js.Any = js.native
    def sendAudio(chat_id: String, file: js.Any): js.Any = js.native
    def sendAudio(chat_id: String, file: js.Any, opt: Duration): js.Any = js.native
    def sendAudio(chat_id: String, file: Buffer): js.Any = js.native
    def sendAudio(chat_id: String, file: Buffer, opt: Duration): js.Any = js.native
    def sendAudio(chat_id: String, file: ReadableStream): js.Any = js.native
    def sendAudio(chat_id: String, file: ReadableStream, opt: Duration): js.Any = js.native
    def sendAudio(chat_id: Double, file: String): js.Any = js.native
    def sendAudio(chat_id: Double, file: String, opt: Duration): js.Any = js.native
    def sendAudio(chat_id: Double, file: js.Any): js.Any = js.native
    def sendAudio(chat_id: Double, file: js.Any, opt: Duration): js.Any = js.native
    def sendAudio(chat_id: Double, file: Buffer): js.Any = js.native
    def sendAudio(chat_id: Double, file: Buffer, opt: Duration): js.Any = js.native
    def sendAudio(chat_id: Double, file: ReadableStream): js.Any = js.native
    def sendAudio(chat_id: Double, file: ReadableStream, opt: Duration): js.Any = js.native
    
    def sendContact(chat_id: String, number: String, firstName: String): js.Any = js.native
    def sendContact(
      chat_id: String,
      number: String,
      firstName: String,
      lastName: js.UndefOr[scala.Nothing],
      opt: NotificationReplyMarkup
    ): js.Any = js.native
    def sendContact(chat_id: String, number: String, firstName: String, lastName: String): js.Any = js.native
    def sendContact(chat_id: String, number: String, firstName: String, lastName: String, opt: NotificationReplyMarkup): js.Any = js.native
    def sendContact(chat_id: Double, number: String, firstName: String): js.Any = js.native
    def sendContact(
      chat_id: Double,
      number: String,
      firstName: String,
      lastName: js.UndefOr[scala.Nothing],
      opt: NotificationReplyMarkup
    ): js.Any = js.native
    def sendContact(chat_id: Double, number: String, firstName: String, lastName: String): js.Any = js.native
    def sendContact(chat_id: Double, number: String, firstName: String, lastName: String, opt: NotificationReplyMarkup): js.Any = js.native
    
    def sendDocument(chat_id: String, file: String): js.Any = js.native
    def sendDocument(chat_id: String, file: String, opt: Caption): js.Any = js.native
    def sendDocument(chat_id: String, file: js.Any): js.Any = js.native
    def sendDocument(chat_id: String, file: js.Any, opt: Caption): js.Any = js.native
    def sendDocument(chat_id: String, file: Buffer): js.Any = js.native
    def sendDocument(chat_id: String, file: Buffer, opt: Caption): js.Any = js.native
    def sendDocument(chat_id: String, file: ReadableStream): js.Any = js.native
    def sendDocument(chat_id: String, file: ReadableStream, opt: Caption): js.Any = js.native
    def sendDocument(chat_id: Double, file: String): js.Any = js.native
    def sendDocument(chat_id: Double, file: String, opt: Caption): js.Any = js.native
    def sendDocument(chat_id: Double, file: js.Any): js.Any = js.native
    def sendDocument(chat_id: Double, file: js.Any, opt: Caption): js.Any = js.native
    def sendDocument(chat_id: Double, file: Buffer): js.Any = js.native
    def sendDocument(chat_id: Double, file: Buffer, opt: Caption): js.Any = js.native
    def sendDocument(chat_id: Double, file: ReadableStream): js.Any = js.native
    def sendDocument(chat_id: Double, file: ReadableStream, opt: Caption): js.Any = js.native
    
    def sendGame(chat_id: String, game_short_name: String): js.Any = js.native
    def sendGame(chat_id: String, game_short_name: String, opt: NotificationReplyMarkup): js.Any = js.native
    def sendGame(chat_id: Double, game_short_name: String): js.Any = js.native
    def sendGame(chat_id: Double, game_short_name: String, opt: NotificationReplyMarkup): js.Any = js.native
    
    def sendInvoice(chat_id: String, invoiceDetails: Currency): js.Any = js.native
    def sendInvoice(chat_id: Double, invoiceDetails: Currency): js.Any = js.native
    
    def sendLocation(chat_id: String, coords: js.Tuple2[Double, Double]): js.Any = js.native
    def sendLocation(chat_id: String, coords: js.Tuple2[Double, Double], opt: NotificationReplyMarkup): js.Any = js.native
    def sendLocation(chat_id: Double, coords: js.Tuple2[Double, Double]): js.Any = js.native
    def sendLocation(chat_id: Double, coords: js.Tuple2[Double, Double], opt: NotificationReplyMarkup): js.Any = js.native
    
    def sendMessage(chat_id: String, text: String): js.Any = js.native
    def sendMessage(chat_id: String, text: String, opt: Notification): js.Any = js.native
    def sendMessage(chat_id: Double, text: String): js.Any = js.native
    def sendMessage(chat_id: Double, text: String, opt: Notification): js.Any = js.native
    
    def sendPhoto(chat_id: String, file: String): js.Any = js.native
    def sendPhoto(chat_id: String, file: String, opt: Caption): js.Any = js.native
    def sendPhoto(chat_id: String, file: js.Any): js.Any = js.native
    def sendPhoto(chat_id: String, file: js.Any, opt: Caption): js.Any = js.native
    def sendPhoto(chat_id: String, file: Buffer): js.Any = js.native
    def sendPhoto(chat_id: String, file: Buffer, opt: Caption): js.Any = js.native
    def sendPhoto(chat_id: String, file: ReadableStream): js.Any = js.native
    def sendPhoto(chat_id: String, file: ReadableStream, opt: Caption): js.Any = js.native
    def sendPhoto(chat_id: Double, file: String): js.Any = js.native
    def sendPhoto(chat_id: Double, file: String, opt: Caption): js.Any = js.native
    def sendPhoto(chat_id: Double, file: js.Any): js.Any = js.native
    def sendPhoto(chat_id: Double, file: js.Any, opt: Caption): js.Any = js.native
    def sendPhoto(chat_id: Double, file: Buffer): js.Any = js.native
    def sendPhoto(chat_id: Double, file: Buffer, opt: Caption): js.Any = js.native
    def sendPhoto(chat_id: Double, file: ReadableStream): js.Any = js.native
    def sendPhoto(chat_id: Double, file: ReadableStream, opt: Caption): js.Any = js.native
    
    def sendSticker(chat_id: String, file: String): js.Any = js.native
    def sendSticker(chat_id: String, file: String, opt: FileName): js.Any = js.native
    def sendSticker(chat_id: String, file: js.Any): js.Any = js.native
    def sendSticker(chat_id: String, file: js.Any, opt: FileName): js.Any = js.native
    def sendSticker(chat_id: String, file: Buffer): js.Any = js.native
    def sendSticker(chat_id: String, file: Buffer, opt: FileName): js.Any = js.native
    def sendSticker(chat_id: String, file: ReadableStream): js.Any = js.native
    def sendSticker(chat_id: String, file: ReadableStream, opt: FileName): js.Any = js.native
    def sendSticker(chat_id: Double, file: String): js.Any = js.native
    def sendSticker(chat_id: Double, file: String, opt: FileName): js.Any = js.native
    def sendSticker(chat_id: Double, file: js.Any): js.Any = js.native
    def sendSticker(chat_id: Double, file: js.Any, opt: FileName): js.Any = js.native
    def sendSticker(chat_id: Double, file: Buffer): js.Any = js.native
    def sendSticker(chat_id: Double, file: Buffer, opt: FileName): js.Any = js.native
    def sendSticker(chat_id: Double, file: ReadableStream): js.Any = js.native
    def sendSticker(chat_id: Double, file: ReadableStream, opt: FileName): js.Any = js.native
    
    def sendVenue(chat_id: String, coords: js.Tuple2[Double, Double], title: String, address: String): js.Any = js.native
    def sendVenue(
      chat_id: String,
      coords: js.Tuple2[Double, Double],
      title: String,
      address: String,
      opt: FoursquareId
    ): js.Any = js.native
    def sendVenue(chat_id: Double, coords: js.Tuple2[Double, Double], title: String, address: String): js.Any = js.native
    def sendVenue(
      chat_id: Double,
      coords: js.Tuple2[Double, Double],
      title: String,
      address: String,
      opt: FoursquareId
    ): js.Any = js.native
    
    def sendVideo(chat_id: String, file: String): js.Any = js.native
    def sendVideo(chat_id: String, file: String, opt: Height): js.Any = js.native
    def sendVideo(chat_id: String, file: js.Any): js.Any = js.native
    def sendVideo(chat_id: String, file: js.Any, opt: Height): js.Any = js.native
    def sendVideo(chat_id: String, file: Buffer): js.Any = js.native
    def sendVideo(chat_id: String, file: Buffer, opt: Height): js.Any = js.native
    def sendVideo(chat_id: String, file: ReadableStream): js.Any = js.native
    def sendVideo(chat_id: String, file: ReadableStream, opt: Height): js.Any = js.native
    def sendVideo(chat_id: Double, file: String): js.Any = js.native
    def sendVideo(chat_id: Double, file: String, opt: Height): js.Any = js.native
    def sendVideo(chat_id: Double, file: js.Any): js.Any = js.native
    def sendVideo(chat_id: Double, file: js.Any, opt: Height): js.Any = js.native
    def sendVideo(chat_id: Double, file: Buffer): js.Any = js.native
    def sendVideo(chat_id: Double, file: Buffer, opt: Height): js.Any = js.native
    def sendVideo(chat_id: Double, file: ReadableStream): js.Any = js.native
    def sendVideo(chat_id: Double, file: ReadableStream, opt: Height): js.Any = js.native
    
    def sendVideoNote(chat_id: String, file: String): js.Any = js.native
    def sendVideoNote(chat_id: String, file: String, opt: ReplyMarkup): js.Any = js.native
    def sendVideoNote(chat_id: String, file: js.Any): js.Any = js.native
    def sendVideoNote(chat_id: String, file: js.Any, opt: ReplyMarkup): js.Any = js.native
    def sendVideoNote(chat_id: String, file: Buffer): js.Any = js.native
    def sendVideoNote(chat_id: String, file: Buffer, opt: ReplyMarkup): js.Any = js.native
    def sendVideoNote(chat_id: String, file: ReadableStream): js.Any = js.native
    def sendVideoNote(chat_id: String, file: ReadableStream, opt: ReplyMarkup): js.Any = js.native
    def sendVideoNote(chat_id: Double, file: String): js.Any = js.native
    def sendVideoNote(chat_id: Double, file: String, opt: ReplyMarkup): js.Any = js.native
    def sendVideoNote(chat_id: Double, file: js.Any): js.Any = js.native
    def sendVideoNote(chat_id: Double, file: js.Any, opt: ReplyMarkup): js.Any = js.native
    def sendVideoNote(chat_id: Double, file: Buffer): js.Any = js.native
    def sendVideoNote(chat_id: Double, file: Buffer, opt: ReplyMarkup): js.Any = js.native
    def sendVideoNote(chat_id: Double, file: ReadableStream): js.Any = js.native
    def sendVideoNote(chat_id: Double, file: ReadableStream, opt: ReplyMarkup): js.Any = js.native
    
    def sendVoice(chat_id: String, file: String): js.Any = js.native
    def sendVoice(chat_id: String, file: String, opt: ReplyToMessage): js.Any = js.native
    def sendVoice(chat_id: String, file: js.Any): js.Any = js.native
    def sendVoice(chat_id: String, file: js.Any, opt: ReplyToMessage): js.Any = js.native
    def sendVoice(chat_id: String, file: Buffer): js.Any = js.native
    def sendVoice(chat_id: String, file: Buffer, opt: ReplyToMessage): js.Any = js.native
    def sendVoice(chat_id: String, file: ReadableStream): js.Any = js.native
    def sendVoice(chat_id: String, file: ReadableStream, opt: ReplyToMessage): js.Any = js.native
    def sendVoice(chat_id: Double, file: String): js.Any = js.native
    def sendVoice(chat_id: Double, file: String, opt: ReplyToMessage): js.Any = js.native
    def sendVoice(chat_id: Double, file: js.Any): js.Any = js.native
    def sendVoice(chat_id: Double, file: js.Any, opt: ReplyToMessage): js.Any = js.native
    def sendVoice(chat_id: Double, file: Buffer): js.Any = js.native
    def sendVoice(chat_id: Double, file: Buffer, opt: ReplyToMessage): js.Any = js.native
    def sendVoice(chat_id: Double, file: ReadableStream): js.Any = js.native
    def sendVoice(chat_id: Double, file: ReadableStream, opt: ReplyToMessage): js.Any = js.native
    
    def setGameScore(user_id: Double, score: Double): Boolean | js.Error | js.Any = js.native
    def setGameScore(user_id: Double, score: Double, opt: ChatId): Boolean | js.Error | js.Any = js.native
    
    def setWebhook(url: String): Boolean = js.native
    def setWebhook(
      url: String,
      certificate: js.UndefOr[scala.Nothing],
      allowed_updates: js.UndefOr[scala.Nothing],
      max_connections: Double
    ): Boolean = js.native
    def setWebhook(url: String, certificate: js.UndefOr[scala.Nothing], allowed_updates: js.Array[String]): Boolean = js.native
    def setWebhook(
      url: String,
      certificate: js.UndefOr[scala.Nothing],
      allowed_updates: js.Array[String],
      max_connections: Double
    ): Boolean = js.native
    def setWebhook(url: String, certificate: js.Any): Boolean = js.native
    def setWebhook(
      url: String,
      certificate: js.Any,
      allowed_updates: js.UndefOr[scala.Nothing],
      max_connections: Double
    ): Boolean = js.native
    def setWebhook(url: String, certificate: js.Any, allowed_updates: js.Array[String]): Boolean = js.native
    def setWebhook(url: String, certificate: js.Any, allowed_updates: js.Array[String], max_connections: Double): Boolean = js.native
    
    def start(args: js.Any*): Unit = js.native
    
    def stop(message: String): Unit = js.native
    
    def unbanChatMember(chat_id: String, user_id: Double): Boolean = js.native
    def unbanChatMember(chat_id: Double, user_id: Double): Boolean = js.native
    
    def use(module: module): Unit = js.native
  }
}
