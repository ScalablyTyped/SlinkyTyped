package typingsSlinky.sipDotJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sipDotJs.libCoreLogLoggerMod.Logger
import typingsSlinky.sipDotJs.libCoreLogMod.LoggerFactory
import typingsSlinky.sipDotJs.libCoreMessagesBodyMod.Body
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages", JSImport.Namespace)
@js.native
object libCoreMessagesMod extends js.Object {
  @js.native
  class DigestAuthentication protected ()
    extends typingsSlinky.sipDotJs.libCoreMessagesDigestDashAuthenticationMod.DigestAuthentication {
    def this(loggerFactory: LoggerFactory) = this()
    def this(loggerFactory: LoggerFactory, username: String) = this()
    def this(loggerFactory: LoggerFactory, username: js.UndefOr[scala.Nothing], password: String) = this()
    /**
      * Constructor.
      * @param loggerFactory - LoggerFactory.
      * @param username - Username.
      * @param password - Password.
      */
    def this(loggerFactory: LoggerFactory, username: String, password: String) = this()
  }
  
  @js.native
  class IncomingMessage ()
    extends typingsSlinky.sipDotJs.libCoreMessagesIncomingDashMessageMod.IncomingMessage
  
  @js.native
  class IncomingRequestMessage ()
    extends typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
  
  @js.native
  class IncomingResponseMessage ()
    extends typingsSlinky.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  
  @js.native
  class NameAddrHeader protected ()
    extends typingsSlinky.sipDotJs.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(
      uri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      displayName: String,
      parameters: StringDictionary[String]
    ) = this()
  }
  
  @js.native
  class OutgoingRequestMessage protected ()
    extends typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage {
    def this(
      method: String,
      ruri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
  }
  
  @js.native
  class Parameters protected ()
    extends typingsSlinky.sipDotJs.libCoreMessagesParametersMod.Parameters {
    def this(parameters: StringDictionary[String]) = this()
  }
  
  @js.native
  class URI protected ()
    extends typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI {
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
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
  }
  
  def constructOutgoingResponse(
    message: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: String): Body = js.native
  def fromBodyLegacy(bodyLegacy: Anon_Body): Body = js.native
  def getBody(message: Body): js.UndefOr[Body] = js.native
  def getBody(
    message: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
  ): js.UndefOr[Body] = js.native
  def getBody(
    message: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  ): js.UndefOr[Body] = js.native
  def getBody(
    message: typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage
  ): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = js.native
  @js.native
  object C extends js.Object {
    val ACK: typingsSlinky.sipDotJs.sipDotJsStrings.ACK = js.native
    val BYE: typingsSlinky.sipDotJs.sipDotJsStrings.BYE = js.native
    val CANCEL: typingsSlinky.sipDotJs.sipDotJsStrings.CANCEL = js.native
    val INFO: typingsSlinky.sipDotJs.sipDotJsStrings.INFO = js.native
    val INVITE: typingsSlinky.sipDotJs.sipDotJsStrings.INVITE = js.native
    val MESSAGE: typingsSlinky.sipDotJs.sipDotJsStrings.MESSAGE = js.native
    val NOTIFY: typingsSlinky.sipDotJs.sipDotJsStrings.NOTIFY = js.native
    val OPTIONS: typingsSlinky.sipDotJs.sipDotJsStrings.OPTIONS = js.native
    val PRACK: typingsSlinky.sipDotJs.sipDotJsStrings.PRACK = js.native
    val PUBLISH: typingsSlinky.sipDotJs.sipDotJsStrings.PUBLISH = js.native
    val REFER: typingsSlinky.sipDotJs.sipDotJsStrings.REFER = js.native
    val REGISTER: typingsSlinky.sipDotJs.sipDotJsStrings.REGISTER = js.native
    val SUBSCRIBE: typingsSlinky.sipDotJs.sipDotJsStrings.SUBSCRIBE = js.native
    val UPDATE: typingsSlinky.sipDotJs.sipDotJsStrings.UPDATE = js.native
  }
  
  @js.native
  object Grammar extends js.Object {
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    def URIParse(uri: String): js.UndefOr[typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI] = js.native
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typingsSlinky.sipDotJs.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
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
      message: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | Anon_Error = js.native
    def parseHeader(
      message: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | Anon_Error = js.native
    def parseMessage(data: String, logger: Logger): js.UndefOr[
        typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage | typingsSlinky.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
      ] = js.native
  }
  
}

