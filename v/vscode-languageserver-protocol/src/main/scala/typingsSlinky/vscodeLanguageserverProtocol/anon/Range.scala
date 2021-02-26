package typingsSlinky.vscodeLanguageserverProtocol.anon

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends TextDocumentContentChangeEvent {
  
  /**
    * The range of the document that changed.
    */
  var range: typingsSlinky.vscodeLanguageserverTypes.mod.Range = js.native
  
  /**
    * The optional length of the range that got replaced.
    *
    * @deprecated use range instead.
    */
  var rangeLength: js.UndefOr[Double] = js.native
  
  /**
    * The new text for the provided range.
    */
  var text: String = js.native
}
object Range {
  
  @scala.inline
  def apply(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range, text: String): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: typingsSlinky.vscodeLanguageserverTypes.mod.Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeLength(value: Double): Self = StObject.set(x, "rangeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeLengthUndefined: Self = StObject.set(x, "rangeLength", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
