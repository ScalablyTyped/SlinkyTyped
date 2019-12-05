package typingsSlinky.vscodeDashLanguageclient.libClientMod

import typingsSlinky.vscode.vscodeMod.CompletionContext
import typingsSlinky.vscode.vscodeMod.Definition
import typingsSlinky.vscode.vscodeMod.DefinitionLink
import typingsSlinky.vscode.vscodeMod.ProviderResult
import typingsSlinky.vscode.vscodeMod.SignatureHelp
import typingsSlinky.vscode.vscodeMod.TextDocumentChangeEvent
import typingsSlinky.vscode.vscodeMod.TextDocumentWillSaveEvent
import typingsSlinky.vscode.vscodeMod.Uri
import typingsSlinky.vscodeDashJsonrpc.Thenable
import typingsSlinky.vscodeDashLanguageclient.Anon_IncludeDeclaration
import typingsSlinky.vscodeDashLanguageclient.Anon_Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Middleware extends js.Object {
  var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, Unit]] = js.undefined
  var didClose: js.UndefOr[NextSignature[typingsSlinky.vscode.vscodeMod.TextDocument, Unit]] = js.undefined
  var didOpen: js.UndefOr[NextSignature[typingsSlinky.vscode.vscodeMod.TextDocument, Unit]] = js.undefined
  var didSave: js.UndefOr[NextSignature[typingsSlinky.vscode.vscodeMod.TextDocument, Unit]] = js.undefined
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[typingsSlinky.vscode.vscodeMod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ]
  ] = js.undefined
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.Range | Anon_Placeholder]
    ]
  ] = js.undefined
  var provideCodeActions: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* range */ typingsSlinky.vscode.vscodeMod.Range, 
      /* context */ typingsSlinky.vscode.vscodeMod.CodeActionContext, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[
        js.Array[
          typingsSlinky.vscode.vscodeMod.Command | typingsSlinky.vscode.vscodeMod.CodeAction
        ]
      ]
    ]
  ] = js.undefined
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.CodeLens]]
    ]
  ] = js.undefined
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* context */ CompletionContext, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[
        js.Array[typingsSlinky.vscode.vscodeMod.CompletionItem] | typingsSlinky.vscode.vscodeMod.CompletionList
      ]
    ]
  ] = js.undefined
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.undefined
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.DocumentHighlight]]
    ]
  ] = js.undefined
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.DocumentLink]]
    ]
  ] = js.undefined
  var provideDocumentRangeFormattingEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* range */ typingsSlinky.vscode.vscodeMod.Range, 
      /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[
        js.Array[
          typingsSlinky.vscode.vscodeMod.DocumentSymbol | typingsSlinky.vscode.vscodeMod.SymbolInformation
        ]
      ]
    ]
  ] = js.undefined
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.Hover]
    ]
  ] = js.undefined
  var provideOnTypeFormattingEdits: js.UndefOr[
    js.ThisFunction6[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* ch */ String, 
      /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
    ]
  ] = js.undefined
  var provideReferences: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* options */ Anon_IncludeDeclaration, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.Location]]
    ]
  ] = js.undefined
  var provideRenameEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* newName */ String, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.WorkspaceEdit]
    ]
  ] = js.undefined
  var provideSignatureHelp: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ]
  ] = js.undefined
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.SymbolInformation]]
    ]
  ] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ typingsSlinky.vscode.vscodeMod.CodeLens, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.CodeLens]
    ]
  ] = js.undefined
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* item */ typingsSlinky.vscode.vscodeMod.CompletionItem, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.CompletionItem]
    ]
  ] = js.undefined
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typingsSlinky.vscode.vscodeMod.DocumentLink, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.DocumentLink]
    ]
  ] = js.undefined
  var willSave: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, Unit]] = js.undefined
  var willSaveWaitUntil: js.UndefOr[
    NextSignature[
      TextDocumentWillSaveEvent, 
      Thenable[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
    ]
  ] = js.undefined
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.undefined
}

