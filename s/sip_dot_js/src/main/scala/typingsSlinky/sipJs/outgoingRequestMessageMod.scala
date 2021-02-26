package typingsSlinky.sipJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sipJs.bodyMod.Body
import typingsSlinky.sipJs.grammarMod.NameAddrHeader
import typingsSlinky.sipJs.grammarMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outgoingRequestMessageMod {
  
  @JSImport("sip.js/lib/core/messages/outgoing-request-message", "OutgoingRequestMessage")
  @js.native
  class OutgoingRequestMessage protected () extends StObject {
    def this(method: String, ruri: URI, fromURI: URI, toURI: URI) = this()
    def this(method: String, ruri: URI, fromURI: URI, toURI: URI, options: OutgoingRequestMessageOptions) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: js.UndefOr[scala.Nothing],
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: js.UndefOr[scala.Nothing],
      extraHeaders: js.UndefOr[scala.Nothing],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: js.UndefOr[scala.Nothing],
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.UndefOr[scala.Nothing],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
    
    var body: js.UndefOr[typingsSlinky.sipJs.anon.Body] = js.native
    
    var branch: js.UndefOr[String] = js.native
    
    val callId: String = js.native
    
    var cseq: Double = js.native
    
    var extraHeaders: js.Array[String] = js.native
    
    val from: NameAddrHeader = js.native
    
    val fromTag: String = js.native
    
    val fromURI: URI = js.native
    
    /**
      * Get the value of the given header name at the given position.
      * @param name - header name
      * @returns Returns the specified header, undefined if header doesn't exist.
      */
    def getHeader(name: String): js.UndefOr[String] = js.native
    
    /**
      * Get the header/s of the given name.
      * @param name - header name
      * @returns Array with all the headers of the specified name.
      */
    def getHeaders(name: String): js.Array[String] = js.native
    
    /**
      * Verify the existence of the given header.
      * @param name - header name
      * @returns true if header with given name exists, false otherwise
      */
    def hasHeader(name: String): Boolean = js.native
    
    val headers: StringDictionary[js.Array[String]] = js.native
    
    val method: String = js.native
    
    var options: js.Any = js.native
    
    val ruri: URI = js.native
    
    /**
      * Replace the the given header by the given value.
      * @param name - header name
      * @param value - header value
      */
    def setHeader(name: String, value: String): Unit = js.native
    def setHeader(name: String, value: js.Array[String]): Unit = js.native
    
    /**
      * The Via header field indicates the transport used for the transaction
      * and identifies the location where the response is to be sent.  A Via
      * header field value is added only after the transport that will be
      * used to reach the next hop has been selected (which may involve the
      * usage of the procedures in [4]).
      *
      * When the UAC creates a request, it MUST insert a Via into that
      * request.  The protocol name and protocol version in the header field
      * MUST be SIP and 2.0, respectively.  The Via header field value MUST
      * contain a branch parameter.  This parameter is used to identify the
      * transaction created by that request.  This parameter is used by both
      * the client and the server.
      * https://tools.ietf.org/html/rfc3261#section-8.1.1.7
      * @param branchParameter - The branch parameter.
      * @param transport - The sent protocol transport.
      */
    def setViaHeader(branch: String, transport: String): Unit = js.native
    
    val to: NameAddrHeader = js.native
    
    val toTag: js.UndefOr[String] = js.native
    
    val toURI: URI = js.native
  }
  /* static members */
  object OutgoingRequestMessage {
    
    @JSImport("sip.js/lib/core/messages/outgoing-request-message", "OutgoingRequestMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /** Get a copy of the default options. */
    @JSImport("sip.js/lib/core/messages/outgoing-request-message", "OutgoingRequestMessage.getDefaultOptions")
    @js.native
    def getDefaultOptions: js.Any = js.native
    @scala.inline
    def getDefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/outgoing-request-message", "OutgoingRequestMessage.makeNameAddrHeader")
    @js.native
    def makeNameAddrHeader: js.Any = js.native
    @scala.inline
    def makeNameAddrHeader_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeNameAddrHeader")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait OutgoingRequestMessageOptions extends StObject {
    
    var callId: js.UndefOr[String] = js.native
    
    var callIdPrefix: js.UndefOr[String] = js.native
    
    var cseq: js.UndefOr[Double] = js.native
    
    var forceRport: js.UndefOr[Boolean] = js.native
    
    var fromDisplayName: js.UndefOr[String] = js.native
    
    var fromTag: js.UndefOr[String] = js.native
    
    var hackViaTcp: js.UndefOr[Boolean] = js.native
    
    var optionTags: js.UndefOr[js.Array[String]] = js.native
    
    var routeSet: js.UndefOr[js.Array[String]] = js.native
    
    var toDisplayName: js.UndefOr[String] = js.native
    
    var toTag: js.UndefOr[String] = js.native
    
    var userAgentString: js.UndefOr[String] = js.native
    
    var viaHost: js.UndefOr[String] = js.native
  }
  object OutgoingRequestMessageOptions {
    
    @scala.inline
    def apply(): OutgoingRequestMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingRequestMessageOptions]
    }
    
    @scala.inline
    implicit class OutgoingRequestMessageOptionsMutableBuilder[Self <: OutgoingRequestMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallId(value: String): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallIdPrefix(value: String): Self = StObject.set(x, "callIdPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallIdPrefixUndefined: Self = StObject.set(x, "callIdPrefix", js.undefined)
      
      @scala.inline
      def setCallIdUndefined: Self = StObject.set(x, "callId", js.undefined)
      
      @scala.inline
      def setCseq(value: Double): Self = StObject.set(x, "cseq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCseqUndefined: Self = StObject.set(x, "cseq", js.undefined)
      
      @scala.inline
      def setForceRport(value: Boolean): Self = StObject.set(x, "forceRport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRportUndefined: Self = StObject.set(x, "forceRport", js.undefined)
      
      @scala.inline
      def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
      
      @scala.inline
      def setFromTag(value: String): Self = StObject.set(x, "fromTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromTagUndefined: Self = StObject.set(x, "fromTag", js.undefined)
      
      @scala.inline
      def setHackViaTcp(value: Boolean): Self = StObject.set(x, "hackViaTcp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHackViaTcpUndefined: Self = StObject.set(x, "hackViaTcp", js.undefined)
      
      @scala.inline
      def setOptionTags(value: js.Array[String]): Self = StObject.set(x, "optionTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionTagsUndefined: Self = StObject.set(x, "optionTags", js.undefined)
      
      @scala.inline
      def setOptionTagsVarargs(value: String*): Self = StObject.set(x, "optionTags", js.Array(value :_*))
      
      @scala.inline
      def setRouteSet(value: js.Array[String]): Self = StObject.set(x, "routeSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteSetUndefined: Self = StObject.set(x, "routeSet", js.undefined)
      
      @scala.inline
      def setRouteSetVarargs(value: String*): Self = StObject.set(x, "routeSet", js.Array(value :_*))
      
      @scala.inline
      def setToDisplayName(value: String): Self = StObject.set(x, "toDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDisplayNameUndefined: Self = StObject.set(x, "toDisplayName", js.undefined)
      
      @scala.inline
      def setToTag(value: String): Self = StObject.set(x, "toTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToTagUndefined: Self = StObject.set(x, "toTag", js.undefined)
      
      @scala.inline
      def setUserAgentString(value: String): Self = StObject.set(x, "userAgentString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentStringUndefined: Self = StObject.set(x, "userAgentString", js.undefined)
      
      @scala.inline
      def setViaHost(value: String): Self = StObject.set(x, "viaHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViaHostUndefined: Self = StObject.set(x, "viaHost", js.undefined)
    }
  }
}
