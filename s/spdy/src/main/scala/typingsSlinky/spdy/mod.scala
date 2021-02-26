package typingsSlinky.spdy

import typingsSlinky.node.tlsMod.TlsOptions
import typingsSlinky.spdy.anon.Connection
import typingsSlinky.spdy.anon.Plain
import typingsSlinky.spdy.mod.agent.Agent
import typingsSlinky.spdy.mod.server.Server
import typingsSlinky.spdy.mod.socket.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object agent {
    
    @JSImport("spdy", "agent.Agent")
    @js.native
    class Agent ()
      extends typingsSlinky.node.httpsMod.Agent {
      def this(options: typingsSlinky.node.httpsMod.AgentOptions) = this()
    }
    
    @JSImport("spdy", "agent.PlainAgent")
    @js.native
    class PlainAgent ()
      extends typingsSlinky.node.httpMod.Agent {
      def this(opts: typingsSlinky.node.httpMod.AgentOptions) = this()
    }
    
    @JSImport("spdy", "agent.create")
    @js.native
    def create(base: js.Any, options: typingsSlinky.spdy.mod.agent.AgentOptions): Agent | typingsSlinky.spdy.mod.agent.PlainAgent = js.native
    
    @js.native
    trait AgentOptions
      extends typingsSlinky.node.httpsMod.AgentOptions {
      
      var spdy: js.UndefOr[Plain] = js.native
    }
    object AgentOptions {
      
      @scala.inline
      def apply(): typingsSlinky.spdy.mod.agent.AgentOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.spdy.mod.agent.AgentOptions]
      }
      
      @scala.inline
      implicit class AgentOptionsMutableBuilder[Self <: typingsSlinky.spdy.mod.agent.AgentOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpdy(value: Plain): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
      }
    }
  }
  
  @JSImport("spdy", "createAgent")
  @js.native
  def createAgent(base: js.Any, options: AgentOptions): Agent_ | PlainAgent = js.native
  @JSImport("spdy", "createAgent")
  @js.native
  def createAgent(options: AgentOptions): Agent_ | PlainAgent = js.native
  
  @JSImport("spdy", "createServer")
  @js.native
  def createServer(
    base: js.Any,
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
  @JSImport("spdy", "createServer")
  @js.native
  def createServer(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
  @JSImport("spdy", "createServer")
  @js.native
  def createServer(
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
  
  object request {
    
    @JSImport("spdy", "request.onNewListener")
    @js.native
    def onNewListener(`type`: String): Unit = js.native
  }
  
  object response {
    
    @JSImport("spdy", "response.end")
    @js.native
    def end(data: js.Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
    
    @JSImport("spdy", "response.writeHead")
    @js.native
    def writeHead(statusCode: Double, obj: js.Object): Unit = js.native
    @JSImport("spdy", "response.writeHead")
    @js.native
    def writeHead(statusCode: Double, reason: String, obj: js.Object): Unit = js.native
  }
  
  object server {
    
    @JSImport("spdy", "server.create")
    @js.native
    def create(
      base: js.Any,
      options: typingsSlinky.node.httpsMod.ServerOptions,
      handler: js.Function2[
          /* request */ typingsSlinky.spdy.mod.server.IncomingMessage, 
          /* response */ typingsSlinky.spdy.mod.server.ServerResponse | typingsSlinky.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = js.native
    @JSImport("spdy", "server.create")
    @js.native
    def create(
      handler: js.Function2[
          /* request */ typingsSlinky.spdy.mod.server.IncomingMessage, 
          /* response */ typingsSlinky.spdy.mod.server.ServerResponse | typingsSlinky.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = js.native
    @JSImport("spdy", "server.create")
    @js.native
    def create(
      options: typingsSlinky.node.httpsMod.ServerOptions,
      handler: js.Function2[
          /* request */ typingsSlinky.spdy.mod.server.IncomingMessage, 
          /* response */ typingsSlinky.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = js.native
    
    type IncomingMessage = typingsSlinky.node.httpMod.IncomingMessage
    
    type PlainServer = typingsSlinky.node.httpMod.Server
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.spdy.spdyStrings.h2
      - typingsSlinky.spdy.spdyStrings.spdySlash3Dot1
      - typingsSlinky.spdy.spdyStrings.spdySlash3
      - typingsSlinky.spdy.spdyStrings.spdySlash2
      - typingsSlinky.spdy.spdyStrings.httpSlash1Dot1
      - typingsSlinky.spdy.spdyStrings.httpSlash1Dot0
    */
    trait Protocol extends StObject
    object Protocol {
      
      @scala.inline
      def h2: typingsSlinky.spdy.spdyStrings.h2 = "h2".asInstanceOf[typingsSlinky.spdy.spdyStrings.h2]
      
      @scala.inline
      def httpSlash1Dot0: typingsSlinky.spdy.spdyStrings.httpSlash1Dot0 = "http/1.0".asInstanceOf[typingsSlinky.spdy.spdyStrings.httpSlash1Dot0]
      
      @scala.inline
      def httpSlash1Dot1: typingsSlinky.spdy.spdyStrings.httpSlash1Dot1 = "http/1.1".asInstanceOf[typingsSlinky.spdy.spdyStrings.httpSlash1Dot1]
      
      @scala.inline
      def spdySlash2: typingsSlinky.spdy.spdyStrings.spdySlash2 = "spdy/2".asInstanceOf[typingsSlinky.spdy.spdyStrings.spdySlash2]
      
      @scala.inline
      def spdySlash3: typingsSlinky.spdy.spdyStrings.spdySlash3 = "spdy/3".asInstanceOf[typingsSlinky.spdy.spdyStrings.spdySlash3]
      
      @scala.inline
      def spdySlash3Dot1: typingsSlinky.spdy.spdyStrings.spdySlash3Dot1 = "spdy/3.1".asInstanceOf[typingsSlinky.spdy.spdyStrings.spdySlash3Dot1]
    }
    
    @js.native
    trait PushOptions extends StObject {
      
      var method: js.UndefOr[String] = js.native
      
      var request: js.UndefOr[js.Any] = js.native
      
      var response: js.UndefOr[js.Any] = js.native
      
      var status: js.UndefOr[Double] = js.native
    }
    object PushOptions {
      
      @scala.inline
      def apply(): PushOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PushOptions]
      }
      
      @scala.inline
      implicit class PushOptionsMutableBuilder[Self <: PushOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        @scala.inline
        def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    type Server = typingsSlinky.node.httpsMod.Server
    
    @js.native
    trait ServerOptions
      extends TlsOptions
         with typingsSlinky.node.httpMod.ServerOptions {
      
      var spdy: js.UndefOr[Connection] = js.native
    }
    object ServerOptions {
      
      @scala.inline
      def apply(): typingsSlinky.spdy.mod.server.ServerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.spdy.mod.server.ServerOptions]
      }
      
      @scala.inline
      implicit class ServerOptionsMutableBuilder[Self <: typingsSlinky.spdy.mod.server.ServerOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpdy(value: Connection): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
      }
    }
    
    @js.native
    trait ServerResponse
      extends typingsSlinky.node.httpMod.ServerResponse {
      
      def push(filename: String, options: PushOptions): js.Any = js.native
    }
  }
  
  type AgentOptions = typingsSlinky.spdy.mod.agent.AgentOptions
  
  type Agent_ = Agent
  
  @js.native
  trait Handle extends StObject {
    
    def assignClientRequest(req: js.Any): Unit = js.native
    
    def assignRequest(req: js.Any): Unit = js.native
    
    def assignResponse(res: js.Any): Unit = js.native
    
    def assignSocket(socket: Socket_, options: js.Object): Unit = js.native
    
    def create(options: js.Object, stream: js.Any, socket: Socket_): Handle = js.native
    
    def emitRequest(): Unit = js.native
    
    def emitResponse(status: js.Any, headers: js.Any): Unit = js.native
    
    def getStream(): js.Any = js.native
    def getStream(callback: js.Function1[/* stream */ js.Any, Unit]): js.Any = js.native
  }
  
  type IncomingMessage = typingsSlinky.spdy.mod.server.IncomingMessage
  
  type PlainAgent = typingsSlinky.spdy.mod.agent.PlainAgent
  
  type PlainServer = typingsSlinky.spdy.mod.server.PlainServer
  
  type ServerOptions = typingsSlinky.spdy.mod.server.ServerOptions
  
  type ServerRequest = typingsSlinky.spdy.mod.server.IncomingMessage
  
  type ServerResponse = typingsSlinky.spdy.mod.server.ServerResponse
  
  type Server_ = Server
  
  type Socket_ = Socket
  
  object socket {
    
    // tslint:disable-next-line no-empty-interface
    @js.native
    trait Socket extends StObject
  }
}
