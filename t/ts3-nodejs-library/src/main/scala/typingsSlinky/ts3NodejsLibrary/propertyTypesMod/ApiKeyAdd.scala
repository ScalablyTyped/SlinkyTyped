package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import typingsSlinky.ts3NodejsLibrary.enumMod.ApiKeyScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyAdd extends js.Object {
  var cldbid: js.UndefOr[Double] = js.native
  var lifetime: js.UndefOr[Double] = js.native
  var scope: ApiKeyScope = js.native
}

object ApiKeyAdd {
  @scala.inline
  def apply(scope: ApiKeyScope): ApiKeyAdd = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAdd]
  }
  @scala.inline
  implicit class ApiKeyAddOps[Self <: ApiKeyAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: ApiKeyScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCldbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime")(js.undefined)
        ret
    }
  }
  
}

