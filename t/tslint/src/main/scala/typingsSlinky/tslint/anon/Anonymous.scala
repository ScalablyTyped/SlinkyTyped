package typingsSlinky.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anonymous extends js.Object {
  var anonymous: String = js.native
  var asyncArrow: String = js.native
  var constructor: String = js.native
  var method: String = js.native
  var named: String = js.native
}

object Anonymous {
  @scala.inline
  def apply(anonymous: String, asyncArrow: String, constructor: String, method: String, named: String): Anonymous = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], asyncArrow = asyncArrow.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anonymous]
  }
  @scala.inline
  implicit class AnonymousOps[Self <: Anonymous] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymous(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

