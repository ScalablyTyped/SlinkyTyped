package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscode.mod.CompletionContext
import typingsSlinky.vscode.mod.Definition
import typingsSlinky.vscode.mod.DefinitionLink
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.SignatureHelp
import typingsSlinky.vscode.mod.TextDocumentChangeEvent
import typingsSlinky.vscode.mod.TextDocumentWillSaveEvent
import typingsSlinky.vscode.mod.Uri
import typingsSlinky.vscodeJsonrpc.Thenable
import typingsSlinky.vscodeLanguageclient.AnonIncludeDeclaration
import typingsSlinky.vscodeLanguageclient.AnonPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Middleware extends js.Object {
  var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, Unit]] = js.native
  var didClose: js.UndefOr[NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]] = js.native
  var didOpen: js.UndefOr[NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]] = js.native
  var didSave: js.UndefOr[NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]] = js.native
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[typingsSlinky.vscode.mod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ]
  ] = js.native
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[typingsSlinky.vscode.mod.Range | AnonPlaceholder]
    ]
  ] = js.native
  var provideCodeActions: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* range */ typingsSlinky.vscode.mod.Range, 
      /* context */ typingsSlinky.vscode.mod.CodeActionContext, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.Command | typingsSlinky.vscode.mod.CodeAction]]
    ]
  ] = js.native
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.CodeLens]]
    ]
  ] = js.native
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* context */ CompletionContext, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[
        js.Array[typingsSlinky.vscode.mod.CompletionItem] | typingsSlinky.vscode.mod.CompletionList
      ]
    ]
  ] = js.native
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.native
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
    ]
  ] = js.native
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentHighlight]]
    ]
  ] = js.native
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentLink]]
    ]
  ] = js.native
  var provideDocumentRangeFormattingEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* range */ typingsSlinky.vscode.mod.Range, 
      /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
    ]
  ] = js.native
  var provideDocumentSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[
        js.Array[
          typingsSlinky.vscode.mod.DocumentSymbol | typingsSlinky.vscode.mod.SymbolInformation
        ]
      ]
    ]
  ] = js.native
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[typingsSlinky.vscode.mod.Hover]
    ]
  ] = js.native
  var provideOnTypeFormattingEdits: js.UndefOr[
    js.ThisFunction6[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* ch */ String, 
      /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
    ]
  ] = js.native
  var provideReferences: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* options */ AnonIncludeDeclaration, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.Location]]
    ]
  ] = js.native
  var provideRenameEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* newName */ String, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[typingsSlinky.vscode.mod.WorkspaceEdit]
    ]
  ] = js.native
  var provideSignatureHelp: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ]
  ] = js.native
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.SymbolInformation]]
    ]
  ] = js.native
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ typingsSlinky.vscode.mod.CodeLens, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[typingsSlinky.vscode.mod.CodeLens]
    ]
  ] = js.native
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* item */ typingsSlinky.vscode.mod.CompletionItem, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[typingsSlinky.vscode.mod.CompletionItem]
    ]
  ] = js.native
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typingsSlinky.vscode.mod.DocumentLink, 
      /* token */ typingsSlinky.vscode.mod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typingsSlinky.vscode.mod.DocumentLink]
    ]
  ] = js.native
  var willSave: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, Unit]] = js.native
  var willSaveWaitUntil: js.UndefOr[
    NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typingsSlinky.vscode.mod.TextEdit]]]
  ] = js.native
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.native
}

