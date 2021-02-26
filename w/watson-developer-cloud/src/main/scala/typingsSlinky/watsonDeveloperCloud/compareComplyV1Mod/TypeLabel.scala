package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identification of a specific type. */
@js.native
trait TypeLabel extends StObject {
  
  /** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
  var label: js.UndefOr[Label] = js.native
  
  /** One or more hash values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.native
}
object TypeLabel {
  
  @scala.inline
  def apply(): TypeLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeLabel]
  }
  
  @scala.inline
  implicit class TypeLabelMutableBuilder[Self <: TypeLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setProvenance_ids(value: js.Array[String]): Self = StObject.set(x, "provenance_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvenance_idsUndefined: Self = StObject.set(x, "provenance_ids", js.undefined)
    
    @scala.inline
    def setProvenance_idsVarargs(value: String*): Self = StObject.set(x, "provenance_ids", js.Array(value :_*))
  }
}
