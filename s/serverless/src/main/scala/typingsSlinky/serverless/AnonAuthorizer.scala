package typingsSlinky.serverless

import typingsSlinky.serverless.validateMod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthorizer extends js.Object {
  var authorizer: js.UndefOr[js.Any] = js.native
  var cors: js.UndefOr[js.Any] = js.native
  var integration: js.UndefOr[String] = js.native
  var mehtod: HttpMethod = js.native
  var path: String = js.native
}

object AnonAuthorizer {
  @scala.inline
  def apply(mehtod: HttpMethod, path: String): AnonAuthorizer = {
    val __obj = js.Dynamic.literal(mehtod = mehtod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizer]
  }
  @scala.inline
  implicit class AnonAuthorizerOps[Self <: AnonAuthorizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMehtod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mehtod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizer")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integration")(js.undefined)
        ret
    }
  }
  
}

