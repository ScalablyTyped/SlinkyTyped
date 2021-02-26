package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.CancellationToken
import typingsSlinky.vscode.mod.Disposable
import typingsSlinky.vscode.mod.DocumentRangeSemanticTokensProvider
import typingsSlinky.vscode.mod.DocumentSelector
import typingsSlinky.vscode.mod.DocumentSemanticTokensProvider
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.Range
import typingsSlinky.vscode.mod.SemanticTokens
import typingsSlinky.vscode.mod.SemanticTokensEdits
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensOptions
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semanticTokensProposedMod {
  
  @JSImport("vscode-languageclient/lib/semanticTokens.proposed", "SemanticTokensFeature")
  @js.native
  class SemanticTokensFeature protected () extends TextDocumentFeature[
          Boolean | SemanticTokensOptions, 
          SemanticTokensRegistrationOptions, 
          SemanticTokensProviders
        ] {
    def this(client: BaseLanguageClient) = this()
  }
  
  /* augmented module */
  object vscodeAugmentingMod {
    
    @JSImport("vscode", "SemanticTokens")
    @js.native
    class SemanticTokens protected () extends StObject {
      def this(data: js.typedarray.Uint32Array) = this()
      def this(data: js.typedarray.Uint32Array, resultId: String) = this()
      
      val data: js.typedarray.Uint32Array = js.native
      
      /**
        * The result id of the tokens.
        *
        * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
        */
      val resultId: js.UndefOr[String] = js.native
    }
    
    @JSImport("vscode", "SemanticTokensBuilder")
    @js.native
    class SemanticTokensBuilder () extends StObject {
      
      def build(): js.typedarray.Uint32Array = js.native
      
      def push(line: Double, char: Double, length: Double, tokenType: Double, tokenModifiers: Double): Unit = js.native
    }
    
    @JSImport("vscode", "SemanticTokensEdit")
    @js.native
    class SemanticTokensEdit protected () extends StObject {
      def this(start: Double, deleteCount: Double) = this()
      def this(start: Double, deleteCount: Double, data: js.typedarray.Uint32Array) = this()
      
      val data: js.UndefOr[js.typedarray.Uint32Array] = js.native
      
      val deleteCount: Double = js.native
      
      val start: Double = js.native
    }
    
    @JSImport("vscode", "SemanticTokensEdits")
    @js.native
    class SemanticTokensEdits protected () extends StObject {
      def this(edits: js.Array[SemanticTokensEdit]) = this()
      def this(edits: js.Array[SemanticTokensEdit], resultId: String) = this()
      
      val edits: js.Array[SemanticTokensEdit] = js.native
      
      /**
        * The result id of the tokens.
        *
        * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
        */
      val resultId: js.UndefOr[String] = js.native
    }
    
    @JSImport("vscode", "SemanticTokensLegend")
    @js.native
    class SemanticTokensLegend protected () extends StObject {
      def this(tokenTypes: js.Array[String], tokenModifiers: js.Array[String]) = this()
      
      val tokenModifiers: js.Array[String] = js.native
      
      val tokenTypes: js.Array[String] = js.native
    }
    
    object languages {
      
      /**
        * Register a semantic tokens provider for a document range.
        *
        * Multiple providers can be registered for a language. In that case providers are sorted
        * by their [score](#languages.match) and the best-matching provider is used. Failure
        * of the selected provider will cause a failure of the whole operation.
        *
        * @param selector A selector that defines the documents this provider is applicable to.
        * @param provider A document range semantic tokens provider.
        * @return A [disposable](#Disposable) that unregisters this provider when being disposed.
        */
      @JSImport("vscode", "languages.registerDocumentRangeSemanticTokensProvider")
      @js.native
      def registerDocumentRangeSemanticTokensProvider(
        selector: DocumentSelector,
        provider: DocumentRangeSemanticTokensProvider,
        legend: SemanticTokensLegend
      ): Disposable = js.native
      
      /**
        * Register a semantic tokens provider for a whole document.
        *
        * Multiple providers can be registered for a language. In that case providers are sorted
        * by their [score](#languages.match) and the best-matching provider is used. Failure
        * of the selected provider will cause a failure of the whole operation.
        *
        * @param selector A selector that defines the documents this provider is applicable to.
        * @param provider A document semantic tokens provider.
        * @return A [disposable](#Disposable) that unregisters this provider when being disposed.
        */
      @JSImport("vscode", "languages.registerDocumentSemanticTokensProvider")
      @js.native
      def registerDocumentSemanticTokensProvider(selector: DocumentSelector, provider: DocumentSemanticTokensProvider, legend: SemanticTokensLegend): Disposable = js.native
    }
    
    /**
      * The document range semantic tokens provider interface defines the contract between extensions and
      * semantic tokens.
      */
    @js.native
    trait DocumentRangeSemanticTokensProvider extends StObject {
      
      /**
        * See [provideDocumentSemanticTokens](#DocumentSemanticTokensProvider.provideDocumentSemanticTokens).
        */
      def provideDocumentRangeSemanticTokens(document: TextDocument, range: Range, token: CancellationToken): ProviderResult[SemanticTokens] = js.native
    }
    object DocumentRangeSemanticTokensProvider {
      
      @scala.inline
      def apply(
        provideDocumentRangeSemanticTokens: (TextDocument, Range, CancellationToken) => ProviderResult[SemanticTokens]
      ): DocumentRangeSemanticTokensProvider = {
        val __obj = js.Dynamic.literal(provideDocumentRangeSemanticTokens = js.Any.fromFunction3(provideDocumentRangeSemanticTokens))
        __obj.asInstanceOf[DocumentRangeSemanticTokensProvider]
      }
      
      @scala.inline
      implicit class DocumentRangeSemanticTokensProviderMutableBuilder[Self <: DocumentRangeSemanticTokensProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProvideDocumentRangeSemanticTokens(value: (TextDocument, Range, CancellationToken) => ProviderResult[SemanticTokens]): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.Any.fromFunction3(value))
      }
    }
    
    /**
      * The document semantic tokens provider interface defines the contract between extensions and
      * semantic tokens.
      */
    @js.native
    trait DocumentSemanticTokensProvider extends StObject {
      
      /**
        * A file can contain many tokens, perhaps even hundreds of thousands of tokens. Therefore, to improve
        * the memory consumption around describing semantic tokens, we have decided to avoid allocating an object
        * for each token and we represent tokens from a file as an array of integers. Furthermore, the position
        * of each token is expressed relative to the token before it because most tokens remain stable relative to
        * each other when edits are made in a file.
        *
        * ---
        * In short, each token takes 5 integers to represent, so a specific token `i` in the file consists of the following array indices:
        *  - at index `5*i`   - `deltaLine`: token line number, relative to the previous token
        *  - at index `5*i+1` - `deltaStart`: token start character, relative to the previous token (relative to 0 or the previous token's start if they are on the same line)
        *  - at index `5*i+2` - `length`: the length of the token. A token cannot be multiline.
        *  - at index `5*i+3` - `tokenType`: will be looked up in `SemanticTokensLegend.tokenTypes`
        *  - at index `5*i+4` - `tokenModifiers`: each set bit will be looked up in `SemanticTokensLegend.tokenModifiers`
        *
        * ---
        * ### How to encode tokens
        *
        * Here is an example for encoding a file with 3 tokens in a uint32 array:
        * ```
        *    { line: 2, startChar:  5, length: 3, tokenType: "properties", tokenModifiers: ["private", "static"] },
        *    { line: 2, startChar: 10, length: 4, tokenType: "types",      tokenModifiers: [] },
        *    { line: 5, startChar:  2, length: 7, tokenType: "classes",    tokenModifiers: [] }
        * ```
        *
        * 1. First of all, a legend must be devised. This legend must be provided up-front and capture all possible token types.
        * For this example, we will choose the following legend which must be passed in when registering the provider:
        * ```
        *    tokenTypes: ['properties', 'types', 'classes'],
        *    tokenModifiers: ['private', 'static']
        * ```
        *
        * 2. The first transformation step is to encode `tokenType` and `tokenModifiers` as integers using the legend. Token types are looked
        * up by index, so a `tokenType` value of `1` means `tokenTypes[1]`. Multiple token modifiers can be set by using bit flags,
        * so a `tokenModifier` value of `3` is first viewed as binary `0b00000011`, which means `[tokenModifiers[0], tokenModifiers[1]]` because
        * bits 0 and 1 are set. Using this legend, the tokens now are:
        * ```
        *    { line: 2, startChar:  5, length: 3, tokenType: 0, tokenModifiers: 3 },
        *    { line: 2, startChar: 10, length: 4, tokenType: 1, tokenModifiers: 0 },
        *    { line: 5, startChar:  2, length: 7, tokenType: 2, tokenModifiers: 0 }
        * ```
        *
        * 3. The next steps is to encode each token relative to the previous token in the file. In this case, the second token
        * is on the same line as the first token, so the `startChar` of the second token is made relative to the `startChar`
        * of the first token, so it will be `10 - 5`. The third token is on a different line than the second token, so the
        * `startChar` of the third token will not be altered:
        * ```
        *    { deltaLine: 2, deltaStartChar: 5, length: 3, tokenType: 0, tokenModifiers: 3 },
        *    { deltaLine: 0, deltaStartChar: 5, length: 4, tokenType: 1, tokenModifiers: 0 },
        *    { deltaLine: 3, deltaStartChar: 2, length: 7, tokenType: 2, tokenModifiers: 0 }
        * ```
        *
        * 4. Finally, the last step is to inline each of the 5 fields for a token in a single array, which is a memory friendly representation:
        * ```
        *    // 1st token,  2nd token,  3rd token
        *    [  2,5,3,0,3,  0,5,4,1,0,  3,2,7,2,0 ]
        * ```
        */
      def provideDocumentSemanticTokens(document: TextDocument, token: CancellationToken): ProviderResult[SemanticTokens] = js.native
      
      /**
        * Instead of always returning all the tokens in a file, it is possible for a `DocumentSemanticTokensProvider` to implement
        * this method (`updateSemanticTokens`) and then return incremental updates to the previously provided semantic tokens.
        *
        * ---
        * ### How tokens change when the document changes
        *
        * Let's look at how tokens might change.
        *
        * Continuing with the above example, suppose a new line was inserted at the top of the file.
        * That would make all the tokens move down by one line (notice how the line has changed for each one):
        * ```
        *    { line: 3, startChar:  5, length: 3, tokenType: "properties", tokenModifiers: ["private", "static"] },
        *    { line: 3, startChar: 10, length: 4, tokenType: "types",      tokenModifiers: [] },
        *    { line: 6, startChar:  2, length: 7, tokenType: "classes",    tokenModifiers: [] }
        * ```
        * The integer encoding of the tokens does not change substantially because of the delta-encoding of positions:
        * ```
        *    // 1st token,  2nd token,  3rd token
        *    [  3,5,3,0,3,  0,5,4,1,0,  3,2,7,2,0 ]
        * ```
        * It is possible to express these new tokens in terms of an edit applied to the previous tokens:
        * ```
        *    [  2,5,3,0,3,  0,5,4,1,0,  3,2,7,2,0 ] // old tokens
        *    [  3,5,3,0,3,  0,5,4,1,0,  3,2,7,2,0 ] // new tokens
        *
        *    edit: { start:  0, deleteCount: 1, data: [3] } // replace integer at offset 0 with 3
        * ```
        *
        * Furthermore, let's assume that a new token has appeared on line 4:
        * ```
        *    { line: 3, startChar:  5, length: 3, tokenType: "properties", tokenModifiers: ["private", "static"] },
        *    { line: 3, startChar: 10, length: 4, tokenType: "types",      tokenModifiers: [] },
        *    { line: 4, startChar:  3, length: 5, tokenType: "properties", tokenModifiers: ["static"] },
        *    { line: 6, startChar:  2, length: 7, tokenType: "classes",    tokenModifiers: [] }
        * ```
        * The integer encoding of the tokens is:
        * ```
        *    // 1st token,  2nd token,  3rd token,  4th token
        *    [  3,5,3,0,3,  0,5,4,1,0,  1,3,5,0,2,  2,2,7,2,0, ]
        * ```
        * Again, it is possible to express these new tokens in terms of an edit applied to the previous tokens:
        * ```
        *    [  3,5,3,0,3,  0,5,4,1,0,  3,2,7,2,0 ]               // old tokens
        *    [  3,5,3,0,3,  0,5,4,1,0,  1,3,5,0,2,  2,2,7,2,0, ]  // new tokens
        *
        *    edit: { start: 10, deleteCount: 1, data: [1,3,5,0,2,2] } // replace integer at offset 10 with [1,3,5,0,2,2]
        * ```
        *
        * *NOTE*: When doing edits, it is possible that multiple edits occur until VS Code decides to invoke the semantic tokens provider.
        * *NOTE*: If the provider cannot compute `SemanticTokensEdits`, it can "give up" and return all the tokens in the document again.
        * *NOTE*: All edits in `SemanticTokensEdits` contain indices in the old integers array, so they all refer to the previous result state.
        */
      var provideDocumentSemanticTokensEdits: js.UndefOr[
            js.Function3[
              /* document */ TextDocument, 
              /* previousResultId */ String, 
              /* token */ CancellationToken, 
              ProviderResult[SemanticTokens | SemanticTokensEdits]
            ]
          ] = js.native
    }
    object DocumentSemanticTokensProvider {
      
      @scala.inline
      def apply(provideDocumentSemanticTokens: (TextDocument, CancellationToken) => ProviderResult[SemanticTokens]): DocumentSemanticTokensProvider = {
        val __obj = js.Dynamic.literal(provideDocumentSemanticTokens = js.Any.fromFunction2(provideDocumentSemanticTokens))
        __obj.asInstanceOf[DocumentSemanticTokensProvider]
      }
      
      @scala.inline
      implicit class DocumentSemanticTokensProviderMutableBuilder[Self <: DocumentSemanticTokensProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProvideDocumentSemanticTokens(value: (TextDocument, CancellationToken) => ProviderResult[SemanticTokens]): Self = StObject.set(x, "provideDocumentSemanticTokens", js.Any.fromFunction2(value))
        
        @scala.inline
        def setProvideDocumentSemanticTokensEdits(
          value: (/* document */ TextDocument, /* previousResultId */ String, /* token */ CancellationToken) => ProviderResult[SemanticTokens | SemanticTokensEdits]
        ): Self = StObject.set(x, "provideDocumentSemanticTokensEdits", js.Any.fromFunction3(value))
        
        @scala.inline
        def setProvideDocumentSemanticTokensEditsUndefined: Self = StObject.set(x, "provideDocumentSemanticTokensEdits", js.undefined)
      }
    }
  }
  
  type DocumentRangeSemanticTokensSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* range */ Range, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokens]
  ]
  
  type DocumentSemanticsTokensEditsSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* previousResultId */ String, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokensEdits | SemanticTokens]
  ]
  
  type DocumentSemanticsTokensSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokens]
  ]
  
  @js.native
  trait SemanticTokensMiddleware extends StObject {
    
    var provideDocumentRangeSemanticTokens: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* range */ Range, 
          /* token */ CancellationToken, 
          /* next */ DocumentRangeSemanticTokensSignature, 
          ProviderResult[SemanticTokens]
        ]
      ] = js.native
    
    var provideDocumentSemanticTokens: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ DocumentSemanticsTokensSignature, 
          ProviderResult[SemanticTokens]
        ]
      ] = js.native
    
    var provideDocumentSemanticTokensEdits: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* previousResultId */ String, 
          /* token */ CancellationToken, 
          /* next */ DocumentSemanticsTokensEditsSignature, 
          ProviderResult[SemanticTokensEdits | SemanticTokens]
        ]
      ] = js.native
  }
  object SemanticTokensMiddleware {
    
    @scala.inline
    def apply(): SemanticTokensMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemanticTokensMiddleware]
    }
    
    @scala.inline
    implicit class SemanticTokensMiddlewareMutableBuilder[Self <: SemanticTokensMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvideDocumentRangeSemanticTokens(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* range */ Range, 
              /* token */ CancellationToken, 
              /* next */ DocumentRangeSemanticTokensSignature, 
              ProviderResult[SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideDocumentRangeSemanticTokensUndefined: Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.undefined)
      
      @scala.inline
      def setProvideDocumentSemanticTokens(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ DocumentSemanticsTokensSignature, 
              ProviderResult[SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentSemanticTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideDocumentSemanticTokensEdits(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* previousResultId */ String, 
              /* token */ CancellationToken, 
              /* next */ DocumentSemanticsTokensEditsSignature, 
              ProviderResult[SemanticTokensEdits | SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentSemanticTokensEdits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideDocumentSemanticTokensEditsUndefined: Self = StObject.set(x, "provideDocumentSemanticTokensEdits", js.undefined)
      
      @scala.inline
      def setProvideDocumentSemanticTokensUndefined: Self = StObject.set(x, "provideDocumentSemanticTokens", js.undefined)
    }
  }
  
  @js.native
  trait SemanticTokensProviders extends StObject {
    
    var document: DocumentSemanticTokensProvider = js.native
    
    var range: js.UndefOr[DocumentRangeSemanticTokensProvider] = js.native
  }
  object SemanticTokensProviders {
    
    @scala.inline
    def apply(document: DocumentSemanticTokensProvider): SemanticTokensProviders = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensProviders]
    }
    
    @scala.inline
    implicit class SemanticTokensProvidersMutableBuilder[Self <: SemanticTokensProviders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: DocumentSemanticTokensProvider): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: DocumentRangeSemanticTokensProvider): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
}
