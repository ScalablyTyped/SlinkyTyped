package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSemanticTokensProvider extends js.Object {
  
  /**
    * An optional event to signal that the semantic tokens from this provider have changed.
    */
  var onDidChangeSemanticTokens: js.UndefOr[Event[Unit]] = js.native
  
  /**
    * Tokens in a file are represented as an array of integers. The position of each token is expressed relative to
    * the token before it, because most tokens remain stable relative to each other when edits are made in a file.
    *
    * ---
    * In short, each token takes 5 integers to represent, so a specific token `i` in the file consists of the following array indices:
    *  - at index `5*i`   - `deltaLine`: token line number, relative to the previous token
    *  - at index `5*i+1` - `deltaStart`: token start character, relative to the previous token (relative to 0 or the previous token's start if they are on the same line)
    *  - at index `5*i+2` - `length`: the length of the token. A token cannot be multiline.
    *  - at index `5*i+3` - `tokenType`: will be looked up in `SemanticTokensLegend.tokenTypes`. We currently ask that `tokenType` < 65536.
    *  - at index `5*i+4` - `tokenModifiers`: each set bit will be looked up in `SemanticTokensLegend.tokenModifiers`
    *
    * ---
    * ### How to encode tokens
    *
    * Here is an example for encoding a file with 3 tokens in a uint32 array:
    * ```
    *    { line: 2, startChar:  5, length: 3, tokenType: "property",  tokenModifiers: ["private", "static"] },
    *    { line: 2, startChar: 10, length: 4, tokenType: "type",      tokenModifiers: [] },
    *    { line: 5, startChar:  2, length: 7, tokenType: "class",     tokenModifiers: [] }
    * ```
    *
    * 1. First of all, a legend must be devised. This legend must be provided up-front and capture all possible token types.
    * For this example, we will choose the following legend which must be passed in when registering the provider:
    * ```
    *    tokenTypes: ['property', 'type', 'class'],
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
    * 3. The next step is to represent each token relative to the previous token in the file. In this case, the second token
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
    *
    * @see [SemanticTokensBuilder](#SemanticTokensBuilder) for a helper to encode tokens as integers.
    * *NOTE*: When doing edits, it is possible that multiple edits occur until VS Code decides to invoke the semantic tokens provider.
    * *NOTE*: If the provider cannot temporarily compute semantic tokens, it can indicate this by throwing an error with the message 'Busy'.
    */
  def provideDocumentSemanticTokens(document: TextDocument, token: CancellationToken): ProviderResult[SemanticTokens] = js.native
  
  /**
    * Instead of always returning all the tokens in a file, it is possible for a `DocumentSemanticTokensProvider` to implement
    * this method (`provideDocumentSemanticTokensEdits`) and then return incremental updates to the previously provided semantic tokens.
    *
    * ---
    * ### How tokens change when the document changes
    *
    * Suppose that `provideDocumentSemanticTokens` has previously returned the following semantic tokens:
    * ```
    *    // 1st token,  2nd token,  3rd token
    *    [  2,5,3,0,3,  0,5,4,1,0,  3,2,7,2,0 ]
    * ```
    *
    * Also suppose that after some edits, the new semantic tokens in a file are:
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
  implicit class DocumentSemanticTokensProviderOps[Self <: DocumentSemanticTokensProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvideDocumentSemanticTokens(value: (TextDocument, CancellationToken) => ProviderResult[SemanticTokens]): Self = this.set("provideDocumentSemanticTokens", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDidChangeSemanticTokens(
      value: (/* listener */ js.Function1[Unit, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = this.set("onDidChangeSemanticTokens", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDidChangeSemanticTokens: Self = this.set("onDidChangeSemanticTokens", js.undefined)
    
    @scala.inline
    def setProvideDocumentSemanticTokensEdits(
      value: (/* document */ TextDocument, /* previousResultId */ String, /* token */ CancellationToken) => ProviderResult[SemanticTokens | SemanticTokensEdits]
    ): Self = this.set("provideDocumentSemanticTokensEdits", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProvideDocumentSemanticTokensEdits: Self = this.set("provideDocumentSemanticTokensEdits", js.undefined)
  }
}
