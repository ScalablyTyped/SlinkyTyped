package typingsSlinky.vscodeLanguageclient.uuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUID extends js.Object {
  /**
    * @returns the canonical representation in sets of hexadecimal numbers separated by dashes.
    */
  def asHex(): String = js.native
  def equals(other: UUID): Boolean = js.native
}

object UUID {
  @scala.inline
  def apply(asHex: () => String, equals: UUID => Boolean): UUID = {
    val __obj = js.Dynamic.literal(asHex = js.Any.fromFunction0(asHex), equals = js.Any.fromFunction1(equals))
    __obj.asInstanceOf[UUID]
  }
  @scala.inline
  implicit class UUIDOps[Self <: UUID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsHex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asHex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEquals(value: UUID => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

