package typingsSlinky.webgme.GmeCommon

import typingsSlinky.webgme.anon.Filter
import typingsSlinky.webgme.anon.Level
import typingsSlinky.webgme.anon.Ptr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaRules extends js.Object {
  var aspects: Filter = js.native
  var attributes: Level = js.native
  var children: MetaCardRule = js.native
  var constraints: Dictionary[typingsSlinky.webgme.Core.Constraint] = js.native
  var pointers: Ptr = js.native
}

object MetaRules {
  @scala.inline
  def apply(
    aspects: Filter,
    attributes: Level,
    children: MetaCardRule,
    constraints: Dictionary[typingsSlinky.webgme.Core.Constraint],
    pointers: Ptr
  ): MetaRules = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaRules]
  }
  @scala.inline
  implicit class MetaRulesOps[Self <: MetaRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspects(value: Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: MetaCardRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraints(value: Dictionary[typingsSlinky.webgme.Core.Constraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointers(value: Ptr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

