package typingsSlinky.sipJs

import org.scalablytyped.runtime.StringDictionary
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
    extends typingsSlinky.sipJs.incomingMessageMod.IncomingMessage
  
  @js.native
  class IncomingRequestMessage ()
    extends typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage
  
  @js.native
  class IncomingResponseMessage ()
    extends typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
  
  @js.native
  class NameAddrHeader protected ()
    extends typingsSlinky.sipJs.nameAddrHeaderMod.NameAddrHeader {
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
      ruri: typingsSlinky.sipJs.uriMod.URI,
      fromURI: typingsSlinky.sipJs.uriMod.URI,
      toURI: typingsSlinky.sipJs.uriMod.URI
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.uriMod.URI,
      fromURI: typingsSlinky.sipJs.uriMod.URI,
      toURI: typingsSlinky.sipJs.uriMod.URI,
      options: OutgoingRequestMessageOptions
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.uriMod.URI,
      fromURI: typingsSlinky.sipJs.uriMod.URI,
      toURI: typingsSlinky.sipJs.uriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typingsSlinky.sipJs.uriMod.URI,
      fromURI: typingsSlinky.sipJs.uriMod.URI,
      toURI: typingsSlinky.sipJs.uriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
  }
  
  @js.native
  class Parameters protected ()
    extends typingsSlinky.sipJs.parametersMod.Parameters {
    def this(parameters: StringDictionary[String]) = this()
  }
  
  @js.native
  class URI protected ()
    extends typingsSlinky.sipJs.uriMod.URI {
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
    message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: String): Body = js.native
  def fromBodyLegacy(bodyLegacy: AnonBody): Body = js.native
  def getBody(message: Body): js.UndefOr[Body] = js.native
  def getBody(message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def getBody(message: typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = js.native
  def getBody(message: typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = js.native
  @js.native
  object C extends js.Object {
    val ACK: typingsSlinky.sipJs.sipJsStrings.ACK = js.native
    val BYE: typingsSlinky.sipJs.sipJsStrings.BYE = js.native
    val CANCEL: typingsSlinky.sipJs.sipJsStrings.CANCEL = js.native
    val INFO: typingsSlinky.sipJs.sipJsStrings.INFO = js.native
    val INVITE: typingsSlinky.sipJs.sipJsStrings.INVITE = js.native
    val MESSAGE: typingsSlinky.sipJs.sipJsStrings.MESSAGE = js.native
    val NOTIFY: typingsSlinky.sipJs.sipJsStrings.NOTIFY = js.native
    val OPTIONS: typingsSlinky.sipJs.sipJsStrings.OPTIONS = js.native
    val PRACK: typingsSlinky.sipJs.sipJsStrings.PRACK = js.native
    val PUBLISH: typingsSlinky.sipJs.sipJsStrings.PUBLISH = js.native
    val REFER: typingsSlinky.sipJs.sipJsStrings.REFER = js.native
    val REGISTER: typingsSlinky.sipJs.sipJsStrings.REGISTER = js.native
    val SUBSCRIBE: typingsSlinky.sipJs.sipJsStrings.SUBSCRIBE = js.native
    val UPDATE: typingsSlinky.sipJs.sipJsStrings.UPDATE = js.native
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
    ): Boolean | AnonError = js.native
    def parseHeader(
      message: typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | AnonError = js.native
    def parseMessage(data: String, logger: Logger): js.UndefOr[
        typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage | typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
      ] = js.native
  }
  
}

