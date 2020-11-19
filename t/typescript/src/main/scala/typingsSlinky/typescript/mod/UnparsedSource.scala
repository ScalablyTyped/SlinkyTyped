package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparsedSource extends Node {
  
  var fileName: java.lang.String = js.native
  
  var hasNoDefaultLib: js.UndefOr[Boolean] = js.native
  
  var helpers: js.UndefOr[js.Array[UnscopedEmitHelper]] = js.native
  
  @JSName("kind")
  var kind_UnparsedSource: typingsSlinky.typescript.mod.SyntaxKind.UnparsedSource = js.native
  
  var libReferenceDirectives: js.Array[FileReference] = js.native
  
  var prologues: js.Array[UnparsedPrologue] = js.native
  
  var referencedFiles: js.Array[FileReference] = js.native
  
  var sourceMapPath: js.UndefOr[java.lang.String] = js.native
  
  var sourceMapText: js.UndefOr[java.lang.String] = js.native
  
  var syntheticReferences: js.UndefOr[js.Array[UnparsedSyntheticReference]] = js.native
  
  var text: java.lang.String = js.native
  
  var texts: js.Array[UnparsedSourceText] = js.native
  
  var typeReferenceDirectives: js.UndefOr[js.Array[java.lang.String]] = js.native
}
