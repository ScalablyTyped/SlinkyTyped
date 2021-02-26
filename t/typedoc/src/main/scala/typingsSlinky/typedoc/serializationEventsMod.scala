package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialProjectReflection
import typingsSlinky.typedoc.modelsMod.ProjectReflection
import typingsSlinky.typedoc.utilsEventsMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationEventsMod {
  
  @JSImport("typedoc/dist/lib/serialization/events", "SerializeEvent")
  @js.native
  class SerializeEvent protected () extends Event {
    def this(name: String, project: ProjectReflection, output: PartialProjectReflection) = this()
    
    var output: PartialProjectReflection = js.native
    
    var outputDirectory: js.UndefOr[String] = js.native
    
    var outputFile: js.UndefOr[String] = js.native
    
    val project: ProjectReflection = js.native
  }
  
  @js.native
  trait SerializeEventData extends StObject {
    
    var outputDirectory: js.UndefOr[String] = js.native
    
    var outputFile: js.UndefOr[String] = js.native
  }
  object SerializeEventData {
    
    @scala.inline
    def apply(): SerializeEventData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeEventData]
    }
    
    @scala.inline
    implicit class SerializeEventDataMutableBuilder[Self <: SerializeEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputDirectory(value: String): Self = StObject.set(x, "outputDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDirectoryUndefined: Self = StObject.set(x, "outputDirectory", js.undefined)
      
      @scala.inline
      def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
    }
  }
}
