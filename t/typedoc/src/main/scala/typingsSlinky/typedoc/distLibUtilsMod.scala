package typingsSlinky.typedoc

import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typedoc.distLibUtilsComponentMod.Component
import typingsSlinky.typedoc.distLibUtilsComponentMod.ComponentHost
import typingsSlinky.typedoc.distLibUtilsComponentMod.ComponentOptions
import typingsSlinky.typedoc.distLibUtilsOptionsDeclarationMod.DeclarationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils", JSImport.Namespace)
@js.native
object distLibUtilsMod extends js.Object {
  @js.native
  abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
    extends typingsSlinky.typedoc.distLibUtilsComponentMod.AbstractComponent[O] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
  }
  
  @js.native
  class CallbackLogger protected ()
    extends typingsSlinky.typedoc.distLibUtilsLoggersMod.CallbackLogger {
    def this(callback: js.Function) = this()
  }
  
  @js.native
  abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected ()
    extends typingsSlinky.typedoc.distLibUtilsComponentMod.ChildableComponent[O, C] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
  }
  
  @js.native
  class ConsoleLogger ()
    extends typingsSlinky.typedoc.distLibUtilsLoggersMod.ConsoleLogger
  
  @js.native
  class Event protected ()
    extends typingsSlinky.typedoc.distLibUtilsEventsMod.Event {
    def this(name: String) = this()
  }
  
  @js.native
  class EventDispatcher ()
    extends typingsSlinky.typedoc.distLibUtilsEventsMod.EventDispatcher
  
  @js.native
  class Logger ()
    extends typingsSlinky.typedoc.distLibUtilsLoggersMod.Logger
  
  @js.native
  class PluginHost ()
    extends typingsSlinky.typedoc.distLibUtilsPluginsMod.PluginHost
  
  def Component(options: ComponentOptions): ClassDecorator = js.native
  def Option(options: DeclarationOption): PropertyDecorator = js.native
  def directoryExists(directoryPath: String): Boolean = js.native
  def ensureDirectoriesExist(directoryPath: String): Unit = js.native
  def normalizePath(path: String): String = js.native
  def writeFile(fileName: String, data: String, writeByteOrderMark: Boolean): Unit = js.native
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  @js.native
  object LogLevel extends js.Object {
    /* 3 */ val Error: typingsSlinky.typedoc.distLibUtilsLoggersMod.LogLevel.Error with Double = js.native
    /* 1 */ val Info: typingsSlinky.typedoc.distLibUtilsLoggersMod.LogLevel.Info with Double = js.native
    /* 4 */ val Success: typingsSlinky.typedoc.distLibUtilsLoggersMod.LogLevel.Success with Double = js.native
    /* 0 */ val Verbose: typingsSlinky.typedoc.distLibUtilsLoggersMod.LogLevel.Verbose with Double = js.native
    /* 2 */ val Warn: typingsSlinky.typedoc.distLibUtilsLoggersMod.LogLevel.Warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.distLibUtilsLoggersMod.LogLevel with Double] = js.native
  }
  
}

