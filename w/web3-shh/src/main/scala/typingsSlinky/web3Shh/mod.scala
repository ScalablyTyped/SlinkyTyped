package typingsSlinky.web3Shh

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.node.netMod.Socket
import typingsSlinky.web3Core.mod.Extension
import typingsSlinky.web3Core.mod.Providers
import typingsSlinky.web3Net.mod.Network
import typingsSlinky.web3Shh.web3ShhStrings.data
import typingsSlinky.web3Shh.web3ShhStrings.error
import typingsSlinky.web3Shh.web3ShhStrings.messages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-shh", "Shh")
  @js.native
  class Shh () extends StObject {
    def this(provider: typingsSlinky.web3Core.mod.provider) = this()
    def this(provider: typingsSlinky.web3Core.mod.provider, net: Socket) = this()
    
    var BatchRequest: Instantiable0[typingsSlinky.web3Core.mod.BatchRequest] = js.native
    
    def addPrivateKey(privateKey: String): js.Promise[String] = js.native
    def addPrivateKey(privateKey: String, callback: js.Function2[/* error */ js.Error, /* privateKey */ String, Unit]): js.Promise[String] = js.native
    
    def addSymKey(symKey: String): js.Promise[String] = js.native
    def addSymKey(symKey: String, callback: js.Function2[/* error */ js.Error, /* key */ String, Unit]): js.Promise[String] = js.native
    
    val currentProvider: typingsSlinky.web3Core.mod.provider = js.native
    
    def deleteKeyPair(id: String): js.Promise[Boolean] = js.native
    def deleteKeyPair(id: String, callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    def deleteMessageFilter(id: String): js.Promise[Boolean] = js.native
    def deleteMessageFilter(id: String, callback: js.Function2[/* error */ js.Error, /* result */ String, Unit]): js.Promise[Boolean] = js.native
    
    def deleteSymKey(id: String): js.Promise[Boolean] = js.native
    def deleteSymKey(id: String, callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    def extend(extension: Extension): js.Any = js.native
    
    def generateSymKeyFromPassword(password: String): js.Promise[String] = js.native
    def generateSymKeyFromPassword(password: String, callback: js.Function2[/* error */ js.Error, /* key */ String, Unit]): js.Promise[String] = js.native
    
    def getFilterMessages(id: String): js.Promise[js.Array[Notification]] = js.native
    def getFilterMessages(id: String, callback: js.Function2[/* error */ js.Error, /* result */ String, Unit]): js.Promise[js.Array[Notification]] = js.native
    
    def getInfo(): js.Promise[Info] = js.native
    def getInfo(callback: js.Function2[/* error */ js.Error, /* info */ Info, Unit]): js.Promise[Info] = js.native
    
    def getPrivateKey(id: String): js.Promise[String] = js.native
    def getPrivateKey(id: String, callback: js.Function2[/* error */ js.Error, /* privateKey */ String, Unit]): js.Promise[String] = js.native
    
    def getPublicKey(id: String): js.Promise[String] = js.native
    def getPublicKey(id: String, callback: js.Function2[/* error */ js.Error, /* publicKey */ String, Unit]): js.Promise[String] = js.native
    
    def getSymKey(id: String): js.Promise[String] = js.native
    def getSymKey(id: String, callback: js.Function2[/* error */ js.Error, /* key */ String, Unit]): js.Promise[String] = js.native
    
    def getVersion(): js.Promise[String] = js.native
    def getVersion(callback: js.Function2[/* error */ js.Error, /* version */ String, Unit]): js.Promise[String] = js.native
    
    val givenProvider: js.Any = js.native
    
    def hasKeyPair(id: String): js.Promise[Boolean] = js.native
    def hasKeyPair(id: String, callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    def hasSymKey(id: String): js.Promise[Boolean] = js.native
    def hasSymKey(id: String, callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    def markTrustedPeer(enode: String): js.Promise[Boolean] = js.native
    def markTrustedPeer(enode: String, callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    var net: Network = js.native
    
    def newKeyPair(): js.Promise[String] = js.native
    def newKeyPair(callback: js.Function2[/* error */ js.Error, /* key */ String, Unit]): js.Promise[String] = js.native
    
    def newMessageFilter(): js.Promise[String] = js.native
    def newMessageFilter(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.Error, /* result */ String, Unit]
    ): js.Promise[String] = js.native
    def newMessageFilter(options: SubscriptionOptions): js.Promise[String] = js.native
    def newMessageFilter(
      options: SubscriptionOptions,
      callback: js.Function2[/* error */ js.Error, /* result */ String, Unit]
    ): js.Promise[String] = js.native
    
    def newSymKey(): js.Promise[String] = js.native
    def newSymKey(callback: js.Function2[/* error */ js.Error, /* key */ String, Unit]): js.Promise[String] = js.native
    
    def post(`object`: PostWithPubKey): js.Promise[String] = js.native
    def post(`object`: PostWithPubKey, callback: js.Function2[/* error */ js.Error, /* result */ String, Unit]): js.Promise[String] = js.native
    def post(`object`: PostWithSymKey): js.Promise[String] = js.native
    def post(`object`: PostWithSymKey, callback: js.Function2[/* error */ js.Error, /* result */ String, Unit]): js.Promise[String] = js.native
    
    def setMaxMessageSize(size: Double): js.Promise[Boolean] = js.native
    def setMaxMessageSize(size: Double, callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    def setMinPoW(pow: Double): js.Promise[Boolean] = js.native
    def setMinPoW(pow: Double, callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    def setProvider(provider: typingsSlinky.web3Core.mod.provider): Boolean = js.native
    
    @JSName("subscribe")
    def subscribe_messages(string: messages, options: SubscriptionOptions): Subscribe = js.native
    @JSName("subscribe")
    def subscribe_messages(
      string: messages,
      options: SubscriptionOptions,
      callback: js.Function3[/* error */ js.Error, /* message */ Notification, /* subscription */ js.Any, Unit]
    ): Subscribe = js.native
  }
  /* static members */
  object Shh {
    
    @JSImport("web3-shh", "Shh.givenProvider")
    @js.native
    val givenProvider: js.Any = js.native
    
    @JSImport("web3-shh", "Shh.providers")
    @js.native
    val providers: Providers = js.native
  }
  
  @js.native
  trait Info extends StObject {
    
    var maxMessageSize: Double = js.native
    
    var memory: Double = js.native
    
    var messages: Double = js.native
    
    var minPow: Double = js.native
  }
  object Info {
    
    @scala.inline
    def apply(maxMessageSize: Double, memory: Double, messages: Double, minPow: Double): Info = {
      val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], minPow = minPow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxMessageSize(value: Double): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: Double): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPow(value: Double): Self = StObject.set(x, "minPow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Notification extends StObject {
    
    var hash: String = js.native
    
    var padding: Double = js.native
    
    var payload: String = js.native
    
    var pow: Double = js.native
    
    var recipientPublicKey: js.UndefOr[String] = js.native
    
    var sig: js.UndefOr[String] = js.native
    
    var timestamp: String = js.native
    
    var topic: String = js.native
    
    var ttl: Double = js.native
  }
  object Notification {
    
    @scala.inline
    def apply(
      hash: String,
      padding: Double,
      payload: String,
      pow: Double,
      timestamp: String,
      topic: String,
      ttl: Double
    ): Notification = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], pow = pow.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notification]
    }
    
    @scala.inline
    implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPow(value: Double): Self = StObject.set(x, "pow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientPublicKey(value: String): Self = StObject.set(x, "recipientPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientPublicKeyUndefined: Self = StObject.set(x, "recipientPublicKey", js.undefined)
      
      @scala.inline
      def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostBase extends StObject {
    
    var padding: js.UndefOr[Double] = js.native
    
    var payload: String = js.native
    
    var powTarget: js.UndefOr[Double] = js.native
    
    var powTime: js.UndefOr[Double] = js.native
    
    var sig: js.UndefOr[String] = js.native
    
    var targetPeer: js.UndefOr[Double] = js.native
    
    var topic: String = js.native
    
    var ttl: Double = js.native
  }
  object PostBase {
    
    @scala.inline
    def apply(payload: String, topic: String, ttl: Double): PostBase = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostBase]
    }
    
    @scala.inline
    implicit class PostBaseMutableBuilder[Self <: PostBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowTarget(value: Double): Self = StObject.set(x, "powTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowTargetUndefined: Self = StObject.set(x, "powTarget", js.undefined)
      
      @scala.inline
      def setPowTime(value: Double): Self = StObject.set(x, "powTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowTimeUndefined: Self = StObject.set(x, "powTime", js.undefined)
      
      @scala.inline
      def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
      
      @scala.inline
      def setTargetPeer(value: Double): Self = StObject.set(x, "targetPeer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPeerUndefined: Self = StObject.set(x, "targetPeer", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostWithPubKey extends PostBase {
    
    var pubKey: String = js.native
  }
  object PostWithPubKey {
    
    @scala.inline
    def apply(payload: String, pubKey: String, topic: String, ttl: Double): PostWithPubKey = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pubKey = pubKey.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostWithPubKey]
    }
    
    @scala.inline
    implicit class PostWithPubKeyMutableBuilder[Self <: PostWithPubKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPubKey(value: String): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostWithSymKey extends PostBase {
    
    var symKeyID: String = js.native
  }
  object PostWithSymKey {
    
    @scala.inline
    def apply(payload: String, symKeyID: String, topic: String, ttl: Double): PostWithSymKey = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], symKeyID = symKeyID.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostWithSymKey]
    }
    
    @scala.inline
    implicit class PostWithSymKeyMutableBuilder[Self <: PostWithSymKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSymKeyID(value: String): Self = StObject.set(x, "symKeyID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Subscribe extends StObject {
    
    @JSName("on")
    def on_data(`type`: data, handler: js.Function1[/* data */ Notification, Unit]): Unit = js.native
    @JSName("on")
    def on_error(`type`: error, handler: js.Function1[/* data */ js.Error, Unit]): Unit = js.native
  }
  
  @js.native
  trait SubscriptionOptions extends StObject {
    
    var allowP2P: js.UndefOr[Boolean] = js.native
    
    var minPow: js.UndefOr[Double] = js.native
    
    var privateKeyID: js.UndefOr[String] = js.native
    
    var sig: js.UndefOr[String] = js.native
    
    var symKeyID: js.UndefOr[String] = js.native
    
    var topics: js.UndefOr[js.Array[String]] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
  }
  object SubscriptionOptions {
    
    @scala.inline
    def apply(): SubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    @scala.inline
    implicit class SubscriptionOptionsMutableBuilder[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowP2P(value: Boolean): Self = StObject.set(x, "allowP2P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowP2PUndefined: Self = StObject.set(x, "allowP2P", js.undefined)
      
      @scala.inline
      def setMinPow(value: Double): Self = StObject.set(x, "minPow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPowUndefined: Self = StObject.set(x, "minPow", js.undefined)
      
      @scala.inline
      def setPrivateKeyID(value: String): Self = StObject.set(x, "privateKeyID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyIDUndefined: Self = StObject.set(x, "privateKeyID", js.undefined)
      
      @scala.inline
      def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
      
      @scala.inline
      def setSymKeyID(value: String): Self = StObject.set(x, "symKeyID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymKeyIDUndefined: Self = StObject.set(x, "symKeyID", js.undefined)
      
      @scala.inline
      def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      @scala.inline
      def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
