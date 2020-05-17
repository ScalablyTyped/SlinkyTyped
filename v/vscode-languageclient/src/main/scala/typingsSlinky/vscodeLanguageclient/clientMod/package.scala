package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  type HandleDiagnosticsSignature = js.Function2[
    /* uri */ typingsSlinky.vscode.mod.Uri, 
    /* diagnostics */ js.Array[typingsSlinky.vscode.mod.Diagnostic], 
    scala.Unit
  ]
  type InitializationFailedHandler = js.Function1[
    /* error */ typingsSlinky.vscodeLanguageserverProtocol.mod.ResponseError[typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeError] | js.Error | js.Any, 
    scala.Boolean
  ]
  type Middleware = typingsSlinky.vscodeLanguageclient.clientMod._Middleware with typingsSlinky.vscodeLanguageclient.typeDefinitionMod.TypeDefinitionMiddleware with typingsSlinky.vscodeLanguageclient.implementationMod.ImplementationMiddleware with typingsSlinky.vscodeLanguageclient.colorProviderMod.ColorProviderMiddleware with typingsSlinky.vscodeLanguageclient.foldingRangeMod.FoldingRangeProviderMiddleware with typingsSlinky.vscodeLanguageclient.declarationMod.DeclarationMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      typingsSlinky.vscode.mod.Range | typingsSlinky.vscodeLanguageclient.anon.Placeholder
    ]
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* range */ typingsSlinky.vscode.mod.Range, 
    /* context */ typingsSlinky.vscode.mod.CodeActionContext, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.Command | typingsSlinky.vscode.mod.CodeAction]]
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.CodeLens]]
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* context */ typingsSlinky.vscode.mod.CompletionContext, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      js.Array[typingsSlinky.vscode.mod.CompletionItem] | typingsSlinky.vscode.mod.CompletionList
    ]
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      typingsSlinky.vscode.mod.Definition | js.Array[typingsSlinky.vscode.mod.DefinitionLink]
    ]
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentHighlight]]
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentLink]]
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* range */ typingsSlinky.vscode.mod.Range, 
    /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      js.Array[
        typingsSlinky.vscode.mod.DocumentSymbol | typingsSlinky.vscode.mod.SymbolInformation
      ]
    ]
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.Hover]
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* ch */ java.lang.String, 
    /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* options */ typingsSlinky.vscodeLanguageclient.anon.IncludeDeclaration, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.Location]]
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* newName */ java.lang.String, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.WorkspaceEdit]
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.SignatureHelp]
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ java.lang.String, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.SymbolInformation]]
  ]
  type ResolveCodeLensSignature = js.Function2[
    /* codeLens */ typingsSlinky.vscode.mod.CodeLens, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.CodeLens]
  ]
  type ResolveCompletionItemSignature = js.Function2[
    /* item */ typingsSlinky.vscode.mod.CompletionItem, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.CompletionItem]
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* link */ typingsSlinky.vscode.mod.DocumentLink, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.DocumentLink]
  ]
  type WorkspaceMiddleware = typingsSlinky.vscodeLanguageclient.clientMod._WorkspaceMiddleware with typingsSlinky.vscodeLanguageclient.configurationMod.ConfigurationWorkspaceMiddleware with typingsSlinky.vscodeLanguageclient.workspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
}
