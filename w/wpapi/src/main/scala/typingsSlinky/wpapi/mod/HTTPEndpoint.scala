package typingsSlinky.wpapi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPEndpoint extends js.Object {
  var args: StringDictionary[HTTPArgument] = js.native
  var methods: js.Array[HTTPMethod] = js.native
}

object HTTPEndpoint {
  @scala.inline
  def apply(args: StringDictionary[HTTPArgument], methods: js.Array[HTTPMethod]): HTTPEndpoint = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPEndpoint]
  }
  @scala.inline
  implicit class HTTPEndpointOps[Self <: HTTPEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: StringDictionary[HTTPArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[HTTPMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

