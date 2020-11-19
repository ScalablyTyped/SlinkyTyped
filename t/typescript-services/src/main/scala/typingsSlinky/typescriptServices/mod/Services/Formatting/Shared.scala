package typingsSlinky.typescriptServices.mod.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.Formatting.Shared")
@js.native
object Shared extends js.Object {
  
  @js.native
  class TokenAllAccess ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenAllAccess
  
  @js.native
  class TokenRange protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange {
    def this(tokenAccess: ITokenAccess) = this()
  }
  /* static members */
  @js.native
  object TokenRange extends js.Object {
    
    def AllTokens(): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var Any: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var AnyIncludingMultilineComments: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var BinaryKeywordOperators: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var BinaryOperators: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var Comments: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    def FromRange(f: SyntaxKind, to: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    def FromToken(token: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    def FromTokens(tokens: js.Array[SyntaxKind]): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var Keywords: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var Operators: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var ReservedKeywords: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var TypeNames: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var UnaryPostdecrementExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var UnaryPostincrementExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var UnaryPredecrementExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var UnaryPrefixExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var UnaryPrefixOperators: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    
    var UnaryPreincrementExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
  }
  
  @js.native
  class TokenRangeAccess protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
    def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
  }
  
  @js.native
  class TokenSingleValueAccess protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
    def this(token: SyntaxKind) = this()
  }
  
  @js.native
  class TokenValuesAccess protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
    def this(tks: js.Array[SyntaxKind]) = this()
  }
}
