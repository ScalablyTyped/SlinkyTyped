package typingsSlinky.sipJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sipJs.anon.Error
import typingsSlinky.sipJs.bodyMod.Body
import typingsSlinky.sipJs.logMod.LoggerFactory
import typingsSlinky.sipJs.loggerMod.Logger
import typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessageOptions
import typingsSlinky.sipJs.outgoingResponseMod.OutgoingResponse
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages", JSImport.Namespace)
@js.native
object messagesMod extends js.Object {
  @js.native
  class DigestAuthentication protected ()
    extends typingsSlinky.sipJs.digestAuthenticationMod.DigestAuthentication {
    /**
      * Constructor.
      * @param loggerFactory - LoggerFactory.
      * @param username - Username.
      * @param password - Password.
      */
    def this(loggerFactory: LoggerFactory) = this()
    def this(loggerFactory: LoggerFactory, ha1: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: js.UndefOr[scala.Nothing], username: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: String) = this()
    def this(
      loggerFactory: LoggerFactory,
      ha1: js.UndefOr[scala.Nothing],
      username: js.UndefOr[scala.Nothing],
      password: String
    ) = this()
    def this(loggerFactory: LoggerFactory, ha1: js.UndefOr[scala.Nothing], username: String, password: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: js.UndefOr[scala.Nothing], password: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: String, password: String) = this()
  }
  
  @js.native
  class IncomingMessage ()
    extends typingsSlinky.sipJs.incomingMessageMod.IncomingMessage
  
  @js.native
  class IncomingRequestMessage ()
    extends typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage
  
  @js.native
  class IncomingResponseMessage ()
    extends typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
  
  @js.native
  class NameAddrHeader protected ()
    extends typingsSlinky.sipJs.grammarMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(uri: typingsSlinky.sipJs.uriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
  }
  
  @js.native
  class OutgoingRequestMessage protected ()
    extends typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage {
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.grammarMod.URI,
      fromURI: typingsSlinky.sipJs.grammarMod.URI,
      toURI: typingsSlinky.sipJs.grammarMod.URI
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.grammarMod.URI,
      fromURI: typingsSlinky.sipJs.grammarMod.URI,
      toURI: typingsSlinky.sipJs.grammarMod.URI,
      options: OutgoingRequestMessageOptions
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.grammarMod.URI,
      fromURI: typingsSlinky.sipJs.grammarMod.URI,
      toURI: typingsSlinky.sipJs.grammarMod.URI,
      options: js.UndefOr[scala.Nothing],
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.grammarMod.URI,
      fromURI: typingsSlinky.sipJs.grammarMod.URI,
      toURI: typingsSlinky.sipJs.grammarMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.grammarMod.URI,
      fromURI: typingsSlinky.sipJs.grammarMod.URI,
      toURI: typingsSlinky.sipJs.grammarMod.URI,
      options: js.UndefOr[scala.Nothing],
      extraHeaders: js.UndefOr[scala.Nothing],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.grammarMod.URI,
      fromURI: typingsSlinky.sipJs.grammarMod.URI,
      toURI: typingsSlinky.sipJs.grammarMod.URI,
      options: js.UndefOr[scala.Nothing],
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.grammarMod.URI,
      fromURI: typingsSlinky.sipJs.grammarMod.URI,
      toURI: typingsSlinky.sipJs.grammarMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.UndefOr[scala.Nothing],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.grammarMod.URI,
      fromURI: typingsSlinky.sipJs.grammarMod.URI,
      toURI: typingsSlinky.sipJs.grammarMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
  }
  
  @js.native
  class Parameters protected ()
    extends typingsSlinky.sipJs.grammarMod.Parameters {
    def this(parameters: StringDictionary[String]) = this()
  }
  
  @js.native
  class URI protected ()
    extends typingsSlinky.sipJs.grammarMod.URI {
    /**
      * Constructor
      * @param scheme -
      * @param user -
      * @param host -
      * @param port -
      * @param parameters -
      * @param headers -
      */
    def this(scheme: String, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: String, user: String, host: String, port: js.UndefOr[scala.Nothing], parameters: js.Any) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      headers: js.Any
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: js.UndefOr[scala.Nothing],
      parameters: js.Any,
      headers: js.Any
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: js.UndefOr[scala.Nothing],
      headers: js.Any
    ) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
  }
  
  def constructOutgoingResponse(
    message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: String): Body = js.native
  def fromBodyLegacy(bodyLegacy: typingsSlinky.sipJs.anon.Body): Body = js.native
  def getBody(message: Body): js.UndefOr[Body] = js.native
  def getBody(message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def getBody(message: typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = js.native
  def getBody(message: typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = js.native
  @js.native
  object C extends js.Object {
    val ACK: /* "ACK" */ String = js.native
    val BYE: /* "BYE" */ String = js.native
    val CANCEL: /* "CANCEL" */ String = js.native
    val INFO: /* "INFO" */ String = js.native
    val INVITE: /* "INVITE" */ String = js.native
    val MESSAGE: /* "MESSAGE" */ String = js.native
    val NOTIFY: /* "NOTIFY" */ String = js.native
    val OPTIONS: /* "OPTIONS" */ String = js.native
    val PRACK: /* "PRACK" */ String = js.native
    val PUBLISH: /* "PUBLISH" */ String = js.native
    val REFER: /* "REFER" */ String = js.native
    val REGISTER: /* "REGISTER" */ String = js.native
    val SUBSCRIBE: /* "SUBSCRIBE" */ String = js.native
    val UPDATE: /* "UPDATE" */ String = js.native
  }
  
  @js.native
  object Grammar extends js.Object {
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    def URIParse(uri: String): js.UndefOr[typingsSlinky.sipJs.uriMod.URI] = js.native
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typingsSlinky.sipJs.nameAddrHeaderMod.NameAddrHeader] = js.native
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    def parse(input: String, startRule: String): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object OutgoingRequestMessage extends js.Object {
    /** Get a copy of the default options. */
    var getDefaultOptions: js.Any = js.native
    var makeNameAddrHeader: js.Any = js.native
  }
  
  @js.native
  object Parser extends js.Object {
    def getHeader(data: js.Any, headerStart: Double): Double = js.native
    def parseHeader(
      message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | Error = js.native
    def parseHeader(
      message: typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | Error = js.native
    def parseMessage(data: String, logger: Logger): js.UndefOr[
        typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage | typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
      ] = js.native
  }
  
}

