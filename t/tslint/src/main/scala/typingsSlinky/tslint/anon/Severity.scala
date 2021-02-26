package typingsSlinky.tslint.anon

import typingsSlinky.tslint.ruleMod.RuleSeverity
import typingsSlinky.tslint.tslintStrings.default
import typingsSlinky.tslint.tslintStrings.none
import typingsSlinky.tslint.tslintStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Severity extends StObject {
  
  var options: js.UndefOr[js.Any] = js.native
  
  var severity: js.UndefOr[RuleSeverity | warn | none | default] = js.native
}
object Severity {
  
  @scala.inline
  def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  
  @scala.inline
  implicit class SeverityMutableBuilder[Self <: Severity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSeverity(value: RuleSeverity | warn | none | default): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