object _Middleware {
  @scala.inline
  def apply(
    didChange: NextSignature[TextDocumentChangeEvent, Unit] = null,
    didClose: NextSignature[typingsSlinky.vscode.vscodeMod.TextDocument, Unit] = null,
    didOpen: NextSignature[typingsSlinky.vscode.vscodeMod.TextDocument, Unit] = null,
    didSave: NextSignature[typingsSlinky.vscode.vscodeMod.TextDocument, Unit] = null,
    handleDiagnostics: js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[typingsSlinky.vscode.vscodeMod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ] = null,
    prepareRename: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.Range | Anon_Placeholder]
    ] = null,
    provideCodeActions: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* range */ typingsSlinky.vscode.vscodeMod.Range, 
      /* context */ typingsSlinky.vscode.vscodeMod.CodeActionContext, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[
        js.Array[
          typingsSlinky.vscode.vscodeMod.Command | typingsSlinky.vscode.vscodeMod.CodeAction
        ]
      ]
    ] = null,
    provideCodeLenses: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.CodeLens]]
    ] = null,
    provideCompletionItem: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* context */ CompletionContext, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[
        js.Array[typingsSlinky.vscode.vscodeMod.CompletionItem] | typingsSlinky.vscode.vscodeMod.CompletionList
      ]
    ] = null,
    provideDefinition: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ] = null,
    provideDocumentFormattingEdits: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
    ] = null,
    provideDocumentHighlights: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.DocumentHighlight]]
    ] = null,
    provideDocumentLinks: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.DocumentLink]]
    ] = null,
    provideDocumentRangeFormattingEdits: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* range */ typingsSlinky.vscode.vscodeMod.Range, 
      /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
    ] = null,
    provideDocumentSymbols: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[
        js.Array[
          typingsSlinky.vscode.vscodeMod.DocumentSymbol | typingsSlinky.vscode.vscodeMod.SymbolInformation
        ]
      ]
    ] = null,
    provideHover: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.Hover]
    ] = null,
    provideOnTypeFormattingEdits: js.ThisFunction6[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* ch */ String, 
      /* options */ typingsSlinky.vscode.vscodeMod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
    ] = null,
    provideReferences: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* options */ Anon_IncludeDeclaration, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.Location]]
    ] = null,
    provideRenameEdits: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* newName */ String, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.WorkspaceEdit]
    ] = null,
    provideSignatureHelp: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.vscodeMod.TextDocument, 
      /* position */ typingsSlinky.vscode.vscodeMod.Position, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ] = null,
    provideWorkspaceSymbols: js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.vscodeMod.SymbolInformation]]
    ] = null,
    resolveCodeLens: js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ typingsSlinky.vscode.vscodeMod.CodeLens, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.CodeLens]
    ] = null,
    resolveCompletionItem: js.ThisFunction3[
      /* this */ Unit, 
      /* item */ typingsSlinky.vscode.vscodeMod.CompletionItem, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.CompletionItem]
    ] = null,
    resolveDocumentLink: js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typingsSlinky.vscode.vscodeMod.DocumentLink, 
      /* token */ typingsSlinky.vscode.vscodeMod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typingsSlinky.vscode.vscodeMod.DocumentLink]
    ] = null,
    willSave: NextSignature[TextDocumentWillSaveEvent, Unit] = null,
    willSaveWaitUntil: NextSignature[
      TextDocumentWillSaveEvent, 
      Thenable[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]]
    ] = null,
    workspace: WorkspaceMiddleware = null
  ): _Middleware = {
    val __obj = js.Dynamic.literal()
    if (didChange != null) __obj.updateDynamic("didChange")(didChange.asInstanceOf[js.Any])
    if (didClose != null) __obj.updateDynamic("didClose")(didClose.asInstanceOf[js.Any])
    if (didOpen != null) __obj.updateDynamic("didOpen")(didOpen.asInstanceOf[js.Any])
    if (didSave != null) __obj.updateDynamic("didSave")(didSave.asInstanceOf[js.Any])
    if (handleDiagnostics != null) __obj.updateDynamic("handleDiagnostics")(handleDiagnostics.asInstanceOf[js.Any])
    if (prepareRename != null) __obj.updateDynamic("prepareRename")(prepareRename.asInstanceOf[js.Any])
    if (provideCodeActions != null) __obj.updateDynamic("provideCodeActions")(provideCodeActions.asInstanceOf[js.Any])
    if (provideCodeLenses != null) __obj.updateDynamic("provideCodeLenses")(provideCodeLenses.asInstanceOf[js.Any])
    if (provideCompletionItem != null) __obj.updateDynamic("provideCompletionItem")(provideCompletionItem.asInstanceOf[js.Any])
    if (provideDefinition != null) __obj.updateDynamic("provideDefinition")(provideDefinition.asInstanceOf[js.Any])
    if (provideDocumentFormattingEdits != null) __obj.updateDynamic("provideDocumentFormattingEdits")(provideDocumentFormattingEdits.asInstanceOf[js.Any])
    if (provideDocumentHighlights != null) __obj.updateDynamic("provideDocumentHighlights")(provideDocumentHighlights.asInstanceOf[js.Any])
    if (provideDocumentLinks != null) __obj.updateDynamic("provideDocumentLinks")(provideDocumentLinks.asInstanceOf[js.Any])
    if (provideDocumentRangeFormattingEdits != null) __obj.updateDynamic("provideDocumentRangeFormattingEdits")(provideDocumentRangeFormattingEdits.asInstanceOf[js.Any])
    if (provideDocumentSymbols != null) __obj.updateDynamic("provideDocumentSymbols")(provideDocumentSymbols.asInstanceOf[js.Any])
    if (provideHover != null) __obj.updateDynamic("provideHover")(provideHover.asInstanceOf[js.Any])
    if (provideOnTypeFormattingEdits != null) __obj.updateDynamic("provideOnTypeFormattingEdits")(provideOnTypeFormattingEdits.asInstanceOf[js.Any])
    if (provideReferences != null) __obj.updateDynamic("provideReferences")(provideReferences.asInstanceOf[js.Any])
    if (provideRenameEdits != null) __obj.updateDynamic("provideRenameEdits")(provideRenameEdits.asInstanceOf[js.Any])
    if (provideSignatureHelp != null) __obj.updateDynamic("provideSignatureHelp")(provideSignatureHelp.asInstanceOf[js.Any])
    if (provideWorkspaceSymbols != null) __obj.updateDynamic("provideWorkspaceSymbols")(provideWorkspaceSymbols.asInstanceOf[js.Any])
    if (resolveCodeLens != null) __obj.updateDynamic("resolveCodeLens")(resolveCodeLens.asInstanceOf[js.Any])
    if (resolveCompletionItem != null) __obj.updateDynamic("resolveCompletionItem")(resolveCompletionItem.asInstanceOf[js.Any])
    if (resolveDocumentLink != null) __obj.updateDynamic("resolveDocumentLink")(resolveDocumentLink.asInstanceOf[js.Any])
    if (willSave != null) __obj.updateDynamic("willSave")(willSave.asInstanceOf[js.Any])
    if (willSaveWaitUntil != null) __obj.updateDynamic("willSaveWaitUntil")(willSaveWaitUntil.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Middleware]
  }
}

