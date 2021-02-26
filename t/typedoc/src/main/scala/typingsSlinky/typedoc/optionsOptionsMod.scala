package typingsSlinky.typedoc

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.PropertyKey
import typingsSlinky.typedoc.anon.Application
import typingsSlinky.typedoc.anon.File
import typingsSlinky.typedoc.anon.Name
import typingsSlinky.typedoc.anon.PartialTypeDocOptions
import typingsSlinky.typedoc.anon.ReadonlyArrayDeclarationO
import typingsSlinky.typedoc.anon.ReadonlyBooleanDeclaratio
import typingsSlinky.typedoc.anon.ReadonlyMapDeclarationOpt
import typingsSlinky.typedoc.anon.ReadonlyMixedDeclarationO
import typingsSlinky.typedoc.anon.ReadonlyNumberDeclaration
import typingsSlinky.typedoc.anon.ReadonlyStringDeclaration
import typingsSlinky.typedoc.anon.`0`
import typingsSlinky.typedoc.anon.`10`
import typingsSlinky.typedoc.anon.`11`
import typingsSlinky.typedoc.anon.`12`
import typingsSlinky.typedoc.anon.`13`
import typingsSlinky.typedoc.anon.`14`
import typingsSlinky.typedoc.anon.`15`
import typingsSlinky.typedoc.anon.`16`
import typingsSlinky.typedoc.anon.`17`
import typingsSlinky.typedoc.anon.`18`
import typingsSlinky.typedoc.anon.`19`
import typingsSlinky.typedoc.anon.`1`
import typingsSlinky.typedoc.anon.`20`
import typingsSlinky.typedoc.anon.`21`
import typingsSlinky.typedoc.anon.`22`
import typingsSlinky.typedoc.anon.`23`
import typingsSlinky.typedoc.anon.`24`
import typingsSlinky.typedoc.anon.`25`
import typingsSlinky.typedoc.anon.`26`
import typingsSlinky.typedoc.anon.`27`
import typingsSlinky.typedoc.anon.`28`
import typingsSlinky.typedoc.anon.`29`
import typingsSlinky.typedoc.anon.`2`
import typingsSlinky.typedoc.anon.`30`
import typingsSlinky.typedoc.anon.`31`
import typingsSlinky.typedoc.anon.`32`
import typingsSlinky.typedoc.anon.`33`
import typingsSlinky.typedoc.anon.`34`
import typingsSlinky.typedoc.anon.`35`
import typingsSlinky.typedoc.anon.`36`
import typingsSlinky.typedoc.anon.`37`
import typingsSlinky.typedoc.anon.`3`
import typingsSlinky.typedoc.anon.`4`
import typingsSlinky.typedoc.anon.`5`
import typingsSlinky.typedoc.anon.`6`
import typingsSlinky.typedoc.anon.`7`
import typingsSlinky.typedoc.anon.`8`
import typingsSlinky.typedoc.anon.`9`
import typingsSlinky.typedoc.libUtilsMod.NeverIfInternal
import typingsSlinky.typedoc.loggersMod.Logger
import typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOption
import typingsSlinky.typedoc.optionsDeclarationMod.KeyToDeclaration
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterScope
import typingsSlinky.typedoc.optionsDeclarationMod.TypeDocAndTSOptions
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
import typingsSlinky.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsOptionsMod {
  
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption(name: NeverIfInternal[String]): js.Function2[
    /* target */ Application | typingsSlinky.typedoc.anon.Options, 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_categorizeByGroup(name: categorizeByGroup): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_categoryOrder(name: categoryOrder): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_defaultCategory(name: defaultCategory): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_disableOutputCheck(name: disableOutputCheck): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_disableSources(name: disableSources): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_entryPoint(name: entryPoint): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_exclude(name: exclude): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_excludeExternals(name: excludeExternals): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_excludeNotDocumented(name: excludeNotDocumented): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_excludeNotExported(name: excludeNotExported): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_excludePrivate(name: excludePrivate): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_excludeProtected(name: excludeProtected): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_excludeTags(name: excludeTags): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_externalPattern(name: externalPattern): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_gaID(name: gaID): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_gaSite(name: gaSite): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_gitRemote(name: gitRemote): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_gitRevision(name: gitRevision): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_help(name: help): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_hideGenerator(name: hideGenerator): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_ignoreCompilerErrors(name: ignoreCompilerErrors): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_includeDeclarations(name: includeDeclarations): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_includeVersion(name: includeVersion): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_includes(name: includes): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_inputFiles(name: inputFiles): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_json(name: json): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_listInvalidSymbolLinks(name: listInvalidSymbolLinks): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_logger(name: logger): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_media(name: media): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_mode(name: mode): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_name(name: name): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_options(name: options): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_out(name: out): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_plugin(name: plugin): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_readme(name: readme): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_theme(name: theme): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_toc(name: toc): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_tsconfig(name: tsconfig): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
  @js.native
  def BindOption_version(name: version): js.Function2[
    /* target */ (Application | typingsSlinky.typedoc.anon.Options) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  
  @JSImport("typedoc/dist/lib/utils/options/options", "Options")
  @js.native
  class Options protected () extends StObject {
    def this(logger: Logger) = this()
    
    var _compilerOptions: js.Any = js.native
    
    var _declarations: js.Any = js.native
    
    var _logger: js.Any = js.native
    
    var _readers: js.Any = js.native
    
    var _values: js.Any = js.native
    
    def addDeclaration(declaration: NeverIfInternal[DeclarationOption]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_categorizeByGroup(declaration: `33` with KeyToDeclaration[categorizeByGroup]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_categoryOrder(declaration: `24` with KeyToDeclaration[categoryOrder]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_defaultCategory(declaration: `9` with KeyToDeclaration[defaultCategory]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_disableOutputCheck(declaration: `27` with KeyToDeclaration[disableOutputCheck]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_disableSources(declaration: `18` with KeyToDeclaration[disableSources]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_entryPoint(declaration: `28` with KeyToDeclaration[entryPoint]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_exclude(declaration: `8` with KeyToDeclaration[exclude]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeExternals(declaration: `36` with KeyToDeclaration[excludeExternals]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeNotDocumented(declaration: `15` with KeyToDeclaration[excludeNotDocumented]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeNotExported(declaration: `20` with KeyToDeclaration[excludeNotExported]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludePrivate(declaration: `22` with KeyToDeclaration[excludePrivate]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeProtected(declaration: `14` with KeyToDeclaration[excludeProtected]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeTags(declaration: `23` with KeyToDeclaration[excludeTags]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_externalPattern(declaration: `35` with KeyToDeclaration[externalPattern]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_gaID(declaration: `1` with KeyToDeclaration[gaID]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_gaSite(declaration: `31` with KeyToDeclaration[gaSite]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_gitRemote(declaration: `4` with KeyToDeclaration[gitRemote]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_gitRevision(declaration: `26` with KeyToDeclaration[gitRevision]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_help(declaration: `21` with KeyToDeclaration[help]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_hideGenerator(declaration: `2` with KeyToDeclaration[hideGenerator]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_ignoreCompilerErrors(declaration: `29` with KeyToDeclaration[ignoreCompilerErrors]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_includeDeclarations(declaration: `16` with KeyToDeclaration[includeDeclarations]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_includeVersion(declaration: `7` with KeyToDeclaration[includeVersion]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_includes(declaration: `11` with KeyToDeclaration[includes]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_inputFiles(declaration: `10` with KeyToDeclaration[inputFiles]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_json(declaration: `5` with KeyToDeclaration[json]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_listInvalidSymbolLinks(declaration: `6` with KeyToDeclaration[listInvalidSymbolLinks]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_logger(declaration: `3` with KeyToDeclaration[typingsSlinky.typedoc.typedocStrings.logger]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_media(declaration: `17` with KeyToDeclaration[media]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_mode(declaration: `30` with KeyToDeclaration[mode]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_name(declaration: `34` with KeyToDeclaration[name]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_options(declaration: `32` with KeyToDeclaration[options]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_out(declaration: `0` with KeyToDeclaration[out]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_plugin(declaration: `13` with KeyToDeclaration[plugin]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_readme(declaration: `37` with KeyToDeclaration[readme]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_theme(declaration: `12` with KeyToDeclaration[theme]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_toc(declaration: `25` with KeyToDeclaration[toc]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_tsconfig(declaration: `19` with KeyToDeclaration[tsconfig]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_version(declaration: Name with KeyToDeclaration[version]): Unit = js.native
    
    def addDeclarations(declarations: js.Array[DeclarationOption]): Unit = js.native
    
    def addDefaultDeclarations(): Unit = js.native
    
    def addReader(reader: OptionsReader): Unit = js.native
    
    def getCompilerOptions(): CompilerOptions = js.native
    
    def getDeclaration(name: String): js.UndefOr[DeclarationOption] = js.native
    
    def getDeclarationsByScope(scope: ParameterScope): js.Array[
        ReadonlyStringDeclaration | ReadonlyNumberDeclaration | ReadonlyBooleanDeclaratio | ReadonlyMixedDeclarationO | ReadonlyMapDeclarationOpt | ReadonlyArrayDeclarationO
      ] = js.native
    
    var getDefaultOptionValue: js.Any = js.native
    
    def getRawValues(): PartialTypeDocOptions = js.native
    
    def getValue(name: NeverIfInternal[String]): js.Any = js.native
    @JSName("getValue")
    def getValue_categorizeByGroup(name: categorizeByGroup): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_categoryOrder(name: categoryOrder): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_defaultCategory(name: defaultCategory): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_disableOutputCheck(name: disableOutputCheck): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_disableSources(name: disableSources): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_entryPoint(name: entryPoint): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_exclude(name: exclude): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_excludeExternals(name: excludeExternals): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_excludeNotDocumented(name: excludeNotDocumented): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_excludeNotExported(name: excludeNotExported): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_excludePrivate(name: excludePrivate): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_excludeProtected(name: excludeProtected): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_excludeTags(name: excludeTags): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_externalPattern(name: externalPattern): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_gaID(name: gaID): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_gaSite(name: gaSite): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_gitRemote(name: gitRemote): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_gitRevision(name: gitRevision): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_help(name: help): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_hideGenerator(name: hideGenerator): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_ignoreCompilerErrors(name: ignoreCompilerErrors): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_includeDeclarations(name: includeDeclarations): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_includeVersion(name: includeVersion): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_includes(name: includes): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_inputFiles(name: inputFiles): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_json(name: json): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_listInvalidSymbolLinks(name: listInvalidSymbolLinks): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_logger(name: typingsSlinky.typedoc.typedocStrings.logger): js.UndefOr[js.Any | (Exclude[_, String])] = js.native
    @JSName("getValue")
    def getValue_media(name: media): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_mode(name: mode): js.UndefOr[File | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_name(name: name): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_options(name: options): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_out(name: out): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_plugin(name: plugin): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_readme(name: readme): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_theme(name: theme): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_toc(name: toc): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_tsconfig(name: tsconfig): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
    @JSName("getValue")
    def getValue_version(name: version): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
    
    def isDefault(name: NeverIfInternal[String]): Boolean = js.native
    @JSName("isDefault")
    def isDefault_categorizeByGroup(name: categorizeByGroup): Boolean = js.native
    @JSName("isDefault")
    def isDefault_categoryOrder(name: categoryOrder): Boolean = js.native
    @JSName("isDefault")
    def isDefault_defaultCategory(name: defaultCategory): Boolean = js.native
    @JSName("isDefault")
    def isDefault_disableOutputCheck(name: disableOutputCheck): Boolean = js.native
    @JSName("isDefault")
    def isDefault_disableSources(name: disableSources): Boolean = js.native
    @JSName("isDefault")
    def isDefault_entryPoint(name: entryPoint): Boolean = js.native
    @JSName("isDefault")
    def isDefault_exclude(name: exclude): Boolean = js.native
    @JSName("isDefault")
    def isDefault_excludeExternals(name: excludeExternals): Boolean = js.native
    @JSName("isDefault")
    def isDefault_excludeNotDocumented(name: excludeNotDocumented): Boolean = js.native
    @JSName("isDefault")
    def isDefault_excludeNotExported(name: excludeNotExported): Boolean = js.native
    @JSName("isDefault")
    def isDefault_excludePrivate(name: excludePrivate): Boolean = js.native
    @JSName("isDefault")
    def isDefault_excludeProtected(name: excludeProtected): Boolean = js.native
    @JSName("isDefault")
    def isDefault_excludeTags(name: excludeTags): Boolean = js.native
    @JSName("isDefault")
    def isDefault_externalPattern(name: externalPattern): Boolean = js.native
    @JSName("isDefault")
    def isDefault_gaID(name: gaID): Boolean = js.native
    @JSName("isDefault")
    def isDefault_gaSite(name: gaSite): Boolean = js.native
    @JSName("isDefault")
    def isDefault_gitRemote(name: gitRemote): Boolean = js.native
    @JSName("isDefault")
    def isDefault_gitRevision(name: gitRevision): Boolean = js.native
    @JSName("isDefault")
    def isDefault_help(name: help): Boolean = js.native
    @JSName("isDefault")
    def isDefault_hideGenerator(name: hideGenerator): Boolean = js.native
    @JSName("isDefault")
    def isDefault_ignoreCompilerErrors(name: ignoreCompilerErrors): Boolean = js.native
    @JSName("isDefault")
    def isDefault_includeDeclarations(name: includeDeclarations): Boolean = js.native
    @JSName("isDefault")
    def isDefault_includeVersion(name: includeVersion): Boolean = js.native
    @JSName("isDefault")
    def isDefault_includes(name: includes): Boolean = js.native
    @JSName("isDefault")
    def isDefault_inputFiles(name: inputFiles): Boolean = js.native
    @JSName("isDefault")
    def isDefault_json(name: json): Boolean = js.native
    @JSName("isDefault")
    def isDefault_listInvalidSymbolLinks(name: listInvalidSymbolLinks): Boolean = js.native
    @JSName("isDefault")
    def isDefault_logger(name: typingsSlinky.typedoc.typedocStrings.logger): Boolean = js.native
    @JSName("isDefault")
    def isDefault_media(name: media): Boolean = js.native
    @JSName("isDefault")
    def isDefault_mode(name: mode): Boolean = js.native
    @JSName("isDefault")
    def isDefault_name(name: name): Boolean = js.native
    @JSName("isDefault")
    def isDefault_options(name: options): Boolean = js.native
    @JSName("isDefault")
    def isDefault_out(name: out): Boolean = js.native
    @JSName("isDefault")
    def isDefault_plugin(name: plugin): Boolean = js.native
    @JSName("isDefault")
    def isDefault_readme(name: readme): Boolean = js.native
    @JSName("isDefault")
    def isDefault_theme(name: theme): Boolean = js.native
    @JSName("isDefault")
    def isDefault_toc(name: toc): Boolean = js.native
    @JSName("isDefault")
    def isDefault_tsconfig(name: tsconfig): Boolean = js.native
    @JSName("isDefault")
    def isDefault_version(name: version): Boolean = js.native
    
    def read(logger: Logger): Unit = js.native
    
    def removeDeclarationByName(name: String): Unit = js.native
    
    def removeReaderByName(name: String): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setLogger(logger: Logger): Unit = js.native
    
    var setOptionValueToDefault: js.Any = js.native
    
    def setValue(name: NeverIfInternal[String], value: NeverIfInternal[_]): Unit = js.native
    @JSName("setValue")
    def setValue_categorizeByGroup(name: categorizeByGroup, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_categoryOrder(name: categoryOrder, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_defaultCategory(name: defaultCategory, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_disableOutputCheck(name: disableOutputCheck, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_disableSources(name: disableSources, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_entryPoint(name: entryPoint, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_exclude(name: exclude, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_excludeExternals(name: excludeExternals, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_excludeNotDocumented(name: excludeNotDocumented, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_excludeNotExported(name: excludeNotExported, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_excludePrivate(name: excludePrivate, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_excludeProtected(name: excludeProtected, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_excludeTags(name: excludeTags, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_externalPattern(name: externalPattern, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_gaID(name: gaID, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_gaSite(name: gaSite, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_gitRemote(name: gitRemote, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_gitRevision(name: gitRevision, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_help(name: help, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_hideGenerator(name: hideGenerator, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_ignoreCompilerErrors(name: ignoreCompilerErrors, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_includeDeclarations(name: includeDeclarations, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_includeVersion(name: includeVersion, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_includes(name: includes, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_inputFiles(name: inputFiles, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_json(name: json, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_listInvalidSymbolLinks(name: listInvalidSymbolLinks, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_logger(
      name: typingsSlinky.typedoc.typedocStrings.logger,
      value: js.UndefOr[js.Any | (Exclude[_, String])]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_media(name: media, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_mode(name: mode, value: js.UndefOr[File | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_name(name: name, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_options(name: options, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_out(name: out, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_plugin(name: plugin, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_readme(name: readme, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_theme(name: theme, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_toc(name: toc, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_tsconfig(name: tsconfig, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Unit = js.native
    @JSName("setValue")
    def setValue_version(name: version, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Unit = js.native
    
    def setValues(obj: NeverIfInternal[Partial[TypeDocAndTSOptions]]): Unit = js.native
  }
  
  @js.native
  trait OptionsReader extends StObject {
    
    var name: String = js.native
    
    var priority: Double = js.native
    
    def read(container: Options, logger: Logger): Unit = js.native
  }
  object OptionsReader {
    
    @scala.inline
    def apply(name: String, priority: Double, read: (Options, Logger) => Unit): OptionsReader = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], read = js.Any.fromFunction2(read))
      __obj.asInstanceOf[OptionsReader]
    }
    
    @scala.inline
    implicit class OptionsReaderMutableBuilder[Self <: OptionsReader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: (Options, Logger) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    }
  }
}
