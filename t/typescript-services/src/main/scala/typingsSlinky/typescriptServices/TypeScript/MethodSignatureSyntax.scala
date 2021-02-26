package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodSignatureSyntax extends SyntaxNode {
  
  var callSignature: CallSignatureSyntax = js.native
  
  var propertyName: ISyntaxToken = js.native
  
  var questionToken: ISyntaxToken = js.native
  
  def update(propertyName: ISyntaxToken, questionToken: ISyntaxToken, callSignature: CallSignatureSyntax): MethodSignatureSyntax = js.native
  
  def withCallSignature(callSignature: CallSignatureSyntax): MethodSignatureSyntax = js.native
  
  def withPropertyName(propertyName: ISyntaxToken): MethodSignatureSyntax = js.native
  
  def withQuestionToken(questionToken: ISyntaxToken): MethodSignatureSyntax = js.native
}
