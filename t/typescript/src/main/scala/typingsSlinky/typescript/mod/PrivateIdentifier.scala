package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateIdentifier
  extends Node
     with DeclarationName
     with PropertyName {
  
  val escapedText: String = js.native
  
  @JSName("kind")
  val kind_PrivateIdentifier: typingsSlinky.typescript.mod.SyntaxKind.PrivateIdentifier = js.native
  
  val text: java.lang.String = js.native
}
