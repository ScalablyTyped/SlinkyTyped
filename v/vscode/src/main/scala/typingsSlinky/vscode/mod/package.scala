package typingsSlinky.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  
  type Declaration = typingsSlinky.vscode.mod.Location | (js.Array[typingsSlinky.vscode.mod.Location | typingsSlinky.vscode.mod.LocationLink])
  
  type Definition = typingsSlinky.vscode.mod.Location | js.Array[typingsSlinky.vscode.mod.Location]
  
  type DefinitionLink = typingsSlinky.vscode.mod.LocationLink
  
  type DocumentSelector = typingsSlinky.vscode.mod.DocumentFilter | java.lang.String | (js.Array[typingsSlinky.vscode.mod.DocumentFilter | java.lang.String])
  
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[typingsSlinky.vscode.mod.Disposable]], 
    typingsSlinky.vscode.mod.Disposable
  ]
  
  type GlobPattern = java.lang.String | typingsSlinky.vscode.mod.RelativePattern
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vscode.mod.MarkdownString
    - java.lang.String
    - typingsSlinky.vscode.anon.Language
  */
  type MarkedString = typingsSlinky.vscode.mod._MarkedString | java.lang.String
  
  type ProviderResult[T] = js.UndefOr[T | scala.Null | (typingsSlinky.vscode.Thenable[js.UndefOr[T | scala.Null]])]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.vscode.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
