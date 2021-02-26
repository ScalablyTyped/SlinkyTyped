package typingsSlinky.typedoc.anon

import typingsSlinky.typedoc.schemaMod.ModelToObject
import typingsSlinky.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ReflectionCategory> */
@js.native
trait PartialReflectionCategory extends StObject {
  
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ]
  ] = js.native
  
  var title: js.UndefOr[ModelToObject[String] | String] = js.native
}
object PartialReflectionCategory {
  
  @scala.inline
  def apply(): PartialReflectionCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReflectionCategory]
  }
  
  @scala.inline
  implicit class PartialReflectionCategoryMutableBuilder[Self <: PartialReflectionCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: ModelToObject[String] | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "title", js.Array(value :_*))
  }
}
