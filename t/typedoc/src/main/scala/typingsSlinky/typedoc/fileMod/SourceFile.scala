package typingsSlinky.typedoc.fileMod

import typingsSlinky.typedoc.abstractMod.Reflection
import typingsSlinky.typedoc.directoryMod.SourceDirectory
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
