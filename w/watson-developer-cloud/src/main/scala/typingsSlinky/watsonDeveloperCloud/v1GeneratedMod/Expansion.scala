package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An expansion definition. Each object respresents one set of expandable strings. For example, you could have expansions for the word `hot` in one object, and expansions for the word `cold` in another. */
@js.native
trait Expansion extends StObject {
  
  /** A list of terms that this expansion will be expanded to. If specified without **input_terms**, it also functions as the input term list. */
  var expanded_terms: js.Array[String] = js.native
  
  /** A list of terms that will be expanded for this expansion. If specified, only the items in this list are expanded. */
  var input_terms: js.UndefOr[js.Array[String]] = js.native
}
object Expansion {
  
  @scala.inline
  def apply(expanded_terms: js.Array[String]): Expansion = {
    val __obj = js.Dynamic.literal(expanded_terms = expanded_terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expansion]
  }
  
  @scala.inline
  implicit class ExpansionMutableBuilder[Self <: Expansion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded_terms(value: js.Array[String]): Self = StObject.set(x, "expanded_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded_termsVarargs(value: String*): Self = StObject.set(x, "expanded_terms", js.Array(value :_*))
    
    @scala.inline
    def setInput_terms(value: js.Array[String]): Self = StObject.set(x, "input_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_termsUndefined: Self = StObject.set(x, "input_terms", js.undefined)
    
    @scala.inline
    def setInput_termsVarargs(value: String*): Self = StObject.set(x, "input_terms", js.Array(value :_*))
  }
}
