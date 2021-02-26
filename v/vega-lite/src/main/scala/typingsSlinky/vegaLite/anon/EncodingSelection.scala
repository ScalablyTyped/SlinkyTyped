package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channelMod.SingleDefUnitChannel
import typingsSlinky.vegaLite.srcSelectionMod.SelectionExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodingSelection extends SelectionExtent {
  
  /**
    * The encoding channel to extract selected values for, when a selection is [projected](https://vega.github.io/vega-lite/docs/project.html)
    * over multiple fields or encodings.
    */
  var encoding: js.UndefOr[SingleDefUnitChannel] = js.native
  
  /**
    * The name of a selection.
    */
  var selection: String = js.native
}
object EncodingSelection {
  
  @scala.inline
  def apply(selection: String): EncodingSelection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingSelection]
  }
  
  @scala.inline
  implicit class EncodingSelectionMutableBuilder[Self <: EncodingSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: SingleDefUnitChannel): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
