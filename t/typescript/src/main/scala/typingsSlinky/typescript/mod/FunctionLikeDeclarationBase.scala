package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionLikeDeclarationBase extends SignatureDeclarationBase {
  
  var _functionLikeDeclarationBrand: js.Any = js.native
  
  var asteriskToken: js.UndefOr[AsteriskToken] = js.native
  
  var body: js.UndefOr[Block | Expression] = js.native
  
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  var questionToken: js.UndefOr[QuestionToken] = js.native
}
