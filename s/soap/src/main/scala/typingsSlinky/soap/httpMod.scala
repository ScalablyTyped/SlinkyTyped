package typingsSlinky.soap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.request.mod.Response
import typingsSlinky.soap.typesMod.IHeaders
import typingsSlinky.soap.typesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("soap/lib/http", "HttpClient")
  @js.native
  class HttpClient () extends StObject {
    def this(options: IOptions) = this()
    
    var _request: js.Any = js.native
    
    /**
      * Build the HTTP request (method, uri, headers, ...)
      * @param {String} rurl The resource url
      * @param {Object|String} data The payload
      * @param {Object} exheaders Extra http headers
      * @param {Object} exoptions Extra options
      * @returns {Object} The http request object for the `request` module
      */
    def buildRequest(rurl: String, data: js.Any): js.Any = js.native
    def buildRequest(rurl: String, data: js.Any, exheaders: js.UndefOr[scala.Nothing], exoptions: IExOptions): js.Any = js.native
    def buildRequest(rurl: String, data: js.Any, exheaders: IHeaders): js.Any = js.native
    def buildRequest(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions): js.Any = js.native
    
    /**
      * Handle the http response
      * @param {Object} The req object
      * @param {Object} res The res object
      * @param {Object} body The http body
      * @param {Object} The parsed body
      */
    def handleResponse(req: typingsSlinky.request.mod.Request, res: Response, body: js.Any): js.Any = js.native
    
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _]
    ): typingsSlinky.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
      exheaders: js.UndefOr[scala.Nothing],
      exoptions: js.UndefOr[scala.Nothing],
      caller: js.Any
    ): typingsSlinky.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
      exheaders: js.UndefOr[scala.Nothing],
      exoptions: IExOptions
    ): typingsSlinky.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
      exheaders: js.UndefOr[scala.Nothing],
      exoptions: IExOptions,
      caller: js.Any
    ): typingsSlinky.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
      exheaders: IHeaders
    ): typingsSlinky.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
      exheaders: IHeaders,
      exoptions: js.UndefOr[scala.Nothing],
      caller: js.Any
    ): typingsSlinky.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
      exheaders: IHeaders,
      exoptions: IExOptions
    ): typingsSlinky.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
      exheaders: IHeaders,
      exoptions: IExOptions,
      caller: js.Any
    ): typingsSlinky.request.mod.Request = js.native
    
    def requestStream(rurl: String, data: js.Any): typingsSlinky.request.mod.Request = js.native
    def requestStream(
      rurl: String,
      data: js.Any,
      exheaders: js.UndefOr[scala.Nothing],
      exoptions: js.UndefOr[scala.Nothing],
      caller: js.Any
    ): typingsSlinky.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: js.UndefOr[scala.Nothing], exoptions: IExOptions): typingsSlinky.request.mod.Request = js.native
    def requestStream(
      rurl: String,
      data: js.Any,
      exheaders: js.UndefOr[scala.Nothing],
      exoptions: IExOptions,
      caller: js.Any
    ): typingsSlinky.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: IHeaders): typingsSlinky.request.mod.Request = js.native
    def requestStream(
      rurl: String,
      data: js.Any,
      exheaders: IHeaders,
      exoptions: js.UndefOr[scala.Nothing],
      caller: js.Any
    ): typingsSlinky.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions): typingsSlinky.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions, caller: js.Any): typingsSlinky.request.mod.Request = js.native
  }
  
  @js.native
  trait IAttachment extends StObject {
    
    var body: ReadableStream = js.native
    
    var contentId: String = js.native
    
    var mimetype: String = js.native
    
    var name: String = js.native
  }
  object IAttachment {
    
    @scala.inline
    def apply(body: ReadableStream, contentId: String, mimetype: String, name: String): IAttachment = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttachment]
    }
    
    @scala.inline
    implicit class IAttachmentMutableBuilder[Self <: IAttachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type IExOptions = StringDictionary[js.Any]
  
  type Request = typingsSlinky.request.mod.Request
}
