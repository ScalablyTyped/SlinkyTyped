package typingsSlinky.swaggerExpressMiddleware.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextParserOptionItem extends js.Object {
  
  /**
    * the default charset to parse as, if not specified in content-type. (default: 'utf-8')
    */
  var defaultCharset: js.UndefOr[String] = js.native
  
  /**
    * if deflated bodies will be inflated. (default: true)
    */
  var inflate: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls the maximum request body size.
    * If this is a number, then the value specifies the number of bytes; if it is a string, the value is passed to the bytes library for parsing.
    * Defaults to '100kb'
    */
  var limit: js.UndefOr[String | Double] = js.native
  
  /**
    * The type option is used to determine what media type the middleware will parse.
    * This option can be a function or a string.
    * If a string, type option is passed directly to the type-is library and this can be an extension name (like txt), a mime type (like text/plain), or a mime type * with a wildcard (like * / * or text/ *).
    * If a function, the type option is called as fn(req) and the request is parsed if it returns a truthy value. Defaults to text/plain.
    */
  var `type`: js.UndefOr[
    (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) | String
  ] = js.native
  
  /**
    * function to verify body content, the parsing can be aborted by throwing an error.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.native
}
object TextParserOptionItem {
  
  @scala.inline
  def apply(): TextParserOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextParserOptionItem]
  }
  
  @scala.inline
  implicit class TextParserOptionItemOps[Self <: TextParserOptionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultCharset(value: String): Self = this.set("defaultCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCharset: Self = this.set("defaultCharset", js.undefined)
    
    @scala.inline
    def setInflate(value: Boolean): Self = this.set("inflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInflate: Self = this.set("inflate", js.undefined)
    
    @scala.inline
    def setLimit(value: String | Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setTypeFunction1(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = this.set("type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVerify(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response, /* buf */ Buffer, /* encoding */ String) => Unit
    ): Self = this.set("verify", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
}
