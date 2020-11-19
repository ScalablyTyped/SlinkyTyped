package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", JSImport.Namespace)
@js.native
object categoryPluginMod extends js.Object {
  
  @js.native
  class CategoryPlugin () extends AbstractComponent[Converter] {
    
    var categorize: js.Any = js.native
    
    var categorizeByGroup: Boolean = js.native
    
    var categoryOrder: js.Array[String] = js.native
    
    var defaultCategory: String = js.native
    
    var groupCategorize: js.Any = js.native
    
    var lumpCategorize: js.Any = js.native
    
    var onBegin: js.Any = js.native
    
    var onEndResolve: js.Any = js.native
    
    var onResolve: js.Any = js.native
  }
  /* static members */
  @js.native
  object CategoryPlugin extends js.Object {
    
    var WEIGHTS: js.Array[String] = js.native
    
    var defaultCategory: String = js.native
    
    def getCategory(reflection: Reflection): String = js.native
    
    def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = js.native
    
    def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = js.native
  }
}
