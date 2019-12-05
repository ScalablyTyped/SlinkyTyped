package typingsSlinky.typedoc.distLibModelsSourcesFileMod

import typingsSlinky.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typingsSlinky.typedoc.distLibModelsSourcesDirectoryMod.SourceDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/sources/file", "SourceFile")
@js.native
class SourceFile protected () extends js.Object {
  def this(fullFileName: String) = this()
  var fileName: String = js.native
  var fullFileName: String = js.native
  var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
  var name: String = js.native
  var parent: js.UndefOr[SourceDirectory] = js.native
  var reflections: js.Array[Reflection] = js.native
  var url: js.UndefOr[String] = js.native
}

