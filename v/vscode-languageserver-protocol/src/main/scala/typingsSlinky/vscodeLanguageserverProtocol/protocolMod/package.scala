package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object protocolMod {
  
  type ClientCapabilities = typingsSlinky.vscodeLanguageserverProtocol.protocolMod._ClientCapabilities with typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersClientCapabilities with typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationClientCapabilities with typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressClientCapabilities
  
  type DefinitionOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type DocumentFormattingOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type DocumentHighlightOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type DocumentRangeFormattingOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type DocumentSelector = js.Array[
    java.lang.String | typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
  ]
  
  type DocumentSymbolOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type ExecuteCommandRegistrationOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandOptions
  
  type HoverOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type InitializeParams = typingsSlinky.vscodeLanguageserverProtocol.protocolMod._InitializeParams with typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersInitializeParams
  
  type ReferenceOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type ServerCapabilities[T] = typingsSlinky.vscodeLanguageserverProtocol.protocolMod._ServerCapabilities[T] with typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersServerCapabilities
  
  type WorkspaceSymbolOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type WorkspaceSymbolRegistrationOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolOptions
}
