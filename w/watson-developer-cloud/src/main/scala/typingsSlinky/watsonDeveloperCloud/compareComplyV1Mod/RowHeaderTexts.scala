package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of values, each being the `text` value of a row header that is applicable to this body cell. */
@js.native
trait RowHeaderTexts extends StObject {
  
  /** The `text` value of a row header. */
  var text: js.UndefOr[String] = js.native
}
object RowHeaderTexts {
  
  @scala.inline
  def apply(): RowHeaderTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderTexts]
  }
  
  @scala.inline
  implicit class RowHeaderTextsMutableBuilder[Self <: RowHeaderTexts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
