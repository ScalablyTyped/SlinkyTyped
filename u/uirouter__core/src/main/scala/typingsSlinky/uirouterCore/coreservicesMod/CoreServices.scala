package typingsSlinky.uirouterCore.coreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreServices extends js.Object {
  @JSName("$injector")
  var $injector: InjectorLike = js.native
  @JSName("$q")
  var $q: QLike = js.native
}

object CoreServices {
  @scala.inline
  def apply($injector: InjectorLike, $q: QLike): CoreServices = {
    val __obj = js.Dynamic.literal($injector = $injector.asInstanceOf[js.Any], $q = $q.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServices]
  }
  @scala.inline
  implicit class CoreServicesOps[Self <: CoreServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$injector(value: InjectorLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$injector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$q(value: QLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$q")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

