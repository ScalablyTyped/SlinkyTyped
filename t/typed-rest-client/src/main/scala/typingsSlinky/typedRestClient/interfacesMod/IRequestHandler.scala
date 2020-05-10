package typingsSlinky.typedRestClient.interfacesMod

import typingsSlinky.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestHandler extends js.Object {
  def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
  def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
  def prepareRequest(options: RequestOptions): Unit = js.native
}

object IRequestHandler {
  @scala.inline
  def apply(
    canHandleAuthentication: IHttpClientResponse => Boolean,
    handleAuthentication: (IHttpClient, IRequestInfo, js.Any) => js.Promise[IHttpClientResponse],
    prepareRequest: RequestOptions => Unit
  ): IRequestHandler = {
    val __obj = js.Dynamic.literal(canHandleAuthentication = js.Any.fromFunction1(canHandleAuthentication), handleAuthentication = js.Any.fromFunction3(handleAuthentication), prepareRequest = js.Any.fromFunction1(prepareRequest))
    __obj.asInstanceOf[IRequestHandler]
  }
  @scala.inline
  implicit class IRequestHandlerOps[Self <: IRequestHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanHandleAuthentication(value: IHttpClientResponse => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canHandleAuthentication")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleAuthentication(value: (IHttpClient, IRequestInfo, js.Any) => js.Promise[IHttpClientResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleAuthentication")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPrepareRequest(value: RequestOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareRequest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

