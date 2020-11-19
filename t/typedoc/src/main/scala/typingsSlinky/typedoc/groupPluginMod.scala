package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.reflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", JSImport.Namespace)
@js.native
object groupPluginMod extends js.Object {
  
  @js.native
  class GroupPlugin () extends AbstractComponent[Converter] {
    
    var onEndResolve: js.Any = js.native
    
    var onResolve: js.Any = js.native
  }
  /* static members */
  @js.native
  object GroupPlugin extends js.Object {
    
    var WEIGHTS: js.Array[ReflectionKind] = js.native
    
    def getKindPlural(kind: ReflectionKind): String = js.native
    
    def getKindSingular(kind: ReflectionKind): String = js.native
    
    var getKindString: js.Any = js.native
    
    def getReflectionGroups(reflections: js.Array[Reflection]): js.Array[ReflectionGroup] = js.native
    
    def sortCallback(a: Reflection, b: Reflection): Double = js.native
  }
}
