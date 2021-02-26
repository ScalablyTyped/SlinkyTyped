package typingsSlinky.typedoc

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.PropertyKey
import typingsSlinky.typedoc.anon.Application
import typingsSlinky.typedoc.anon.Priority
import typingsSlinky.typedoc.componentMod.Component
import typingsSlinky.typedoc.componentMod.ComponentHost
import typingsSlinky.typedoc.componentMod.ComponentOptions
import typingsSlinky.typedoc.typedocBooleans.`false`
import typingsSlinky.typedoc.typedocStrings.BindOption
import typingsSlinky.typedoc.typedocStrings.categorizeByGroup
import typingsSlinky.typedoc.typedocStrings.categoryOrder
import typingsSlinky.typedoc.typedocStrings.defaultCategory
import typingsSlinky.typedoc.typedocStrings.disableOutputCheck
import typingsSlinky.typedoc.typedocStrings.disableSources
import typingsSlinky.typedoc.typedocStrings.entryPoint
import typingsSlinky.typedoc.typedocStrings.exclude
import typingsSlinky.typedoc.typedocStrings.excludeExternals
import typingsSlinky.typedoc.typedocStrings.excludeNotDocumented
import typingsSlinky.typedoc.typedocStrings.excludeNotExported
import typingsSlinky.typedoc.typedocStrings.excludePrivate
import typingsSlinky.typedoc.typedocStrings.excludeProtected
import typingsSlinky.typedoc.typedocStrings.excludeTags
import typingsSlinky.typedoc.typedocStrings.externalPattern
import typingsSlinky.typedoc.typedocStrings.gaID
import typingsSlinky.typedoc.typedocStrings.gaSite
import typingsSlinky.typedoc.typedocStrings.gitRemote
import typingsSlinky.typedoc.typedocStrings.gitRevision
import typingsSlinky.typedoc.typedocStrings.help
import typingsSlinky.typedoc.typedocStrings.hideGenerator
import typingsSlinky.typedoc.typedocStrings.ignoreCompilerErrors
import typingsSlinky.typedoc.typedocStrings.includeDeclarations
import typingsSlinky.typedoc.typedocStrings.includeVersion
import typingsSlinky.typedoc.typedocStrings.includes
import typingsSlinky.typedoc.typedocStrings.inputFiles
import typingsSlinky.typedoc.typedocStrings.json
import typingsSlinky.typedoc.typedocStrings.listInvalidSymbolLinks
import typingsSlinky.typedoc.typedocStrings.logger
import typingsSlinky.typedoc.typedocStrings.media
import typingsSlinky.typedoc.typedocStrings.mode
import typingsSlinky.typedoc.typedocStrings.name
import typingsSlinky.typedoc.typedocStrings.options
import typingsSlinky.typedoc.typedocStrings.out
import typingsSlinky.typedoc.typedocStrings.plugin
import typingsSlinky.typedoc.typedocStrings.readme
import typingsSlinky.typedoc.typedocStrings.theme
import typingsSlinky.typedoc.typedocStrings.toc
import typingsSlinky.typedoc.typedocStrings.tsconfig
import typingsSlinky.typedoc.typedocStrings.version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("typedoc/dist/lib/utils", "AbstractComponent")
  @js.native
  abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
    extends typingsSlinky.typedoc.componentMod.AbstractComponent[O] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption(name: NeverIfInternal[String]): js.Function2[
    /* target */ Application | typingsSlinky.typedoc.anon.Options, 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_categorizeByGroup(name: categorizeByGroup): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_categoryOrder(name: categoryOrder): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_defaultCategory(name: defaultCategory): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_disableOutputCheck(name: disableOutputCheck): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_disableSources(name: disableSources): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_entryPoint(name: entryPoint): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_exclude(name: exclude): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_excludeExternals(name: excludeExternals): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_excludeNotDocumented(name: excludeNotDocumented): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_excludeNotExported(name: excludeNotExported): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_excludePrivate(name: excludePrivate): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_excludeProtected(name: excludeProtected): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_excludeTags(name: excludeTags): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_externalPattern(name: externalPattern): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_gaID(name: gaID): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_gaSite(name: gaSite): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_gitRemote(name: gitRemote): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_gitRevision(name: gitRevision): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_help(name: help): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_hideGenerator(name: hideGenerator): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_ignoreCompilerErrors(name: ignoreCompilerErrors): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_includeDeclarations(name: includeDeclarations): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_includeVersion(name: includeVersion): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_includes(name: includes): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_inputFiles(name: inputFiles): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_json(name: json): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_listInvalidSymbolLinks(name: listInvalidSymbolLinks): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_logger(name: logger): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_media(name: media): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_mode(name: mode): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_name(name: name): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_options(name: options): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_out(name: out): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_plugin(name: plugin): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_readme(name: readme): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_theme(name: theme): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_toc(name: toc): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_tsconfig(name: tsconfig): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils", "BindOption")
  @js.native
  def BindOption_version(name: version): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  
  @JSImport("typedoc/dist/lib/utils", "CallbackLogger")
  @js.native
  class CallbackLogger protected ()
    extends typingsSlinky.typedoc.loggersMod.CallbackLogger {
    def this(callback: js.Function) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "ChildableComponent")
  @js.native
  abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected ()
    extends typingsSlinky.typedoc.componentMod.ChildableComponent[O, C] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "Component")
  @js.native
  def Component(options: ComponentOptions): ClassDecorator = js.native
  
  @JSImport("typedoc/dist/lib/utils", "ConsoleLogger")
  @js.native
  class ConsoleLogger ()
    extends typingsSlinky.typedoc.loggersMod.ConsoleLogger
  
  @JSImport("typedoc/dist/lib/utils", "Event")
  @js.native
  class Event protected ()
    extends typingsSlinky.typedoc.utilsEventsMod.Event {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "EventDispatcher")
  @js.native
  class EventDispatcher ()
    extends typingsSlinky.typedoc.utilsEventsMod.EventDispatcher
  
  @JSImport("typedoc/dist/lib/utils", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.loggersMod.LogLevel with Double] = js.native
    
    /* 3 */ val Error: typingsSlinky.typedoc.loggersMod.LogLevel.Error with Double = js.native
    
    /* 1 */ val Info: typingsSlinky.typedoc.loggersMod.LogLevel.Info with Double = js.native
    
    /* 4 */ val Success: typingsSlinky.typedoc.loggersMod.LogLevel.Success with Double = js.native
    
    /* 0 */ val Verbose: typingsSlinky.typedoc.loggersMod.LogLevel.Verbose with Double = js.native
    
    /* 2 */ val Warn: typingsSlinky.typedoc.loggersMod.LogLevel.Warn with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "Logger")
  @js.native
  class Logger ()
    extends typingsSlinky.typedoc.loggersMod.Logger
  
  @JSImport("typedoc/dist/lib/utils", "Options")
  @js.native
  class Options protected ()
    extends typingsSlinky.typedoc.optionsMod.Options {
    def this(logger: typingsSlinky.typedoc.loggersMod.Logger) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "ParameterHint")
  @js.native
  object ParameterHint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.optionsDeclarationMod.ParameterHint with Double] = js.native
    
    /* 1 */ val Directory: typingsSlinky.typedoc.optionsDeclarationMod.ParameterHint.Directory with Double = js.native
    
    /* 0 */ val File: typingsSlinky.typedoc.optionsDeclarationMod.ParameterHint.File with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "ParameterScope")
  @js.native
  object ParameterScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.optionsDeclarationMod.ParameterScope with Double] = js.native
    
    /* 0 */ val TypeDoc: typingsSlinky.typedoc.optionsDeclarationMod.ParameterScope.TypeDoc with Double = js.native
    
    /* 1 */ val TypeScript: typingsSlinky.typedoc.optionsDeclarationMod.ParameterScope.TypeScript with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "ParameterType")
  @js.native
  object ParameterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.optionsDeclarationMod.ParameterType with Double] = js.native
    
    /* 5 */ val Array: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Array with Double = js.native
    
    /* 2 */ val Boolean: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Boolean with Double = js.native
    
    /* 3 */ val Map: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Map with Double = js.native
    
    /* 4 */ val Mixed: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Mixed with Double = js.native
    
    /* 1 */ val Number: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Number with Double = js.native
    
    /* 0 */ val String: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.String with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "PluginHost")
  @js.native
  class PluginHost protected ()
    extends typingsSlinky.typedoc.utilsPluginsMod.PluginHost {
    def this(owner: js.Symbol) = this()
    def this(owner: typingsSlinky.typedoc.applicationMod.Application) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "SourceFileMode")
  @js.native
  object SourceFileMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode with Double] = js.native
    
    /* 0 */ val File: typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode.File with Double = js.native
    
    /* 1 */ val Modules: typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode.Modules with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "directoryExists")
  @js.native
  def directoryExists(directoryPath: String): Boolean = js.native
  
  @JSImport("typedoc/dist/lib/utils", "ensureDirectoriesExist")
  @js.native
  def ensureDirectoriesExist(directoryPath: String): Unit = js.native
  
  @JSImport("typedoc/dist/lib/utils", "insertPrioritySorted")
  @js.native
  def insertPrioritySorted[T /* <: Priority */](arr: js.Array[T], item: T): js.Array[T] = js.native
  
  @JSImport("typedoc/dist/lib/utils", "normalizePath")
  @js.native
  def normalizePath(path: String): String = js.native
  
  @JSImport("typedoc/dist/lib/utils", "readFile")
  @js.native
  def readFile(file: String): String = js.native
  
  @JSImport("typedoc/dist/lib/utils", "removeIfPresent")
  @js.native
  def removeIfPresent[T](arr: js.UndefOr[scala.Nothing], item: T): Unit = js.native
  @JSImport("typedoc/dist/lib/utils", "removeIfPresent")
  @js.native
  def removeIfPresent[T](arr: js.Array[T], item: T): Unit = js.native
  
  @JSImport("typedoc/dist/lib/utils", "writeFile")
  @js.native
  def writeFile(fileName: String, data: String, writeByteOrderMark: Boolean): Unit = js.native
  @JSImport("typedoc/dist/lib/utils", "writeFile")
  @js.native
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  
  type IfInternal[T, F] = F | T
  
  type InternalOnly = `false`
  
  type NeverIfInternal[T] = IfInternal[scala.Nothing, T]
}
