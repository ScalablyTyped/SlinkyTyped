package typingsSlinky.tern.ternMod

import typingsSlinky.tern.anon.End
import typingsSlinky.tern.ternStrings.global
import typingsSlinky.tern.ternStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefsQueryResult extends js.Object {
  /** The name of the variable or property */
  var name: String = js.native
  var refs: js.Array[End] = js.native
  /** for variables: a type property holding either "global" or "local". */
  var `type`: js.UndefOr[global | local] = js.native
}

object RefsQueryResult {
  @scala.inline
  def apply(name: String, refs: js.Array[End]): RefsQueryResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefsQueryResult]
  }
  @scala.inline
  implicit class RefsQueryResultOps[Self <: RefsQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefs(value: js.Array[End]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: global | local): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