object _Middleware {
  @scala.inline
  def apply(): _Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Middleware]
  }
  @scala.inline
  implicit class _MiddlewareOps[Self <: _Middleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidChange(value: NextSignature[TextDocumentChangeEvent, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChange")(js.undefined)
        ret
    }
    @scala.inline
    def withDidClose(value: NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didClose")(js.undefined)
        ret
    }
    @scala.inline
    def withDidOpen(value: NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDidSave(value: NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didSave")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDiagnostics(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* uri */ Uri, 
          /* diagnostics */ js.Array[typingsSlinky.vscode.mod.Diagnostic], 
          /* next */ HandleDiagnosticsSignature, 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepareRename(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ PrepareRenameSignature, 
          ProviderResult[typingsSlinky.vscode.mod.Range | AnonPlaceholder]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepareRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareRename")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideCodeActions(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* range */ typingsSlinky.vscode.mod.Range, 
          /* context */ typingsSlinky.vscode.mod.CodeActionContext, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideCodeActionsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.Command | typingsSlinky.vscode.mod.CodeAction]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCodeActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideCodeActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCodeActions")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideCodeLenses(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideCodeLensesSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.CodeLens]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCodeLenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideCodeLenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCodeLenses")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideCompletionItem(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* context */ CompletionContext, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideCompletionItemsSignature, 
          ProviderResult[
            js.Array[typingsSlinky.vscode.mod.CompletionItem] | typingsSlinky.vscode.mod.CompletionList
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCompletionItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideCompletionItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCompletionItem")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideDefinition(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideDocumentFormattingEdits(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentFormattingEditsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentFormattingEdits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideDocumentFormattingEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentFormattingEdits")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideDocumentHighlights(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentHighlightsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentHighlight]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentHighlights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideDocumentHighlights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentHighlights")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideDocumentLinks(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentLinksSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentLink]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideDocumentLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideDocumentRangeFormattingEdits(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* range */ typingsSlinky.vscode.mod.Range, 
          /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentRangeFormattingEditsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentRangeFormattingEdits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideDocumentRangeFormattingEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentRangeFormattingEdits")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideDocumentSymbols(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentSymbolsSignature, 
          ProviderResult[
            js.Array[
              typingsSlinky.vscode.mod.DocumentSymbol | typingsSlinky.vscode.mod.SymbolInformation
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideDocumentSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideHover(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideHoverSignature, 
          ProviderResult[typingsSlinky.vscode.mod.Hover]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideHover")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideOnTypeFormattingEdits(
      value: js.ThisFunction6[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* ch */ String, 
          /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideOnTypeFormattingEditsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideOnTypeFormattingEdits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideOnTypeFormattingEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideOnTypeFormattingEdits")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideReferences(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* options */ AnonIncludeDeclaration, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideReferencesSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.Location]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideRenameEdits(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* newName */ String, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideRenameEditsSignature, 
          ProviderResult[typingsSlinky.vscode.mod.WorkspaceEdit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideRenameEdits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideRenameEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideRenameEdits")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideSignatureHelp(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideSignatureHelpSignature, 
          ProviderResult[SignatureHelp]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideSignatureHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideSignatureHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideSignatureHelp")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideWorkspaceSymbols(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* query */ String, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideWorkspaceSymbolsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.SymbolInformation]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideWorkspaceSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideWorkspaceSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideWorkspaceSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveCodeLens(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* codeLens */ typingsSlinky.vscode.mod.CodeLens, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ResolveCodeLensSignature, 
          ProviderResult[typingsSlinky.vscode.mod.CodeLens]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCodeLens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveCodeLens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCodeLens")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveCompletionItem(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* item */ typingsSlinky.vscode.mod.CompletionItem, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ResolveCompletionItemSignature, 
          ProviderResult[typingsSlinky.vscode.mod.CompletionItem]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCompletionItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveCompletionItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCompletionItem")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveDocumentLink(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* link */ typingsSlinky.vscode.mod.DocumentLink, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ResolveDocumentLinkSignature, 
          ProviderResult[typingsSlinky.vscode.mod.DocumentLink]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDocumentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveDocumentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDocumentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withWillSave(value: NextSignature[TextDocumentWillSaveEvent, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWillSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSave")(js.undefined)
        ret
    }
    @scala.inline
    def withWillSaveWaitUntil(
      value: NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typingsSlinky.vscode.mod.TextEdit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSaveWaitUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWillSaveWaitUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSaveWaitUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspace(value: WorkspaceMiddleware): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(js.undefined)
        ret
    }
  }
  
}

