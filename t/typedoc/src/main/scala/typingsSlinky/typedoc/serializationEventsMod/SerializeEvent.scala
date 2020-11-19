package typingsSlinky.typedoc.serializationEventsMod

import typingsSlinky.typedoc.anon.PartialProjectReflection
import typingsSlinky.typedoc.modelsMod.ProjectReflection
import typingsSlinky.typedoc.utilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/events", "SerializeEvent")
@js.native
class SerializeEvent protected () extends Event {
  def this(name: String, project: ProjectReflection, output: PartialProjectReflection) = this()
  
  var output: PartialProjectReflection = js.native
  
  var outputDirectory: js.UndefOr[String] = js.native
  
  var outputFile: js.UndefOr[String] = js.native
  
  val project: ProjectReflection = js.native
}
