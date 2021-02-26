package typingsSlinky.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  /**
    * A rule allows you to include logic in order to apply a set of attributes only to certain aspects of your chart that meet the crite
    * ria specified within each "rule": group. You can include any number of "rule": groups nested within a "rules": set. Place the desi
    * red attribute or attributes within each "rule": group to apply those attributes to the areas that fulfill the requirement. The eff
    * ect of rules depends largely on the placement of the "rules": set within your JSON code. In the above example, the styling attribu
    * tes within each rule will be applied to the scale-y guide. "%c == 2" | "%v <= 0" | "%v > 0" | ...
    */
  var rule: js.UndefOr[String] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
