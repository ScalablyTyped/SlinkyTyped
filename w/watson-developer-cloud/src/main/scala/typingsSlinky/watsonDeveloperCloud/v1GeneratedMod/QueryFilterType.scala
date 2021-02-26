package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryFilterType. */
@js.native
trait QueryFilterType extends StObject {
  
  /** A comma-separated list of types to exclude. */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /** A comma-separated list of types to include. All other types are excluded. */
  var include: js.UndefOr[js.Array[String]] = js.native
}
object QueryFilterType {
  
  @scala.inline
  def apply(): QueryFilterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFilterType]
  }
  
  @scala.inline
  implicit class QueryFilterTypeMutableBuilder[Self <: QueryFilterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
