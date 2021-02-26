package typingsSlinky.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object optionsDeclarationMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typedoc.optionsDeclarationMod.StringDeclarationOption
    - typingsSlinky.typedoc.optionsDeclarationMod.NumberDeclarationOption
    - typingsSlinky.typedoc.optionsDeclarationMod.BooleanDeclarationOption
    - typingsSlinky.typedoc.optionsDeclarationMod.MixedDeclarationOption
    - typingsSlinky.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]
    - typingsSlinky.typedoc.optionsDeclarationMod.ArrayDeclarationOption
  */
  type DeclarationOption = typingsSlinky.typedoc.optionsDeclarationMod._DeclarationOption | typingsSlinky.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]
  
  type DeclarationOptionToOptionType[T /* <: typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOption */] = js.Array[java.lang.String] | js.Any | scala.Boolean | scala.Double | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]
    - typingsSlinky.typedoc.optionsDeclarationMod.MixedDeclarationOption
    - typingsSlinky.typedoc.optionsDeclarationMod.ArrayDeclarationOption
    - typingsSlinky.typedoc.optionsDeclarationMod.NumberDeclarationOption
    - typingsSlinky.typedoc.optionsDeclarationMod.StringDeclarationOption
    - typingsSlinky.typedoc.optionsDeclarationMod.BooleanDeclarationOption
  */
  type KeyToDeclaration[K /* <: typingsSlinky.typedoc.typedocStrings.options | typingsSlinky.typedoc.typedocStrings.tsconfig | typingsSlinky.typedoc.typedocStrings.inputFiles | typingsSlinky.typedoc.typedocStrings.mode | typingsSlinky.typedoc.typedocStrings.includeDeclarations | typingsSlinky.typedoc.typedocStrings.entryPoint | typingsSlinky.typedoc.typedocStrings.exclude | typingsSlinky.typedoc.typedocStrings.externalPattern | typingsSlinky.typedoc.typedocStrings.excludeExternals | typingsSlinky.typedoc.typedocStrings.excludeNotExported | typingsSlinky.typedoc.typedocStrings.excludePrivate | typingsSlinky.typedoc.typedocStrings.excludeProtected | typingsSlinky.typedoc.typedocStrings.excludeNotDocumented | typingsSlinky.typedoc.typedocStrings.ignoreCompilerErrors | typingsSlinky.typedoc.typedocStrings.disableSources | typingsSlinky.typedoc.typedocStrings.includes | typingsSlinky.typedoc.typedocStrings.media | typingsSlinky.typedoc.typedocStrings.out | typingsSlinky.typedoc.typedocStrings.json | typingsSlinky.typedoc.typedocStrings.theme | typingsSlinky.typedoc.typedocStrings.name | typingsSlinky.typedoc.typedocStrings.includeVersion | typingsSlinky.typedoc.typedocStrings.excludeTags | typingsSlinky.typedoc.typedocStrings.readme | typingsSlinky.typedoc.typedocStrings.defaultCategory | typingsSlinky.typedoc.typedocStrings.categoryOrder | typingsSlinky.typedoc.typedocStrings.categorizeByGroup | typingsSlinky.typedoc.typedocStrings.gitRevision | typingsSlinky.typedoc.typedocStrings.gitRemote | typingsSlinky.typedoc.typedocStrings.gaID | typingsSlinky.typedoc.typedocStrings.gaSite | typingsSlinky.typedoc.typedocStrings.hideGenerator | typingsSlinky.typedoc.typedocStrings.toc | typingsSlinky.typedoc.typedocStrings.disableOutputCheck | typingsSlinky.typedoc.typedocStrings.help | typingsSlinky.typedoc.typedocStrings.version | typingsSlinky.typedoc.typedocStrings.plugin | typingsSlinky.typedoc.typedocStrings.logger | typingsSlinky.typedoc.typedocStrings.listInvalidSymbolLinks */] = typingsSlinky.typedoc.optionsDeclarationMod._KeyToDeclaration[K] | typingsSlinky.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]
  
  type KnownKeys[T] = js.Any
  
  type TypeDocAndTSOptions = typingsSlinky.typedoc.optionsDeclarationMod.TypeDocOptions with (typingsSlinky.std.Pick[
    typingsSlinky.typescript.mod.CompilerOptions, 
    typingsSlinky.std.Exclude[
      typingsSlinky.typedoc.optionsDeclarationMod.KnownKeys[typingsSlinky.typescript.mod.CompilerOptions], 
      typingsSlinky.typedoc.typescriptMod.IgnoredTsOptionKeys
    ]
  ])
  
  @scala.inline
  def convert(value: js.Any, option: typingsSlinky.typedoc.optionsDeclarationMod.ArrayDeclarationOption): typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.ArrayDeclarationOption] = (typingsSlinky.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.ArrayDeclarationOption]]
  @scala.inline
  def convert(value: js.Any, option: typingsSlinky.typedoc.optionsDeclarationMod.BooleanDeclarationOption): typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.BooleanDeclarationOption] = (typingsSlinky.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.BooleanDeclarationOption]]
  @scala.inline
  def convert(value: js.Any, option: typingsSlinky.typedoc.optionsDeclarationMod.MapDeclarationOption[_]): typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.MapDeclarationOption[_]] = (typingsSlinky.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.MapDeclarationOption[_]]]
  @scala.inline
  def convert(value: js.Any, option: typingsSlinky.typedoc.optionsDeclarationMod.MixedDeclarationOption): typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.MixedDeclarationOption] = (typingsSlinky.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.MixedDeclarationOption]]
  @scala.inline
  def convert(value: js.Any, option: typingsSlinky.typedoc.optionsDeclarationMod.NumberDeclarationOption): typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.NumberDeclarationOption] = (typingsSlinky.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.NumberDeclarationOption]]
  @scala.inline
  def convert(value: js.Any, option: typingsSlinky.typedoc.optionsDeclarationMod.StringDeclarationOption): typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.StringDeclarationOption] = (typingsSlinky.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typingsSlinky.typedoc.optionsDeclarationMod.StringDeclarationOption]]
}
