package typingsSlinky.swaggerDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.swaggerDashUiDashReact.swaggerDashUiDashReactMod.Request
import typingsSlinky.swaggerDashUiDashReact.swaggerDashUiDashReactMod.Response
import typingsSlinky.swaggerDashUiDashReact.swaggerDashUiDashReactMod.SwaggerUIProps
import typingsSlinky.swaggerDashUiDashReact.swaggerDashUiDashReactMod.System
import typingsSlinky.swaggerDashUiDashReact.swaggerDashUiDashReactMod.default
import typingsSlinky.swaggerDashUiDashReact.swaggerDashUiDashReactStrings.full
import typingsSlinky.swaggerDashUiDashReact.swaggerDashUiDashReactStrings.list
import typingsSlinky.swaggerDashUiDashReact.swaggerDashUiDashReactStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwaggerDashUiDashReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("swagger-ui-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    docExpansion: list | full | none,
    onComplete: /* system */ System => Unit = null,
    requestInterceptor: /* req */ Request => Request | js.Promise[Request] = null,
    responseInterceptor: /* res */ Response => Response | js.Promise[Response] = null,
    spec: js.Object = null,
    url: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(docExpansion = docExpansion.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (requestInterceptor != null) __obj.updateDynamic("requestInterceptor")(js.Any.fromFunction1(requestInterceptor))
    if (responseInterceptor != null) __obj.updateDynamic("responseInterceptor")(js.Any.fromFunction1(responseInterceptor))
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwaggerUIProps
}

