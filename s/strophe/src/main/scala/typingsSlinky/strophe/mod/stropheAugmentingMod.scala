package typingsSlinky.strophe.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.strophe.mod.Strophe.ConnectionOptions
import typingsSlinky.strophe.mod.Strophe.LogLevel
import typingsSlinky.strophe.mod.Strophe.SASLMechanism
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stropheAugmentingMod {
  
  @JSImport("Strophe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Class: Strophe.Builder
    *  XML DOM builder.
    *
    *  This object provides an interface similar to JQuery but for building
    *  DOM element easily and rapidly.  All the functions except for toString()
    *  and tree() return the object, so calls can be chained.  Here's an
    *  example using the $iq() builder helper.
    *  > $iq({to: 'you', from: 'me', type: 'get', id: '1'})
    *  >     .c('query', {xmlns: 'strophe:example'})
    *  >     .c('example')
    *  >     .toString()
    *  The above generates this XML fragment
    *  > <iq to='you' from='me' type='get' id='1'>
    *  >   <query xmlns='strophe:example'>
    *  >     <example/>
    *  >   </query>
    *  > </iq>
    *  The corresponding DOM manipulations to get a similar fragment would be
    *  a lot more tedious and probably involve several helper variables.
    *
    *  Since adding children makes new operations operate on the child, up()
    *  is provided to traverse up the tree.  To add two children, do
    *  > builder.c('child1', ...).up().c('child2', ...)
    *  The next operation on the Builder will be relative to the second child.
    */
  @JSImport("Strophe", "Builder")
  @js.native
  class Builder protected ()
    extends typingsSlinky.strophe.mod.Strophe.Builder {
    /** Constructor: Strophe.Builder
      *  Create a Strophe.Builder object.
      *
      *  The attributes should be passed in object notation.  For example
      *  > var b = new Builder('message', {to: 'you', from: 'me'});
      *  or
      *  > var b = new Builder('messsage', {'xml:lang': 'en'});
      *
      *  Parameters:
      *    (String) name - The name of the root element.
      *    (Object) attrs - The attributes for the root element in object notation.
      *
      *  Returns:
      *    A new Strophe.Builder.
      */
    def this(name: String) = this()
    def this(name: String, attrs: js.Any) = this()
  }
  
  /** Class: Strophe.Connection
    *  XMPP Connection manager.
    *
    *  This class is the main part of Strophe.  It manages a BOSH connection
    *  to an XMPP server and dispatches events to the user callbacks as
    *  data arrives.  It supports SASL PLAIN, SASL DIGEST-MD5, SASL SCRAM-SHA1
    *  and legacy authentication.
    *
    *  After creating a Strophe.Connection object, the user will typically
    *  call connect() with a user supplied callback to handle connection level
    *  events like authentication failure, disconnection, or connection
    *  complete.
    *
    *  The user will also have several event handlers defined by using
    *  addHandler() and addTimedHandler().  These will allow the user code to
    *  respond to interesting stanzas or do something periodically with the
    *  connection.  These handlers will be active once authentication is
    *  finished.
    *
    *  To send data to the connection, use send().
    */
  @JSImport("Strophe", "Connection")
  @js.native
  class Connection protected ()
    extends typingsSlinky.strophe.mod.Strophe.Connection {
    //todo: what other members are meant to be public?
    /** Constructor: Strophe.Connection
      *  Create and initialize a Strophe.Connection object.
      *
      *  The transport-protocol for this connection will be chosen automatically
      *  based on the given service parameter. URLs starting with "ws://" or
      *  "wss://" will use WebSockets, URLs starting with "http://", "https://"
      *  or without a protocol will use BOSH.
      *
      *  To make Strophe connect to the current host you can leave out the protocol
      *  and host part and just pass the path, e.g.
      *
      *  > var conn = new Strophe.Connection("/http-bind/");
      *
      *  WebSocket options:
      *
      *  If you want to connect to the current host with a WebSocket connection you
      *  can tell Strophe to use WebSockets through a "protocol" attribute in the
      *  optional options parameter. Valid values are "ws" for WebSocket and "wss"
      *  for Secure WebSocket.
      *  So to connect to "wss://CURRENT_HOSTNAME/xmpp-websocket" you would call
      *
      *  > var conn = new Strophe.Connection("/xmpp-websocket/", {protocol: "wss"});
      *
      *  Note that relative URLs _NOT_ starting with a "/" will also include the path
      *  of the current site.
      *
      *  Also because downgrading security is not permitted by browsers, when using
      *  relative URLs both BOSH and WebSocket connections will use their secure
      *  variants if the current connection to the site is also secure (https).
      *
      *  BOSH options:
      *
      *  by adding "sync" to the options, you can control if requests will
      *  be made synchronously or not. The default behaviour is asynchronous.
      *  If you want to make requests synchronous, make "sync" evaluate to true:
      *  > var conn = new Strophe.Connection("/http-bind/", {sync: true});
      *  You can also toggle this on an already established connection:
      *  > conn.options.sync = true;
      *
      *
      *  Parameters:
      *    (String) service - The BOSH or WebSocket service URL.
      *    (Object) options - A hash of configuration options
      *
      *  Returns:
      *    A new Strophe.Connection object.
      */
    def this(service: String) = this()
    def this(service: String, options: ConnectionOptions) = this()
  }
  
  /** Constants: Log Level Constants
    *  Logging level indicators.
    *
    *  LogLevel.DEBUG - Debug output
    *  LogLevel.INFO - Informational output
    *  LogLevel.WARN - Warnings
    *  LogLevel.ERROR - Errors
    *  LogLevel.FATAL - Fatal errors
    */
  @JSImport("Strophe", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.strophe.mod.Strophe.LogLevel with Double] = js.native
    
    /* 0 */ val DEBUG: typingsSlinky.strophe.mod.Strophe.LogLevel.DEBUG with Double = js.native
    
    /* 3 */ val ERROR: typingsSlinky.strophe.mod.Strophe.LogLevel.ERROR with Double = js.native
    
    /* 4 */ val FATAL: typingsSlinky.strophe.mod.Strophe.LogLevel.FATAL with Double = js.native
    
    /* 1 */ val INFO: typingsSlinky.strophe.mod.Strophe.LogLevel.INFO with Double = js.native
    
    /* 2 */ val WARN: typingsSlinky.strophe.mod.Strophe.LogLevel.WARN with Double = js.native
  }
  
  /** Constants: XMPP Namespace Constants
    *  Common namespace constants from the XMPP RFCs and XEPs.
    *
    *  NS.HTTPBIND - HTTP BIND namespace from XEP 124.
    *  NS.BOSH - BOSH namespace from XEP 206.
    *  NS.CLIENT - Main XMPP client namespace.
    *  NS.AUTH - Legacy authentication namespace.
    *  NS.ROSTER - Roster operations namespace.
    *  NS.PROFILE - Profile namespace.
    *  NS.DISCO_INFO - Service discovery info namespace from XEP 30.
    *  NS.DISCO_ITEMS - Service discovery items namespace from XEP 30.
    *  NS.MUC - Multi-User Chat namespace from XEP 45.
    *  NS.SASL - XMPP SASL namespace from RFC 3920.
    *  NS.STREAM - XMPP Streams namespace from RFC 3920.
    *  NS.BIND - XMPP Binding namespace from RFC 3920.
    *  NS.SESSION - XMPP Session namespace from RFC 3920.
    *  NS.XHTML_IM - XHTML-IM namespace from XEP 71.
    *  NS.XHTML - XHTML body namespace from XEP 71.
    */
  object NS {
    
    @JSImport("Strophe", "NS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("Strophe", "NS.AUTH")
    @js.native
    def AUTH: String = js.native
    @scala.inline
    def AUTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTH")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.BIND")
    @js.native
    def BIND: String = js.native
    @scala.inline
    def BIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIND")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.BOSH")
    @js.native
    def BOSH: String = js.native
    @scala.inline
    def BOSH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOSH")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.CLIENT")
    @js.native
    def CLIENT: String = js.native
    @scala.inline
    def CLIENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.DISCO_INFO")
    @js.native
    def DISCO_INFO: String = js.native
    @scala.inline
    def DISCO_INFO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCO_INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.DISCO_ITEMS")
    @js.native
    def DISCO_ITEMS: String = js.native
    @scala.inline
    def DISCO_ITEMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCO_ITEMS")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.FRAMING")
    @js.native
    def FRAMING: String = js.native
    @scala.inline
    def FRAMING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAMING")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.HTTPBIND")
    @js.native
    def HTTPBIND: String = js.native
    @scala.inline
    def HTTPBIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPBIND")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.MUC")
    @js.native
    def MUC: String = js.native
    @scala.inline
    def MUC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUC")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.PROFILE")
    @js.native
    def PROFILE: String = js.native
    @scala.inline
    def PROFILE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROFILE")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.ROSTER")
    @js.native
    def ROSTER: String = js.native
    @scala.inline
    def ROSTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSTER")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.SASL")
    @js.native
    def SASL: String = js.native
    @scala.inline
    def SASL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASL")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.SESSION")
    @js.native
    def SESSION: String = js.native
    @scala.inline
    def SESSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.STANZAS")
    @js.native
    def STANZAS: String = js.native
    @scala.inline
    def STANZAS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANZAS")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.STREAM")
    @js.native
    def STREAM: String = js.native
    @scala.inline
    def STREAM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.XHTML")
    @js.native
    def XHTML: String = js.native
    @scala.inline
    def XHTML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XHTML")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "NS.XHTML_IM")
    @js.native
    def XHTML_IM: String = js.native
    @scala.inline
    def XHTML_IM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XHTML_IM")(x.asInstanceOf[js.Any])
  }
  
  /** Constants: SASL mechanisms
    *  Available authentication mechanisms
    *
    *  Strophe.SASLAnonymous - SASL Anonymous authentication.
    *  Strophe.SASLPlain - SASL Plain authentication.
    *  Strophe.SASLMD5 - SASL Digest-MD5 authentication
    *  Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
    */
  @JSImport("Strophe", "SASLAnonymous")
  @js.native
  def SASLAnonymous: SASLMechanism = js.native
  @scala.inline
  def SASLAnonymous_=(x: SASLMechanism): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASLAnonymous")(x.asInstanceOf[js.Any])
  
  @JSImport("Strophe", "SASLMD5")
  @js.native
  def SASLMD5: SASLMechanism = js.native
  @scala.inline
  def SASLMD5_=(x: SASLMechanism): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASLMD5")(x.asInstanceOf[js.Any])
  
  @JSImport("Strophe", "SASLPlain")
  @js.native
  def SASLPlain: SASLMechanism = js.native
  @scala.inline
  def SASLPlain_=(x: SASLMechanism): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASLPlain")(x.asInstanceOf[js.Any])
  
  @JSImport("Strophe", "SASLSHA1")
  @js.native
  def SASLSHA1: SASLMechanism = js.native
  @scala.inline
  def SASLSHA1_=(x: SASLMechanism): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASLSHA1")(x.asInstanceOf[js.Any])
  
  /** Constants: Connection Status Constants
    *  Connection status constants for use by the connection handler
    *  callback.
    *
    *  Status.ERROR - An error has occurred
    *  Status.CONNECTING - The connection is currently being made
    *  Status.CONNFAIL - The connection attempt failed
    *  Status.AUTHENTICATING - The connection is authenticating
    *  Status.AUTHFAIL - The authentication attempt failed
    *  Status.CONNECTED - The connection has succeeded
    *  Status.DISCONNECTED - The connection has been terminated
    *  Status.DISCONNECTING - The connection is currently being terminated
    *  Status.ATTACHED - The connection has been attached
    */
  @JSImport("Strophe", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.strophe.mod.Strophe.Status with Double] = js.native
    
    /* 8 */ val ATTACHED: typingsSlinky.strophe.mod.Strophe.Status.ATTACHED with Double = js.native
    
    /* 3 */ val AUTHENTICATING: typingsSlinky.strophe.mod.Strophe.Status.AUTHENTICATING with Double = js.native
    
    /* 4 */ val AUTHFAIL: typingsSlinky.strophe.mod.Strophe.Status.AUTHFAIL with Double = js.native
    
    /* 5 */ val CONNECTED: typingsSlinky.strophe.mod.Strophe.Status.CONNECTED with Double = js.native
    
    /* 1 */ val CONNECTING: typingsSlinky.strophe.mod.Strophe.Status.CONNECTING with Double = js.native
    
    /* 2 */ val CONNFAIL: typingsSlinky.strophe.mod.Strophe.Status.CONNFAIL with Double = js.native
    
    /* 10 */ val CONNTIMEOUT: typingsSlinky.strophe.mod.Strophe.Status.CONNTIMEOUT with Double = js.native
    
    /* 6 */ val DISCONNECTED: typingsSlinky.strophe.mod.Strophe.Status.DISCONNECTED with Double = js.native
    
    /* 7 */ val DISCONNECTING: typingsSlinky.strophe.mod.Strophe.Status.DISCONNECTING with Double = js.native
    
    /* 0 */ val ERROR: typingsSlinky.strophe.mod.Strophe.Status.ERROR with Double = js.native
    
    /* 9 */ val REDIRECT: typingsSlinky.strophe.mod.Strophe.Status.REDIRECT with Double = js.native
  }
  
  /** Constant: VERSION
    *  The version of the Strophe library. Unreleased builds will have
    *  a version of head-HASH where HASH is a partial revision.
    */
  @JSImport("Strophe", "VERSION")
  @js.native
  def VERSION: String = js.native
  @scala.inline
  def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  /** Function: addConnectionPlugin
    *  Extends the Strophe.Connection object with the given plugin.
    *
    *  Parameters:
    *    (String) name - The name of the extension.
    *    (Object) ptype - The plugin's prototype.
    */
  @JSImport("Strophe", "addConnectionPlugin")
  @js.native
  def addConnectionPlugin(name: String, ptype: js.Any): Unit = js.native
  
  /** Function: addNamespace
    *  This function is used to extend the current namespaces in
    *  Strophe.NS.  It takes a key and a value with the key being the
    *  name of the new namespace, with its actual value.
    *  For example:
    *  Strophe.addNamespace('PUBSUB', "http://jabber.org/protocol/pubsub");
    *
    *  Parameters:
    *    (String) name - The name under which the namespace will be
    *      referenced under Strophe.NS
    *    (String) value - The actual namespace.
    */
  @JSImport("Strophe", "addNamespace")
  @js.native
  def addNamespace(name: String, value: String): Unit = js.native
  
  /** Function: copyElement
    *  Copy an XML DOM element.
    *
    *  This function copies a DOM element and all its descendants and returns
    *  the new copy.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    A new, copied DOM element tree.
    */
  @JSImport("Strophe", "copyElement")
  @js.native
  def copyElement(elem: Element): Element = js.native
  
  /** Function: createHtml
    *  Copy an HTML DOM element into an XML DOM.
    *
    *  This function copies a DOM element and all its descendants and returns
    *  the new copy.
    *
    *  Parameters:
    *    (Element) elem - A DOM element.
    *
    *  Returns:
    *    A new, copied DOM element tree.
    */
  @JSImport("Strophe", "createHtml")
  @js.native
  def createHtml(elem: Element): Element = js.native
  
  /** Functions: debug, info, warn, error
    *  Log a message at the appropriate Strophe.LogLevel
    *
    *  Parameters:
    *    (String) msg - The log message.
    */
  @JSImport("Strophe", "debug")
  @js.native
  def debug(msg: String): Unit = js.native
  
  @JSImport("Strophe", "error")
  @js.native
  def error(msg: String): Unit = js.native
  
  /** Function: escapeNode
    *  Escape the node part (also called local part) of a JID.
    *
    *  Parameters:
    *    (String) node - A node (or local part).
    *
    *  Returns:
    *    An escaped node (or local part).
    */
  @JSImport("Strophe", "escapeNode")
  @js.native
  def escapeNode(node: String): String = js.native
  
  @JSImport("Strophe", "fatal")
  @js.native
  def fatal(msg: String): Unit = js.native
  
  /** Function: forEachChild
    *  Map a function over some or all child elements of a given element.
    *
    *  This is a small convenience function for mapping a function over
    *  some or all of the children of an element.  If elemName is null, all
    *  children will be passed to the function, otherwise only children
    *  whose tag names match elemName will be passed.
    *
    *  Parameters:
    *    (XMLElement) elem - The element to operate on.
    *    (String) elemName - The child element tag name filter.
    *    (Function) func - The function to apply to each child.  This
    *      function should take a single argument, a DOM element.
    */
  @JSImport("Strophe", "forEachChild")
  @js.native
  def forEachChild(elem: Element, elemName: String, func: js.Function1[/* child */ Element, _]): Unit = js.native
  
  /** Function: getBareJidFromJid
    *  Get the bare JID from a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the bare JID.
    */
  @JSImport("Strophe", "getBareJidFromJid")
  @js.native
  def getBareJidFromJid(jid: String): String = js.native
  
  /** Function: getDomainFromJid
    *  Get the domain portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the domain.
    */
  @JSImport("Strophe", "getDomainFromJid")
  @js.native
  def getDomainFromJid(jid: String): String = js.native
  
  /** Function: getNodeFromJid
    *  Get the node portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the node.
    */
  @JSImport("Strophe", "getNodeFromJid")
  @js.native
  def getNodeFromJid(jid: String): String = js.native
  
  /** Function: getResourceFromJid
    *  Get the resource portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the resource.
    */
  @JSImport("Strophe", "getResourceFromJid")
  @js.native
  def getResourceFromJid(jid: String): String = js.native
  
  /** Function: getText
    *  Get the concatenation of all text children of an element.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    A String with the concatenated text of all text element children.
    */
  @JSImport("Strophe", "getText")
  @js.native
  def getText(elem: Element): String = js.native
  
  @JSImport("Strophe", "info")
  @js.native
  def info(msg: String): Unit = js.native
  
  /** Function: isTagEqual
    *  Compare an element's tag name with a string.
    *
    *  This function is case sensitive.
    *
    *  Parameters:
    *    (XMLElement) el - A DOM element.
    *    (String) name - The element name.
    *
    *  Returns:
    *    true if the element's tag name matches _el_, and false
    *    otherwise.
    */
  @JSImport("Strophe", "isTagEqual")
  @js.native
  def isTagEqual(el: Element, name: String): Boolean = js.native
  
  /** Function: log
    *  User overrideable logging function.
    *
    *  This function is called whenever the Strophe library calls any
    *  of the logging functions.  The default implementation of this
    *  function does nothing.  If client code wishes to handle the logging
    *  messages, it should override this with
    *  > Strophe.log = function (level, msg) {
    *  >   (user code here)
    *  > };
    *
    *  Please note that data sent and received over the wire is logged
    *  via Strophe.Connection.rawInput() and Strophe.Connection.rawOutput().
    *
    *  The different levels and their meanings are
    *
    *    DEBUG - Messages useful for debugging purposes.
    *    INFO - Informational messages.  This is mostly information like
    *      'disconnect was called' or 'SASL auth succeeded'.
    *    WARN - Warnings about potential problems.  This is mostly used
    *      to report transient connection errors like request timeouts.
    *    ERROR - Some error occurred.
    *    FATAL - A non-recoverable fatal error occurred.
    *
    *  Parameters:
    *    (Integer) level - The log level of the log message.  This will
    *      be one of the values in Strophe.LogLevel.
    *    (String) msg - The log message.
    */
  @JSImport("Strophe", "log")
  @js.native
  def log(level: LogLevel, msg: String): Unit = js.native
  
  /** Function: serialize
    *  Render a DOM element and all descendants to a String.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    The serialized element tree as a String.
    */
  @JSImport("Strophe", "serialize")
  @js.native
  def serialize(elem: Element): String = js.native
  @JSImport("Strophe", "serialize")
  @js.native
  def serialize(elem: typingsSlinky.strophe.mod.Strophe.Builder): String = js.native
  
  /** Function: unescapeNode
    *  Unescape a node part (also called local part) of a JID.
    *
    *  Parameters:
    *    (String) node - A node (or local part).
    *
    *  Returns:
    *    An unescaped node (or local part).
    */
  @JSImport("Strophe", "unescapeNode")
  @js.native
  def unescapeNode(node: String): String = js.native
  
  @JSImport("Strophe", "warn")
  @js.native
  def warn(msg: String): Unit = js.native
  
  /** Function: xmlElement
    *  Create an XML DOM element.
    *
    *  This function creates an XML DOM element correctly across all
    *  implementations. Note that these are not HTML DOM elements, which
    *  aren't appropriate for XMPP stanzas.
    *
    *  Parameters:
    *    (String) name - The name for the element.
    *    (Array|Object) attrs - An optional array or object containing
    *      key/value pairs to use as element attributes. The object should
    *      be in the format {'key': 'value'} or {key: 'value'}. The array
    *      should have the format [['key1', 'value1'], ['key2', 'value2']].
    *    (String) text - The text child data for the element.
    *
    *  Returns:
    *    A new XML DOM element.
    */
  @JSImport("Strophe", "xmlElement")
  @js.native
  def xmlElement(name: String): Element = js.native
  @JSImport("Strophe", "xmlElement")
  @js.native
  def xmlElement(name: String, attrs: js.UndefOr[scala.Nothing], text: String): Element = js.native
  @JSImport("Strophe", "xmlElement")
  @js.native
  def xmlElement(name: String, attrs: js.Any): Element = js.native
  @JSImport("Strophe", "xmlElement")
  @js.native
  def xmlElement(name: String, attrs: js.Any, text: String): Element = js.native
  @JSImport("Strophe", "xmlElement")
  @js.native
  def xmlElement(name: String, text: js.UndefOr[scala.Nothing], attrs: js.Any): Element = js.native
  @JSImport("Strophe", "xmlElement")
  @js.native
  def xmlElement(name: String, text: String): Element = js.native
  @JSImport("Strophe", "xmlElement")
  @js.native
  def xmlElement(name: String, text: String, attrs: js.Any): Element = js.native
  
  /** Function: xmlGenerator
    *  Get the DOM document to generate elements.
    *
    *  Returns:
    *    The currently used DOM document.
    */
  @JSImport("Strophe", "xmlGenerator")
  @js.native
  def xmlGenerator(): Document = js.native
  
  /** Function: xmlHtmlNode
    *  Creates an XML DOM html node.
    *
    *  Parameters:
    *    (String) html - The content of the html node.
    *
    *  Returns:
    *    A new XML DOM text node.
    */
  @JSImport("Strophe", "xmlHtmlNode")
  @js.native
  def xmlHtmlNode(html: String): Document = js.native
  
  /** Function: xmlTextNode
    *  Creates an XML DOM text node.
    *
    *  Provides a cross implementation version of document.createTextNode.
    *
    *  Parameters:
    *    (String) text - The content of the text node.
    *
    *  Returns:
    *    A new XML DOM text node.
    */
  @JSImport("Strophe", "xmlTextNode")
  @js.native
  def xmlTextNode(text: String): Text = js.native
  
  /*  Function: xmlescape
    *  Excapes invalid xml characters.
    *
    *  Parameters:
    *     (String) text - text to escape.
    *
    *  Returns:
    *      Escaped text.
    */
  @JSImport("Strophe", "xmlescape")
  @js.native
  def xmlescape(text: String): String = js.native
  
  /*  Function: xmlunescape
    *  Unexcapes invalid xml characters.
    *
    *  Parameters:
    *     (String) text - text to unescape.
    *
    *  Returns:
    *      Unescaped text.
    */
  @JSImport("Strophe", "xmlunescape")
  @js.native
  def xmlunescape(text: String): String = js.native
}
