package typingsSlinky.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  import typingsSlinky.vscode.vscodeMod.CompletionContext
  import typingsSlinky.vscode.vscodeMod.Definition
  import typingsSlinky.vscode.vscodeMod.DefinitionLink
  import typingsSlinky.vscode.vscodeMod.ProviderResult
  import typingsSlinky.vscode.vscodeMod.SignatureHelp
  import typingsSlinky.vscode.vscodeMod.Uri
  import typingsSlinky.vscodeDashLanguageclient.Anon_IncludeDeclaration
  import typingsSlinky.vscodeDashLanguageclient.Anon_Placeholder
  import typingsSlinky.vscodeDashLanguageclient.libColorProviderMod.ColorProviderMiddleware
  import typingsSlinky.vscodeDashLanguageclient.libConfigurationMod.ConfigurationWorkspaceMiddleware
  import typingsSlinky.vscodeDashLanguageclient.libDeclarationMod.DeclarationMiddleware
  import typingsSlinky.vscodeDashLanguageclient.libFoldingRangeMod.FoldingRangeProviderMiddleware
  import typingsSlinky.vscodeDashLanguageclient.libImplementationMod.ImplementationMiddleware
  import typingsSlinky.vscodeDashLanguageclient.libTypeDefinitionMod.TypeDefinitionMiddleware
  import typingsSlinky.vscodeDashLanguageclient.libWorkspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware

  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[String]], Unit]
  type HandleDiagnosticsSignature = js.Function2[
    /* uri */ Uri, 
    /* diagnostics */ js.Array[typingsSlinky.vscode.vscodeMod.Diagnostic], 
    Unit
  ]
  type InitializationFailedHandler = js.Function1[
    /* error */ (typingsSlinky.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.ResponseError[
      typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeError
    ]) | js.Error | js.Any, 
    Boolean
  ]
  type Middleware = _Middleware with TypeDefinitionMiddleware with ImplementationMiddleware with ColorProviderMiddleware with FoldingRangeProviderMiddleware with DeclarationMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typingsSlinky.vscode.vscodeMod.Range | Anon_Placeholder]
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* range */ typingsSlinky.vscode.vscodeMod.Range, 
    /* context */ typingsSlinky.vscode.vscodeMod.CodeActionContext, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[
      js.Array[
        typingsSlinky.vscode.vscodeMod.Command | typingsSlinky.vscode.vscodeMod.CodeAction
      ]
    ]
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.CodeLens]]
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* context */ CompletionContext, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[
      js.Array[typingsSlinky.vscode.vscodeMod.CompletionItem] | typingsSlinky.vscode.vscodeMod.CompletionList
    ]
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.DocumentHighlight]]
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.DocumentLink]]
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* range */ typingsSlinky.vscode.vscodeMod.Range, 
    /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[
      js.Array[
        typingsSlinky.vscode.vscodeMod.DocumentSymbol | typingsSlinky.vscode.vscodeMod.SymbolInformation
      ]
    ]
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typingsSlinky.vscode.vscodeMod.Hover]
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* ch */ String, 
    /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* options */ Anon_IncludeDeclaration, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.Location]]
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* newName */ String, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typingsSlinky.vscode.vscodeMod.WorkspaceEdit]
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
    /* position */ typingsSlinky.vscode.vscodeMod.Position, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[SignatureHelp]
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ String, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.SymbolInformation]]
  ]
  type ResolveCodeLensSignature = js.Function2[
    /* codeLens */ typingsSlinky.vscode.vscodeMod.CodeLens, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typingsSlinky.vscode.vscodeMod.CodeLens]
  ]
  type ResolveCompletionItemSignature = js.Function2[
    /* item */ typingsSlinky.vscode.vscodeMod.CompletionItem, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typingsSlinky.vscode.vscodeMod.CompletionItem]
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* link */ typingsSlinky.vscode.vscodeMod.DocumentLink, 
    /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typingsSlinky.vscode.vscodeMod.DocumentLink]
  ]
  type WorkspaceMiddleware = _WorkspaceMiddleware with ConfigurationWorkspaceMiddleware with WorkspaceFolderWorkspaceMiddleware
}
