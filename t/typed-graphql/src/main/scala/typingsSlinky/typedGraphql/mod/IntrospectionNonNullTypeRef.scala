package typingsSlinky.typedGraphql.mod

import typingsSlinky.typedGraphql.typedGraphqlStrings.NON_NULL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionNonNullTypeRef extends IntrospectionTypeRef {
  var kind: NON_NULL = js.native
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.native
}

object IntrospectionNonNullTypeRef {
  @scala.inline
  def apply(kind: NON_NULL): IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNonNullTypeRef]
  }
  @scala.inline
  implicit class IntrospectionNonNullTypeRefOps[Self <: IntrospectionNonNullTypeRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: NON_NULL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfType(value: IntrospectionTypeRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ofType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ofType")(js.undefined)
        ret
    }
  }
  
}

