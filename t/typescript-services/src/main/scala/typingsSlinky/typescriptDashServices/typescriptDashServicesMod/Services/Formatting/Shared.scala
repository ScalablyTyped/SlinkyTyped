package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Shared")
@js.native
object Shared extends js.Object {
  @js.native
  class TokenAllAccess ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenAllAccess
  
  @js.native
  class TokenRange protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange {
    def this(tokenAccess: ITokenAccess) = this()
  }
  
  @js.native
  class TokenRangeAccess protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
    def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
  }
  
  @js.native
  class TokenSingleValueAccess protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
    def this(token: SyntaxKind) = this()
  }
  
  @js.native
  class TokenValuesAccess protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
    def this(tks: js.Array[SyntaxKind]) = this()
  }
  
  /* static members */
  @js.native
  object TokenRange extends js.Object {
    var Any: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var AnyIncludingMultilineComments: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var BinaryKeywordOperators: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var BinaryOperators: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Comments: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Keywords: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Operators: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var ReservedKeywords: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var TypeNames: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPostdecrementExpressions: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPostincrementExpressions: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPredecrementExpressions: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPrefixExpressions: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPrefixOperators: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPreincrementExpressions: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def AllTokens(): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromToken(token: SyntaxKind): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromTokens(tokens: js.Array[SyntaxKind]): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
  }
  
}

