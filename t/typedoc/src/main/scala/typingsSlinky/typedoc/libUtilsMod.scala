package typingsSlinky.typedoc

import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typedoc.componentMod.Component
import typingsSlinky.typedoc.componentMod.ComponentHost
import typingsSlinky.typedoc.componentMod.ComponentOptions
import typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  @js.native
  abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
    extends typingsSlinky.typedoc.componentMod.AbstractComponent[O] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
  }
  
  @js.native
  class CallbackLogger protected ()
    extends typingsSlinky.typedoc.loggersMod.CallbackLogger {
    def this(callback: js.Function) = this()
  }
  
  @js.native
  abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected ()
    extends typingsSlinky.typedoc.componentMod.ChildableComponent[O, C] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
  }
  
  @js.native
  class ConsoleLogger ()
    extends typingsSlinky.typedoc.loggersMod.ConsoleLogger
  
  @js.native
  class Event protected ()
    extends typingsSlinky.typedoc.utilsEventsMod.Event {
    def this(name: String) = this()
  }
  
  @js.native
  class EventDispatcher ()
    extends typingsSlinky.typedoc.utilsEventsMod.EventDispatcher
  
  @js.native
  class Logger ()
    extends typingsSlinky.typedoc.loggersMod.Logger
  
  @js.native
  class PluginHost ()
    extends typingsSlinky.typedoc.utilsPluginsMod.PluginHost
  
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
    /* 3 */ val Error: typingsSlinky.typedoc.loggersMod.LogLevel.Error with Double = js.native
    /* 1 */ val Info: typingsSlinky.typedoc.loggersMod.LogLevel.Info with Double = js.native
    /* 4 */ val Success: typingsSlinky.typedoc.loggersMod.LogLevel.Success with Double = js.native
    /* 0 */ val Verbose: typingsSlinky.typedoc.loggersMod.LogLevel.Verbose with Double = js.native
    /* 2 */ val Warn: typingsSlinky.typedoc.loggersMod.LogLevel.Warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.loggersMod.LogLevel with Double] = js.native
  }
  
}

