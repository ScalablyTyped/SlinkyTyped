package typingsSlinky.swaggerUiReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
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
import scala.scalajs.js.annotation._

object SwaggerUiReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("swagger-ui-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    defaultModelExpandDepth: Int | Double = null,
    docExpansion: list | full | none = null,
    onComplete: /* system */ System => Unit = null,
    plugins: js.Array[Plugin] = null,
    requestInterceptor: /* req */ Request => Request | js.Promise[Request] = null,
    responseInterceptor: /* res */ Response => Response | js.Promise[Response] = null,
    spec: js.Object = null,
    url: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultModelExpandDepth != null) __obj.updateDynamic("defaultModelExpandDepth")(defaultModelExpandDepth.asInstanceOf[js.Any])
    if (docExpansion != null) __obj.updateDynamic("docExpansion")(docExpansion.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (requestInterceptor != null) __obj.updateDynamic("requestInterceptor")(js.Any.fromFunction1(requestInterceptor))
    if (responseInterceptor != null) __obj.updateDynamic("responseInterceptor")(js.Any.fromFunction1(responseInterceptor))
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.swaggerUiReact.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwaggerUIProps
}

