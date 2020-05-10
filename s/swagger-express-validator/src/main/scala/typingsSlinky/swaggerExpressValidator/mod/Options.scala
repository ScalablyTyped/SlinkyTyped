package typingsSlinky.swaggerExpressValidator.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowNullable: js.UndefOr[Boolean] = js.native
  var requestValidationFn: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      Unit
    ]
  ] = js.native
  var responseValidationFn: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      Unit
    ]
  ] = js.native
  var schema: String = js.native
  var validateRequest: js.UndefOr[Boolean] = js.native
  var validateResponse: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(schema: String): Options = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNullable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullable")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestValidationFn(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* data */ js.Any, /* errors */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestValidationFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRequestValidationFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestValidationFn")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseValidationFn(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* data */ js.Any, /* errors */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseValidationFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResponseValidationFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseValidationFn")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateResponse")(js.undefined)
        ret
    }
  }
  
}

