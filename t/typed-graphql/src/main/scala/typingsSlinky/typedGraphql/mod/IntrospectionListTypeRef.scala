package typingsSlinky.typedGraphql.mod

import typingsSlinky.typedGraphql.typedGraphqlStrings.LIST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionListTypeRef extends IntrospectionTypeRef {
  var kind: LIST = js.native
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.native
}

object IntrospectionListTypeRef {
  @scala.inline
  def apply(kind: LIST): IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionListTypeRef]
  }
  @scala.inline
  implicit class IntrospectionListTypeRefOps[Self <: IntrospectionListTypeRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: LIST): Self = {
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

