package typingsSlinky.typedoc

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.PropertyKey
import typingsSlinky.typedoc.anon.Application
import typingsSlinky.typedoc.libUtilsMod.NeverIfInternal
import typingsSlinky.typedoc.loggersMod.Logger
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

object optionsMod {
  
  @JSImport("typedoc/dist/lib/utils/options", "ArgumentsReader")
  @js.native
  class ArgumentsReader protected ()
    extends typingsSlinky.typedoc.readersMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption(name: NeverIfInternal[String]): js.Function2[
    /* target */ Application | typingsSlinky.typedoc.anon.Options, 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_categorizeByGroup(name: categorizeByGroup): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_categoryOrder(name: categoryOrder): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_defaultCategory(name: defaultCategory): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_disableOutputCheck(name: disableOutputCheck): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_disableSources(name: disableSources): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_entryPoint(name: entryPoint): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_exclude(name: exclude): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_excludeExternals(name: excludeExternals): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_excludeNotDocumented(name: excludeNotDocumented): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_excludeNotExported(name: excludeNotExported): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_excludePrivate(name: excludePrivate): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_excludeProtected(name: excludeProtected): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_excludeTags(name: excludeTags): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_externalPattern(name: externalPattern): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_gaID(name: gaID): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_gaSite(name: gaSite): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_gitRemote(name: gitRemote): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_gitRevision(name: gitRevision): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_help(name: help): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_hideGenerator(name: hideGenerator): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_ignoreCompilerErrors(name: ignoreCompilerErrors): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_includeDeclarations(name: includeDeclarations): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_includeVersion(name: includeVersion): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_includes(name: includes): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_inputFiles(name: inputFiles): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_json(name: json): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_listInvalidSymbolLinks(name: listInvalidSymbolLinks): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_logger(name: logger): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_media(name: media): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_mode(name: mode): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_name(name: name): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_options(name: options): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_out(name: out): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_plugin(name: plugin): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_readme(name: readme): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_theme(name: theme): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_toc(name: toc): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_tsconfig(name: tsconfig): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options", "BindOption")
  @js.native
  def BindOption_version(name: version): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  
  @JSImport("typedoc/dist/lib/utils/options", "Options")
  @js.native
  class Options protected ()
    extends typingsSlinky.typedoc.optionsOptionsMod.Options {
    def this(logger: Logger) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "ParameterHint")
  @js.native
  object ParameterHint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.optionsDeclarationMod.ParameterHint with Double] = js.native
    
    /* 1 */ val Directory: typingsSlinky.typedoc.optionsDeclarationMod.ParameterHint.Directory with Double = js.native
    
    /* 0 */ val File: typingsSlinky.typedoc.optionsDeclarationMod.ParameterHint.File with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "ParameterScope")
  @js.native
  object ParameterScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.optionsDeclarationMod.ParameterScope with Double] = js.native
    
    /* 0 */ val TypeDoc: typingsSlinky.typedoc.optionsDeclarationMod.ParameterScope.TypeDoc with Double = js.native
    
    /* 1 */ val TypeScript: typingsSlinky.typedoc.optionsDeclarationMod.ParameterScope.TypeScript with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "ParameterType")
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
  
  @JSImport("typedoc/dist/lib/utils/options", "SourceFileMode")
  @js.native
  object SourceFileMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode with Double] = js.native
    
    /* 0 */ val File: typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode.File with Double = js.native
    
    /* 1 */ val Modules: typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode.Modules with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "TSConfigReader")
  @js.native
  class TSConfigReader ()
    extends typingsSlinky.typedoc.readersMod.TSConfigReader
  
  @JSImport("typedoc/dist/lib/utils/options", "TypeDocReader")
  @js.native
  class TypeDocReader ()
    extends typingsSlinky.typedoc.readersMod.TypeDocReader
}
