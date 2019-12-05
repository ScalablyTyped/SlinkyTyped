package typingsSlinky.typedoc

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typingsSlinky.typedoc.distLibModelsReflectionsContainerMod.ContainerReflection
import typingsSlinky.typedoc.distLibModelsSourcesMod.SourceDirectory
import typingsSlinky.typedoc.distLibModelsSourcesMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/project", JSImport.Namespace)
@js.native
object distLibModelsReflectionsProjectMod extends js.Object {
  @js.native
  class ProjectReflection protected () extends ContainerReflection {
    def this(name: String) = this()
    var directory: SourceDirectory = js.native
    var files: js.Array[SourceFile] = js.native
    var packageInfo: js.Any = js.native
    var readme: js.UndefOr[String] = js.native
    var reflections: NumberDictionary[Reflection] = js.native
    var symbolMapping: NumberDictionary[Double] = js.native
    def getReflectionsByKind(kind: ReflectionKind): js.Array[Reflection] = js.native
  }
  
}

