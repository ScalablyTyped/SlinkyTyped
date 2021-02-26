package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattingOptions
  extends /**
  * Signature for further properties.
  */
/* key */ StringDictionary[Boolean | Double | String] {
  
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: Boolean = js.native
  
  /**
    * Size of a tab in spaces.
    */
  var tabSize: Double = js.native
}
object FormattingOptions {
  
  @scala.inline
  def apply(insertSpaces: Boolean, tabSize: Double): FormattingOptions = {
    val __obj = js.Dynamic.literal(insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  
  @scala.inline
  implicit class FormattingOptionsMutableBuilder[Self <: FormattingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
  }
}
