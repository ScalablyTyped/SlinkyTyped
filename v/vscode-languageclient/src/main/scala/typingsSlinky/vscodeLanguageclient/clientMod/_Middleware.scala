package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscode.mod.CompletionContext
import typingsSlinky.vscode.mod.Definition
import typingsSlinky.vscode.mod.DefinitionLink
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.SignatureHelp
import typingsSlinky.vscode.mod.SignatureHelpContext
import typingsSlinky.vscode.mod.TextDocumentChangeEvent
import typingsSlinky.vscode.mod.TextDocumentWillSaveEvent
import typingsSlinky.vscode.mod.Uri
import typingsSlinky.vscodeJsonrpc.Thenable
import typingsSlinky.vscodeLanguageclient.anon.IncludeDeclaration
import typingsSlinky.vscodeLanguageclient.anon.Placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _Middleware extends StObject {
  
  var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, Unit]] = js.native
  
  var didClose: js.UndefOr[NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]] = js.native
  
  var didOpen: js.UndefOr[NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]] = js.native
  
  var didSave: js.UndefOr[NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]] = js.native
  
  var executeCommand: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* command */ String, 
      /* args */ js.Array[_], 
      /* next */ ExecuteCommandSignature, 
      ProviderResult[_]
    ]
  ] = js.native
  
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
      ProviderResult[typingsSlinky.vscode.mod.Range | Placeholder]
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
        js.Array[typingsSlinky.vscode.mod.CompletionItem] | typingsSlinky.vscode.mod.CompletionList[typingsSlinky.vscode.mod.CompletionItem]
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
      /* options */ IncludeDeclaration, 
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
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsSlinky.vscode.mod.TextDocument, 
      /* position */ typingsSlinky.vscode.mod.Position, 
      /* context */ SignatureHelpContext, 
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
  implicit class _MiddlewareMutableBuilder[Self <: _Middleware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDidChange(value: NextSignature[TextDocumentChangeEvent, Unit]): Self = StObject.set(x, "didChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidChangeUndefined: Self = StObject.set(x, "didChange", js.undefined)
    
    @scala.inline
    def setDidClose(value: NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]): Self = StObject.set(x, "didClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidCloseUndefined: Self = StObject.set(x, "didClose", js.undefined)
    
    @scala.inline
    def setDidOpen(value: NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]): Self = StObject.set(x, "didOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidOpenUndefined: Self = StObject.set(x, "didOpen", js.undefined)
    
    @scala.inline
    def setDidSave(value: NextSignature[typingsSlinky.vscode.mod.TextDocument, Unit]): Self = StObject.set(x, "didSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidSaveUndefined: Self = StObject.set(x, "didSave", js.undefined)
    
    @scala.inline
    def setExecuteCommand(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* command */ String, 
          /* args */ js.Array[_], 
          /* next */ ExecuteCommandSignature, 
          ProviderResult[_]
        ]
    ): Self = StObject.set(x, "executeCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteCommandUndefined: Self = StObject.set(x, "executeCommand", js.undefined)
    
    @scala.inline
    def setHandleDiagnostics(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* uri */ Uri, 
          /* diagnostics */ js.Array[typingsSlinky.vscode.mod.Diagnostic], 
          /* next */ HandleDiagnosticsSignature, 
          Unit
        ]
    ): Self = StObject.set(x, "handleDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleDiagnosticsUndefined: Self = StObject.set(x, "handleDiagnostics", js.undefined)
    
    @scala.inline
    def setPrepareRename(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ PrepareRenameSignature, 
          ProviderResult[typingsSlinky.vscode.mod.Range | Placeholder]
        ]
    ): Self = StObject.set(x, "prepareRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepareRenameUndefined: Self = StObject.set(x, "prepareRename", js.undefined)
    
    @scala.inline
    def setProvideCodeActions(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* range */ typingsSlinky.vscode.mod.Range, 
          /* context */ typingsSlinky.vscode.mod.CodeActionContext, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideCodeActionsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.Command | typingsSlinky.vscode.mod.CodeAction]]
        ]
    ): Self = StObject.set(x, "provideCodeActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideCodeActionsUndefined: Self = StObject.set(x, "provideCodeActions", js.undefined)
    
    @scala.inline
    def setProvideCodeLenses(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideCodeLensesSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.CodeLens]]
        ]
    ): Self = StObject.set(x, "provideCodeLenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideCodeLensesUndefined: Self = StObject.set(x, "provideCodeLenses", js.undefined)
    
    @scala.inline
    def setProvideCompletionItem(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* context */ CompletionContext, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideCompletionItemsSignature, 
          ProviderResult[
            js.Array[typingsSlinky.vscode.mod.CompletionItem] | typingsSlinky.vscode.mod.CompletionList[typingsSlinky.vscode.mod.CompletionItem]
          ]
        ]
    ): Self = StObject.set(x, "provideCompletionItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideCompletionItemUndefined: Self = StObject.set(x, "provideCompletionItem", js.undefined)
    
    @scala.inline
    def setProvideDefinition(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
    ): Self = StObject.set(x, "provideDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideDefinitionUndefined: Self = StObject.set(x, "provideDefinition", js.undefined)
    
    @scala.inline
    def setProvideDocumentFormattingEdits(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentFormattingEditsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
        ]
    ): Self = StObject.set(x, "provideDocumentFormattingEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideDocumentFormattingEditsUndefined: Self = StObject.set(x, "provideDocumentFormattingEdits", js.undefined)
    
    @scala.inline
    def setProvideDocumentHighlights(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentHighlightsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentHighlight]]
        ]
    ): Self = StObject.set(x, "provideDocumentHighlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideDocumentHighlightsUndefined: Self = StObject.set(x, "provideDocumentHighlights", js.undefined)
    
    @scala.inline
    def setProvideDocumentLinks(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentLinksSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentLink]]
        ]
    ): Self = StObject.set(x, "provideDocumentLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideDocumentLinksUndefined: Self = StObject.set(x, "provideDocumentLinks", js.undefined)
    
    @scala.inline
    def setProvideDocumentRangeFormattingEdits(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* range */ typingsSlinky.vscode.mod.Range, 
          /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentRangeFormattingEditsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
        ]
    ): Self = StObject.set(x, "provideDocumentRangeFormattingEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideDocumentRangeFormattingEditsUndefined: Self = StObject.set(x, "provideDocumentRangeFormattingEdits", js.undefined)
    
    @scala.inline
    def setProvideDocumentSymbols(
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
    ): Self = StObject.set(x, "provideDocumentSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideDocumentSymbolsUndefined: Self = StObject.set(x, "provideDocumentSymbols", js.undefined)
    
    @scala.inline
    def setProvideHover(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideHoverSignature, 
          ProviderResult[typingsSlinky.vscode.mod.Hover]
        ]
    ): Self = StObject.set(x, "provideHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideHoverUndefined: Self = StObject.set(x, "provideHover", js.undefined)
    
    @scala.inline
    def setProvideOnTypeFormattingEdits(
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
    ): Self = StObject.set(x, "provideOnTypeFormattingEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideOnTypeFormattingEditsUndefined: Self = StObject.set(x, "provideOnTypeFormattingEdits", js.undefined)
    
    @scala.inline
    def setProvideReferences(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* options */ IncludeDeclaration, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideReferencesSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.Location]]
        ]
    ): Self = StObject.set(x, "provideReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideReferencesUndefined: Self = StObject.set(x, "provideReferences", js.undefined)
    
    @scala.inline
    def setProvideRenameEdits(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* newName */ String, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideRenameEditsSignature, 
          ProviderResult[typingsSlinky.vscode.mod.WorkspaceEdit]
        ]
    ): Self = StObject.set(x, "provideRenameEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideRenameEditsUndefined: Self = StObject.set(x, "provideRenameEdits", js.undefined)
    
    @scala.inline
    def setProvideSignatureHelp(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typingsSlinky.vscode.mod.TextDocument, 
          /* position */ typingsSlinky.vscode.mod.Position, 
          /* context */ SignatureHelpContext, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideSignatureHelpSignature, 
          ProviderResult[SignatureHelp]
        ]
    ): Self = StObject.set(x, "provideSignatureHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideSignatureHelpUndefined: Self = StObject.set(x, "provideSignatureHelp", js.undefined)
    
    @scala.inline
    def setProvideWorkspaceSymbols(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* query */ String, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ProvideWorkspaceSymbolsSignature, 
          ProviderResult[js.Array[typingsSlinky.vscode.mod.SymbolInformation]]
        ]
    ): Self = StObject.set(x, "provideWorkspaceSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideWorkspaceSymbolsUndefined: Self = StObject.set(x, "provideWorkspaceSymbols", js.undefined)
    
    @scala.inline
    def setResolveCodeLens(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* codeLens */ typingsSlinky.vscode.mod.CodeLens, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ResolveCodeLensSignature, 
          ProviderResult[typingsSlinky.vscode.mod.CodeLens]
        ]
    ): Self = StObject.set(x, "resolveCodeLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveCodeLensUndefined: Self = StObject.set(x, "resolveCodeLens", js.undefined)
    
    @scala.inline
    def setResolveCompletionItem(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* item */ typingsSlinky.vscode.mod.CompletionItem, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ResolveCompletionItemSignature, 
          ProviderResult[typingsSlinky.vscode.mod.CompletionItem]
        ]
    ): Self = StObject.set(x, "resolveCompletionItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveCompletionItemUndefined: Self = StObject.set(x, "resolveCompletionItem", js.undefined)
    
    @scala.inline
    def setResolveDocumentLink(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* link */ typingsSlinky.vscode.mod.DocumentLink, 
          /* token */ typingsSlinky.vscode.mod.CancellationToken, 
          /* next */ ResolveDocumentLinkSignature, 
          ProviderResult[typingsSlinky.vscode.mod.DocumentLink]
        ]
    ): Self = StObject.set(x, "resolveDocumentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveDocumentLinkUndefined: Self = StObject.set(x, "resolveDocumentLink", js.undefined)
    
    @scala.inline
    def setWillSave(value: NextSignature[TextDocumentWillSaveEvent, Unit]): Self = StObject.set(x, "willSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillSaveUndefined: Self = StObject.set(x, "willSave", js.undefined)
    
    @scala.inline
    def setWillSaveWaitUntil(
      value: NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typingsSlinky.vscode.mod.TextEdit]]]
    ): Self = StObject.set(x, "willSaveWaitUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillSaveWaitUntilUndefined: Self = StObject.set(x, "willSaveWaitUntil", js.undefined)
    
    @scala.inline
    def setWorkspace(value: WorkspaceMiddleware): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
