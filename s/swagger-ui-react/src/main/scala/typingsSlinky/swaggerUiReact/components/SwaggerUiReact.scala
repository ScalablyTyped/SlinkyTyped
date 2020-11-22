package typingsSlinky.swaggerUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.swaggerUiReact.mod.Plugin
import typingsSlinky.swaggerUiReact.mod.Request
import typingsSlinky.swaggerUiReact.mod.Response
import typingsSlinky.swaggerUiReact.mod.SwaggerUIProps
import typingsSlinky.swaggerUiReact.mod.System
import typingsSlinky.swaggerUiReact.mod.default
import typingsSlinky.swaggerUiReact.swaggerUiReactStrings.full
import typingsSlinky.swaggerUiReact.swaggerUiReactStrings.list
import typingsSlinky.swaggerUiReact.swaggerUiReactStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwaggerUiReact {
  
  @JSImport("swagger-ui-react", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def deepLinking(value: Boolean): this.type = set("deepLinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultModelExpandDepth(value: Double): this.type = set("defaultModelExpandDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def docExpansion(value: list | full | none): this.type = set("docExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onComplete(value: /* system */ System => Unit): this.type = set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def pluginsVarargs(value: Plugin*): this.type = set("plugins", js.Array(value :_*))
    
    @scala.inline
    def plugins(value: js.Array[Plugin]): this.type = set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def requestInterceptor(value: /* req */ Request => Request | js.Promise[Request]): this.type = set("requestInterceptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def responseInterceptor(value: /* res */ Response => Response | js.Promise[Response]): this.type = set("responseInterceptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def spec(value: js.Object | String): this.type = set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def supportedSubmitMethodsVarargs(value: String*): this.type = set("supportedSubmitMethods", js.Array(value :_*))
    
    @scala.inline
    def supportedSubmitMethods(value: js.Array[String]): this.type = set("supportedSubmitMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwaggerUIProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SwaggerUiReact.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
