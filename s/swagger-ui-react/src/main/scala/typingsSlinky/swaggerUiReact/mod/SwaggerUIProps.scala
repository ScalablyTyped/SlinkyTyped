package typingsSlinky.swaggerUiReact.mod

import typingsSlinky.swaggerUiReact.swaggerUiReactStrings.full
import typingsSlinky.swaggerUiReact.swaggerUiReactStrings.list
import typingsSlinky.swaggerUiReact.swaggerUiReactStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerUIProps extends js.Object {
  var defaultModelExpandDepth: js.UndefOr[Double] = js.native
  var docExpansion: js.UndefOr[list | full | none] = js.native
  var onComplete: js.UndefOr[js.Function1[/* system */ System, Unit]] = js.native
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  var requestInterceptor: js.UndefOr[js.Function1[/* req */ Request, Request | js.Promise[Request]]] = js.native
  var responseInterceptor: js.UndefOr[js.Function1[/* res */ Response, Response | js.Promise[Response]]] = js.native
  var spec: js.UndefOr[js.Object] = js.native
  var url: js.UndefOr[String] = js.native
}

object SwaggerUIProps {
  @scala.inline
  def apply(): SwaggerUIProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerUIProps]
  }
  @scala.inline
  implicit class SwaggerUIPropsOps[Self <: SwaggerUIProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultModelExpandDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultModelExpandDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultModelExpandDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultModelExpandDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withDocExpansion(value: list | full | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* system */ System => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestInterceptor(value: /* req */ Request => Request | js.Promise[Request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestInterceptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterceptor")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseInterceptor(value: /* res */ Response => Response | js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResponseInterceptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInterceptor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpec(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

