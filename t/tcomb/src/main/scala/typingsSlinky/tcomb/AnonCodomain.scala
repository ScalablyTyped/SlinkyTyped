package typingsSlinky.tcomb

import typingsSlinky.tcomb.mod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodomain[T] extends js.Object {
  var codomain: T = js.native
  var domain: Constructor[String] = js.native
  var identity: Boolean = js.native
  var kind: String = js.native
  var name: String = js.native
}

object AnonCodomain {
  @scala.inline
  def apply[T](codomain: T, domain: Constructor[String], identity: Boolean, kind: String, name: String): AnonCodomain[T] = {
    val __obj = js.Dynamic.literal(codomain = codomain.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodomain[T]]
  }
  @scala.inline
  implicit class AnonCodomainOps[Self[t] <: AnonCodomain[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCodomain(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: Constructor[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

