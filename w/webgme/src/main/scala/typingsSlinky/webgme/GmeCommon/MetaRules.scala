package typingsSlinky.webgme.GmeCommon

import typingsSlinky.webgme.Anon_Filter
import typingsSlinky.webgme.Anon_Level
import typingsSlinky.webgme.Anon_Ptr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaRules extends js.Object {
  var aspects: Anon_Filter
  var attributes: Anon_Level
  var children: MetaCardRule
  var constraints: Dictionary[typingsSlinky.webgme.Core.Constraint]
  var pointers: Anon_Ptr
}

object MetaRules {
  @scala.inline
  def apply(
    aspects: Anon_Filter,
    attributes: Anon_Level,
    children: MetaCardRule,
    constraints: Dictionary[typingsSlinky.webgme.Core.Constraint],
    pointers: Anon_Ptr
  ): MetaRules = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaRules]
  }
}

