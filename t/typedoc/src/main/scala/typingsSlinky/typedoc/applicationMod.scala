package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.componentMod.ChildableComponent
import typingsSlinky.typedoc.converterMod.Converter
import typingsSlinky.typedoc.libUtilsMod.Logger
import typingsSlinky.typedoc.libUtilsMod.PluginHost
import typingsSlinky.typedoc.modelsMod.ProjectReflection
import typingsSlinky.typedoc.optionsMod.Options
import typingsSlinky.typedoc.optionsOptionsMod.OptionsReadResult
import typingsSlinky.typedoc.rendererMod.Renderer
import typingsSlinky.typedoc.serializationMod.Serializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/application", JSImport.Namespace)
@js.native
object applicationMod extends js.Object {
  @js.native
  class Application () extends ChildableComponent[Application, AbstractComponent[Application]] {
    def this(options: js.Object) = this()
    var converter: Converter = js.native
    var exclude: js.Array[String] = js.native
    var ignoreCompilerErrors: Boolean = js.native
    var logger: Logger = js.native
    var loggerType: String | js.Function = js.native
    var options: Options = js.native
    var plugins: PluginHost = js.native
    var renderer: Renderer = js.native
    var serializer: Serializer = js.native
    @JSName("application")
    def application_MApplication: Application = js.native
    /* protected */ def bootstrap(): OptionsReadResult = js.native
    /* protected */ def bootstrap(options: js.Object): OptionsReadResult = js.native
    def convert(src: js.Array[String]): js.UndefOr[ProjectReflection] = js.native
    def expandInputFiles(): js.Array[String] = js.native
    def expandInputFiles(inputFiles: js.Array[String]): js.Array[String] = js.native
    def generateDocs(project: ProjectReflection, out: String): Boolean = js.native
    def generateDocs(src: js.Array[String], out: String): Boolean = js.native
    def generateJson(project: ProjectReflection, out: String): Boolean = js.native
    def generateJson(src: js.Array[String], out: String): Boolean = js.native
    def getTypeScriptPath(): String = js.native
    def getTypeScriptVersion(): String = js.native
    def isCLI: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Application extends js.Object {
    var VERSION: String = js.native
  }
  
}

