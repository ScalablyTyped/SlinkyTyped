package typingsSlinky.typedoc.optionsDeclarationMod

import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Array
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Boolean
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Mixed
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Number
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _KeyToDeclaration[K /* <: options | tsconfig | inputFiles | mode | includeDeclarations | entryPoint | exclude | externalPattern | excludeExternals | excludeNotExported | excludePrivate | excludeProtected | excludeNotDocumented | ignoreCompilerErrors | disableSources | includes | media | out | json | theme | name | includeVersion | excludeTags | readme | defaultCategory | categoryOrder | categorizeByGroup | gitRevision | gitRemote | gaID | gaSite | hideGenerator | toc | disableOutputCheck | help | version | plugin | logger | listInvalidSymbolLinks */] extends js.Object
object _KeyToDeclaration {
  
  @scala.inline
  def StringDeclarationOption[K /* <: options | tsconfig | inputFiles | mode | includeDeclarations | entryPoint | exclude | externalPattern | excludeExternals | excludeNotExported | excludePrivate | excludeProtected | excludeNotDocumented | ignoreCompilerErrors | disableSources | includes | media | out | json | theme | name | includeVersion | excludeTags | readme | defaultCategory | categoryOrder | categorizeByGroup | gitRevision | gitRemote | gaID | gaSite | hideGenerator | toc | disableOutputCheck | help | version | plugin | logger | listInvalidSymbolLinks */](help: String, name: String): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
  
  @scala.inline
  def MixedDeclarationOption[K /* <: options | tsconfig | inputFiles | mode | includeDeclarations | entryPoint | exclude | externalPattern | excludeExternals | excludeNotExported | excludePrivate | excludeProtected | excludeNotDocumented | ignoreCompilerErrors | disableSources | includes | media | out | json | theme | name | includeVersion | excludeTags | readme | defaultCategory | categoryOrder | categorizeByGroup | gitRevision | gitRemote | gaID | gaSite | hideGenerator | toc | disableOutputCheck | help | version | plugin | logger | listInvalidSymbolLinks */](help: String, name: String, `type`: Mixed): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
  
  @scala.inline
  def ArrayDeclarationOption[K /* <: options | tsconfig | inputFiles | mode | includeDeclarations | entryPoint | exclude | externalPattern | excludeExternals | excludeNotExported | excludePrivate | excludeProtected | excludeNotDocumented | ignoreCompilerErrors | disableSources | includes | media | out | json | theme | name | includeVersion | excludeTags | readme | defaultCategory | categoryOrder | categorizeByGroup | gitRevision | gitRemote | gaID | gaSite | hideGenerator | toc | disableOutputCheck | help | version | plugin | logger | listInvalidSymbolLinks */](help: String, name: String, `type`: Array): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
  
  @scala.inline
  def BooleanDeclarationOption[K /* <: options | tsconfig | inputFiles | mode | includeDeclarations | entryPoint | exclude | externalPattern | excludeExternals | excludeNotExported | excludePrivate | excludeProtected | excludeNotDocumented | ignoreCompilerErrors | disableSources | includes | media | out | json | theme | name | includeVersion | excludeTags | readme | defaultCategory | categoryOrder | categorizeByGroup | gitRevision | gitRemote | gaID | gaSite | hideGenerator | toc | disableOutputCheck | help | version | plugin | logger | listInvalidSymbolLinks */](help: String, name: String, `type`: Boolean): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
  
  @scala.inline
  def NumberDeclarationOption[K /* <: options | tsconfig | inputFiles | mode | includeDeclarations | entryPoint | exclude | externalPattern | excludeExternals | excludeNotExported | excludePrivate | excludeProtected | excludeNotDocumented | ignoreCompilerErrors | disableSources | includes | media | out | json | theme | name | includeVersion | excludeTags | readme | defaultCategory | categoryOrder | categorizeByGroup | gitRevision | gitRemote | gaID | gaSite | hideGenerator | toc | disableOutputCheck | help | version | plugin | logger | listInvalidSymbolLinks */](help: String, name: String, `type`: Number): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
}
